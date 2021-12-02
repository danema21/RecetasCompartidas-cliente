/**
 * ControladorRegistrarRecetaPublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorRegistrarRecetaPublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorRegistrarRecetaPublishService {

    public ControladorRegistrarRecetaPublishServiceLocator() {
    }


    public ControladorRegistrarRecetaPublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorRegistrarRecetaPublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorRegistrarRecetaPublishPort
    private java.lang.String ControladorRegistrarRecetaPublishPort_address = "http://localhost:1942/ControladorRegistrarRecetaPublish";

    public java.lang.String getControladorRegistrarRecetaPublishPortAddress() {
        return ControladorRegistrarRecetaPublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorRegistrarRecetaPublishPortWSDDServiceName = "ControladorRegistrarRecetaPublishPort";

    public java.lang.String getControladorRegistrarRecetaPublishPortWSDDServiceName() {
        return ControladorRegistrarRecetaPublishPortWSDDServiceName;
    }

    public void setControladorRegistrarRecetaPublishPortWSDDServiceName(java.lang.String name) {
        ControladorRegistrarRecetaPublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorRegistrarRecetaPublish getControladorRegistrarRecetaPublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorRegistrarRecetaPublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorRegistrarRecetaPublishPort(endpoint);
    }

    public publicadores.ControladorRegistrarRecetaPublish getControladorRegistrarRecetaPublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorRegistrarRecetaPublishPortBindingStub _stub = new publicadores.ControladorRegistrarRecetaPublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorRegistrarRecetaPublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorRegistrarRecetaPublishPortEndpointAddress(java.lang.String address) {
        ControladorRegistrarRecetaPublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorRegistrarRecetaPublish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorRegistrarRecetaPublishPortBindingStub _stub = new publicadores.ControladorRegistrarRecetaPublishPortBindingStub(new java.net.URL(ControladorRegistrarRecetaPublishPort_address), this);
                _stub.setPortName(getControladorRegistrarRecetaPublishPortWSDDServiceName());
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
        if ("ControladorRegistrarRecetaPublishPort".equals(inputPortName)) {
            return getControladorRegistrarRecetaPublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorRegistrarRecetaPublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorRegistrarRecetaPublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorRegistrarRecetaPublishPort".equals(portName)) {
            setControladorRegistrarRecetaPublishPortEndpointAddress(address);
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
