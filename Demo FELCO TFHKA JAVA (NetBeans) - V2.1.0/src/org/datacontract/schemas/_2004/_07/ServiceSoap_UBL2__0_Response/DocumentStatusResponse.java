/**
 * DocumentStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response;

public class DocumentStatusResponse  implements java.io.Serializable {
    private java.lang.Boolean aceptacionFisica;

    private java.lang.String ambiente;

    private java.lang.String cadenaCodigoQR;

    private java.lang.String cadenaCufe;

    private java.lang.Integer codigo;

    private java.lang.String consecutivo;

    private java.lang.String cufe;

    private java.lang.String descripcionDocumento;

    private java.lang.String descripcionEstatusDocumento;

    private java.lang.String entregaMetodoDIAN;

    private java.lang.Boolean esValidoDIAN;

    private java.lang.Integer estatusDocumento;

    private org.datacontract.schemas._2004._07.ServiceSoap_Models_Response.Evento[] eventos;

    private java.lang.String fechaDocumento;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.HistorialDeEntrega[] historialDeEntregas;

    private java.lang.String mensaje;

    private java.lang.String mensajeDocumento;

    private java.lang.Boolean poseeAdjuntos;

    private java.lang.Boolean poseeRepresentacionGrafica;

    private java.lang.String[] reglasValidacionDIAN;

    private java.lang.String resultado;

    private java.lang.String tipoCufe;

    private java.lang.String tipoDocumento;

    private java.lang.String trackID;

    public DocumentStatusResponse() {
    }

    public DocumentStatusResponse(
           java.lang.Boolean aceptacionFisica,
           java.lang.String ambiente,
           java.lang.String cadenaCodigoQR,
           java.lang.String cadenaCufe,
           java.lang.Integer codigo,
           java.lang.String consecutivo,
           java.lang.String cufe,
           java.lang.String descripcionDocumento,
           java.lang.String descripcionEstatusDocumento,
           java.lang.String entregaMetodoDIAN,
           java.lang.Boolean esValidoDIAN,
           java.lang.Integer estatusDocumento,
           org.datacontract.schemas._2004._07.ServiceSoap_Models_Response.Evento[] eventos,
           java.lang.String fechaDocumento,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.HistorialDeEntrega[] historialDeEntregas,
           java.lang.String mensaje,
           java.lang.String mensajeDocumento,
           java.lang.Boolean poseeAdjuntos,
           java.lang.Boolean poseeRepresentacionGrafica,
           java.lang.String[] reglasValidacionDIAN,
           java.lang.String resultado,
           java.lang.String tipoCufe,
           java.lang.String tipoDocumento,
           java.lang.String trackID) {
           this.aceptacionFisica = aceptacionFisica;
           this.ambiente = ambiente;
           this.cadenaCodigoQR = cadenaCodigoQR;
           this.cadenaCufe = cadenaCufe;
           this.codigo = codigo;
           this.consecutivo = consecutivo;
           this.cufe = cufe;
           this.descripcionDocumento = descripcionDocumento;
           this.descripcionEstatusDocumento = descripcionEstatusDocumento;
           this.entregaMetodoDIAN = entregaMetodoDIAN;
           this.esValidoDIAN = esValidoDIAN;
           this.estatusDocumento = estatusDocumento;
           this.eventos = eventos;
           this.fechaDocumento = fechaDocumento;
           this.historialDeEntregas = historialDeEntregas;
           this.mensaje = mensaje;
           this.mensajeDocumento = mensajeDocumento;
           this.poseeAdjuntos = poseeAdjuntos;
           this.poseeRepresentacionGrafica = poseeRepresentacionGrafica;
           this.reglasValidacionDIAN = reglasValidacionDIAN;
           this.resultado = resultado;
           this.tipoCufe = tipoCufe;
           this.tipoDocumento = tipoDocumento;
           this.trackID = trackID;
    }


    /**
     * Gets the aceptacionFisica value for this DocumentStatusResponse.
     * 
     * @return aceptacionFisica
     */
    public java.lang.Boolean getAceptacionFisica() {
        return aceptacionFisica;
    }


    /**
     * Sets the aceptacionFisica value for this DocumentStatusResponse.
     * 
     * @param aceptacionFisica
     */
    public void setAceptacionFisica(java.lang.Boolean aceptacionFisica) {
        this.aceptacionFisica = aceptacionFisica;
    }


    /**
     * Gets the ambiente value for this DocumentStatusResponse.
     * 
     * @return ambiente
     */
    public java.lang.String getAmbiente() {
        return ambiente;
    }


    /**
     * Sets the ambiente value for this DocumentStatusResponse.
     * 
     * @param ambiente
     */
    public void setAmbiente(java.lang.String ambiente) {
        this.ambiente = ambiente;
    }


    /**
     * Gets the cadenaCodigoQR value for this DocumentStatusResponse.
     * 
     * @return cadenaCodigoQR
     */
    public java.lang.String getCadenaCodigoQR() {
        return cadenaCodigoQR;
    }


    /**
     * Sets the cadenaCodigoQR value for this DocumentStatusResponse.
     * 
     * @param cadenaCodigoQR
     */
    public void setCadenaCodigoQR(java.lang.String cadenaCodigoQR) {
        this.cadenaCodigoQR = cadenaCodigoQR;
    }


    /**
     * Gets the cadenaCufe value for this DocumentStatusResponse.
     * 
     * @return cadenaCufe
     */
    public java.lang.String getCadenaCufe() {
        return cadenaCufe;
    }


    /**
     * Sets the cadenaCufe value for this DocumentStatusResponse.
     * 
     * @param cadenaCufe
     */
    public void setCadenaCufe(java.lang.String cadenaCufe) {
        this.cadenaCufe = cadenaCufe;
    }


    /**
     * Gets the codigo value for this DocumentStatusResponse.
     * 
     * @return codigo
     */
    public java.lang.Integer getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this DocumentStatusResponse.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.Integer codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the consecutivo value for this DocumentStatusResponse.
     * 
     * @return consecutivo
     */
    public java.lang.String getConsecutivo() {
        return consecutivo;
    }


    /**
     * Sets the consecutivo value for this DocumentStatusResponse.
     * 
     * @param consecutivo
     */
    public void setConsecutivo(java.lang.String consecutivo) {
        this.consecutivo = consecutivo;
    }


    /**
     * Gets the cufe value for this DocumentStatusResponse.
     * 
     * @return cufe
     */
    public java.lang.String getCufe() {
        return cufe;
    }


    /**
     * Sets the cufe value for this DocumentStatusResponse.
     * 
     * @param cufe
     */
    public void setCufe(java.lang.String cufe) {
        this.cufe = cufe;
    }


    /**
     * Gets the descripcionDocumento value for this DocumentStatusResponse.
     * 
     * @return descripcionDocumento
     */
    public java.lang.String getDescripcionDocumento() {
        return descripcionDocumento;
    }


    /**
     * Sets the descripcionDocumento value for this DocumentStatusResponse.
     * 
     * @param descripcionDocumento
     */
    public void setDescripcionDocumento(java.lang.String descripcionDocumento) {
        this.descripcionDocumento = descripcionDocumento;
    }


    /**
     * Gets the descripcionEstatusDocumento value for this DocumentStatusResponse.
     * 
     * @return descripcionEstatusDocumento
     */
    public java.lang.String getDescripcionEstatusDocumento() {
        return descripcionEstatusDocumento;
    }


    /**
     * Sets the descripcionEstatusDocumento value for this DocumentStatusResponse.
     * 
     * @param descripcionEstatusDocumento
     */
    public void setDescripcionEstatusDocumento(java.lang.String descripcionEstatusDocumento) {
        this.descripcionEstatusDocumento = descripcionEstatusDocumento;
    }


    /**
     * Gets the entregaMetodoDIAN value for this DocumentStatusResponse.
     * 
     * @return entregaMetodoDIAN
     */
    public java.lang.String getEntregaMetodoDIAN() {
        return entregaMetodoDIAN;
    }


    /**
     * Sets the entregaMetodoDIAN value for this DocumentStatusResponse.
     * 
     * @param entregaMetodoDIAN
     */
    public void setEntregaMetodoDIAN(java.lang.String entregaMetodoDIAN) {
        this.entregaMetodoDIAN = entregaMetodoDIAN;
    }


    /**
     * Gets the esValidoDIAN value for this DocumentStatusResponse.
     * 
     * @return esValidoDIAN
     */
    public java.lang.Boolean getEsValidoDIAN() {
        return esValidoDIAN;
    }


    /**
     * Sets the esValidoDIAN value for this DocumentStatusResponse.
     * 
     * @param esValidoDIAN
     */
    public void setEsValidoDIAN(java.lang.Boolean esValidoDIAN) {
        this.esValidoDIAN = esValidoDIAN;
    }


    /**
     * Gets the estatusDocumento value for this DocumentStatusResponse.
     * 
     * @return estatusDocumento
     */
    public java.lang.Integer getEstatusDocumento() {
        return estatusDocumento;
    }


    /**
     * Sets the estatusDocumento value for this DocumentStatusResponse.
     * 
     * @param estatusDocumento
     */
    public void setEstatusDocumento(java.lang.Integer estatusDocumento) {
        this.estatusDocumento = estatusDocumento;
    }


    /**
     * Gets the eventos value for this DocumentStatusResponse.
     * 
     * @return eventos
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_Models_Response.Evento[] getEventos() {
        return eventos;
    }


    /**
     * Sets the eventos value for this DocumentStatusResponse.
     * 
     * @param eventos
     */
    public void setEventos(org.datacontract.schemas._2004._07.ServiceSoap_Models_Response.Evento[] eventos) {
        this.eventos = eventos;
    }


    /**
     * Gets the fechaDocumento value for this DocumentStatusResponse.
     * 
     * @return fechaDocumento
     */
    public java.lang.String getFechaDocumento() {
        return fechaDocumento;
    }


    /**
     * Sets the fechaDocumento value for this DocumentStatusResponse.
     * 
     * @param fechaDocumento
     */
    public void setFechaDocumento(java.lang.String fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }


    /**
     * Gets the historialDeEntregas value for this DocumentStatusResponse.
     * 
     * @return historialDeEntregas
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.HistorialDeEntrega[] getHistorialDeEntregas() {
        return historialDeEntregas;
    }


    /**
     * Sets the historialDeEntregas value for this DocumentStatusResponse.
     * 
     * @param historialDeEntregas
     */
    public void setHistorialDeEntregas(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.HistorialDeEntrega[] historialDeEntregas) {
        this.historialDeEntregas = historialDeEntregas;
    }


    /**
     * Gets the mensaje value for this DocumentStatusResponse.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this DocumentStatusResponse.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the mensajeDocumento value for this DocumentStatusResponse.
     * 
     * @return mensajeDocumento
     */
    public java.lang.String getMensajeDocumento() {
        return mensajeDocumento;
    }


    /**
     * Sets the mensajeDocumento value for this DocumentStatusResponse.
     * 
     * @param mensajeDocumento
     */
    public void setMensajeDocumento(java.lang.String mensajeDocumento) {
        this.mensajeDocumento = mensajeDocumento;
    }


    /**
     * Gets the poseeAdjuntos value for this DocumentStatusResponse.
     * 
     * @return poseeAdjuntos
     */
    public java.lang.Boolean getPoseeAdjuntos() {
        return poseeAdjuntos;
    }


    /**
     * Sets the poseeAdjuntos value for this DocumentStatusResponse.
     * 
     * @param poseeAdjuntos
     */
    public void setPoseeAdjuntos(java.lang.Boolean poseeAdjuntos) {
        this.poseeAdjuntos = poseeAdjuntos;
    }


    /**
     * Gets the poseeRepresentacionGrafica value for this DocumentStatusResponse.
     * 
     * @return poseeRepresentacionGrafica
     */
    public java.lang.Boolean getPoseeRepresentacionGrafica() {
        return poseeRepresentacionGrafica;
    }


    /**
     * Sets the poseeRepresentacionGrafica value for this DocumentStatusResponse.
     * 
     * @param poseeRepresentacionGrafica
     */
    public void setPoseeRepresentacionGrafica(java.lang.Boolean poseeRepresentacionGrafica) {
        this.poseeRepresentacionGrafica = poseeRepresentacionGrafica;
    }


    /**
     * Gets the reglasValidacionDIAN value for this DocumentStatusResponse.
     * 
     * @return reglasValidacionDIAN
     */
    public java.lang.String[] getReglasValidacionDIAN() {
        return reglasValidacionDIAN;
    }


    /**
     * Sets the reglasValidacionDIAN value for this DocumentStatusResponse.
     * 
     * @param reglasValidacionDIAN
     */
    public void setReglasValidacionDIAN(java.lang.String[] reglasValidacionDIAN) {
        this.reglasValidacionDIAN = reglasValidacionDIAN;
    }


    /**
     * Gets the resultado value for this DocumentStatusResponse.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this DocumentStatusResponse.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the tipoCufe value for this DocumentStatusResponse.
     * 
     * @return tipoCufe
     */
    public java.lang.String getTipoCufe() {
        return tipoCufe;
    }


    /**
     * Sets the tipoCufe value for this DocumentStatusResponse.
     * 
     * @param tipoCufe
     */
    public void setTipoCufe(java.lang.String tipoCufe) {
        this.tipoCufe = tipoCufe;
    }


    /**
     * Gets the tipoDocumento value for this DocumentStatusResponse.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this DocumentStatusResponse.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the trackID value for this DocumentStatusResponse.
     * 
     * @return trackID
     */
    public java.lang.String getTrackID() {
        return trackID;
    }


    /**
     * Sets the trackID value for this DocumentStatusResponse.
     * 
     * @param trackID
     */
    public void setTrackID(java.lang.String trackID) {
        this.trackID = trackID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentStatusResponse)) return false;
        DocumentStatusResponse other = (DocumentStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aceptacionFisica==null && other.getAceptacionFisica()==null) || 
             (this.aceptacionFisica!=null &&
              this.aceptacionFisica.equals(other.getAceptacionFisica()))) &&
            ((this.ambiente==null && other.getAmbiente()==null) || 
             (this.ambiente!=null &&
              this.ambiente.equals(other.getAmbiente()))) &&
            ((this.cadenaCodigoQR==null && other.getCadenaCodigoQR()==null) || 
             (this.cadenaCodigoQR!=null &&
              this.cadenaCodigoQR.equals(other.getCadenaCodigoQR()))) &&
            ((this.cadenaCufe==null && other.getCadenaCufe()==null) || 
             (this.cadenaCufe!=null &&
              this.cadenaCufe.equals(other.getCadenaCufe()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.consecutivo==null && other.getConsecutivo()==null) || 
             (this.consecutivo!=null &&
              this.consecutivo.equals(other.getConsecutivo()))) &&
            ((this.cufe==null && other.getCufe()==null) || 
             (this.cufe!=null &&
              this.cufe.equals(other.getCufe()))) &&
            ((this.descripcionDocumento==null && other.getDescripcionDocumento()==null) || 
             (this.descripcionDocumento!=null &&
              this.descripcionDocumento.equals(other.getDescripcionDocumento()))) &&
            ((this.descripcionEstatusDocumento==null && other.getDescripcionEstatusDocumento()==null) || 
             (this.descripcionEstatusDocumento!=null &&
              this.descripcionEstatusDocumento.equals(other.getDescripcionEstatusDocumento()))) &&
            ((this.entregaMetodoDIAN==null && other.getEntregaMetodoDIAN()==null) || 
             (this.entregaMetodoDIAN!=null &&
              this.entregaMetodoDIAN.equals(other.getEntregaMetodoDIAN()))) &&
            ((this.esValidoDIAN==null && other.getEsValidoDIAN()==null) || 
             (this.esValidoDIAN!=null &&
              this.esValidoDIAN.equals(other.getEsValidoDIAN()))) &&
            ((this.estatusDocumento==null && other.getEstatusDocumento()==null) || 
             (this.estatusDocumento!=null &&
              this.estatusDocumento.equals(other.getEstatusDocumento()))) &&
            ((this.eventos==null && other.getEventos()==null) || 
             (this.eventos!=null &&
              java.util.Arrays.equals(this.eventos, other.getEventos()))) &&
            ((this.fechaDocumento==null && other.getFechaDocumento()==null) || 
             (this.fechaDocumento!=null &&
              this.fechaDocumento.equals(other.getFechaDocumento()))) &&
            ((this.historialDeEntregas==null && other.getHistorialDeEntregas()==null) || 
             (this.historialDeEntregas!=null &&
              java.util.Arrays.equals(this.historialDeEntregas, other.getHistorialDeEntregas()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.mensajeDocumento==null && other.getMensajeDocumento()==null) || 
             (this.mensajeDocumento!=null &&
              this.mensajeDocumento.equals(other.getMensajeDocumento()))) &&
            ((this.poseeAdjuntos==null && other.getPoseeAdjuntos()==null) || 
             (this.poseeAdjuntos!=null &&
              this.poseeAdjuntos.equals(other.getPoseeAdjuntos()))) &&
            ((this.poseeRepresentacionGrafica==null && other.getPoseeRepresentacionGrafica()==null) || 
             (this.poseeRepresentacionGrafica!=null &&
              this.poseeRepresentacionGrafica.equals(other.getPoseeRepresentacionGrafica()))) &&
            ((this.reglasValidacionDIAN==null && other.getReglasValidacionDIAN()==null) || 
             (this.reglasValidacionDIAN!=null &&
              java.util.Arrays.equals(this.reglasValidacionDIAN, other.getReglasValidacionDIAN()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado()))) &&
            ((this.tipoCufe==null && other.getTipoCufe()==null) || 
             (this.tipoCufe!=null &&
              this.tipoCufe.equals(other.getTipoCufe()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.trackID==null && other.getTrackID()==null) || 
             (this.trackID!=null &&
              this.trackID.equals(other.getTrackID())));
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
        if (getAceptacionFisica() != null) {
            _hashCode += getAceptacionFisica().hashCode();
        }
        if (getAmbiente() != null) {
            _hashCode += getAmbiente().hashCode();
        }
        if (getCadenaCodigoQR() != null) {
            _hashCode += getCadenaCodigoQR().hashCode();
        }
        if (getCadenaCufe() != null) {
            _hashCode += getCadenaCufe().hashCode();
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getConsecutivo() != null) {
            _hashCode += getConsecutivo().hashCode();
        }
        if (getCufe() != null) {
            _hashCode += getCufe().hashCode();
        }
        if (getDescripcionDocumento() != null) {
            _hashCode += getDescripcionDocumento().hashCode();
        }
        if (getDescripcionEstatusDocumento() != null) {
            _hashCode += getDescripcionEstatusDocumento().hashCode();
        }
        if (getEntregaMetodoDIAN() != null) {
            _hashCode += getEntregaMetodoDIAN().hashCode();
        }
        if (getEsValidoDIAN() != null) {
            _hashCode += getEsValidoDIAN().hashCode();
        }
        if (getEstatusDocumento() != null) {
            _hashCode += getEstatusDocumento().hashCode();
        }
        if (getEventos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFechaDocumento() != null) {
            _hashCode += getFechaDocumento().hashCode();
        }
        if (getHistorialDeEntregas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistorialDeEntregas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistorialDeEntregas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getMensajeDocumento() != null) {
            _hashCode += getMensajeDocumento().hashCode();
        }
        if (getPoseeAdjuntos() != null) {
            _hashCode += getPoseeAdjuntos().hashCode();
        }
        if (getPoseeRepresentacionGrafica() != null) {
            _hashCode += getPoseeRepresentacionGrafica().hashCode();
        }
        if (getReglasValidacionDIAN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReglasValidacionDIAN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReglasValidacionDIAN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        if (getTipoCufe() != null) {
            _hashCode += getTipoCufe().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getTrackID() != null) {
            _hashCode += getTrackID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "DocumentStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aceptacionFisica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "aceptacionFisica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ambiente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "ambiente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cadenaCodigoQR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "cadenaCodigoQR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cadenaCufe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "cadenaCufe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consecutivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "consecutivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cufe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "cufe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "descripcionDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionEstatusDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "descripcionEstatusDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entregaMetodoDIAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "entregaMetodoDIAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esValidoDIAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "esValidoDIAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estatusDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "estatusDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "eventos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "Evento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "Evento"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "fechaDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historialDeEntregas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "historialDeEntregas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "HistorialDeEntrega"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "HistorialDeEntrega"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajeDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "mensajeDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poseeAdjuntos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "poseeAdjuntos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poseeRepresentacionGrafica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "poseeRepresentacionGrafica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reglasValidacionDIAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "reglasValidacionDIAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCufe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "tipoCufe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "trackID"));
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
