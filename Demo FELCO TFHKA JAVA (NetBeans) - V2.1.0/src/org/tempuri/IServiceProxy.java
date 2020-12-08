package org.tempuri;

public class IServiceProxy implements org.tempuri.IService {
  private String _endpoint = null;
  private org.tempuri.IService iService = null;
  
  public IServiceProxy() {
    _initIServiceProxy();
  }
  
  public IServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIServiceProxy();
  }
  
  private void _initIServiceProxy() {
    try {
      iService = (new org.tempuri.ServiceLocator()).getBasicHttpBinding_IService();
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
  
  public org.tempuri.IService getIService() {
    if (iService == null)
      _initIServiceProxy();
    return iService;
  }
  
  public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.DocumentResponse enviar(java.lang.String tokenEmpresa, java.lang.String tokenPassword, org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaGeneral factura, java.lang.String adjuntos) throws java.rmi.RemoteException{
    if (iService == null)
      _initIServiceProxy();
    return iService.enviar(tokenEmpresa, tokenPassword, factura, adjuntos);
  }
  
  public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.DocumentStatusResponse estadoDocumento(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String documento) throws java.rmi.RemoteException{
    if (iService == null)
      _initIServiceProxy();
    return iService.estadoDocumento(tokenEmpresa, tokenPassword, documento);
  }
  
  public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.SendEmailResponse envioCorreo(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String documento, java.lang.String correo) throws java.rmi.RemoteException{
    if (iService == null)
      _initIServiceProxy();
    return iService.envioCorreo(tokenEmpresa, tokenPassword, documento, correo);
  }
  
  public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.DownloadPDFResponse descargaPDF(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String documento) throws java.rmi.RemoteException{
    if (iService == null)
      _initIServiceProxy();
    return iService.descargaPDF(tokenEmpresa, tokenPassword, documento);
  }
  
  public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.DownloadXMLResponse descargaXML(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String documento) throws java.rmi.RemoteException{
    if (iService == null)
      _initIServiceProxy();
    return iService.descargaXML(tokenEmpresa, tokenPassword, documento);
  }
  
  public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.FoliosRemainingResponse foliosRestantes(java.lang.String tokenEmpresa, java.lang.String tokenPassword) throws java.rmi.RemoteException{
    if (iService == null)
      _initIServiceProxy();
    return iService.foliosRestantes(tokenEmpresa, tokenPassword);
  }
  
  public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.LoadCertificateResponse cargarCertificado(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String certificado, java.lang.String password) throws java.rmi.RemoteException{
    if (iService == null)
      _initIServiceProxy();
    return iService.cargarCertificado(tokenEmpresa, tokenPassword, certificado, password);
  }
  
  public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.EventoResponse generarEvento(java.lang.String tokenEmpresa, java.lang.String tokenPassword, org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DatosEvento datosEvento) throws java.rmi.RemoteException{
    if (iService == null)
      _initIServiceProxy();
    return iService.generarEvento(tokenEmpresa, tokenPassword, datosEvento);
  }
  
  public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.DescargarEventoResponse descargarEventoXML(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String documentoEvento, java.lang.String documento) throws java.rmi.RemoteException{
    if (iService == null)
      _initIServiceProxy();
    return iService.descargarEventoXML(tokenEmpresa, tokenPassword, documentoEvento, documento);
  }
  
  public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.ContenedorResponse generarContenedor(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String documento) throws java.rmi.RemoteException{
    if (iService == null)
      _initIServiceProxy();
    return iService.generarContenedor(tokenEmpresa, tokenPassword, documento);
  }
  
  
}