/**
 * IService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IService extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.DocumentResponse enviar(java.lang.String tokenEmpresa, java.lang.String tokenPassword, org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaGeneral factura, java.lang.String adjuntos) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.DocumentStatusResponse estadoDocumento(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String documento) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.SendEmailResponse envioCorreo(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String documento, java.lang.String correo) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.DownloadPDFResponse descargaPDF(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String documento) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.DownloadXMLResponse descargaXML(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String documento) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.FoliosRemainingResponse foliosRestantes(java.lang.String tokenEmpresa, java.lang.String tokenPassword) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.LoadCertificateResponse cargarCertificado(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String certificado, java.lang.String password) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.EventoResponse generarEvento(java.lang.String tokenEmpresa, java.lang.String tokenPassword, org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DatosEvento datosEvento) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.DescargarEventoResponse descargarEventoXML(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String documentoEvento, java.lang.String documento) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.ContenedorResponse generarContenedor(java.lang.String tokenEmpresa, java.lang.String tokenPassword, java.lang.String documento) throws java.rmi.RemoteException;
}
