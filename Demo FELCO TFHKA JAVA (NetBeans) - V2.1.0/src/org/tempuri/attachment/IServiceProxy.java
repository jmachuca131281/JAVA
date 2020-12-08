package org.tempuri.attachment;

public class IServiceProxy implements org.tempuri.attachment.IService {
  private String _endpoint = null;
  private org.tempuri.attachment.IService iService = null;
  
  public IServiceProxy() {
    _initIServiceProxy();
  }
  
  public IServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIServiceProxy();
  }
  
  private void _initIServiceProxy() {
    try {
      iService = (new org.tempuri.attachment.ServiceLocator()).getBasicHttpBinding_IService();
      if (iService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iService != null)
      ((javax.xml.rpc.Stub)iService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.attachment.IService getIService() {
    if (iService == null)
      _initIServiceProxy();
    return iService;
  }
  
  public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.UploadAttachmentResponse cargarAdjuntos(java.lang.String tokenEmpresa, java.lang.String tokenPassword, org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargarAdjuntos adjunto) throws java.rmi.RemoteException{
    if (iService == null)
      _initIServiceProxy();
    return iService.cargarAdjuntos(tokenEmpresa, tokenPassword, adjunto);
  }
  
  
}