/**
 * Coordenadas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class Coordenadas  implements java.io.Serializable {
    private java.lang.String gradosLatitud;

    private java.lang.String gradosLongitud;

    private java.lang.String minutosLatitud;

    private java.lang.String minutosLongitud;

    private java.lang.String orientacionLatitud;

    private java.lang.String orientacionLongitud;

    public Coordenadas() {
    }

    public Coordenadas(
           java.lang.String gradosLatitud,
           java.lang.String gradosLongitud,
           java.lang.String minutosLatitud,
           java.lang.String minutosLongitud,
           java.lang.String orientacionLatitud,
           java.lang.String orientacionLongitud) {
           this.gradosLatitud = gradosLatitud;
           this.gradosLongitud = gradosLongitud;
           this.minutosLatitud = minutosLatitud;
           this.minutosLongitud = minutosLongitud;
           this.orientacionLatitud = orientacionLatitud;
           this.orientacionLongitud = orientacionLongitud;
    }


    /**
     * Gets the gradosLatitud value for this Coordenadas.
     * 
     * @return gradosLatitud
     */
    public java.lang.String getGradosLatitud() {
        return gradosLatitud;
    }


    /**
     * Sets the gradosLatitud value for this Coordenadas.
     * 
     * @param gradosLatitud
     */
    public void setGradosLatitud(java.lang.String gradosLatitud) {
        this.gradosLatitud = gradosLatitud;
    }


    /**
     * Gets the gradosLongitud value for this Coordenadas.
     * 
     * @return gradosLongitud
     */
    public java.lang.String getGradosLongitud() {
        return gradosLongitud;
    }


    /**
     * Sets the gradosLongitud value for this Coordenadas.
     * 
     * @param gradosLongitud
     */
    public void setGradosLongitud(java.lang.String gradosLongitud) {
        this.gradosLongitud = gradosLongitud;
    }


    /**
     * Gets the minutosLatitud value for this Coordenadas.
     * 
     * @return minutosLatitud
     */
    public java.lang.String getMinutosLatitud() {
        return minutosLatitud;
    }


    /**
     * Sets the minutosLatitud value for this Coordenadas.
     * 
     * @param minutosLatitud
     */
    public void setMinutosLatitud(java.lang.String minutosLatitud) {
        this.minutosLatitud = minutosLatitud;
    }


    /**
     * Gets the minutosLongitud value for this Coordenadas.
     * 
     * @return minutosLongitud
     */
    public java.lang.String getMinutosLongitud() {
        return minutosLongitud;
    }


    /**
     * Sets the minutosLongitud value for this Coordenadas.
     * 
     * @param minutosLongitud
     */
    public void setMinutosLongitud(java.lang.String minutosLongitud) {
        this.minutosLongitud = minutosLongitud;
    }


    /**
     * Gets the orientacionLatitud value for this Coordenadas.
     * 
     * @return orientacionLatitud
     */
    public java.lang.String getOrientacionLatitud() {
        return orientacionLatitud;
    }


    /**
     * Sets the orientacionLatitud value for this Coordenadas.
     * 
     * @param orientacionLatitud
     */
    public void setOrientacionLatitud(java.lang.String orientacionLatitud) {
        this.orientacionLatitud = orientacionLatitud;
    }


    /**
     * Gets the orientacionLongitud value for this Coordenadas.
     * 
     * @return orientacionLongitud
     */
    public java.lang.String getOrientacionLongitud() {
        return orientacionLongitud;
    }


    /**
     * Sets the orientacionLongitud value for this Coordenadas.
     * 
     * @param orientacionLongitud
     */
    public void setOrientacionLongitud(java.lang.String orientacionLongitud) {
        this.orientacionLongitud = orientacionLongitud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Coordenadas)) return false;
        Coordenadas other = (Coordenadas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gradosLatitud==null && other.getGradosLatitud()==null) || 
             (this.gradosLatitud!=null &&
              this.gradosLatitud.equals(other.getGradosLatitud()))) &&
            ((this.gradosLongitud==null && other.getGradosLongitud()==null) || 
             (this.gradosLongitud!=null &&
              this.gradosLongitud.equals(other.getGradosLongitud()))) &&
            ((this.minutosLatitud==null && other.getMinutosLatitud()==null) || 
             (this.minutosLatitud!=null &&
              this.minutosLatitud.equals(other.getMinutosLatitud()))) &&
            ((this.minutosLongitud==null && other.getMinutosLongitud()==null) || 
             (this.minutosLongitud!=null &&
              this.minutosLongitud.equals(other.getMinutosLongitud()))) &&
            ((this.orientacionLatitud==null && other.getOrientacionLatitud()==null) || 
             (this.orientacionLatitud!=null &&
              this.orientacionLatitud.equals(other.getOrientacionLatitud()))) &&
            ((this.orientacionLongitud==null && other.getOrientacionLongitud()==null) || 
             (this.orientacionLongitud!=null &&
              this.orientacionLongitud.equals(other.getOrientacionLongitud())));
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
        if (getGradosLatitud() != null) {
            _hashCode += getGradosLatitud().hashCode();
        }
        if (getGradosLongitud() != null) {
            _hashCode += getGradosLongitud().hashCode();
        }
        if (getMinutosLatitud() != null) {
            _hashCode += getMinutosLatitud().hashCode();
        }
        if (getMinutosLongitud() != null) {
            _hashCode += getMinutosLongitud().hashCode();
        }
        if (getOrientacionLatitud() != null) {
            _hashCode += getOrientacionLatitud().hashCode();
        }
        if (getOrientacionLongitud() != null) {
            _hashCode += getOrientacionLongitud().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Coordenadas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Coordenadas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gradosLatitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "gradosLatitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gradosLongitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "gradosLongitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutosLatitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "minutosLatitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutosLongitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "minutosLongitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orientacionLatitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "orientacionLatitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orientacionLongitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "orientacionLongitud"));
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
