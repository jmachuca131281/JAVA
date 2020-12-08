/**
 * FacturaDetalle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class FacturaDetalle  implements java.io.Serializable {
    private java.lang.String cantidadPorEmpaque;

    private java.lang.String cantidadReal;

    private java.lang.String cantidadRealUnidadMedida;

    private java.lang.String cantidadUnidades;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargosDescuentos[] cargosDescuentos;

    private java.lang.String codigoFabricante;

    private java.lang.String codigoIdentificadorPais;

    private java.lang.String codigoProducto;

    private java.lang.String codigoTipoPrecio;

    private java.lang.String descripcion;

    private java.lang.String descripcionTecnica;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DocumentoReferenciado[] documentosReferenciados;

    private java.lang.String estandarCodigo;

    private java.lang.String estandarCodigoID;

    private java.lang.String estandarCodigoIdentificador;

    private java.lang.String estandarCodigoNombre;

    private java.lang.String estandarCodigoProducto;

    private java.lang.String estandarOrganizacion;

    private java.lang.String estandarSubCodigoProducto;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaImpuestos[] impuestosDetalles;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.ImpuestosTotales[] impuestosTotales;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.LineaInformacionAdicional[] informacionAdicional;

    private java.lang.String mandatorioNumeroIdentificacion;

    private java.lang.String mandatorioNumeroIdentificacionDV;

    private java.lang.String mandatorioTipoIdentificacion;

    private java.lang.String marca;

    private java.lang.String modelo;

    private java.lang.String muestraGratis;

    private java.lang.String nombreFabricante;

    private java.lang.String nota;

    private java.lang.String precioReferencia;

    private java.lang.String precioTotal;

    private java.lang.String precioTotalSinImpuestos;

    private java.lang.String precioVentaUnitario;

    private java.lang.String secuencia;

    private java.lang.String seriales;

    private java.lang.String subCodigoFabricante;

    private java.lang.String subCodigoProducto;

    private java.lang.String tipoAIU;

    private java.lang.String unidadMedida;

    public FacturaDetalle() {
    }

    public FacturaDetalle(
           java.lang.String cantidadPorEmpaque,
           java.lang.String cantidadReal,
           java.lang.String cantidadRealUnidadMedida,
           java.lang.String cantidadUnidades,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargosDescuentos[] cargosDescuentos,
           java.lang.String codigoFabricante,
           java.lang.String codigoIdentificadorPais,
           java.lang.String codigoProducto,
           java.lang.String codigoTipoPrecio,
           java.lang.String descripcion,
           java.lang.String descripcionTecnica,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DocumentoReferenciado[] documentosReferenciados,
           java.lang.String estandarCodigo,
           java.lang.String estandarCodigoID,
           java.lang.String estandarCodigoIdentificador,
           java.lang.String estandarCodigoNombre,
           java.lang.String estandarCodigoProducto,
           java.lang.String estandarOrganizacion,
           java.lang.String estandarSubCodigoProducto,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaImpuestos[] impuestosDetalles,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.ImpuestosTotales[] impuestosTotales,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.LineaInformacionAdicional[] informacionAdicional,
           java.lang.String mandatorioNumeroIdentificacion,
           java.lang.String mandatorioNumeroIdentificacionDV,
           java.lang.String mandatorioTipoIdentificacion,
           java.lang.String marca,
           java.lang.String modelo,
           java.lang.String muestraGratis,
           java.lang.String nombreFabricante,
           java.lang.String nota,
           java.lang.String precioReferencia,
           java.lang.String precioTotal,
           java.lang.String precioTotalSinImpuestos,
           java.lang.String precioVentaUnitario,
           java.lang.String secuencia,
           java.lang.String seriales,
           java.lang.String subCodigoFabricante,
           java.lang.String subCodigoProducto,
           java.lang.String tipoAIU,
           java.lang.String unidadMedida) {
           this.cantidadPorEmpaque = cantidadPorEmpaque;
           this.cantidadReal = cantidadReal;
           this.cantidadRealUnidadMedida = cantidadRealUnidadMedida;
           this.cantidadUnidades = cantidadUnidades;
           this.cargosDescuentos = cargosDescuentos;
           this.codigoFabricante = codigoFabricante;
           this.codigoIdentificadorPais = codigoIdentificadorPais;
           this.codigoProducto = codigoProducto;
           this.codigoTipoPrecio = codigoTipoPrecio;
           this.descripcion = descripcion;
           this.descripcionTecnica = descripcionTecnica;
           this.documentosReferenciados = documentosReferenciados;
           this.estandarCodigo = estandarCodigo;
           this.estandarCodigoID = estandarCodigoID;
           this.estandarCodigoIdentificador = estandarCodigoIdentificador;
           this.estandarCodigoNombre = estandarCodigoNombre;
           this.estandarCodigoProducto = estandarCodigoProducto;
           this.estandarOrganizacion = estandarOrganizacion;
           this.estandarSubCodigoProducto = estandarSubCodigoProducto;
           this.extras = extras;
           this.impuestosDetalles = impuestosDetalles;
           this.impuestosTotales = impuestosTotales;
           this.informacionAdicional = informacionAdicional;
           this.mandatorioNumeroIdentificacion = mandatorioNumeroIdentificacion;
           this.mandatorioNumeroIdentificacionDV = mandatorioNumeroIdentificacionDV;
           this.mandatorioTipoIdentificacion = mandatorioTipoIdentificacion;
           this.marca = marca;
           this.modelo = modelo;
           this.muestraGratis = muestraGratis;
           this.nombreFabricante = nombreFabricante;
           this.nota = nota;
           this.precioReferencia = precioReferencia;
           this.precioTotal = precioTotal;
           this.precioTotalSinImpuestos = precioTotalSinImpuestos;
           this.precioVentaUnitario = precioVentaUnitario;
           this.secuencia = secuencia;
           this.seriales = seriales;
           this.subCodigoFabricante = subCodigoFabricante;
           this.subCodigoProducto = subCodigoProducto;
           this.tipoAIU = tipoAIU;
           this.unidadMedida = unidadMedida;
    }


    /**
     * Gets the cantidadPorEmpaque value for this FacturaDetalle.
     * 
     * @return cantidadPorEmpaque
     */
    public java.lang.String getCantidadPorEmpaque() {
        return cantidadPorEmpaque;
    }


    /**
     * Sets the cantidadPorEmpaque value for this FacturaDetalle.
     * 
     * @param cantidadPorEmpaque
     */
    public void setCantidadPorEmpaque(java.lang.String cantidadPorEmpaque) {
        this.cantidadPorEmpaque = cantidadPorEmpaque;
    }


    /**
     * Gets the cantidadReal value for this FacturaDetalle.
     * 
     * @return cantidadReal
     */
    public java.lang.String getCantidadReal() {
        return cantidadReal;
    }


    /**
     * Sets the cantidadReal value for this FacturaDetalle.
     * 
     * @param cantidadReal
     */
    public void setCantidadReal(java.lang.String cantidadReal) {
        this.cantidadReal = cantidadReal;
    }


    /**
     * Gets the cantidadRealUnidadMedida value for this FacturaDetalle.
     * 
     * @return cantidadRealUnidadMedida
     */
    public java.lang.String getCantidadRealUnidadMedida() {
        return cantidadRealUnidadMedida;
    }


    /**
     * Sets the cantidadRealUnidadMedida value for this FacturaDetalle.
     * 
     * @param cantidadRealUnidadMedida
     */
    public void setCantidadRealUnidadMedida(java.lang.String cantidadRealUnidadMedida) {
        this.cantidadRealUnidadMedida = cantidadRealUnidadMedida;
    }


    /**
     * Gets the cantidadUnidades value for this FacturaDetalle.
     * 
     * @return cantidadUnidades
     */
    public java.lang.String getCantidadUnidades() {
        return cantidadUnidades;
    }


    /**
     * Sets the cantidadUnidades value for this FacturaDetalle.
     * 
     * @param cantidadUnidades
     */
    public void setCantidadUnidades(java.lang.String cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }


    /**
     * Gets the cargosDescuentos value for this FacturaDetalle.
     * 
     * @return cargosDescuentos
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargosDescuentos[] getCargosDescuentos() {
        return cargosDescuentos;
    }


    /**
     * Sets the cargosDescuentos value for this FacturaDetalle.
     * 
     * @param cargosDescuentos
     */
    public void setCargosDescuentos(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargosDescuentos[] cargosDescuentos) {
        this.cargosDescuentos = cargosDescuentos;
    }


    /**
     * Gets the codigoFabricante value for this FacturaDetalle.
     * 
     * @return codigoFabricante
     */
    public java.lang.String getCodigoFabricante() {
        return codigoFabricante;
    }


    /**
     * Sets the codigoFabricante value for this FacturaDetalle.
     * 
     * @param codigoFabricante
     */
    public void setCodigoFabricante(java.lang.String codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }


    /**
     * Gets the codigoIdentificadorPais value for this FacturaDetalle.
     * 
     * @return codigoIdentificadorPais
     */
    public java.lang.String getCodigoIdentificadorPais() {
        return codigoIdentificadorPais;
    }


    /**
     * Sets the codigoIdentificadorPais value for this FacturaDetalle.
     * 
     * @param codigoIdentificadorPais
     */
    public void setCodigoIdentificadorPais(java.lang.String codigoIdentificadorPais) {
        this.codigoIdentificadorPais = codigoIdentificadorPais;
    }


    /**
     * Gets the codigoProducto value for this FacturaDetalle.
     * 
     * @return codigoProducto
     */
    public java.lang.String getCodigoProducto() {
        return codigoProducto;
    }


    /**
     * Sets the codigoProducto value for this FacturaDetalle.
     * 
     * @param codigoProducto
     */
    public void setCodigoProducto(java.lang.String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }


    /**
     * Gets the codigoTipoPrecio value for this FacturaDetalle.
     * 
     * @return codigoTipoPrecio
     */
    public java.lang.String getCodigoTipoPrecio() {
        return codigoTipoPrecio;
    }


    /**
     * Sets the codigoTipoPrecio value for this FacturaDetalle.
     * 
     * @param codigoTipoPrecio
     */
    public void setCodigoTipoPrecio(java.lang.String codigoTipoPrecio) {
        this.codigoTipoPrecio = codigoTipoPrecio;
    }


    /**
     * Gets the descripcion value for this FacturaDetalle.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this FacturaDetalle.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the descripcionTecnica value for this FacturaDetalle.
     * 
     * @return descripcionTecnica
     */
    public java.lang.String getDescripcionTecnica() {
        return descripcionTecnica;
    }


    /**
     * Sets the descripcionTecnica value for this FacturaDetalle.
     * 
     * @param descripcionTecnica
     */
    public void setDescripcionTecnica(java.lang.String descripcionTecnica) {
        this.descripcionTecnica = descripcionTecnica;
    }


    /**
     * Gets the documentosReferenciados value for this FacturaDetalle.
     * 
     * @return documentosReferenciados
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DocumentoReferenciado[] getDocumentosReferenciados() {
        return documentosReferenciados;
    }


    /**
     * Sets the documentosReferenciados value for this FacturaDetalle.
     * 
     * @param documentosReferenciados
     */
    public void setDocumentosReferenciados(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DocumentoReferenciado[] documentosReferenciados) {
        this.documentosReferenciados = documentosReferenciados;
    }


    /**
     * Gets the estandarCodigo value for this FacturaDetalle.
     * 
     * @return estandarCodigo
     */
    public java.lang.String getEstandarCodigo() {
        return estandarCodigo;
    }


    /**
     * Sets the estandarCodigo value for this FacturaDetalle.
     * 
     * @param estandarCodigo
     */
    public void setEstandarCodigo(java.lang.String estandarCodigo) {
        this.estandarCodigo = estandarCodigo;
    }


    /**
     * Gets the estandarCodigoID value for this FacturaDetalle.
     * 
     * @return estandarCodigoID
     */
    public java.lang.String getEstandarCodigoID() {
        return estandarCodigoID;
    }


    /**
     * Sets the estandarCodigoID value for this FacturaDetalle.
     * 
     * @param estandarCodigoID
     */
    public void setEstandarCodigoID(java.lang.String estandarCodigoID) {
        this.estandarCodigoID = estandarCodigoID;
    }


    /**
     * Gets the estandarCodigoIdentificador value for this FacturaDetalle.
     * 
     * @return estandarCodigoIdentificador
     */
    public java.lang.String getEstandarCodigoIdentificador() {
        return estandarCodigoIdentificador;
    }


    /**
     * Sets the estandarCodigoIdentificador value for this FacturaDetalle.
     * 
     * @param estandarCodigoIdentificador
     */
    public void setEstandarCodigoIdentificador(java.lang.String estandarCodigoIdentificador) {
        this.estandarCodigoIdentificador = estandarCodigoIdentificador;
    }


    /**
     * Gets the estandarCodigoNombre value for this FacturaDetalle.
     * 
     * @return estandarCodigoNombre
     */
    public java.lang.String getEstandarCodigoNombre() {
        return estandarCodigoNombre;
    }


    /**
     * Sets the estandarCodigoNombre value for this FacturaDetalle.
     * 
     * @param estandarCodigoNombre
     */
    public void setEstandarCodigoNombre(java.lang.String estandarCodigoNombre) {
        this.estandarCodigoNombre = estandarCodigoNombre;
    }


    /**
     * Gets the estandarCodigoProducto value for this FacturaDetalle.
     * 
     * @return estandarCodigoProducto
     */
    public java.lang.String getEstandarCodigoProducto() {
        return estandarCodigoProducto;
    }


    /**
     * Sets the estandarCodigoProducto value for this FacturaDetalle.
     * 
     * @param estandarCodigoProducto
     */
    public void setEstandarCodigoProducto(java.lang.String estandarCodigoProducto) {
        this.estandarCodigoProducto = estandarCodigoProducto;
    }


    /**
     * Gets the estandarOrganizacion value for this FacturaDetalle.
     * 
     * @return estandarOrganizacion
     */
    public java.lang.String getEstandarOrganizacion() {
        return estandarOrganizacion;
    }


    /**
     * Sets the estandarOrganizacion value for this FacturaDetalle.
     * 
     * @param estandarOrganizacion
     */
    public void setEstandarOrganizacion(java.lang.String estandarOrganizacion) {
        this.estandarOrganizacion = estandarOrganizacion;
    }


    /**
     * Gets the estandarSubCodigoProducto value for this FacturaDetalle.
     * 
     * @return estandarSubCodigoProducto
     */
    public java.lang.String getEstandarSubCodigoProducto() {
        return estandarSubCodigoProducto;
    }


    /**
     * Sets the estandarSubCodigoProducto value for this FacturaDetalle.
     * 
     * @param estandarSubCodigoProducto
     */
    public void setEstandarSubCodigoProducto(java.lang.String estandarSubCodigoProducto) {
        this.estandarSubCodigoProducto = estandarSubCodigoProducto;
    }


    /**
     * Gets the extras value for this FacturaDetalle.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this FacturaDetalle.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras) {
        this.extras = extras;
    }


    /**
     * Gets the impuestosDetalles value for this FacturaDetalle.
     * 
     * @return impuestosDetalles
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaImpuestos[] getImpuestosDetalles() {
        return impuestosDetalles;
    }


    /**
     * Sets the impuestosDetalles value for this FacturaDetalle.
     * 
     * @param impuestosDetalles
     */
    public void setImpuestosDetalles(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaImpuestos[] impuestosDetalles) {
        this.impuestosDetalles = impuestosDetalles;
    }


    /**
     * Gets the impuestosTotales value for this FacturaDetalle.
     * 
     * @return impuestosTotales
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.ImpuestosTotales[] getImpuestosTotales() {
        return impuestosTotales;
    }


    /**
     * Sets the impuestosTotales value for this FacturaDetalle.
     * 
     * @param impuestosTotales
     */
    public void setImpuestosTotales(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.ImpuestosTotales[] impuestosTotales) {
        this.impuestosTotales = impuestosTotales;
    }


    /**
     * Gets the informacionAdicional value for this FacturaDetalle.
     * 
     * @return informacionAdicional
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.LineaInformacionAdicional[] getInformacionAdicional() {
        return informacionAdicional;
    }


    /**
     * Sets the informacionAdicional value for this FacturaDetalle.
     * 
     * @param informacionAdicional
     */
    public void setInformacionAdicional(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.LineaInformacionAdicional[] informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }


    /**
     * Gets the mandatorioNumeroIdentificacion value for this FacturaDetalle.
     * 
     * @return mandatorioNumeroIdentificacion
     */
    public java.lang.String getMandatorioNumeroIdentificacion() {
        return mandatorioNumeroIdentificacion;
    }


    /**
     * Sets the mandatorioNumeroIdentificacion value for this FacturaDetalle.
     * 
     * @param mandatorioNumeroIdentificacion
     */
    public void setMandatorioNumeroIdentificacion(java.lang.String mandatorioNumeroIdentificacion) {
        this.mandatorioNumeroIdentificacion = mandatorioNumeroIdentificacion;
    }


    /**
     * Gets the mandatorioNumeroIdentificacionDV value for this FacturaDetalle.
     * 
     * @return mandatorioNumeroIdentificacionDV
     */
    public java.lang.String getMandatorioNumeroIdentificacionDV() {
        return mandatorioNumeroIdentificacionDV;
    }


    /**
     * Sets the mandatorioNumeroIdentificacionDV value for this FacturaDetalle.
     * 
     * @param mandatorioNumeroIdentificacionDV
     */
    public void setMandatorioNumeroIdentificacionDV(java.lang.String mandatorioNumeroIdentificacionDV) {
        this.mandatorioNumeroIdentificacionDV = mandatorioNumeroIdentificacionDV;
    }


    /**
     * Gets the mandatorioTipoIdentificacion value for this FacturaDetalle.
     * 
     * @return mandatorioTipoIdentificacion
     */
    public java.lang.String getMandatorioTipoIdentificacion() {
        return mandatorioTipoIdentificacion;
    }


    /**
     * Sets the mandatorioTipoIdentificacion value for this FacturaDetalle.
     * 
     * @param mandatorioTipoIdentificacion
     */
    public void setMandatorioTipoIdentificacion(java.lang.String mandatorioTipoIdentificacion) {
        this.mandatorioTipoIdentificacion = mandatorioTipoIdentificacion;
    }


    /**
     * Gets the marca value for this FacturaDetalle.
     * 
     * @return marca
     */
    public java.lang.String getMarca() {
        return marca;
    }


    /**
     * Sets the marca value for this FacturaDetalle.
     * 
     * @param marca
     */
    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }


    /**
     * Gets the modelo value for this FacturaDetalle.
     * 
     * @return modelo
     */
    public java.lang.String getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this FacturaDetalle.
     * 
     * @param modelo
     */
    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }


    /**
     * Gets the muestraGratis value for this FacturaDetalle.
     * 
     * @return muestraGratis
     */
    public java.lang.String getMuestraGratis() {
        return muestraGratis;
    }


    /**
     * Sets the muestraGratis value for this FacturaDetalle.
     * 
     * @param muestraGratis
     */
    public void setMuestraGratis(java.lang.String muestraGratis) {
        this.muestraGratis = muestraGratis;
    }


    /**
     * Gets the nombreFabricante value for this FacturaDetalle.
     * 
     * @return nombreFabricante
     */
    public java.lang.String getNombreFabricante() {
        return nombreFabricante;
    }


    /**
     * Sets the nombreFabricante value for this FacturaDetalle.
     * 
     * @param nombreFabricante
     */
    public void setNombreFabricante(java.lang.String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }


    /**
     * Gets the nota value for this FacturaDetalle.
     * 
     * @return nota
     */
    public java.lang.String getNota() {
        return nota;
    }


    /**
     * Sets the nota value for this FacturaDetalle.
     * 
     * @param nota
     */
    public void setNota(java.lang.String nota) {
        this.nota = nota;
    }


    /**
     * Gets the precioReferencia value for this FacturaDetalle.
     * 
     * @return precioReferencia
     */
    public java.lang.String getPrecioReferencia() {
        return precioReferencia;
    }


    /**
     * Sets the precioReferencia value for this FacturaDetalle.
     * 
     * @param precioReferencia
     */
    public void setPrecioReferencia(java.lang.String precioReferencia) {
        this.precioReferencia = precioReferencia;
    }


    /**
     * Gets the precioTotal value for this FacturaDetalle.
     * 
     * @return precioTotal
     */
    public java.lang.String getPrecioTotal() {
        return precioTotal;
    }


    /**
     * Sets the precioTotal value for this FacturaDetalle.
     * 
     * @param precioTotal
     */
    public void setPrecioTotal(java.lang.String precioTotal) {
        this.precioTotal = precioTotal;
    }


    /**
     * Gets the precioTotalSinImpuestos value for this FacturaDetalle.
     * 
     * @return precioTotalSinImpuestos
     */
    public java.lang.String getPrecioTotalSinImpuestos() {
        return precioTotalSinImpuestos;
    }


    /**
     * Sets the precioTotalSinImpuestos value for this FacturaDetalle.
     * 
     * @param precioTotalSinImpuestos
     */
    public void setPrecioTotalSinImpuestos(java.lang.String precioTotalSinImpuestos) {
        this.precioTotalSinImpuestos = precioTotalSinImpuestos;
    }


    /**
     * Gets the precioVentaUnitario value for this FacturaDetalle.
     * 
     * @return precioVentaUnitario
     */
    public java.lang.String getPrecioVentaUnitario() {
        return precioVentaUnitario;
    }


    /**
     * Sets the precioVentaUnitario value for this FacturaDetalle.
     * 
     * @param precioVentaUnitario
     */
    public void setPrecioVentaUnitario(java.lang.String precioVentaUnitario) {
        this.precioVentaUnitario = precioVentaUnitario;
    }


    /**
     * Gets the secuencia value for this FacturaDetalle.
     * 
     * @return secuencia
     */
    public java.lang.String getSecuencia() {
        return secuencia;
    }


    /**
     * Sets the secuencia value for this FacturaDetalle.
     * 
     * @param secuencia
     */
    public void setSecuencia(java.lang.String secuencia) {
        this.secuencia = secuencia;
    }


    /**
     * Gets the seriales value for this FacturaDetalle.
     * 
     * @return seriales
     */
    public java.lang.String getSeriales() {
        return seriales;
    }


    /**
     * Sets the seriales value for this FacturaDetalle.
     * 
     * @param seriales
     */
    public void setSeriales(java.lang.String seriales) {
        this.seriales = seriales;
    }


    /**
     * Gets the subCodigoFabricante value for this FacturaDetalle.
     * 
     * @return subCodigoFabricante
     */
    public java.lang.String getSubCodigoFabricante() {
        return subCodigoFabricante;
    }


    /**
     * Sets the subCodigoFabricante value for this FacturaDetalle.
     * 
     * @param subCodigoFabricante
     */
    public void setSubCodigoFabricante(java.lang.String subCodigoFabricante) {
        this.subCodigoFabricante = subCodigoFabricante;
    }


    /**
     * Gets the subCodigoProducto value for this FacturaDetalle.
     * 
     * @return subCodigoProducto
     */
    public java.lang.String getSubCodigoProducto() {
        return subCodigoProducto;
    }


    /**
     * Sets the subCodigoProducto value for this FacturaDetalle.
     * 
     * @param subCodigoProducto
     */
    public void setSubCodigoProducto(java.lang.String subCodigoProducto) {
        this.subCodigoProducto = subCodigoProducto;
    }


    /**
     * Gets the tipoAIU value for this FacturaDetalle.
     * 
     * @return tipoAIU
     */
    public java.lang.String getTipoAIU() {
        return tipoAIU;
    }


    /**
     * Sets the tipoAIU value for this FacturaDetalle.
     * 
     * @param tipoAIU
     */
    public void setTipoAIU(java.lang.String tipoAIU) {
        this.tipoAIU = tipoAIU;
    }


    /**
     * Gets the unidadMedida value for this FacturaDetalle.
     * 
     * @return unidadMedida
     */
    public java.lang.String getUnidadMedida() {
        return unidadMedida;
    }


    /**
     * Sets the unidadMedida value for this FacturaDetalle.
     * 
     * @param unidadMedida
     */
    public void setUnidadMedida(java.lang.String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FacturaDetalle)) return false;
        FacturaDetalle other = (FacturaDetalle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cantidadPorEmpaque==null && other.getCantidadPorEmpaque()==null) || 
             (this.cantidadPorEmpaque!=null &&
              this.cantidadPorEmpaque.equals(other.getCantidadPorEmpaque()))) &&
            ((this.cantidadReal==null && other.getCantidadReal()==null) || 
             (this.cantidadReal!=null &&
              this.cantidadReal.equals(other.getCantidadReal()))) &&
            ((this.cantidadRealUnidadMedida==null && other.getCantidadRealUnidadMedida()==null) || 
             (this.cantidadRealUnidadMedida!=null &&
              this.cantidadRealUnidadMedida.equals(other.getCantidadRealUnidadMedida()))) &&
            ((this.cantidadUnidades==null && other.getCantidadUnidades()==null) || 
             (this.cantidadUnidades!=null &&
              this.cantidadUnidades.equals(other.getCantidadUnidades()))) &&
            ((this.cargosDescuentos==null && other.getCargosDescuentos()==null) || 
             (this.cargosDescuentos!=null &&
              java.util.Arrays.equals(this.cargosDescuentos, other.getCargosDescuentos()))) &&
            ((this.codigoFabricante==null && other.getCodigoFabricante()==null) || 
             (this.codigoFabricante!=null &&
              this.codigoFabricante.equals(other.getCodigoFabricante()))) &&
            ((this.codigoIdentificadorPais==null && other.getCodigoIdentificadorPais()==null) || 
             (this.codigoIdentificadorPais!=null &&
              this.codigoIdentificadorPais.equals(other.getCodigoIdentificadorPais()))) &&
            ((this.codigoProducto==null && other.getCodigoProducto()==null) || 
             (this.codigoProducto!=null &&
              this.codigoProducto.equals(other.getCodigoProducto()))) &&
            ((this.codigoTipoPrecio==null && other.getCodigoTipoPrecio()==null) || 
             (this.codigoTipoPrecio!=null &&
              this.codigoTipoPrecio.equals(other.getCodigoTipoPrecio()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.descripcionTecnica==null && other.getDescripcionTecnica()==null) || 
             (this.descripcionTecnica!=null &&
              this.descripcionTecnica.equals(other.getDescripcionTecnica()))) &&
            ((this.documentosReferenciados==null && other.getDocumentosReferenciados()==null) || 
             (this.documentosReferenciados!=null &&
              java.util.Arrays.equals(this.documentosReferenciados, other.getDocumentosReferenciados()))) &&
            ((this.estandarCodigo==null && other.getEstandarCodigo()==null) || 
             (this.estandarCodigo!=null &&
              this.estandarCodigo.equals(other.getEstandarCodigo()))) &&
            ((this.estandarCodigoID==null && other.getEstandarCodigoID()==null) || 
             (this.estandarCodigoID!=null &&
              this.estandarCodigoID.equals(other.getEstandarCodigoID()))) &&
            ((this.estandarCodigoIdentificador==null && other.getEstandarCodigoIdentificador()==null) || 
             (this.estandarCodigoIdentificador!=null &&
              this.estandarCodigoIdentificador.equals(other.getEstandarCodigoIdentificador()))) &&
            ((this.estandarCodigoNombre==null && other.getEstandarCodigoNombre()==null) || 
             (this.estandarCodigoNombre!=null &&
              this.estandarCodigoNombre.equals(other.getEstandarCodigoNombre()))) &&
            ((this.estandarCodigoProducto==null && other.getEstandarCodigoProducto()==null) || 
             (this.estandarCodigoProducto!=null &&
              this.estandarCodigoProducto.equals(other.getEstandarCodigoProducto()))) &&
            ((this.estandarOrganizacion==null && other.getEstandarOrganizacion()==null) || 
             (this.estandarOrganizacion!=null &&
              this.estandarOrganizacion.equals(other.getEstandarOrganizacion()))) &&
            ((this.estandarSubCodigoProducto==null && other.getEstandarSubCodigoProducto()==null) || 
             (this.estandarSubCodigoProducto!=null &&
              this.estandarSubCodigoProducto.equals(other.getEstandarSubCodigoProducto()))) &&
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras()))) &&
            ((this.impuestosDetalles==null && other.getImpuestosDetalles()==null) || 
             (this.impuestosDetalles!=null &&
              java.util.Arrays.equals(this.impuestosDetalles, other.getImpuestosDetalles()))) &&
            ((this.impuestosTotales==null && other.getImpuestosTotales()==null) || 
             (this.impuestosTotales!=null &&
              java.util.Arrays.equals(this.impuestosTotales, other.getImpuestosTotales()))) &&
            ((this.informacionAdicional==null && other.getInformacionAdicional()==null) || 
             (this.informacionAdicional!=null &&
              java.util.Arrays.equals(this.informacionAdicional, other.getInformacionAdicional()))) &&
            ((this.mandatorioNumeroIdentificacion==null && other.getMandatorioNumeroIdentificacion()==null) || 
             (this.mandatorioNumeroIdentificacion!=null &&
              this.mandatorioNumeroIdentificacion.equals(other.getMandatorioNumeroIdentificacion()))) &&
            ((this.mandatorioNumeroIdentificacionDV==null && other.getMandatorioNumeroIdentificacionDV()==null) || 
             (this.mandatorioNumeroIdentificacionDV!=null &&
              this.mandatorioNumeroIdentificacionDV.equals(other.getMandatorioNumeroIdentificacionDV()))) &&
            ((this.mandatorioTipoIdentificacion==null && other.getMandatorioTipoIdentificacion()==null) || 
             (this.mandatorioTipoIdentificacion!=null &&
              this.mandatorioTipoIdentificacion.equals(other.getMandatorioTipoIdentificacion()))) &&
            ((this.marca==null && other.getMarca()==null) || 
             (this.marca!=null &&
              this.marca.equals(other.getMarca()))) &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo()))) &&
            ((this.muestraGratis==null && other.getMuestraGratis()==null) || 
             (this.muestraGratis!=null &&
              this.muestraGratis.equals(other.getMuestraGratis()))) &&
            ((this.nombreFabricante==null && other.getNombreFabricante()==null) || 
             (this.nombreFabricante!=null &&
              this.nombreFabricante.equals(other.getNombreFabricante()))) &&
            ((this.nota==null && other.getNota()==null) || 
             (this.nota!=null &&
              this.nota.equals(other.getNota()))) &&
            ((this.precioReferencia==null && other.getPrecioReferencia()==null) || 
             (this.precioReferencia!=null &&
              this.precioReferencia.equals(other.getPrecioReferencia()))) &&
            ((this.precioTotal==null && other.getPrecioTotal()==null) || 
             (this.precioTotal!=null &&
              this.precioTotal.equals(other.getPrecioTotal()))) &&
            ((this.precioTotalSinImpuestos==null && other.getPrecioTotalSinImpuestos()==null) || 
             (this.precioTotalSinImpuestos!=null &&
              this.precioTotalSinImpuestos.equals(other.getPrecioTotalSinImpuestos()))) &&
            ((this.precioVentaUnitario==null && other.getPrecioVentaUnitario()==null) || 
             (this.precioVentaUnitario!=null &&
              this.precioVentaUnitario.equals(other.getPrecioVentaUnitario()))) &&
            ((this.secuencia==null && other.getSecuencia()==null) || 
             (this.secuencia!=null &&
              this.secuencia.equals(other.getSecuencia()))) &&
            ((this.seriales==null && other.getSeriales()==null) || 
             (this.seriales!=null &&
              this.seriales.equals(other.getSeriales()))) &&
            ((this.subCodigoFabricante==null && other.getSubCodigoFabricante()==null) || 
             (this.subCodigoFabricante!=null &&
              this.subCodigoFabricante.equals(other.getSubCodigoFabricante()))) &&
            ((this.subCodigoProducto==null && other.getSubCodigoProducto()==null) || 
             (this.subCodigoProducto!=null &&
              this.subCodigoProducto.equals(other.getSubCodigoProducto()))) &&
            ((this.tipoAIU==null && other.getTipoAIU()==null) || 
             (this.tipoAIU!=null &&
              this.tipoAIU.equals(other.getTipoAIU()))) &&
            ((this.unidadMedida==null && other.getUnidadMedida()==null) || 
             (this.unidadMedida!=null &&
              this.unidadMedida.equals(other.getUnidadMedida())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCantidadPorEmpaque() != null) {
            _hashCode += getCantidadPorEmpaque().hashCode();
        }
        if (getCantidadReal() != null) {
            _hashCode += getCantidadReal().hashCode();
        }
        if (getCantidadRealUnidadMedida() != null) {
            _hashCode += getCantidadRealUnidadMedida().hashCode();
        }
        if (getCantidadUnidades() != null) {
            _hashCode += getCantidadUnidades().hashCode();
        }
        if (getCargosDescuentos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCargosDescuentos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCargosDescuentos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodigoFabricante() != null) {
            _hashCode += getCodigoFabricante().hashCode();
        }
        if (getCodigoIdentificadorPais() != null) {
            _hashCode += getCodigoIdentificadorPais().hashCode();
        }
        if (getCodigoProducto() != null) {
            _hashCode += getCodigoProducto().hashCode();
        }
        if (getCodigoTipoPrecio() != null) {
            _hashCode += getCodigoTipoPrecio().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getDescripcionTecnica() != null) {
            _hashCode += getDescripcionTecnica().hashCode();
        }
        if (getDocumentosReferenciados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentosReferenciados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentosReferenciados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstandarCodigo() != null) {
            _hashCode += getEstandarCodigo().hashCode();
        }
        if (getEstandarCodigoID() != null) {
            _hashCode += getEstandarCodigoID().hashCode();
        }
        if (getEstandarCodigoIdentificador() != null) {
            _hashCode += getEstandarCodigoIdentificador().hashCode();
        }
        if (getEstandarCodigoNombre() != null) {
            _hashCode += getEstandarCodigoNombre().hashCode();
        }
        if (getEstandarCodigoProducto() != null) {
            _hashCode += getEstandarCodigoProducto().hashCode();
        }
        if (getEstandarOrganizacion() != null) {
            _hashCode += getEstandarOrganizacion().hashCode();
        }
        if (getEstandarSubCodigoProducto() != null) {
            _hashCode += getEstandarSubCodigoProducto().hashCode();
        }
        if (getExtras() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtras());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtras(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImpuestosDetalles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImpuestosDetalles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImpuestosDetalles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImpuestosTotales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImpuestosTotales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImpuestosTotales(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInformacionAdicional() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInformacionAdicional());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInformacionAdicional(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMandatorioNumeroIdentificacion() != null) {
            _hashCode += getMandatorioNumeroIdentificacion().hashCode();
        }
        if (getMandatorioNumeroIdentificacionDV() != null) {
            _hashCode += getMandatorioNumeroIdentificacionDV().hashCode();
        }
        if (getMandatorioTipoIdentificacion() != null) {
            _hashCode += getMandatorioTipoIdentificacion().hashCode();
        }
        if (getMarca() != null) {
            _hashCode += getMarca().hashCode();
        }
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        if (getMuestraGratis() != null) {
            _hashCode += getMuestraGratis().hashCode();
        }
        if (getNombreFabricante() != null) {
            _hashCode += getNombreFabricante().hashCode();
        }
        if (getNota() != null) {
            _hashCode += getNota().hashCode();
        }
        if (getPrecioReferencia() != null) {
            _hashCode += getPrecioReferencia().hashCode();
        }
        if (getPrecioTotal() != null) {
            _hashCode += getPrecioTotal().hashCode();
        }
        if (getPrecioTotalSinImpuestos() != null) {
            _hashCode += getPrecioTotalSinImpuestos().hashCode();
        }
        if (getPrecioVentaUnitario() != null) {
            _hashCode += getPrecioVentaUnitario().hashCode();
        }
        if (getSecuencia() != null) {
            _hashCode += getSecuencia().hashCode();
        }
        if (getSeriales() != null) {
            _hashCode += getSeriales().hashCode();
        }
        if (getSubCodigoFabricante() != null) {
            _hashCode += getSubCodigoFabricante().hashCode();
        }
        if (getSubCodigoProducto() != null) {
            _hashCode += getSubCodigoProducto().hashCode();
        }
        if (getTipoAIU() != null) {
            _hashCode += getTipoAIU().hashCode();
        }
        if (getUnidadMedida() != null) {
            _hashCode += getUnidadMedida().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FacturaDetalle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "FacturaDetalle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadPorEmpaque");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cantidadPorEmpaque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadReal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cantidadReal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadRealUnidadMedida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cantidadRealUnidadMedida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadUnidades");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cantidadUnidades"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargosDescuentos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cargosDescuentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "CargosDescuentos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "CargosDescuentos"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoFabricante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoFabricante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoIdentificadorPais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoIdentificadorPais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoPrecio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoTipoPrecio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionTecnica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "descripcionTecnica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentosReferenciados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "documentosReferenciados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DocumentoReferenciado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DocumentoReferenciado"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estandarCodigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarCodigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estandarCodigoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarCodigoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estandarCodigoIdentificador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarCodigoIdentificador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estandarCodigoNombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarCodigoNombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estandarCodigoProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarCodigoProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estandarOrganizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarOrganizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estandarSubCodigoProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarSubCodigoProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extras");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "extras"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Extensible"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Extensible"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impuestosDetalles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "impuestosDetalles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "FacturaImpuestos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "FacturaImpuestos"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impuestosTotales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "impuestosTotales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ImpuestosTotales"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ImpuestosTotales"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacionAdicional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "informacionAdicional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "LineaInformacionAdicional"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "LineaInformacionAdicional"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatorioNumeroIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "mandatorioNumeroIdentificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatorioNumeroIdentificacionDV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "mandatorioNumeroIdentificacionDV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatorioTipoIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "mandatorioTipoIdentificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "marca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("muestraGratis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "muestraGratis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreFabricante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreFabricante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precioReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "precioReferencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precioTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "precioTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precioTotalSinImpuestos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "precioTotalSinImpuestos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precioVentaUnitario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "precioVentaUnitario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secuencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "secuencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "seriales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCodigoFabricante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "subCodigoFabricante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCodigoProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "subCodigoProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoAIU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoAIU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadMedida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "unidadMedida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
