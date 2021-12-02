package publicadores;

public class ControladorRegistarUsuarioPublishProxy implements publicadores.ControladorRegistarUsuarioPublish {
  private String _endpoint = null;
  private publicadores.ControladorRegistarUsuarioPublish controladorRegistarUsuarioPublish = null;
  
  public ControladorRegistarUsuarioPublishProxy() {
    _initControladorRegistarUsuarioPublishProxy();
  }
  
  public ControladorRegistarUsuarioPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorRegistarUsuarioPublishProxy();
  }
  
  private void _initControladorRegistarUsuarioPublishProxy() {
    try {
      controladorRegistarUsuarioPublish = (new publicadores.ControladorRegistarUsuarioPublishServiceLocator()).getControladorRegistarUsuarioPublishPort();
      if (controladorRegistarUsuarioPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorRegistarUsuarioPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorRegistarUsuarioPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorRegistarUsuarioPublish != null)
      ((javax.xml.rpc.Stub)controladorRegistarUsuarioPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorRegistarUsuarioPublish getControladorRegistarUsuarioPublish() {
    if (controladorRegistarUsuarioPublish == null)
      _initControladorRegistarUsuarioPublishProxy();
    return controladorRegistarUsuarioPublish;
  }
  
  public void registrar() throws java.rmi.RemoteException{
    if (controladorRegistarUsuarioPublish == null)
      _initControladorRegistarUsuarioPublishProxy();
    controladorRegistarUsuarioPublish.registrar();
  }
  
  public void ingresarDatos(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, publicadores.UsuarioRepetidoException{
    if (controladorRegistarUsuarioPublish == null)
      _initControladorRegistarUsuarioPublishProxy();
    controladorRegistarUsuarioPublish.ingresarDatos(arg0, arg1, arg2, arg3, arg4);
  }
  
  
}