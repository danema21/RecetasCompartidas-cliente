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

import publicadores.ControladorConsultaRecetaPublish;
import publicadores.ControladorConsultaRecetaPublishService;
import publicadores.ControladorConsultaRecetaPublishServiceLocator;
import publicadores.DtReceta;

/**
 * Servlet implementation class ConsultaReceta
 */
@WebServlet("/ConsultaReceta")
public class ConsultaReceta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaReceta() {
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
		String inputNombreReceta = request.getParameter("inputNombreReceta");
		
		if(inputNombreReceta != null) {
			DtReceta info = null;
			try {
				info = mostrarInfo(inputNombreReceta);
				request.setAttribute("informacionReceta", info);
				RequestDispatcher rd;
				rd = request.getRequestDispatcher("/verReceta.jsp");
				rd.forward(request, response);
				
			} catch (RemoteException | ServiceException e) {
				e.printStackTrace();
				RequestDispatcher rd;
				request.setAttribute("mensaje", "Algo ocurrio al listar las recetas");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
			
			
		}else {
			DtReceta[] dtRecetas = null;
			DtReceta[] dtRecetasFiltro = null;
			try {
				dtRecetas = listarRecetas();
			} catch (RemoteException | ServiceException e) {
				e.printStackTrace();
				RequestDispatcher rd;
				request.setAttribute("mensaje", "Algo ocurrio al listar las recetas");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
			
			if(request.getParameter("nombreBuscado") != null) {
				String nombreBuscado = request.getParameter("nombreBuscado");
				
				int nuevoTamanio = 0;
				DtReceta[] aux = new DtReceta[dtRecetas.length];
				
				for(int i = 0; i < dtRecetas.length; i++) {
					String nomR = dtRecetas[i].getNombre();
					int j = 0;
					boolean igual = true;
					while(j < nombreBuscado.length() && j < nomR.length() && igual) {
						if(nombreBuscado.toUpperCase().charAt(j) != nomR.toUpperCase().charAt(j)) {
							igual = false;
						}
						j++;
					}
					if(igual) {
						aux[nuevoTamanio] = dtRecetas[i];
						nuevoTamanio++;
					}
				}
				dtRecetasFiltro = new DtReceta[nuevoTamanio];
				for(int i = 0; i < dtRecetasFiltro.length; i++) {
					dtRecetasFiltro[i] = aux[i];
				}
				request.setAttribute("recetas", dtRecetasFiltro);
				request.setAttribute("nombreBuscadoServlet", nombreBuscado);
				
			}else {
				request.setAttribute("recetas", dtRecetas);
				
			}
			
			RequestDispatcher rd;
			rd = request.getRequestDispatcher("/buscarRecetas.jsp");
			rd.forward(request, response);
		}
	}

	public DtReceta[] listarRecetas() throws ServiceException, RemoteException {
		ControladorConsultaRecetaPublishService ccrps = new ControladorConsultaRecetaPublishServiceLocator();
		ControladorConsultaRecetaPublish port = ccrps.getControladorConsultaRecetaPublishPort();
		return port.listarRecetas();
	}
	
	public DtReceta mostrarInfo(String nombreReceta) throws ServiceException, RemoteException {
		ControladorConsultaRecetaPublishService ccrps = new ControladorConsultaRecetaPublishServiceLocator();
		ControladorConsultaRecetaPublish port = ccrps.getControladorConsultaRecetaPublishPort();
		return port.mostrarInfo(nombreReceta);
	}

}
