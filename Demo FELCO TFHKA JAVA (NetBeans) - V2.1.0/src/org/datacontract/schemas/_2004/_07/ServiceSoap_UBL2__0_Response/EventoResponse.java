/**
 * EventoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response;

public class EventoResponse  implements java.io.Serializable {
    private java.lang.Integer codigo;

    private java.lang.String consecutivoDocumentoEvento;

    private java.lang.String cufe;

    private java.lang.String fechaRespuesta;

    private java.lang.String hash;

    private java.lang.String mensaje;

    private java.lang.String resultado;

    private java.lang.String tipoCufe;

    private java.lang.String xml;

    public EventoResponse() {
    }

    public EventoResponse(
           java.lang.Integer codigo,
           java.lang.String consecutivoDocumentoEvento,
           java.lang.String cufe,
           java.lang.String fechaRespuesta,
           java.lang.String hash,
           java.lang.String mensaje,
           java.lang.String resultado,
           java.lang.String tipoCufe,
           java.lang.String xml) {
           this.codigo = codigo;
           this.consecutivoDocumentoEvento = consecutivoDocumentoEvento;
           this.cufe = cufe;
           this.fechaRespuesta = fechaRespuesta;
           this.hash = hash;
           this.mensaje = mensaje;
           this.resultado = resultado;
           this.tipoCufe = tipoCufe;
           this.xml = xml;
    }


    /**
     * Gets the codigo value for this EventoResponse.
     * 
     * @return codigo
     */
    public java.lang.Integer getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this EventoResponse.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.Integer codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the consecutivoDocumentoEvento value for this EventoResponse.
     * 
     * @return consecutivoDocumentoEvento
     */
    public java.lang.String getConsecutivoDocumentoEvento() {
        return consecutivoDocumentoEvento;
    }


    /**
     * Sets the consecutivoDocumentoEvento value for this EventoResponse.
     * 
     * @param consecutivoDocumentoEvento
     */
    public void setConsecutivoDocumentoEvento(java.lang.String consecutivoDocumentoEvento) {
        this.consecutivoDocumentoEvento = consecutivoDocumentoEvento;
    }


    /**
     * Gets the cufe value for this EventoResponse.
     * 
     * @return cufe
     */
    public java.lang.String getCufe() {
        return cufe;
    }


    /**
     * Sets the cufe value for this EventoResponse.
     * 
     * @param cufe
     */
    public void setCufe(java.lang.String cufe) {
        this.cufe = cufe;
    }


    /**
     * Gets the fechaRespuesta value for this EventoResponse.
     * 
     * @return fechaRespuesta
     */
    public java.lang.String getFechaRespuesta() {
        return fechaRespuesta;
    }


    /**
     * Sets the fechaRespuesta value for this EventoResponse.
     * 
     * @param fechaRespuesta
     */
    public void setFechaRespuesta(java.lang.String fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }


    /**
     * Gets the hash value for this EventoResponse.
     * 
     * @return hash
     */
    public java.lang.String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this EventoResponse.
     * 
     * @param hash
     */
    public void setHash(java.lang.String hash) {
        this.hash = hash;
    }


    /**
     * Gets the mensaje value for this EventoResponse.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this EventoResponse.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the resultado value for this EventoResponse.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this EventoResponse.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the tipoCufe value for this EventoResponse.
     * 
     * @return tipoCufe
     */
    public java.lang.String getTipoCufe() {
        return tipoCufe;
    }


    /**
     * Sets the tipoCufe value for this EventoResponse.
     * 
     * @param tipoCufe
     */
    public void setTipoCufe(java.lang.String tipoCufe) {
        this.tipoCufe = tipoCufe;
    }


    /**
     * Gets the xml value for this EventoResponse.
     * 
     * @return xml
     */
    public java.lang.String getXml() {
        return xml;
    }


    /**
     * Sets the xml value for this EventoResponse.
     * 
     * @param xml
     */
    public void setXml(java.lang.String xml) {
        this.xml = xml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventoResponse)) return false;
        EventoResponse other = (EventoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.consecutivoDocumentoEvento==null && other.getConsecutivoDocumentoEvento()==null) || 
             (this.consecutivoDocumentoEvento!=null &&
              this.consecutivoDocumentoEvento.equals(other.getConsecutivoDocumentoEvento()))) &&
            ((this.cufe==null && other.getCufe()==null) || 
             (this.cufe!=null &&
              this.cufe.equals(other.getCufe()))) &&
            ((this.fechaRespuesta==null && other.getFechaRespuesta()==null) || 
             (this.fechaRespuesta!=null &&
              this.fechaRespuesta.equals(other.getFechaRespuesta()))) &&
            ((this.hash==null && other.getHash()==null) || 
             (this.hash!=null &&
              this.hash.equals(other.getHash()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado()))) &&
            ((this.tipoCufe==null && other.getTipoCufe()==null) || 
             (this.tipoCufe!=null &&
              this.tipoCufe.equals(other.getTipoCufe()))) &&
            ((this.xml==null && other.getXml()==null) || 
             (this.xml!=null &&
              this.xml.equals(other.getXml())));
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getConsecutivoDocumentoEvento() != null) {
            _hashCode += getConsecutivoDocumentoEvento().hashCode();
        }
        if (getCufe() != null) {
            _hashCode += getCufe().hashCode();
        }
        if (getFechaRespuesta() != null) {
            _hashCode += getFechaRespuesta().hashCode();
        }
        if (getHash() != null) {
            _hashCode += getHash().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        if (getTipoCufe() != null) {
            _hashCode += getTipoCufe().hashCode();
        }
        if (getXml() != null) {
            _hashCode += getXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "EventoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consecutivoDocumentoEvento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "consecutivoDocumentoEvento"));
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
        elemField.setFieldName("fechaRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "fechaRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("xml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "xml"));
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
