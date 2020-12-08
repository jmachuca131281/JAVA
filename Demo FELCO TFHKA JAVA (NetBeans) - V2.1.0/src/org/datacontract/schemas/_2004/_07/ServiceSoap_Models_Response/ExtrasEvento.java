/**
 * ExtrasEvento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_Models_Response;

public class ExtrasEvento  implements java.io.Serializable {
    private java.lang.String codigoInterno1;

    private java.lang.String codigoInterno2;

    private java.lang.String nombre;

    private java.lang.String valor;

    public ExtrasEvento() {
    }

    public ExtrasEvento(
           java.lang.String codigoInterno1,
           java.lang.String codigoInterno2,
           java.lang.String nombre,
           java.lang.String valor) {
           this.codigoInterno1 = codigoInterno1;
           this.codigoInterno2 = codigoInterno2;
           this.nombre = nombre;
           this.valor = valor;
    }


    /**
     * Gets the codigoInterno1 value for this ExtrasEvento.
     * 
     * @return codigoInterno1
     */
    public java.lang.String getCodigoInterno1() {
        return codigoInterno1;
    }


    /**
     * Sets the codigoInterno1 value for this ExtrasEvento.
     * 
     * @param codigoInterno1
     */
    public void setCodigoInterno1(java.lang.String codigoInterno1) {
        this.codigoInterno1 = codigoInterno1;
    }


    /**
     * Gets the codigoInterno2 value for this ExtrasEvento.
     * 
     * @return codigoInterno2
     */
    public java.lang.String getCodigoInterno2() {
        return codigoInterno2;
    }


    /**
     * Sets the codigoInterno2 value for this ExtrasEvento.
     * 
     * @param codigoInterno2
     */
    public void setCodigoInterno2(java.lang.String codigoInterno2) {
        this.codigoInterno2 = codigoInterno2;
    }


    /**
     * Gets the nombre value for this ExtrasEvento.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ExtrasEvento.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the valor value for this ExtrasEvento.
     * 
     * @return valor
     */
    public java.lang.String getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this ExtrasEvento.
     * 
     * @param valor
     */
    public void setValor(java.lang.String valor) {
        this.valor = valor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtrasEvento)) return false;
        ExtrasEvento other = (ExtrasEvento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoInterno1==null && other.getCodigoInterno1()==null) || 
             (this.codigoInterno1!=null &&
              this.codigoInterno1.equals(other.getCodigoInterno1()))) &&
            ((this.codigoInterno2==null && other.getCodigoInterno2()==null) || 
             (this.codigoInterno2!=null &&
              this.codigoInterno2.equals(other.getCodigoInterno2()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor())));
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
        if (getCodigoInterno1() != null) {
            _hashCode += getCodigoInterno1().hashCode();
        }
        if (getCodigoInterno2() != null) {
            _hashCode += getCodigoInterno2().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtrasEvento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "ExtrasEvento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoInterno1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "codigoInterno1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoInterno2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "codigoInterno2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "valor"));
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
