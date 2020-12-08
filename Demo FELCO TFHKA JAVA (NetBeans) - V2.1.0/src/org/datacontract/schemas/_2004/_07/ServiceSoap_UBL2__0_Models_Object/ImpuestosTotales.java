/**
 * ImpuestosTotales.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class ImpuestosTotales  implements java.io.Serializable {
    private java.lang.String codigoTOTALImp;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras;

    private java.lang.String montoTotal;

    public ImpuestosTotales() {
    }

    public ImpuestosTotales(
           java.lang.String codigoTOTALImp,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras,
           java.lang.String montoTotal) {
           this.codigoTOTALImp = codigoTOTALImp;
           this.extras = extras;
           this.montoTotal = montoTotal;
    }


    /**
     * Gets the codigoTOTALImp value for this ImpuestosTotales.
     * 
     * @return codigoTOTALImp
     */
    public java.lang.String getCodigoTOTALImp() {
        return codigoTOTALImp;
    }


    /**
     * Sets the codigoTOTALImp value for this ImpuestosTotales.
     * 
     * @param codigoTOTALImp
     */
    public void setCodigoTOTALImp(java.lang.String codigoTOTALImp) {
        this.codigoTOTALImp = codigoTOTALImp;
    }


    /**
     * Gets the extras value for this ImpuestosTotales.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this ImpuestosTotales.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras) {
        this.extras = extras;
    }


    /**
     * Gets the montoTotal value for this ImpuestosTotales.
     * 
     * @return montoTotal
     */
    public java.lang.String getMontoTotal() {
        return montoTotal;
    }


    /**
     * Sets the montoTotal value for this ImpuestosTotales.
     * 
     * @param montoTotal
     */
    public void setMontoTotal(java.lang.String montoTotal) {
        this.montoTotal = montoTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImpuestosTotales)) return false;
        ImpuestosTotales other = (ImpuestosTotales) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoTOTALImp==null && other.getCodigoTOTALImp()==null) || 
             (this.codigoTOTALImp!=null &&
              this.codigoTOTALImp.equals(other.getCodigoTOTALImp()))) &&
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras()))) &&
            ((this.montoTotal==null && other.getMontoTotal()==null) || 
             (this.montoTotal!=null &&
              this.montoTotal.equals(other.getMontoTotal())));
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
        if (getCodigoTOTALImp() != null) {
            _hashCode += getCodigoTOTALImp().hashCode();
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
        if (getMontoTotal() != null) {
            _hashCode += getMontoTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImpuestosTotales.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ImpuestosTotales"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTOTALImp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoTOTALImp"));
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
        elemField.setFieldName("montoTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "montoTotal"));
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
