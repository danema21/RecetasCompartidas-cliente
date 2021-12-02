package servlets;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import publicadores.ControladorIniciarSesionPublish;
import publicadores.ControladorIniciarSesionPublishService;
import publicadores.ControladorIniciarSesionPublishServiceLocator;

/**
 * Servlet implementation class IniciarSesion
 */
@WebServlet("/IniciarSesion")
public class IniciarSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IniciarSesion() {
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
		HttpSession sesion = request.getSession();
		String idUsuario = request.getParameter("inputIdUsuario");
		String password = request.getParameter("inputPassword");
		String usuarioLogueado = null;
		
		try {
			usuarioLogueado = iniciarSesion(idUsuario, password);
		} catch (RemoteException | ServiceException e) {
			e.printStackTrace();
		}
		
		if(usuarioLogueado != null) {
			sesion.setAttribute("idUsuario", usuarioLogueado);
			
			Cookie c = new Cookie("userId", usuarioLogueado);
			if("on".equals(request.getParameter("inputCheckboxSinCookie")) || "on".equals(request.getParameter("inputCheckboxConCookie"))) {
				c.setMaxAge(365*24*60*60);
				response.addCookie(c);
			}else {
				c.setMaxAge(0);
				response.addCookie(c);
			}
			request.getRequestDispatcher("ConsultarNovedades").forward(request, response);
		}else {
			RequestDispatcher rd;
			request.setAttribute("mensaje", "Usuario o password incorrectos");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		}
		
		doGet(request, response);
	}
	
	public String iniciarSesion(String idUsuario, String password) throws ServiceException, RemoteException {
		ControladorIniciarSesionPublishService cisps = new ControladorIniciarSesionPublishServiceLocator();
		ControladorIniciarSesionPublish port = cisps.getControladorIniciarSesionPublishPort();
		return port.iniciarSesion(idUsuario, password);
	}

}
