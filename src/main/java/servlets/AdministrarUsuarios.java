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

import publicadores.ControladorAdministrarUsuariosPublish;
import publicadores.ControladorAdministrarUsuariosPublishService;
import publicadores.ControladorAdministrarUsuariosPublishServiceLocator;
import publicadores.DtUsuario;

/**
 * Servlet implementation class AdministrarUsuarios
 */
@WebServlet("/AdministrarUsuarios")
public class AdministrarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministrarUsuarios() {
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
		DtUsuario[] dtusuarios = null;
		DtUsuario[] dtusuariosBloqueados = null;
		String bloqueado = request.getParameter("bloquear");
		String desbloqueado = request.getParameter("desbloquear");
		String eliminado = request.getParameter("eliminar");
		
		HttpSession sesion = request.getSession();
		
		if(bloqueado != null) {
			try {
				bloquearUsuario(bloqueado, (String)sesion.getAttribute("idUsuario"));
			} catch (RemoteException | ServiceException e) {
				e.printStackTrace();
				RequestDispatcher rd;
				request.setAttribute("mensaje", "Algo ocurrio al intentar bloquear el usuario");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
		}
		
		if(desbloqueado != null) {
			try {
				desbloquearUsuario(desbloqueado, (String)sesion.getAttribute("idUsuario"));
			} catch (RemoteException | ServiceException e) {
				e.printStackTrace();
				RequestDispatcher rd;
				request.setAttribute("mensaje", "Algo ocurrio al intentar desbloquear el usuario");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
		}
		
		if(eliminado != null) {
			try {
				eliminarUsuario(eliminado, (String)sesion.getAttribute("idUsuario"));
			} catch (RemoteException | ServiceException e) {
				e.printStackTrace();
				RequestDispatcher rd;
				request.setAttribute("mensaje", "Algo ocurrio al intentar eliminar el usuario");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
		}
		
		try {
			dtusuarios = listarUsuariosNoBaneados();
		} catch (RemoteException | ServiceException e) {
			e.printStackTrace();
			RequestDispatcher rd;
			request.setAttribute("mensaje", "Algo ocurrio al listar los usuarios");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		}
		
		try {
			dtusuariosBloqueados = listarUsuariosBaneados();
		} catch (RemoteException | ServiceException e) {
			e.printStackTrace();
			RequestDispatcher rd;
			request.setAttribute("mensaje", "Algo ocurrio al listar los usuarios bloqueados");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		}
		
		request.setAttribute("usuarios", dtusuarios);
		request.setAttribute("bloqueados", dtusuariosBloqueados);
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/perfil.jsp");
		rd.forward(request, response);
	}
	
	public DtUsuario[] listarUsuariosNoBaneados() throws ServiceException, RemoteException {
		ControladorAdministrarUsuariosPublishService caups = new ControladorAdministrarUsuariosPublishServiceLocator();
    	ControladorAdministrarUsuariosPublish port = caups.getControladorAdministrarUsuariosPublishPort();
    	return port.listarUsuariosNoBaneados();
    }
	
    public DtUsuario[] listarUsuariosBaneados() throws ServiceException, RemoteException {
    	ControladorAdministrarUsuariosPublishService caups = new ControladorAdministrarUsuariosPublishServiceLocator();
    	ControladorAdministrarUsuariosPublish port = caups.getControladorAdministrarUsuariosPublishPort();
    	return port.listarUsuariosBaneados();
    }
    
    public void bloquearUsuario(String idDeUsuario, String idDelAdministrador) throws ServiceException, RemoteException {
    	ControladorAdministrarUsuariosPublishService caups = new ControladorAdministrarUsuariosPublishServiceLocator();
    	ControladorAdministrarUsuariosPublish port = caups.getControladorAdministrarUsuariosPublishPort();
    	port.bloquearUsuario(idDeUsuario, idDelAdministrador);
    }
    
    public void desbloquearUsuario(String idDeUsuario, String idDelAdministrador) throws ServiceException, RemoteException {
    	ControladorAdministrarUsuariosPublishService caups = new ControladorAdministrarUsuariosPublishServiceLocator();
    	ControladorAdministrarUsuariosPublish port = caups.getControladorAdministrarUsuariosPublishPort();
    	port.desbloquearUsuario(idDeUsuario, idDelAdministrador);
    }
    
    public void eliminarUsuario(String idDeUsuario, String idDelAdministrador) throws ServiceException, RemoteException {
    	ControladorAdministrarUsuariosPublishService caups = new ControladorAdministrarUsuariosPublishServiceLocator();
    	ControladorAdministrarUsuariosPublish port = caups.getControladorAdministrarUsuariosPublishPort();
    	port.eliminarUsuario(idDeUsuario, idDelAdministrador);
    }

}
