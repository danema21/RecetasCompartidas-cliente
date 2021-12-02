package servlets;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import publicadores.ControladorConsultaNovedadesPublish;
import publicadores.ControladorConsultaNovedadesPublishService;
import publicadores.ControladorConsultaNovedadesPublishServiceLocator;
import publicadores.DtNotificacion;

/**
 * Servlet implementation class ConsultarNovedades
 */
@WebServlet("/ConsultarNovedades")
public class ConsultarNovedades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultarNovedades() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DtNotificacion[] dtNotificaciones = null;
		
		try {
			dtNotificaciones = listarNotificaciones();
		} catch (RemoteException | ServiceException e) {
			e.printStackTrace();
			RequestDispatcher rd;
			request.setAttribute("mensaje", "Algo ocurrio al listar las notificaciones");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		}
		
		request.setAttribute("notificaciones", dtNotificaciones);

		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/menuPrincipal.jsp");
		rd.forward(request, response);
	}

	public DtNotificacion[] listarNotificaciones() throws ServiceException, RemoteException {
		ControladorConsultaNovedadesPublishService ccnps = new ControladorConsultaNovedadesPublishServiceLocator();
		ControladorConsultaNovedadesPublish port = ccnps.getControladorConsultaNovedadesPublishPort();
		return port.listarNotificaciones();
	}
}
