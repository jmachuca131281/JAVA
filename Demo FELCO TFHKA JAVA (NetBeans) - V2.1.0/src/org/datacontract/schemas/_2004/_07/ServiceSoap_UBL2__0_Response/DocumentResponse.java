/**
 * DocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response;

public class DocumentResponse  implements java.io.Serializable {
    private java.lang.Integer codigo;

    private java.lang.String consecutivoDocumento;

    private java.lang.String cufe;

    private java.lang.String fechaRespuesta;

    private java.lang.String hash;

    private java.lang.String mensaje;

    private java.lang.String[] mensajesValidacion;

    private java.lang.String nombre;

    private java.lang.String[] reglasValidacionDIAN;

    private java.lang.String resultado;

    private java.lang.String tipoCufe;

    private java.lang.String xml;

    public DocumentResponse() {
    }

    public DocumentResponse(
           java.lang.Integer codigo,
           java.lang.String consecutivoDocumento,
           java.lang.String cufe,
           java.lang.String fechaRespuesta,
           java.lang.String hash,
           java.lang.String mensaje,
           java.lang.String[] mensajesValidacion,
           java.lang.String nombre,
           java.lang.String[] reglasValidacionDIAN,
           java.lang.String resultado,
           java.lang.String tipoCufe,
           java.lang.String xml) {
           this.codigo = codigo;
           this.consecutivoDocumento = consecutivoDocumento;
           this.cufe = cufe;
           this.fechaRespuesta = fechaRespuesta;
           this.hash = hash;
           this.mensaje = mensaje;
           this.mensajesValidacion = mensajesValidacion;
           this.nombre = nombre;
           this.reglasValidacionDIAN = reglasValidacionDIAN;
           this.resultado = resultado;
           this.tipoCufe = tipoCufe;
           this.xml = xml;
    }


    /**
     * Gets the codigo value for this DocumentResponse.
     * 
     * @return codigo
     */
    public java.lang.Integer getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this DocumentResponse.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.Integer codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the consecutivoDocumento value for this DocumentResponse.
     * 
     * @return consecutivoDocumento
     */
    public java.lang.String getConsecutivoDocumento() {
        return consecutivoDocumento;
    }


    /**
     * Sets the consecutivoDocumento value for this DocumentResponse.
     * 
     * @param consecutivoDocumento
     */
    public void setConsecutivoDocumento(java.lang.String consecutivoDocumento) {
        this.consecutivoDocumento = consecutivoDocumento;
    }


    /**
     * Gets the cufe value for this DocumentResponse.
     * 
     * @return cufe
     */
    public java.lang.String getCufe() {
        return cufe;
    }


    /**
     * Sets the cufe value for this DocumentResponse.
     * 
     * @param cufe
     */
    public void setCufe(java.lang.String cufe) {
        this.cufe = cufe;
    }


    /**
     * Gets the fechaRespuesta value for this DocumentResponse.
     * 
     * @return fechaRespuesta
     */
    public java.lang.String getFechaRespuesta() {
        return fechaRespuesta;
    }


    /**
     * Sets the fechaRespuesta value for this DocumentResponse.
     * 
     * @param fechaRespuesta
     */
    public void setFechaRespuesta(java.lang.String fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }


    /**
     * Gets the hash value for this DocumentResponse.
     * 
     * @return hash
     */
    public java.lang.String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this DocumentResponse.
     * 
     * @param hash
     */
    public void setHash(java.lang.String hash) {
        this.hash = hash;
    }


    /**
     * Gets the mensaje value for this DocumentResponse.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this DocumentResponse.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the mensajesValidacion value for this DocumentResponse.
     * 
     * @return mensajesValidacion
     */
    public java.lang.String[] getMensajesValidacion() {
        return mensajesValidacion;
    }


    /**
     * Sets the mensajesValidacion value for this DocumentResponse.
     * 
     * @param mensajesValidacion
     */
    public void setMensajesValidacion(java.lang.String[] mensajesValidacion) {
        this.mensajesValidacion = mensajesValidacion;
    }


    /**
     * Gets the nombre value for this DocumentResponse.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DocumentResponse.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the reglasValidacionDIAN value for this DocumentResponse.
     * 
     * @return reglasValidacionDIAN
     */
    public java.lang.String[] getReglasValidacionDIAN() {
        return reglasValidacionDIAN;
    }


    /**
     * Sets the reglasValidacionDIAN value for this DocumentResponse.
     * 
     * @param reglasValidacionDIAN
     */
    public void setReglasValidacionDIAN(java.lang.String[] reglasValidacionDIAN) {
        this.reglasValidacionDIAN = reglasValidacionDIAN;
    }


    /**
     * Gets the resultado value for this DocumentResponse.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this DocumentResponse.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the tipoCufe value for this DocumentResponse.
     * 
     * @return tipoCufe
     */
    public java.lang.String getTipoCufe() {
        return tipoCufe;
    }


    /**
     * Sets the tipoCufe value for this DocumentResponse.
     * 
     * @param tipoCufe
     */
    public void setTipoCufe(java.lang.String tipoCufe) {
        this.tipoCufe = tipoCufe;
    }


    /**
     * Gets the xml value for this DocumentResponse.
     * 
     * @return xml
     */
    public java.lang.String getXml() {
        return xml;
    }


    /**
     * Sets the xml value for this DocumentResponse.
     * 
     * @param xml
     */
    public void setXml(java.lang.String xml) {
        this.xml = xml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentResponse)) return false;
        DocumentResponse other = (DocumentResponse) obj;
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
            ((this.consecutivoDocumento==null && other.getConsecutivoDocumento()==null) || 
             (this.consecutivoDocumento!=null &&
              this.consecutivoDocumento.equals(other.getConsecutivoDocumento()))) &&
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
            ((this.mensajesValidacion==null && other.getMensajesValidacion()==null) || 
             (this.mensajesValidacion!=null &&
              java.util.Arrays.equals(this.mensajesValidacion, other.getMensajesValidacion()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.reglasValidacionDIAN==null && other.getReglasValidacionDIAN()==null) || 
             (this.reglasValidacionDIAN!=null &&
              java.util.Arrays.equals(this.reglasValidacionDIAN, other.getReglasValidacionDIAN()))) &&
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
        if (getConsecutivoDocumento() != null) {
            _hashCode += getConsecutivoDocumento().hashCode();
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
        if (getMensajesValidacion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMensajesValidacion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMensajesValidacion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
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
        if (getXml() != null) {
            _hashCode += getXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "DocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consecutivoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "consecutivoDocumento"));
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
        elemField.setFieldName("mensajesValidacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "mensajesValidacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
