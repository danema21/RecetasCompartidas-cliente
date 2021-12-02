/**
 * ControladorConsultaNovedadesPublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorConsultaNovedadesPublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorConsultaNovedadesPublishService {

    public ControladorConsultaNovedadesPublishServiceLocator() {
    }


    public ControladorConsultaNovedadesPublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorConsultaNovedadesPublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorConsultaNovedadesPublishPort
    private java.lang.String ControladorConsultaNovedadesPublishPort_address = "http://localhost:1942/ControladorConsultaNovedadesPublish";

    public java.lang.String getControladorConsultaNovedadesPublishPortAddress() {
        return ControladorConsultaNovedadesPublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorConsultaNovedadesPublishPortWSDDServiceName = "ControladorConsultaNovedadesPublishPort";

    public java.lang.String getControladorConsultaNovedadesPublishPortWSDDServiceName() {
        return ControladorConsultaNovedadesPublishPortWSDDServiceName;
    }

    public void setControladorConsultaNovedadesPublishPortWSDDServiceName(java.lang.String name) {
        ControladorConsultaNovedadesPublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorConsultaNovedadesPublish getControladorConsultaNovedadesPublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorConsultaNovedadesPublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorConsultaNovedadesPublishPort(endpoint);
    }

    public publicadores.ControladorConsultaNovedadesPublish getControladorConsultaNovedadesPublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorConsultaNovedadesPublishPortBindingStub _stub = new publicadores.ControladorConsultaNovedadesPublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorConsultaNovedadesPublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorConsultaNovedadesPublishPortEndpointAddress(java.lang.String address) {
        ControladorConsultaNovedadesPublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorConsultaNovedadesPublish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorConsultaNovedadesPublishPortBindingStub _stub = new publicadores.ControladorConsultaNovedadesPublishPortBindingStub(new java.net.URL(ControladorConsultaNovedadesPublishPort_address), this);
                _stub.setPortName(getControladorConsultaNovedadesPublishPortWSDDServiceName());
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
        if ("ControladorConsultaNovedadesPublishPort".equals(inputPortName)) {
            return getControladorConsultaNovedadesPublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorConsultaNovedadesPublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorConsultaNovedadesPublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorConsultaNovedadesPublishPort".equals(portName)) {
            setControladorConsultaNovedadesPublishPortEndpointAddress(address);
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
