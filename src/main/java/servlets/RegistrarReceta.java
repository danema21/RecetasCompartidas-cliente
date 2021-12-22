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

import publicadores.ControladorRegistrarRecetaPublish;
import publicadores.ControladorRegistrarRecetaPublishService;
import publicadores.ControladorRegistrarRecetaPublishServiceLocator;

/**
 * Servlet implementation class RegistrarReceta
 */
@WebServlet("/RegistrarReceta")
public class RegistrarReceta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarReceta() {
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
		String inputPerfil = request.getParameter("inputPerfil");
		String inputNombre = request.getParameter("inputNombre");
		String inputIngredientes = request.getParameter("inputIngredientes");
		String inputProcedimiento = request.getParameter("inputProcedimiento");
		
		if(inputPerfil.isEmpty()) {
			inputPerfil = "img/defaultRecipeImg.png";
		}else {
			inputPerfil = "img/recipes/" + inputPerfil;
		}
		
		if(inputNombre.isEmpty()) {
			RequestDispatcher rd;
			request.setAttribute("mensaje", "Debe ingresar el nombre del platillo");
			rd = request.getRequestDispatcher("/publicarReceta.jsp");
			rd.forward(request, response);
		}else {
		
			try {
				ingresarDatos(inputNombre, request.getSession().getAttribute("idUsuario").toString(), inputPerfil, inputIngredientes, inputProcedimiento);
				registrar();
				request.getRequestDispatcher("ConsultaReceta").forward(request, response);
			} catch (RemoteException | ServiceException e) {
				e.printStackTrace();
				RequestDispatcher rd;
				request.setAttribute("mensaje", "Esa receta ya existe en el sistema, intente con otro nombre");
				rd = request.getRequestDispatcher("/publicarReceta.jsp");
				rd.forward(request, response);
			}
		}
	}

	public void ingresarDatos(String nombre, String autor, String imagen, String ingredientes, String descripcionDelProceso) throws ServiceException, publicadores.RecetaRepetidaException, RemoteException {
		ControladorRegistrarRecetaPublishService crrps = new ControladorRegistrarRecetaPublishServiceLocator();
		ControladorRegistrarRecetaPublish port = crrps.getControladorRegistrarRecetaPublishPort();
		port.ingresarDatos(nombre, autor, imagen, ingredientes, descripcionDelProceso);
	}
	
	public void registrar() throws ServiceException, RemoteException {
		ControladorRegistrarRecetaPublishService crrps = new ControladorRegistrarRecetaPublishServiceLocator();
		ControladorRegistrarRecetaPublish port = crrps.getControladorRegistrarRecetaPublishPort();
		port.registrar();
	}
}
