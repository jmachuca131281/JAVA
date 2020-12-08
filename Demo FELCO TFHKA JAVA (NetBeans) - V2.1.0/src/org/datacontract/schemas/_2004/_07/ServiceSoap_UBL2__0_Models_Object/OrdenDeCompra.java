/**
 * OrdenDeCompra.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class OrdenDeCompra  implements java.io.Serializable {
    private java.lang.String codigoCliente;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DocumentoReferenciado documentoReferencia;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras;

    private java.lang.String fecha;

    private java.lang.String numeroOrden;

    private java.lang.String numeroPedido;

    private java.lang.String tipoCUFE;

    private java.lang.String tipoOrden;

    private java.lang.String uuid;

    public OrdenDeCompra() {
    }

    public OrdenDeCompra(
           java.lang.String codigoCliente,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DocumentoReferenciado documentoReferencia,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras,
           java.lang.String fecha,
           java.lang.String numeroOrden,
           java.lang.String numeroPedido,
           java.lang.String tipoCUFE,
           java.lang.String tipoOrden,
           java.lang.String uuid) {
           this.codigoCliente = codigoCliente;
           this.documentoReferencia = documentoReferencia;
           this.extras = extras;
           this.fecha = fecha;
           this.numeroOrden = numeroOrden;
           this.numeroPedido = numeroPedido;
           this.tipoCUFE = tipoCUFE;
           this.tipoOrden = tipoOrden;
           this.uuid = uuid;
    }


    /**
     * Gets the codigoCliente value for this OrdenDeCompra.
     * 
     * @return codigoCliente
     */
    public java.lang.String getCodigoCliente() {
        return codigoCliente;
    }


    /**
     * Sets the codigoCliente value for this OrdenDeCompra.
     * 
     * @param codigoCliente
     */
    public void setCodigoCliente(java.lang.String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }


    /**
     * Gets the documentoReferencia value for this OrdenDeCompra.
     * 
     * @return documentoReferencia
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DocumentoReferenciado getDocumentoReferencia() {
        return documentoReferencia;
    }


    /**
     * Sets the documentoReferencia value for this OrdenDeCompra.
     * 
     * @param documentoReferencia
     */
    public void setDocumentoReferencia(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DocumentoReferenciado documentoReferencia) {
        this.documentoReferencia = documentoReferencia;
    }


    /**
     * Gets the extras value for this OrdenDeCompra.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this OrdenDeCompra.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras) {
        this.extras = extras;
    }


    /**
     * Gets the fecha value for this OrdenDeCompra.
     * 
     * @return fecha
     */
    public java.lang.String getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this OrdenDeCompra.
     * 
     * @param fecha
     */
    public void setFecha(java.lang.String fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the numeroOrden value for this OrdenDeCompra.
     * 
     * @return numeroOrden
     */
    public java.lang.String getNumeroOrden() {
        return numeroOrden;
    }


    /**
     * Sets the numeroOrden value for this OrdenDeCompra.
     * 
     * @param numeroOrden
     */
    public void setNumeroOrden(java.lang.String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }


    /**
     * Gets the numeroPedido value for this OrdenDeCompra.
     * 
     * @return numeroPedido
     */
    public java.lang.String getNumeroPedido() {
        return numeroPedido;
    }


    /**
     * Sets the numeroPedido value for this OrdenDeCompra.
     * 
     * @param numeroPedido
     */
    public void setNumeroPedido(java.lang.String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }


    /**
     * Gets the tipoCUFE value for this OrdenDeCompra.
     * 
     * @return tipoCUFE
     */
    public java.lang.String getTipoCUFE() {
        return tipoCUFE;
    }


    /**
     * Sets the tipoCUFE value for this OrdenDeCompra.
     * 
     * @param tipoCUFE
     */
    public void setTipoCUFE(java.lang.String tipoCUFE) {
        this.tipoCUFE = tipoCUFE;
    }


    /**
     * Gets the tipoOrden value for this OrdenDeCompra.
     * 
     * @return tipoOrden
     */
    public java.lang.String getTipoOrden() {
        return tipoOrden;
    }


    /**
     * Sets the tipoOrden value for this OrdenDeCompra.
     * 
     * @param tipoOrden
     */
    public void setTipoOrden(java.lang.String tipoOrden) {
        this.tipoOrden = tipoOrden;
    }


    /**
     * Gets the uuid value for this OrdenDeCompra.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this OrdenDeCompra.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrdenDeCompra)) return false;
        OrdenDeCompra other = (OrdenDeCompra) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoCliente==null && other.getCodigoCliente()==null) || 
             (this.codigoCliente!=null &&
              this.codigoCliente.equals(other.getCodigoCliente()))) &&
            ((this.documentoReferencia==null && other.getDocumentoReferencia()==null) || 
             (this.documentoReferencia!=null &&
              this.documentoReferencia.equals(other.getDocumentoReferencia()))) &&
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.numeroOrden==null && other.getNumeroOrden()==null) || 
             (this.numeroOrden!=null &&
              this.numeroOrden.equals(other.getNumeroOrden()))) &&
            ((this.numeroPedido==null && other.getNumeroPedido()==null) || 
             (this.numeroPedido!=null &&
              this.numeroPedido.equals(other.getNumeroPedido()))) &&
            ((this.tipoCUFE==null && other.getTipoCUFE()==null) || 
             (this.tipoCUFE!=null &&
              this.tipoCUFE.equals(other.getTipoCUFE()))) &&
            ((this.tipoOrden==null && other.getTipoOrden()==null) || 
             (this.tipoOrden!=null &&
              this.tipoOrden.equals(other.getTipoOrden()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid())));
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
        if (getCodigoCliente() != null) {
            _hashCode += getCodigoCliente().hashCode();
        }
        if (getDocumentoReferencia() != null) {
            _hashCode += getDocumentoReferencia().hashCode();
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
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getNumeroOrden() != null) {
            _hashCode += getNumeroOrden().hashCode();
        }
        if (getNumeroPedido() != null) {
            _hashCode += getNumeroPedido().hashCode();
        }
        if (getTipoCUFE() != null) {
            _hashCode += getTipoCUFE().hashCode();
        }
        if (getTipoOrden() != null) {
            _hashCode += getTipoOrden().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrdenDeCompra.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "OrdenDeCompra"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "documentoReferencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DocumentoReferenciado"));
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
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroOrden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroOrden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroPedido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroPedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCUFE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoCUFE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOrden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoOrden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "uuid"));
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
