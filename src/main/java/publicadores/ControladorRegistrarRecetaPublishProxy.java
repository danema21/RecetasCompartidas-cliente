package publicadores;

public class ControladorRegistrarRecetaPublishProxy implements publicadores.ControladorRegistrarRecetaPublish {
  private String _endpoint = null;
  private publicadores.ControladorRegistrarRecetaPublish controladorRegistrarRecetaPublish = null;
  
  public ControladorRegistrarRecetaPublishProxy() {
    _initControladorRegistrarRecetaPublishProxy();
  }
  
  public ControladorRegistrarRecetaPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorRegistrarRecetaPublishProxy();
  }
  
  private void _initControladorRegistrarRecetaPublishProxy() {
    try {
      controladorRegistrarRecetaPublish = (new publicadores.ControladorRegistrarRecetaPublishServiceLocator()).getControladorRegistrarRecetaPublishPort();
      if (controladorRegistrarRecetaPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorRegistrarRecetaPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorRegistrarRecetaPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorRegistrarRecetaPublish != null)
      ((javax.xml.rpc.Stub)controladorRegistrarRecetaPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorRegistrarRecetaPublish getControladorRegistrarRecetaPublish() {
    if (controladorRegistrarRecetaPublish == null)
      _initControladorRegistrarRecetaPublishProxy();
    return controladorRegistrarRecetaPublish;
  }
  
  public java.lang.String[] listarUsuarios() throws java.rmi.RemoteException{
    if (controladorRegistrarRecetaPublish == null)
      _initControladorRegistrarRecetaPublishProxy();
    return controladorRegistrarRecetaPublish.listarUsuarios();
  }
  
  public void ingresarDatos(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, publicadores.RecetaRepetidaException{
    if (controladorRegistrarRecetaPublish == null)
      _initControladorRegistrarRecetaPublishProxy();
    controladorRegistrarRecetaPublish.ingresarDatos(arg0, arg1, arg2, arg3, arg4);
  }
  
  public void registrar() throws java.rmi.RemoteException{
    if (controladorRegistrarRecetaPublish == null)
      _initControladorRegistrarRecetaPublishProxy();
    controladorRegistrarRecetaPublish.registrar();
  }
  
  
}