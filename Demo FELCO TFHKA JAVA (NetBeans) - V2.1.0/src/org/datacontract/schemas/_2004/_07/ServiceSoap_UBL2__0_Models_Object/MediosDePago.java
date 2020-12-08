/**
 * MediosDePago.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class MediosDePago  implements java.io.Serializable {
    private java.lang.String codigoBanco;

    private java.lang.String codigoCanalPago;

    private java.lang.String codigoReferencia;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras;

    private java.lang.String fechaDeVencimiento;

    private java.lang.String medioPago;

    private java.lang.String metodoDePago;

    private java.lang.String nombreBanco;

    private java.lang.String numeroDeReferencia;

    private java.lang.String numeroDias;

    private java.lang.String numeroTransferencia;

    public MediosDePago() {
    }

    public MediosDePago(
           java.lang.String codigoBanco,
           java.lang.String codigoCanalPago,
           java.lang.String codigoReferencia,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras,
           java.lang.String fechaDeVencimiento,
           java.lang.String medioPago,
           java.lang.String metodoDePago,
           java.lang.String nombreBanco,
           java.lang.String numeroDeReferencia,
           java.lang.String numeroDias,
           java.lang.String numeroTransferencia) {
           this.codigoBanco = codigoBanco;
           this.codigoCanalPago = codigoCanalPago;
           this.codigoReferencia = codigoReferencia;
           this.extras = extras;
           this.fechaDeVencimiento = fechaDeVencimiento;
           this.medioPago = medioPago;
           this.metodoDePago = metodoDePago;
           this.nombreBanco = nombreBanco;
           this.numeroDeReferencia = numeroDeReferencia;
           this.numeroDias = numeroDias;
           this.numeroTransferencia = numeroTransferencia;
    }


    /**
     * Gets the codigoBanco value for this MediosDePago.
     * 
     * @return codigoBanco
     */
    public java.lang.String getCodigoBanco() {
        return codigoBanco;
    }


    /**
     * Sets the codigoBanco value for this MediosDePago.
     * 
     * @param codigoBanco
     */
    public void setCodigoBanco(java.lang.String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }


    /**
     * Gets the codigoCanalPago value for this MediosDePago.
     * 
     * @return codigoCanalPago
     */
    public java.lang.String getCodigoCanalPago() {
        return codigoCanalPago;
    }


    /**
     * Sets the codigoCanalPago value for this MediosDePago.
     * 
     * @param codigoCanalPago
     */
    public void setCodigoCanalPago(java.lang.String codigoCanalPago) {
        this.codigoCanalPago = codigoCanalPago;
    }


    /**
     * Gets the codigoReferencia value for this MediosDePago.
     * 
     * @return codigoReferencia
     */
    public java.lang.String getCodigoReferencia() {
        return codigoReferencia;
    }


    /**
     * Sets the codigoReferencia value for this MediosDePago.
     * 
     * @param codigoReferencia
     */
    public void setCodigoReferencia(java.lang.String codigoReferencia) {
        this.codigoReferencia = codigoReferencia;
    }


    /**
     * Gets the extras value for this MediosDePago.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this MediosDePago.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras) {
        this.extras = extras;
    }


    /**
     * Gets the fechaDeVencimiento value for this MediosDePago.
     * 
     * @return fechaDeVencimiento
     */
    public java.lang.String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }


    /**
     * Sets the fechaDeVencimiento value for this MediosDePago.
     * 
     * @param fechaDeVencimiento
     */
    public void setFechaDeVencimiento(java.lang.String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }


    /**
     * Gets the medioPago value for this MediosDePago.
     * 
     * @return medioPago
     */
    public java.lang.String getMedioPago() {
        return medioPago;
    }


    /**
     * Sets the medioPago value for this MediosDePago.
     * 
     * @param medioPago
     */
    public void setMedioPago(java.lang.String medioPago) {
        this.medioPago = medioPago;
    }


    /**
     * Gets the metodoDePago value for this MediosDePago.
     * 
     * @return metodoDePago
     */
    public java.lang.String getMetodoDePago() {
        return metodoDePago;
    }


    /**
     * Sets the metodoDePago value for this MediosDePago.
     * 
     * @param metodoDePago
     */
    public void setMetodoDePago(java.lang.String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }


    /**
     * Gets the nombreBanco value for this MediosDePago.
     * 
     * @return nombreBanco
     */
    public java.lang.String getNombreBanco() {
        return nombreBanco;
    }


    /**
     * Sets the nombreBanco value for this MediosDePago.
     * 
     * @param nombreBanco
     */
    public void setNombreBanco(java.lang.String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }


    /**
     * Gets the numeroDeReferencia value for this MediosDePago.
     * 
     * @return numeroDeReferencia
     */
    public java.lang.String getNumeroDeReferencia() {
        return numeroDeReferencia;
    }


    /**
     * Sets the numeroDeReferencia value for this MediosDePago.
     * 
     * @param numeroDeReferencia
     */
    public void setNumeroDeReferencia(java.lang.String numeroDeReferencia) {
        this.numeroDeReferencia = numeroDeReferencia;
    }


    /**
     * Gets the numeroDias value for this MediosDePago.
     * 
     * @return numeroDias
     */
    public java.lang.String getNumeroDias() {
        return numeroDias;
    }


    /**
     * Sets the numeroDias value for this MediosDePago.
     * 
     * @param numeroDias
     */
    public void setNumeroDias(java.lang.String numeroDias) {
        this.numeroDias = numeroDias;
    }


    /**
     * Gets the numeroTransferencia value for this MediosDePago.
     * 
     * @return numeroTransferencia
     */
    public java.lang.String getNumeroTransferencia() {
        return numeroTransferencia;
    }


    /**
     * Sets the numeroTransferencia value for this MediosDePago.
     * 
     * @param numeroTransferencia
     */
    public void setNumeroTransferencia(java.lang.String numeroTransferencia) {
        this.numeroTransferencia = numeroTransferencia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MediosDePago)) return false;
        MediosDePago other = (MediosDePago) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoBanco==null && other.getCodigoBanco()==null) || 
             (this.codigoBanco!=null &&
              this.codigoBanco.equals(other.getCodigoBanco()))) &&
            ((this.codigoCanalPago==null && other.getCodigoCanalPago()==null) || 
             (this.codigoCanalPago!=null &&
              this.codigoCanalPago.equals(other.getCodigoCanalPago()))) &&
            ((this.codigoReferencia==null && other.getCodigoReferencia()==null) || 
             (this.codigoReferencia!=null &&
              this.codigoReferencia.equals(other.getCodigoReferencia()))) &&
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras()))) &&
            ((this.fechaDeVencimiento==null && other.getFechaDeVencimiento()==null) || 
             (this.fechaDeVencimiento!=null &&
              this.fechaDeVencimiento.equals(other.getFechaDeVencimiento()))) &&
            ((this.medioPago==null && other.getMedioPago()==null) || 
             (this.medioPago!=null &&
              this.medioPago.equals(other.getMedioPago()))) &&
            ((this.metodoDePago==null && other.getMetodoDePago()==null) || 
             (this.metodoDePago!=null &&
              this.metodoDePago.equals(other.getMetodoDePago()))) &&
            ((this.nombreBanco==null && other.getNombreBanco()==null) || 
             (this.nombreBanco!=null &&
              this.nombreBanco.equals(other.getNombreBanco()))) &&
            ((this.numeroDeReferencia==null && other.getNumeroDeReferencia()==null) || 
             (this.numeroDeReferencia!=null &&
              this.numeroDeReferencia.equals(other.getNumeroDeReferencia()))) &&
            ((this.numeroDias==null && other.getNumeroDias()==null) || 
             (this.numeroDias!=null &&
              this.numeroDias.equals(other.getNumeroDias()))) &&
            ((this.numeroTransferencia==null && other.getNumeroTransferencia()==null) || 
             (this.numeroTransferencia!=null &&
              this.numeroTransferencia.equals(other.getNumeroTransferencia())));
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
        if (getCodigoBanco() != null) {
            _hashCode += getCodigoBanco().hashCode();
        }
        if (getCodigoCanalPago() != null) {
            _hashCode += getCodigoCanalPago().hashCode();
        }
        if (getCodigoReferencia() != null) {
            _hashCode += getCodigoReferencia().hashCode();
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
        if (getFechaDeVencimiento() != null) {
            _hashCode += getFechaDeVencimiento().hashCode();
        }
        if (getMedioPago() != null) {
            _hashCode += getMedioPago().hashCode();
        }
        if (getMetodoDePago() != null) {
            _hashCode += getMetodoDePago().hashCode();
        }
        if (getNombreBanco() != null) {
            _hashCode += getNombreBanco().hashCode();
        }
        if (getNumeroDeReferencia() != null) {
            _hashCode += getNumeroDeReferencia().hashCode();
        }
        if (getNumeroDias() != null) {
            _hashCode += getNumeroDias().hashCode();
        }
        if (getNumeroTransferencia() != null) {
            _hashCode += getNumeroTransferencia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MediosDePago.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "MediosDePago"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCanalPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoCanalPago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoReferencia"));
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
        elemField.setFieldName("fechaDeVencimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaDeVencimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medioPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "medioPago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metodoDePago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "metodoDePago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDeReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroDeReferencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroDias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTransferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroTransferencia"));
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
