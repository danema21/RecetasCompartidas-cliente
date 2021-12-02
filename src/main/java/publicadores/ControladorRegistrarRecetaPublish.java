/**
 * ControladorRegistrarRecetaPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorRegistrarRecetaPublish extends java.rmi.Remote {
    public java.lang.String[] listarUsuarios() throws java.rmi.RemoteException;
    public void ingresarDatos(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, publicadores.RecetaRepetidaException;
    public void registrar() throws java.rmi.RemoteException;
}
