package publicadores;

public class ControladorAdministrarUsuariosPublishProxy implements publicadores.ControladorAdministrarUsuariosPublish {
  private String _endpoint = null;
  private publicadores.ControladorAdministrarUsuariosPublish controladorAdministrarUsuariosPublish = null;
  
  public ControladorAdministrarUsuariosPublishProxy() {
    _initControladorAdministrarUsuariosPublishProxy();
  }
  
  public ControladorAdministrarUsuariosPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorAdministrarUsuariosPublishProxy();
  }
  
  private void _initControladorAdministrarUsuariosPublishProxy() {
    try {
      controladorAdministrarUsuariosPublish = (new publicadores.ControladorAdministrarUsuariosPublishServiceLocator()).getControladorAdministrarUsuariosPublishPort();
      if (controladorAdministrarUsuariosPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorAdministrarUsuariosPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorAdministrarUsuariosPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorAdministrarUsuariosPublish != null)
      ((javax.xml.rpc.Stub)controladorAdministrarUsuariosPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorAdministrarUsuariosPublish getControladorAdministrarUsuariosPublish() {
    if (controladorAdministrarUsuariosPublish == null)
      _initControladorAdministrarUsuariosPublishProxy();
    return controladorAdministrarUsuariosPublish;
  }
  
  public void eliminarUsuario(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (controladorAdministrarUsuariosPublish == null)
      _initControladorAdministrarUsuariosPublishProxy();
    controladorAdministrarUsuariosPublish.eliminarUsuario(arg0, arg1);
  }
  
  public void bloquearUsuario(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (controladorAdministrarUsuariosPublish == null)
      _initControladorAdministrarUsuariosPublishProxy();
    controladorAdministrarUsuariosPublish.bloquearUsuario(arg0, arg1);
  }
  
  public publicadores.DtUsuario[] listarUsuariosNoBaneados() throws java.rmi.RemoteException{
    if (controladorAdministrarUsuariosPublish == null)
      _initControladorAdministrarUsuariosPublishProxy();
    return controladorAdministrarUsuariosPublish.listarUsuariosNoBaneados();
  }
  
  public publicadores.DtUsuario[] listarUsuariosBaneados() throws java.rmi.RemoteException{
    if (controladorAdministrarUsuariosPublish == null)
      _initControladorAdministrarUsuariosPublishProxy();
    return controladorAdministrarUsuariosPublish.listarUsuariosBaneados();
  }
  
  public void desbloquearUsuario(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (controladorAdministrarUsuariosPublish == null)
      _initControladorAdministrarUsuariosPublishProxy();
    controladorAdministrarUsuariosPublish.desbloquearUsuario(arg0, arg1);
  }
  
  
}