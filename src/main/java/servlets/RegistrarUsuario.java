package servlets;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import publicadores.ControladorRegistarUsuarioPublish;
import publicadores.ControladorRegistarUsuarioPublishService;
import publicadores.ControladorRegistarUsuarioPublishServiceLocator;

/**
 * Servlet implementation class RegistrarUsuario
 */
@WebServlet("/RegistrarUsuario")
public class RegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarUsuario() {
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
		String idUsuario = request.getParameter("inputIdUsuario");
		String nombre = request.getParameter("inputNombre");
		String apellido = request.getParameter("inputApellido");
		String password = request.getParameter("inputPassword");
		String confPassword = request.getParameter("inputConfPassword");
		String urlImagen = request.getParameter("inputPerfil");
		
		
		if(password.equals(confPassword)) {
			try {
				ingresarDatos(idUsuario, nombre, apellido, password, urlImagen);
				registrar();
				
				HttpSession sesion = request.getSession();
				sesion.setAttribute("idUsuario", idUsuario);
				request.getRequestDispatcher("ConsultarNovedades").forward(request, response);
			} catch (RemoteException | ServiceException e) {
				e.printStackTrace();
				RequestDispatcher rd;
				request.setAttribute("mensaje", "Ya existe una persona con el mismo nombre de usuario");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
		}else {
			RequestDispatcher rd;
			request.setAttribute("mensaje", "La password de confirmacion no coincide con la original");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		}
		
		doGet(request, response);
	}
	
	public void ingresarDatos(String idDeUsuario, String nombre, String apellido, String password, String imagenDePerfil) throws ServiceException, publicadores.UsuarioRepetidoException, RemoteException {
		ControladorRegistarUsuarioPublishService crups = new ControladorRegistarUsuarioPublishServiceLocator();
		ControladorRegistarUsuarioPublish port = crups.getControladorRegistarUsuarioPublishPort();
		port.ingresarDatos(idDeUsuario, nombre, apellido, password, imagenDePerfil);
	}

	public void registrar() throws ServiceException, RemoteException {
		ControladorRegistarUsuarioPublishService crups = new ControladorRegistarUsuarioPublishServiceLocator();
		ControladorRegistarUsuarioPublish port = crups.getControladorRegistarUsuarioPublishPort();
		port.registrar();
	}
}
