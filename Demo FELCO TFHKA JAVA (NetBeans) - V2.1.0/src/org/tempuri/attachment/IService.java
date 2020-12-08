/**
 * IService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.attachment;

public interface IService extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.UploadAttachmentResponse cargarAdjuntos(java.lang.String tokenEmpresa, java.lang.String tokenPassword, org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargarAdjuntos adjunto) throws java.rmi.RemoteException;
}
