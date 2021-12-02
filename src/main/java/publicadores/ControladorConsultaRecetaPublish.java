/**
 * ControladorConsultaRecetaPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorConsultaRecetaPublish extends java.rmi.Remote {
    public publicadores.DtReceta mostrarInfo(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtReceta[] listarRecetas() throws java.rmi.RemoteException;
}
