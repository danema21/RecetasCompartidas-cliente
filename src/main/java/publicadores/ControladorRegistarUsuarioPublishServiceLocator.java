/**
 * ControladorRegistarUsuarioPublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorRegistarUsuarioPublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorRegistarUsuarioPublishService {

    public ControladorRegistarUsuarioPublishServiceLocator() {
    }


    public ControladorRegistarUsuarioPublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorRegistarUsuarioPublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorRegistarUsuarioPublishPort
    private java.lang.String ControladorRegistarUsuarioPublishPort_address = "http://localhost:1942/ControladorRegistrarUsuarioPublish";

    public java.lang.String getControladorRegistarUsuarioPublishPortAddress() {
        return ControladorRegistarUsuarioPublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorRegistarUsuarioPublishPortWSDDServiceName = "ControladorRegistarUsuarioPublishPort";

    public java.lang.String getControladorRegistarUsuarioPublishPortWSDDServiceName() {
        return ControladorRegistarUsuarioPublishPortWSDDServiceName;
    }

    public void setControladorRegistarUsuarioPublishPortWSDDServiceName(java.lang.String name) {
        ControladorRegistarUsuarioPublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorRegistarUsuarioPublish getControladorRegistarUsuarioPublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorRegistarUsuarioPublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorRegistarUsuarioPublishPort(endpoint);
    }

    public publicadores.ControladorRegistarUsuarioPublish getControladorRegistarUsuarioPublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorRegistarUsuarioPublishPortBindingStub _stub = new publicadores.ControladorRegistarUsuarioPublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorRegistarUsuarioPublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorRegistarUsuarioPublishPortEndpointAddress(java.lang.String address) {
        ControladorRegistarUsuarioPublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorRegistarUsuarioPublish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorRegistarUsuarioPublishPortBindingStub _stub = new publicadores.ControladorRegistarUsuarioPublishPortBindingStub(new java.net.URL(ControladorRegistarUsuarioPublishPort_address), this);
                _stub.setPortName(getControladorRegistarUsuarioPublishPortWSDDServiceName());
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
        if ("ControladorRegistarUsuarioPublishPort".equals(inputPortName)) {
            return getControladorRegistarUsuarioPublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorRegistarUsuarioPublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorRegistarUsuarioPublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorRegistarUsuarioPublishPort".equals(portName)) {
            setControladorRegistarUsuarioPublishPortEndpointAddress(address);
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
