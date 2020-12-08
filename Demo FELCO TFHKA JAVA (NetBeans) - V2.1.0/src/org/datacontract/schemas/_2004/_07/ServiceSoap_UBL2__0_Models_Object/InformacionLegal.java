/**
 * InformacionLegal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class InformacionLegal  implements java.io.Serializable {
    private java.lang.String codigoEstablecimiento;

    private java.lang.String nombreRegistroRUT;

    private java.lang.String numeroIdentificacion;

    private java.lang.String numeroIdentificacionDV;

    private java.lang.String numeroMatriculaMercantil;

    private java.lang.String prefijoFacturacion;

    private java.lang.String tipoIdentificacion;

    public InformacionLegal() {
    }

    public InformacionLegal(
           java.lang.String codigoEstablecimiento,
           java.lang.String nombreRegistroRUT,
           java.lang.String numeroIdentificacion,
           java.lang.String numeroIdentificacionDV,
           java.lang.String numeroMatriculaMercantil,
           java.lang.String prefijoFacturacion,
           java.lang.String tipoIdentificacion) {
           this.codigoEstablecimiento = codigoEstablecimiento;
           this.nombreRegistroRUT = nombreRegistroRUT;
           this.numeroIdentificacion = numeroIdentificacion;
           this.numeroIdentificacionDV = numeroIdentificacionDV;
           this.numeroMatriculaMercantil = numeroMatriculaMercantil;
           this.prefijoFacturacion = prefijoFacturacion;
           this.tipoIdentificacion = tipoIdentificacion;
    }


    /**
     * Gets the codigoEstablecimiento value for this InformacionLegal.
     * 
     * @return codigoEstablecimiento
     */
    public java.lang.String getCodigoEstablecimiento() {
        return codigoEstablecimiento;
    }


    /**
     * Sets the codigoEstablecimiento value for this InformacionLegal.
     * 
     * @param codigoEstablecimiento
     */
    public void setCodigoEstablecimiento(java.lang.String codigoEstablecimiento) {
        this.codigoEstablecimiento = codigoEstablecimiento;
    }


    /**
     * Gets the nombreRegistroRUT value for this InformacionLegal.
     * 
     * @return nombreRegistroRUT
     */
    public java.lang.String getNombreRegistroRUT() {
        return nombreRegistroRUT;
    }


    /**
     * Sets the nombreRegistroRUT value for this InformacionLegal.
     * 
     * @param nombreRegistroRUT
     */
    public void setNombreRegistroRUT(java.lang.String nombreRegistroRUT) {
        this.nombreRegistroRUT = nombreRegistroRUT;
    }


    /**
     * Gets the numeroIdentificacion value for this InformacionLegal.
     * 
     * @return numeroIdentificacion
     */
    public java.lang.String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }


    /**
     * Sets the numeroIdentificacion value for this InformacionLegal.
     * 
     * @param numeroIdentificacion
     */
    public void setNumeroIdentificacion(java.lang.String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


    /**
     * Gets the numeroIdentificacionDV value for this InformacionLegal.
     * 
     * @return numeroIdentificacionDV
     */
    public java.lang.String getNumeroIdentificacionDV() {
        return numeroIdentificacionDV;
    }


    /**
     * Sets the numeroIdentificacionDV value for this InformacionLegal.
     * 
     * @param numeroIdentificacionDV
     */
    public void setNumeroIdentificacionDV(java.lang.String numeroIdentificacionDV) {
        this.numeroIdentificacionDV = numeroIdentificacionDV;
    }


    /**
     * Gets the numeroMatriculaMercantil value for this InformacionLegal.
     * 
     * @return numeroMatriculaMercantil
     */
    public java.lang.String getNumeroMatriculaMercantil() {
        return numeroMatriculaMercantil;
    }


    /**
     * Sets the numeroMatriculaMercantil value for this InformacionLegal.
     * 
     * @param numeroMatriculaMercantil
     */
    public void setNumeroMatriculaMercantil(java.lang.String numeroMatriculaMercantil) {
        this.numeroMatriculaMercantil = numeroMatriculaMercantil;
    }


    /**
     * Gets the prefijoFacturacion value for this InformacionLegal.
     * 
     * @return prefijoFacturacion
     */
    public java.lang.String getPrefijoFacturacion() {
        return prefijoFacturacion;
    }


    /**
     * Sets the prefijoFacturacion value for this InformacionLegal.
     * 
     * @param prefijoFacturacion
     */
    public void setPrefijoFacturacion(java.lang.String prefijoFacturacion) {
        this.prefijoFacturacion = prefijoFacturacion;
    }


    /**
     * Gets the tipoIdentificacion value for this InformacionLegal.
     * 
     * @return tipoIdentificacion
     */
    public java.lang.String getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    /**
     * Sets the tipoIdentificacion value for this InformacionLegal.
     * 
     * @param tipoIdentificacion
     */
    public void setTipoIdentificacion(java.lang.String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacionLegal)) return false;
        InformacionLegal other = (InformacionLegal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoEstablecimiento==null && other.getCodigoEstablecimiento()==null) || 
             (this.codigoEstablecimiento!=null &&
              this.codigoEstablecimiento.equals(other.getCodigoEstablecimiento()))) &&
            ((this.nombreRegistroRUT==null && other.getNombreRegistroRUT()==null) || 
             (this.nombreRegistroRUT!=null &&
              this.nombreRegistroRUT.equals(other.getNombreRegistroRUT()))) &&
            ((this.numeroIdentificacion==null && other.getNumeroIdentificacion()==null) || 
             (this.numeroIdentificacion!=null &&
              this.numeroIdentificacion.equals(other.getNumeroIdentificacion()))) &&
            ((this.numeroIdentificacionDV==null && other.getNumeroIdentificacionDV()==null) || 
             (this.numeroIdentificacionDV!=null &&
              this.numeroIdentificacionDV.equals(other.getNumeroIdentificacionDV()))) &&
            ((this.numeroMatriculaMercantil==null && other.getNumeroMatriculaMercantil()==null) || 
             (this.numeroMatriculaMercantil!=null &&
              this.numeroMatriculaMercantil.equals(other.getNumeroMatriculaMercantil()))) &&
            ((this.prefijoFacturacion==null && other.getPrefijoFacturacion()==null) || 
             (this.prefijoFacturacion!=null &&
              this.prefijoFacturacion.equals(other.getPrefijoFacturacion()))) &&
            ((this.tipoIdentificacion==null && other.getTipoIdentificacion()==null) || 
             (this.tipoIdentificacion!=null &&
              this.tipoIdentificacion.equals(other.getTipoIdentificacion())));
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
        if (getCodigoEstablecimiento() != null) {
            _hashCode += getCodigoEstablecimiento().hashCode();
        }
        if (getNombreRegistroRUT() != null) {
            _hashCode += getNombreRegistroRUT().hashCode();
        }
        if (getNumeroIdentificacion() != null) {
            _hashCode += getNumeroIdentificacion().hashCode();
        }
        if (getNumeroIdentificacionDV() != null) {
            _hashCode += getNumeroIdentificacionDV().hashCode();
        }
        if (getNumeroMatriculaMercantil() != null) {
            _hashCode += getNumeroMatriculaMercantil().hashCode();
        }
        if (getPrefijoFacturacion() != null) {
            _hashCode += getPrefijoFacturacion().hashCode();
        }
        if (getTipoIdentificacion() != null) {
            _hashCode += getTipoIdentificacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacionLegal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "InformacionLegal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEstablecimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoEstablecimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreRegistroRUT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreRegistroRUT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroIdentificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroIdentificacionDV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroIdentificacionDV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroMatriculaMercantil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroMatriculaMercantil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefijoFacturacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "prefijoFacturacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoIdentificacion"));
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
