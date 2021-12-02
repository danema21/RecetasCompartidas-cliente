/**
 * ControladorAdministrarUsuariosPublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorAdministrarUsuariosPublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorAdministrarUsuariosPublishService {

    public ControladorAdministrarUsuariosPublishServiceLocator() {
    }


    public ControladorAdministrarUsuariosPublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorAdministrarUsuariosPublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorAdministrarUsuariosPublishPort
    private java.lang.String ControladorAdministrarUsuariosPublishPort_address = "http://localhost:1942/ControladorAdministrarUsuariosPublish";

    public java.lang.String getControladorAdministrarUsuariosPublishPortAddress() {
        return ControladorAdministrarUsuariosPublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorAdministrarUsuariosPublishPortWSDDServiceName = "ControladorAdministrarUsuariosPublishPort";

    public java.lang.String getControladorAdministrarUsuariosPublishPortWSDDServiceName() {
        return ControladorAdministrarUsuariosPublishPortWSDDServiceName;
    }

    public void setControladorAdministrarUsuariosPublishPortWSDDServiceName(java.lang.String name) {
        ControladorAdministrarUsuariosPublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorAdministrarUsuariosPublish getControladorAdministrarUsuariosPublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorAdministrarUsuariosPublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorAdministrarUsuariosPublishPort(endpoint);
    }

    public publicadores.ControladorAdministrarUsuariosPublish getControladorAdministrarUsuariosPublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorAdministrarUsuariosPublishPortBindingStub _stub = new publicadores.ControladorAdministrarUsuariosPublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorAdministrarUsuariosPublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorAdministrarUsuariosPublishPortEndpointAddress(java.lang.String address) {
        ControladorAdministrarUsuariosPublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorAdministrarUsuariosPublish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorAdministrarUsuariosPublishPortBindingStub _stub = new publicadores.ControladorAdministrarUsuariosPublishPortBindingStub(new java.net.URL(ControladorAdministrarUsuariosPublishPort_address), this);
                _stub.setPortName(getControladorAdministrarUsuariosPublishPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ControladorAdministrarUsuariosPublishPort".equals(inputPortName)) {
            return getControladorAdministrarUsuariosPublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorAdministrarUsuariosPublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorAdministrarUsuariosPublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorAdministrarUsuariosPublishPort".equals(portName)) {
            setControladorAdministrarUsuariosPublishPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
