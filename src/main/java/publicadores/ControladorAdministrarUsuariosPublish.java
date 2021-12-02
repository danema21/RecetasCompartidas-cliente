/**
 * ControladorAdministrarUsuariosPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorAdministrarUsuariosPublish extends java.rmi.Remote {
    public void eliminarUsuario(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public void bloquearUsuario(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public publicadores.DtUsuario[] listarUsuariosNoBaneados() throws java.rmi.RemoteException;
    public publicadores.DtUsuario[] listarUsuariosBaneados() throws java.rmi.RemoteException;
    public void desbloquearUsuario(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
}
