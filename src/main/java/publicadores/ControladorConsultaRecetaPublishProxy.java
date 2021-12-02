package publicadores;

public class ControladorConsultaRecetaPublishProxy implements publicadores.ControladorConsultaRecetaPublish {
  private String _endpoint = null;
  private publicadores.ControladorConsultaRecetaPublish controladorConsultaRecetaPublish = null;
  
  public ControladorConsultaRecetaPublishProxy() {
    _initControladorConsultaRecetaPublishProxy();
  }
  
  public ControladorConsultaRecetaPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorConsultaRecetaPublishProxy();
  }
  
  private void _initControladorConsultaRecetaPublishProxy() {
    try {
      controladorConsultaRecetaPublish = (new publicadores.ControladorConsultaRecetaPublishServiceLocator()).getControladorConsultaRecetaPublishPort();
      if (controladorConsultaRecetaPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorConsultaRecetaPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorConsultaRecetaPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorConsultaRecetaPublish != null)
      ((javax.xml.rpc.Stub)controladorConsultaRecetaPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorConsultaRecetaPublish getControladorConsultaRecetaPublish() {
    if (controladorConsultaRecetaPublish == null)
      _initControladorConsultaRecetaPublishProxy();
    return controladorConsultaRecetaPublish;
  }
  
  public publicadores.DtReceta mostrarInfo(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaRecetaPublish == null)
      _initControladorConsultaRecetaPublishProxy();
    return controladorConsultaRecetaPublish.mostrarInfo(arg0);
  }
  
  public publicadores.DtReceta[] listarRecetas() throws java.rmi.RemoteException{
    if (controladorConsultaRecetaPublish == null)
      _initControladorConsultaRecetaPublishProxy();
    return controladorConsultaRecetaPublish.listarRecetas();
  }
  
  
}