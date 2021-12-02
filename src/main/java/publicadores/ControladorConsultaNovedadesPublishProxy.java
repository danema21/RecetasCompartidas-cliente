package publicadores;

public class ControladorConsultaNovedadesPublishProxy implements publicadores.ControladorConsultaNovedadesPublish {
  private String _endpoint = null;
  private publicadores.ControladorConsultaNovedadesPublish controladorConsultaNovedadesPublish = null;
  
  public ControladorConsultaNovedadesPublishProxy() {
    _initControladorConsultaNovedadesPublishProxy();
  }
  
  public ControladorConsultaNovedadesPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorConsultaNovedadesPublishProxy();
  }
  
  private void _initControladorConsultaNovedadesPublishProxy() {
    try {
      controladorConsultaNovedadesPublish = (new publicadores.ControladorConsultaNovedadesPublishServiceLocator()).getControladorConsultaNovedadesPublishPort();
      if (controladorConsultaNovedadesPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorConsultaNovedadesPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorConsultaNovedadesPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorConsultaNovedadesPublish != null)
      ((javax.xml.rpc.Stub)controladorConsultaNovedadesPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorConsultaNovedadesPublish getControladorConsultaNovedadesPublish() {
    if (controladorConsultaNovedadesPublish == null)
      _initControladorConsultaNovedadesPublishProxy();
    return controladorConsultaNovedadesPublish;
  }
  
  public publicadores.DtNotificacion[] listarNotificaciones() throws java.rmi.RemoteException{
    if (controladorConsultaNovedadesPublish == null)
      _initControladorConsultaNovedadesPublishProxy();
    return controladorConsultaNovedadesPublish.listarNotificaciones();
  }
  
  public publicadores.DtReceta verReceta(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaNovedadesPublish == null)
      _initControladorConsultaNovedadesPublishProxy();
    return controladorConsultaNovedadesPublish.verReceta(arg0);
  }
  
  
}