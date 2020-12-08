/**
 * FacturaGeneral.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class FacturaGeneral  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Anticipos[] anticipos;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Autorizado autorizado;

    private java.lang.String cantidadDecimales;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargosDescuentos[] cargosDescuentos;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Cliente cliente;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CondicionDePago[] condicionPago;

    private java.lang.String consecutivoDocumento;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaDetalle[] detalleDeFactura;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DocumentoReferenciado[] documentosReferenciados;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Entrega entregaMercancia;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extras[] extras;

    private java.lang.String fechaEmision;

    private java.lang.String fechaFinPeriodoFacturacion;

    private java.lang.String fechaInicioPeriodoFacturacion;

    private java.lang.String fechaPagoImpuestos;

    private java.lang.String fechaVencimiento;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaImpuestos[] impuestosGenerales;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.ImpuestosTotales[] impuestosTotales;

    private java.lang.String[] informacionAdicional;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.MediosDePago[] mediosDePago;

    private java.lang.String moneda;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.OrdenDeCompra[] ordenDeCompra;

    private java.lang.String propina;

    private java.lang.String rangoNumeracion;

    private java.lang.String redondeoAplicado;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.TasaDeCambio tasaDeCambio;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.TasaDeCambioAlternativa tasaDeCambioAlternativa;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.TerminosDeEntrega terminosEntrega;

    private java.lang.String tipoDocumento;

    private java.lang.String tipoOperacion;

    private java.lang.String totalAnticipos;

    private java.lang.String totalBaseImponible;

    private java.lang.String totalBrutoConImpuesto;

    private java.lang.String totalCargosAplicados;

    private java.lang.String totalDescuentos;

    private java.lang.String totalMonto;

    private java.lang.String totalProductos;

    private java.lang.String totalSinImpuestos;

    public FacturaGeneral() {
    }

    public FacturaGeneral(
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Anticipos[] anticipos,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Autorizado autorizado,
           java.lang.String cantidadDecimales,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargosDescuentos[] cargosDescuentos,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Cliente cliente,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CondicionDePago[] condicionPago,
           java.lang.String consecutivoDocumento,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaDetalle[] detalleDeFactura,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DocumentoReferenciado[] documentosReferenciados,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Entrega entregaMercancia,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extras[] extras,
           java.lang.String fechaEmision,
           java.lang.String fechaFinPeriodoFacturacion,
           java.lang.String fechaInicioPeriodoFacturacion,
           java.lang.String fechaPagoImpuestos,
           java.lang.String fechaVencimiento,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaImpuestos[] impuestosGenerales,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.ImpuestosTotales[] impuestosTotales,
           java.lang.String[] informacionAdicional,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.MediosDePago[] mediosDePago,
           java.lang.String moneda,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.OrdenDeCompra[] ordenDeCompra,
           java.lang.String propina,
           java.lang.String rangoNumeracion,
           java.lang.String redondeoAplicado,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.TasaDeCambio tasaDeCambio,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.TasaDeCambioAlternativa tasaDeCambioAlternativa,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.TerminosDeEntrega terminosEntrega,
           java.lang.String tipoDocumento,
           java.lang.String tipoOperacion,
           java.lang.String totalAnticipos,
           java.lang.String totalBaseImponible,
           java.lang.String totalBrutoConImpuesto,
           java.lang.String totalCargosAplicados,
           java.lang.String totalDescuentos,
           java.lang.String totalMonto,
           java.lang.String totalProductos,
           java.lang.String totalSinImpuestos) {
           this.anticipos = anticipos;
           this.autorizado = autorizado;
           this.cantidadDecimales = cantidadDecimales;
           this.cargosDescuentos = cargosDescuentos;
           this.cliente = cliente;
           this.condicionPago = condicionPago;
           this.consecutivoDocumento = consecutivoDocumento;
           this.detalleDeFactura = detalleDeFactura;
           this.documentosReferenciados = documentosReferenciados;
           this.entregaMercancia = entregaMercancia;
           this.extras = extras;
           this.fechaEmision = fechaEmision;
           this.fechaFinPeriodoFacturacion = fechaFinPeriodoFacturacion;
           this.fechaInicioPeriodoFacturacion = fechaInicioPeriodoFacturacion;
           this.fechaPagoImpuestos = fechaPagoImpuestos;
           this.fechaVencimiento = fechaVencimiento;
           this.impuestosGenerales = impuestosGenerales;
           this.impuestosTotales = impuestosTotales;
           this.informacionAdicional = informacionAdicional;
           this.mediosDePago = mediosDePago;
           this.moneda = moneda;
           this.ordenDeCompra = ordenDeCompra;
           this.propina = propina;
           this.rangoNumeracion = rangoNumeracion;
           this.redondeoAplicado = redondeoAplicado;
           this.tasaDeCambio = tasaDeCambio;
           this.tasaDeCambioAlternativa = tasaDeCambioAlternativa;
           this.terminosEntrega = terminosEntrega;
           this.tipoDocumento = tipoDocumento;
           this.tipoOperacion = tipoOperacion;
           this.totalAnticipos = totalAnticipos;
           this.totalBaseImponible = totalBaseImponible;
           this.totalBrutoConImpuesto = totalBrutoConImpuesto;
           this.totalCargosAplicados = totalCargosAplicados;
           this.totalDescuentos = totalDescuentos;
           this.totalMonto = totalMonto;
           this.totalProductos = totalProductos;
           this.totalSinImpuestos = totalSinImpuestos;
    }


    /**
     * Gets the anticipos value for this FacturaGeneral.
     * 
     * @return anticipos
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Anticipos[] getAnticipos() {
        return anticipos;
    }


    /**
     * Sets the anticipos value for this FacturaGeneral.
     * 
     * @param anticipos
     */
    public void setAnticipos(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Anticipos[] anticipos) {
        this.anticipos = anticipos;
    }


    /**
     * Gets the autorizado value for this FacturaGeneral.
     * 
     * @return autorizado
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Autorizado getAutorizado() {
        return autorizado;
    }


    /**
     * Sets the autorizado value for this FacturaGeneral.
     * 
     * @param autorizado
     */
    public void setAutorizado(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Autorizado autorizado) {
        this.autorizado = autorizado;
    }


    /**
     * Gets the cantidadDecimales value for this FacturaGeneral.
     * 
     * @return cantidadDecimales
     */
    public java.lang.String getCantidadDecimales() {
        return cantidadDecimales;
    }


    /**
     * Sets the cantidadDecimales value for this FacturaGeneral.
     * 
     * @param cantidadDecimales
     */
    public void setCantidadDecimales(java.lang.String cantidadDecimales) {
        this.cantidadDecimales = cantidadDecimales;
    }


    /**
     * Gets the cargosDescuentos value for this FacturaGeneral.
     * 
     * @return cargosDescuentos
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargosDescuentos[] getCargosDescuentos() {
        return cargosDescuentos;
    }


    /**
     * Sets the cargosDescuentos value for this FacturaGeneral.
     * 
     * @param cargosDescuentos
     */
    public void setCargosDescuentos(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargosDescuentos[] cargosDescuentos) {
        this.cargosDescuentos = cargosDescuentos;
    }


    /**
     * Gets the cliente value for this FacturaGeneral.
     * 
     * @return cliente
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Cliente getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this FacturaGeneral.
     * 
     * @param cliente
     */
    public void setCliente(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Cliente cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the condicionPago value for this FacturaGeneral.
     * 
     * @return condicionPago
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CondicionDePago[] getCondicionPago() {
        return condicionPago;
    }


    /**
     * Sets the condicionPago value for this FacturaGeneral.
     * 
     * @param condicionPago
     */
    public void setCondicionPago(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CondicionDePago[] condicionPago) {
        this.condicionPago = condicionPago;
    }


    /**
     * Gets the consecutivoDocumento value for this FacturaGeneral.
     * 
     * @return consecutivoDocumento
     */
    public java.lang.String getConsecutivoDocumento() {
        return consecutivoDocumento;
    }


    /**
     * Sets the consecutivoDocumento value for this FacturaGeneral.
     * 
     * @param consecutivoDocumento
     */
    public void setConsecutivoDocumento(java.lang.String consecutivoDocumento) {
        this.consecutivoDocumento = consecutivoDocumento;
    }


    /**
     * Gets the detalleDeFactura value for this FacturaGeneral.
     * 
     * @return detalleDeFactura
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaDetalle[] getDetalleDeFactura() {
        return detalleDeFactura;
    }


    /**
     * Sets the detalleDeFactura value for this FacturaGeneral.
     * 
     * @param detalleDeFactura
     */
    public void setDetalleDeFactura(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaDetalle[] detalleDeFactura) {
        this.detalleDeFactura = detalleDeFactura;
    }


    /**
     * Gets the documentosReferenciados value for this FacturaGeneral.
     * 
     * @return documentosReferenciados
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DocumentoReferenciado[] getDocumentosReferenciados() {
        return documentosReferenciados;
    }


    /**
     * Sets the documentosReferenciados value for this FacturaGeneral.
     * 
     * @param documentosReferenciados
     */
    public void setDocumentosReferenciados(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DocumentoReferenciado[] documentosReferenciados) {
        this.documentosReferenciados = documentosReferenciados;
    }


    /**
     * Gets the entregaMercancia value for this FacturaGeneral.
     * 
     * @return entregaMercancia
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Entrega getEntregaMercancia() {
        return entregaMercancia;
    }


    /**
     * Sets the entregaMercancia value for this FacturaGeneral.
     * 
     * @param entregaMercancia
     */
    public void setEntregaMercancia(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Entrega entregaMercancia) {
        this.entregaMercancia = entregaMercancia;
    }


    /**
     * Gets the extras value for this FacturaGeneral.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extras[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this FacturaGeneral.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extras[] extras) {
        this.extras = extras;
    }


    /**
     * Gets the fechaEmision value for this FacturaGeneral.
     * 
     * @return fechaEmision
     */
    public java.lang.String getFechaEmision() {
        return fechaEmision;
    }


    /**
     * Sets the fechaEmision value for this FacturaGeneral.
     * 
     * @param fechaEmision
     */
    public void setFechaEmision(java.lang.String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }


    /**
     * Gets the fechaFinPeriodoFacturacion value for this FacturaGeneral.
     * 
     * @return fechaFinPeriodoFacturacion
     */
    public java.lang.String getFechaFinPeriodoFacturacion() {
        return fechaFinPeriodoFacturacion;
    }


    /**
     * Sets the fechaFinPeriodoFacturacion value for this FacturaGeneral.
     * 
     * @param fechaFinPeriodoFacturacion
     */
    public void setFechaFinPeriodoFacturacion(java.lang.String fechaFinPeriodoFacturacion) {
        this.fechaFinPeriodoFacturacion = fechaFinPeriodoFacturacion;
    }


    /**
     * Gets the fechaInicioPeriodoFacturacion value for this FacturaGeneral.
     * 
     * @return fechaInicioPeriodoFacturacion
     */
    public java.lang.String getFechaInicioPeriodoFacturacion() {
        return fechaInicioPeriodoFacturacion;
    }


    /**
     * Sets the fechaInicioPeriodoFacturacion value for this FacturaGeneral.
     * 
     * @param fechaInicioPeriodoFacturacion
     */
    public void setFechaInicioPeriodoFacturacion(java.lang.String fechaInicioPeriodoFacturacion) {
        this.fechaInicioPeriodoFacturacion = fechaInicioPeriodoFacturacion;
    }


    /**
     * Gets the fechaPagoImpuestos value for this FacturaGeneral.
     * 
     * @return fechaPagoImpuestos
     */
    public java.lang.String getFechaPagoImpuestos() {
        return fechaPagoImpuestos;
    }


    /**
     * Sets the fechaPagoImpuestos value for this FacturaGeneral.
     * 
     * @param fechaPagoImpuestos
     */
    public void setFechaPagoImpuestos(java.lang.String fechaPagoImpuestos) {
        this.fechaPagoImpuestos = fechaPagoImpuestos;
    }


    /**
     * Gets the fechaVencimiento value for this FacturaGeneral.
     * 
     * @return fechaVencimiento
     */
    public java.lang.String getFechaVencimiento() {
        return fechaVencimiento;
    }


    /**
     * Sets the fechaVencimiento value for this FacturaGeneral.
     * 
     * @param fechaVencimiento
     */
    public void setFechaVencimiento(java.lang.String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    /**
     * Gets the impuestosGenerales value for this FacturaGeneral.
     * 
     * @return impuestosGenerales
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaImpuestos[] getImpuestosGenerales() {
        return impuestosGenerales;
    }


    /**
     * Sets the impuestosGenerales value for this FacturaGeneral.
     * 
     * @param impuestosGenerales
     */
    public void setImpuestosGenerales(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.FacturaImpuestos[] impuestosGenerales) {
        this.impuestosGenerales = impuestosGenerales;
    }


    /**
     * Gets the impuestosTotales value for this FacturaGeneral.
     * 
     * @return impuestosTotales
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.ImpuestosTotales[] getImpuestosTotales() {
        return impuestosTotales;
    }


    /**
     * Sets the impuestosTotales value for this FacturaGeneral.
     * 
     * @param impuestosTotales
     */
    public void setImpuestosTotales(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.ImpuestosTotales[] impuestosTotales) {
        this.impuestosTotales = impuestosTotales;
    }


    /**
     * Gets the informacionAdicional value for this FacturaGeneral.
     * 
     * @return informacionAdicional
     */
    public java.lang.String[] getInformacionAdicional() {
        return informacionAdicional;
    }


    /**
     * Sets the informacionAdicional value for this FacturaGeneral.
     * 
     * @param informacionAdicional
     */
    public void setInformacionAdicional(java.lang.String[] informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }


    /**
     * Gets the mediosDePago value for this FacturaGeneral.
     * 
     * @return mediosDePago
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.MediosDePago[] getMediosDePago() {
        return mediosDePago;
    }


    /**
     * Sets the mediosDePago value for this FacturaGeneral.
     * 
     * @param mediosDePago
     */
    public void setMediosDePago(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.MediosDePago[] mediosDePago) {
        this.mediosDePago = mediosDePago;
    }


    /**
     * Gets the moneda value for this FacturaGeneral.
     * 
     * @return moneda
     */
    public java.lang.String getMoneda() {
        return moneda;
    }


    /**
     * Sets the moneda value for this FacturaGeneral.
     * 
     * @param moneda
     */
    public void setMoneda(java.lang.String moneda) {
        this.moneda = moneda;
    }


    /**
     * Gets the ordenDeCompra value for this FacturaGeneral.
     * 
     * @return ordenDeCompra
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.OrdenDeCompra[] getOrdenDeCompra() {
        return ordenDeCompra;
    }


    /**
     * Sets the ordenDeCompra value for this FacturaGeneral.
     * 
     * @param ordenDeCompra
     */
    public void setOrdenDeCompra(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.OrdenDeCompra[] ordenDeCompra) {
        this.ordenDeCompra = ordenDeCompra;
    }


    /**
     * Gets the propina value for this FacturaGeneral.
     * 
     * @return propina
     */
    public java.lang.String getPropina() {
        return propina;
    }


    /**
     * Sets the propina value for this FacturaGeneral.
     * 
     * @param propina
     */
    public void setPropina(java.lang.String propina) {
        this.propina = propina;
    }


    /**
     * Gets the rangoNumeracion value for this FacturaGeneral.
     * 
     * @return rangoNumeracion
     */
    public java.lang.String getRangoNumeracion() {
        return rangoNumeracion;
    }


    /**
     * Sets the rangoNumeracion value for this FacturaGeneral.
     * 
     * @param rangoNumeracion
     */
    public void setRangoNumeracion(java.lang.String rangoNumeracion) {
        this.rangoNumeracion = rangoNumeracion;
    }


    /**
     * Gets the redondeoAplicado value for this FacturaGeneral.
     * 
     * @return redondeoAplicado
     */
    public java.lang.String getRedondeoAplicado() {
        return redondeoAplicado;
    }


    /**
     * Sets the redondeoAplicado value for this FacturaGeneral.
     * 
     * @param redondeoAplicado
     */
    public void setRedondeoAplicado(java.lang.String redondeoAplicado) {
        this.redondeoAplicado = redondeoAplicado;
    }


    /**
     * Gets the tasaDeCambio value for this FacturaGeneral.
     * 
     * @return tasaDeCambio
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.TasaDeCambio getTasaDeCambio() {
        return tasaDeCambio;
    }


    /**
     * Sets the tasaDeCambio value for this FacturaGeneral.
     * 
     * @param tasaDeCambio
     */
    public void setTasaDeCambio(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.TasaDeCambio tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }


    /**
     * Gets the tasaDeCambioAlternativa value for this FacturaGeneral.
     * 
     * @return tasaDeCambioAlternativa
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.TasaDeCambioAlternativa getTasaDeCambioAlternativa() {
        return tasaDeCambioAlternativa;
    }


    /**
     * Sets the tasaDeCambioAlternativa value for this FacturaGeneral.
     * 
     * @param tasaDeCambioAlternativa
     */
    public void setTasaDeCambioAlternativa(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.TasaDeCambioAlternativa tasaDeCambioAlternativa) {
        this.tasaDeCambioAlternativa = tasaDeCambioAlternativa;
    }


    /**
     * Gets the terminosEntrega value for this FacturaGeneral.
     * 
     * @return terminosEntrega
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.TerminosDeEntrega getTerminosEntrega() {
        return terminosEntrega;
    }


    /**
     * Sets the terminosEntrega value for this FacturaGeneral.
     * 
     * @param terminosEntrega
     */
    public void setTerminosEntrega(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.TerminosDeEntrega terminosEntrega) {
        this.terminosEntrega = terminosEntrega;
    }


    /**
     * Gets the tipoDocumento value for this FacturaGeneral.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this FacturaGeneral.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the tipoOperacion value for this FacturaGeneral.
     * 
     * @return tipoOperacion
     */
    public java.lang.String getTipoOperacion() {
        return tipoOperacion;
    }


    /**
     * Sets the tipoOperacion value for this FacturaGeneral.
     * 
     * @param tipoOperacion
     */
    public void setTipoOperacion(java.lang.String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }


    /**
     * Gets the totalAnticipos value for this FacturaGeneral.
     * 
     * @return totalAnticipos
     */
    public java.lang.String getTotalAnticipos() {
        return totalAnticipos;
    }


    /**
     * Sets the totalAnticipos value for this FacturaGeneral.
     * 
     * @param totalAnticipos
     */
    public void setTotalAnticipos(java.lang.String totalAnticipos) {
        this.totalAnticipos = totalAnticipos;
    }


    /**
     * Gets the totalBaseImponible value for this FacturaGeneral.
     * 
     * @return totalBaseImponible
     */
    public java.lang.String getTotalBaseImponible() {
        return totalBaseImponible;
    }


    /**
     * Sets the totalBaseImponible value for this FacturaGeneral.
     * 
     * @param totalBaseImponible
     */
    public void setTotalBaseImponible(java.lang.String totalBaseImponible) {
        this.totalBaseImponible = totalBaseImponible;
    }


    /**
     * Gets the totalBrutoConImpuesto value for this FacturaGeneral.
     * 
     * @return totalBrutoConImpuesto
     */
    public java.lang.String getTotalBrutoConImpuesto() {
        return totalBrutoConImpuesto;
    }


    /**
     * Sets the totalBrutoConImpuesto value for this FacturaGeneral.
     * 
     * @param totalBrutoConImpuesto
     */
    public void setTotalBrutoConImpuesto(java.lang.String totalBrutoConImpuesto) {
        this.totalBrutoConImpuesto = totalBrutoConImpuesto;
    }


    /**
     * Gets the totalCargosAplicados value for this FacturaGeneral.
     * 
     * @return totalCargosAplicados
     */
    public java.lang.String getTotalCargosAplicados() {
        return totalCargosAplicados;
    }


    /**
     * Sets the totalCargosAplicados value for this FacturaGeneral.
     * 
     * @param totalCargosAplicados
     */
    public void setTotalCargosAplicados(java.lang.String totalCargosAplicados) {
        this.totalCargosAplicados = totalCargosAplicados;
    }


    /**
     * Gets the totalDescuentos value for this FacturaGeneral.
     * 
     * @return totalDescuentos
     */
    public java.lang.String getTotalDescuentos() {
        return totalDescuentos;
    }


    /**
     * Sets the totalDescuentos value for this FacturaGeneral.
     * 
     * @param totalDescuentos
     */
    public void setTotalDescuentos(java.lang.String totalDescuentos) {
        this.totalDescuentos = totalDescuentos;
    }


    /**
     * Gets the totalMonto value for this FacturaGeneral.
     * 
     * @return totalMonto
     */
    public java.lang.String getTotalMonto() {
        return totalMonto;
    }


    /**
     * Sets the totalMonto value for this FacturaGeneral.
     * 
     * @param totalMonto
     */
    public void setTotalMonto(java.lang.String totalMonto) {
        this.totalMonto = totalMonto;
    }


    /**
     * Gets the totalProductos value for this FacturaGeneral.
     * 
     * @return totalProductos
     */
    public java.lang.String getTotalProductos() {
        return totalProductos;
    }


    /**
     * Sets the totalProductos value for this FacturaGeneral.
     * 
     * @param totalProductos
     */
    public void setTotalProductos(java.lang.String totalProductos) {
        this.totalProductos = totalProductos;
    }


    /**
     * Gets the totalSinImpuestos value for this FacturaGeneral.
     * 
     * @return totalSinImpuestos
     */
    public java.lang.String getTotalSinImpuestos() {
        return totalSinImpuestos;
    }


    /**
     * Sets the totalSinImpuestos value for this FacturaGeneral.
     * 
     * @param totalSinImpuestos
     */
    public void setTotalSinImpuestos(java.lang.String totalSinImpuestos) {
        this.totalSinImpuestos = totalSinImpuestos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FacturaGeneral)) return false;
        FacturaGeneral other = (FacturaGeneral) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anticipos==null && other.getAnticipos()==null) || 
             (this.anticipos!=null &&
              java.util.Arrays.equals(this.anticipos, other.getAnticipos()))) &&
            ((this.autorizado==null && other.getAutorizado()==null) || 
             (this.autorizado!=null &&
              this.autorizado.equals(other.getAutorizado()))) &&
            ((this.cantidadDecimales==null && other.getCantidadDecimales()==null) || 
             (this.cantidadDecimales!=null &&
              this.cantidadDecimales.equals(other.getCantidadDecimales()))) &&
            ((this.cargosDescuentos==null && other.getCargosDescuentos()==null) || 
             (this.cargosDescuentos!=null &&
              java.util.Arrays.equals(this.cargosDescuentos, other.getCargosDescuentos()))) &&
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            ((this.condicionPago==null && other.getCondicionPago()==null) || 
             (this.condicionPago!=null &&
              java.util.Arrays.equals(this.condicionPago, other.getCondicionPago()))) &&
            ((this.consecutivoDocumento==null && other.getConsecutivoDocumento()==null) || 
             (this.consecutivoDocumento!=null &&
              this.consecutivoDocumento.equals(other.getConsecutivoDocumento()))) &&
            ((this.detalleDeFactura==null && other.getDetalleDeFactura()==null) || 
             (this.detalleDeFactura!=null &&
              java.util.Arrays.equals(this.detalleDeFactura, other.getDetalleDeFactura()))) &&
            ((this.documentosReferenciados==null && other.getDocumentosReferenciados()==null) || 
             (this.documentosReferenciados!=null &&
              java.util.Arrays.equals(this.documentosReferenciados, other.getDocumentosReferenciados()))) &&
            ((this.entregaMercancia==null && other.getEntregaMercancia()==null) || 
             (this.entregaMercancia!=null &&
              this.entregaMercancia.equals(other.getEntregaMercancia()))) &&
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras()))) &&
            ((this.fechaEmision==null && other.getFechaEmision()==null) || 
             (this.fechaEmision!=null &&
              this.fechaEmision.equals(other.getFechaEmision()))) &&
            ((this.fechaFinPeriodoFacturacion==null && other.getFechaFinPeriodoFacturacion()==null) || 
             (this.fechaFinPeriodoFacturacion!=null &&
              this.fechaFinPeriodoFacturacion.equals(other.getFechaFinPeriodoFacturacion()))) &&
            ((this.fechaInicioPeriodoFacturacion==null && other.getFechaInicioPeriodoFacturacion()==null) || 
             (this.fechaInicioPeriodoFacturacion!=null &&
              this.fechaInicioPeriodoFacturacion.equals(other.getFechaInicioPeriodoFacturacion()))) &&
            ((this.fechaPagoImpuestos==null && other.getFechaPagoImpuestos()==null) || 
             (this.fechaPagoImpuestos!=null &&
              this.fechaPagoImpuestos.equals(other.getFechaPagoImpuestos()))) &&
            ((this.fechaVencimiento==null && other.getFechaVencimiento()==null) || 
             (this.fechaVencimiento!=null &&
              this.fechaVencimiento.equals(other.getFechaVencimiento()))) &&
            ((this.impuestosGenerales==null && other.getImpuestosGenerales()==null) || 
             (this.impuestosGenerales!=null &&
              java.util.Arrays.equals(this.impuestosGenerales, other.getImpuestosGenerales()))) &&
            ((this.impuestosTotales==null && other.getImpuestosTotales()==null) || 
             (this.impuestosTotales!=null &&
              java.util.Arrays.equals(this.impuestosTotales, other.getImpuestosTotales()))) &&
            ((this.informacionAdicional==null && other.getInformacionAdicional()==null) || 
             (this.informacionAdicional!=null &&
              java.util.Arrays.equals(this.informacionAdicional, other.getInformacionAdicional()))) &&
            ((this.mediosDePago==null && other.getMediosDePago()==null) || 
             (this.mediosDePago!=null &&
              java.util.Arrays.equals(this.mediosDePago, other.getMediosDePago()))) &&
            ((this.moneda==null && other.getMoneda()==null) || 
             (this.moneda!=null &&
              this.moneda.equals(other.getMoneda()))) &&
            ((this.ordenDeCompra==null && other.getOrdenDeCompra()==null) || 
             (this.ordenDeCompra!=null &&
              java.util.Arrays.equals(this.ordenDeCompra, other.getOrdenDeCompra()))) &&
            ((this.propina==null && other.getPropina()==null) || 
             (this.propina!=null &&
              this.propina.equals(other.getPropina()))) &&
            ((this.rangoNumeracion==null && other.getRangoNumeracion()==null) || 
             (this.rangoNumeracion!=null &&
              this.rangoNumeracion.equals(other.getRangoNumeracion()))) &&
            ((this.redondeoAplicado==null && other.getRedondeoAplicado()==null) || 
             (this.redondeoAplicado!=null &&
              this.redondeoAplicado.equals(other.getRedondeoAplicado()))) &&
            ((this.tasaDeCambio==null && other.getTasaDeCambio()==null) || 
             (this.tasaDeCambio!=null &&
              this.tasaDeCambio.equals(other.getTasaDeCambio()))) &&
            ((this.tasaDeCambioAlternativa==null && other.getTasaDeCambioAlternativa()==null) || 
             (this.tasaDeCambioAlternativa!=null &&
              this.tasaDeCambioAlternativa.equals(other.getTasaDeCambioAlternativa()))) &&
            ((this.terminosEntrega==null && other.getTerminosEntrega()==null) || 
             (this.terminosEntrega!=null &&
              this.terminosEntrega.equals(other.getTerminosEntrega()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.tipoOperacion==null && other.getTipoOperacion()==null) || 
             (this.tipoOperacion!=null &&
              this.tipoOperacion.equals(other.getTipoOperacion()))) &&
            ((this.totalAnticipos==null && other.getTotalAnticipos()==null) || 
             (this.totalAnticipos!=null &&
              this.totalAnticipos.equals(other.getTotalAnticipos()))) &&
            ((this.totalBaseImponible==null && other.getTotalBaseImponible()==null) || 
             (this.totalBaseImponible!=null &&
              this.totalBaseImponible.equals(other.getTotalBaseImponible()))) &&
            ((this.totalBrutoConImpuesto==null && other.getTotalBrutoConImpuesto()==null) || 
             (this.totalBrutoConImpuesto!=null &&
              this.totalBrutoConImpuesto.equals(other.getTotalBrutoConImpuesto()))) &&
            ((this.totalCargosAplicados==null && other.getTotalCargosAplicados()==null) || 
             (this.totalCargosAplicados!=null &&
              this.totalCargosAplicados.equals(other.getTotalCargosAplicados()))) &&
            ((this.totalDescuentos==null && other.getTotalDescuentos()==null) || 
             (this.totalDescuentos!=null &&
              this.totalDescuentos.equals(other.getTotalDescuentos()))) &&
            ((this.totalMonto==null && other.getTotalMonto()==null) || 
             (this.totalMonto!=null &&
              this.totalMonto.equals(other.getTotalMonto()))) &&
            ((this.totalProductos==null && other.getTotalProductos()==null) || 
             (this.totalProductos!=null &&
              this.totalProductos.equals(other.getTotalProductos()))) &&
            ((this.totalSinImpuestos==null && other.getTotalSinImpuestos()==null) || 
             (this.totalSinImpuestos!=null &&
              this.totalSinImpuestos.equals(other.getTotalSinImpuestos())));
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
        if (getAnticipos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnticipos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnticipos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutorizado() != null) {
            _hashCode += getAutorizado().hashCode();
        }
        if (getCantidadDecimales() != null) {
            _hashCode += getCantidadDecimales().hashCode();
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
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        if (getCondicionPago() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCondicionPago());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCondicionPago(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsecutivoDocumento() != null) {
            _hashCode += getConsecutivoDocumento().hashCode();
        }
        if (getDetalleDeFactura() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetalleDeFactura());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetalleDeFactura(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getEntregaMercancia() != null) {
            _hashCode += getEntregaMercancia().hashCode();
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
        if (getFechaEmision() != null) {
            _hashCode += getFechaEmision().hashCode();
        }
        if (getFechaFinPeriodoFacturacion() != null) {
            _hashCode += getFechaFinPeriodoFacturacion().hashCode();
        }
        if (getFechaInicioPeriodoFacturacion() != null) {
            _hashCode += getFechaInicioPeriodoFacturacion().hashCode();
        }
        if (getFechaPagoImpuestos() != null) {
            _hashCode += getFechaPagoImpuestos().hashCode();
        }
        if (getFechaVencimiento() != null) {
            _hashCode += getFechaVencimiento().hashCode();
        }
        if (getImpuestosGenerales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImpuestosGenerales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImpuestosGenerales(), i);
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
        if (getMediosDePago() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMediosDePago());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMediosDePago(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMoneda() != null) {
            _hashCode += getMoneda().hashCode();
        }
        if (getOrdenDeCompra() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrdenDeCompra());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrdenDeCompra(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPropina() != null) {
            _hashCode += getPropina().hashCode();
        }
        if (getRangoNumeracion() != null) {
            _hashCode += getRangoNumeracion().hashCode();
        }
        if (getRedondeoAplicado() != null) {
            _hashCode += getRedondeoAplicado().hashCode();
        }
        if (getTasaDeCambio() != null) {
            _hashCode += getTasaDeCambio().hashCode();
        }
        if (getTasaDeCambioAlternativa() != null) {
            _hashCode += getTasaDeCambioAlternativa().hashCode();
        }
        if (getTerminosEntrega() != null) {
            _hashCode += getTerminosEntrega().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getTipoOperacion() != null) {
            _hashCode += getTipoOperacion().hashCode();
        }
        if (getTotalAnticipos() != null) {
            _hashCode += getTotalAnticipos().hashCode();
        }
        if (getTotalBaseImponible() != null) {
            _hashCode += getTotalBaseImponible().hashCode();
        }
        if (getTotalBrutoConImpuesto() != null) {
            _hashCode += getTotalBrutoConImpuesto().hashCode();
        }
        if (getTotalCargosAplicados() != null) {
            _hashCode += getTotalCargosAplicados().hashCode();
        }
        if (getTotalDescuentos() != null) {
            _hashCode += getTotalDescuentos().hashCode();
        }
        if (getTotalMonto() != null) {
            _hashCode += getTotalMonto().hashCode();
        }
        if (getTotalProductos() != null) {
            _hashCode += getTotalProductos().hashCode();
        }
        if (getTotalSinImpuestos() != null) {
            _hashCode += getTotalSinImpuestos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FacturaGeneral.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "FacturaGeneral"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anticipos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "anticipos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Anticipos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Anticipos"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorizado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "autorizado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Autorizado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadDecimales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cantidadDecimales"));
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
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Cliente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicionPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "condicionPago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "CondicionDePago"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "CondicionDePago"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consecutivoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "consecutivoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detalleDeFactura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "detalleDeFactura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "FacturaDetalle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "FacturaDetalle"));
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
        elemField.setFieldName("entregaMercancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "entregaMercancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Entrega"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extras");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "extras"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Extras"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Extras"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaEmision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaEmision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFinPeriodoFacturacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaFinPeriodoFacturacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicioPeriodoFacturacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaInicioPeriodoFacturacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaPagoImpuestos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaPagoImpuestos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVencimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaVencimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impuestosGenerales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "impuestosGenerales"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediosDePago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "mediosDePago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "MediosDePago"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "MediosDePago"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moneda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "moneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordenDeCompra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ordenDeCompra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "OrdenDeCompra"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "OrdenDeCompra"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "propina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoNumeracion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "rangoNumeracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redondeoAplicado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "redondeoAplicado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasaDeCambio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tasaDeCambio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TasaDeCambio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasaDeCambioAlternativa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tasaDeCambioAlternativa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TasaDeCambioAlternativa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminosEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "terminosEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TerminosDeEntrega"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAnticipos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalAnticipos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBaseImponible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalBaseImponible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBrutoConImpuesto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalBrutoConImpuesto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCargosAplicados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalCargosAplicados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDescuentos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalDescuentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMonto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalMonto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalProductos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalProductos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSinImpuestos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalSinImpuestos"));
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
