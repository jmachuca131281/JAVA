/**
 * DatosEvento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class DatosEvento  implements java.io.Serializable {
    private java.lang.String codigoEvento;

    private java.lang.String codigoInterno1;

    private java.lang.String codigoInterno2;

    private java.lang.String comentario;

    private java.lang.String documento;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DatosExtras[] extras;

    public DatosEvento() {
    }

    public DatosEvento(
           java.lang.String codigoEvento,
           java.lang.String codigoInterno1,
           java.lang.String codigoInterno2,
           java.lang.String comentario,
           java.lang.String documento,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DatosExtras[] extras) {
           this.codigoEvento = codigoEvento;
           this.codigoInterno1 = codigoInterno1;
           this.codigoInterno2 = codigoInterno2;
           this.comentario = comentario;
           this.documento = documento;
           this.extras = extras;
    }


    /**
     * Gets the codigoEvento value for this DatosEvento.
     * 
     * @return codigoEvento
     */
    public java.lang.String getCodigoEvento() {
        return codigoEvento;
    }


    /**
     * Sets the codigoEvento value for this DatosEvento.
     * 
     * @param codigoEvento
     */
    public void setCodigoEvento(java.lang.String codigoEvento) {
        this.codigoEvento = codigoEvento;
    }


    /**
     * Gets the codigoInterno1 value for this DatosEvento.
     * 
     * @return codigoInterno1
     */
    public java.lang.String getCodigoInterno1() {
        return codigoInterno1;
    }


    /**
     * Sets the codigoInterno1 value for this DatosEvento.
     * 
     * @param codigoInterno1
     */
    public void setCodigoInterno1(java.lang.String codigoInterno1) {
        this.codigoInterno1 = codigoInterno1;
    }


    /**
     * Gets the codigoInterno2 value for this DatosEvento.
     * 
     * @return codigoInterno2
     */
    public java.lang.String getCodigoInterno2() {
        return codigoInterno2;
    }


    /**
     * Sets the codigoInterno2 value for this DatosEvento.
     * 
     * @param codigoInterno2
     */
    public void setCodigoInterno2(java.lang.String codigoInterno2) {
        this.codigoInterno2 = codigoInterno2;
    }


    /**
     * Gets the comentario value for this DatosEvento.
     * 
     * @return comentario
     */
    public java.lang.String getComentario() {
        return comentario;
    }


    /**
     * Sets the comentario value for this DatosEvento.
     * 
     * @param comentario
     */
    public void setComentario(java.lang.String comentario) {
        this.comentario = comentario;
    }


    /**
     * Gets the documento value for this DatosEvento.
     * 
     * @return documento
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this DatosEvento.
     * 
     * @param documento
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the extras value for this DatosEvento.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DatosExtras[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this DatosEvento.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DatosExtras[] extras) {
        this.extras = extras;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosEvento)) return false;
        DatosEvento other = (DatosEvento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoEvento==null && other.getCodigoEvento()==null) || 
             (this.codigoEvento!=null &&
              this.codigoEvento.equals(other.getCodigoEvento()))) &&
            ((this.codigoInterno1==null && other.getCodigoInterno1()==null) || 
             (this.codigoInterno1!=null &&
              this.codigoInterno1.equals(other.getCodigoInterno1()))) &&
            ((this.codigoInterno2==null && other.getCodigoInterno2()==null) || 
             (this.codigoInterno2!=null &&
              this.codigoInterno2.equals(other.getCodigoInterno2()))) &&
            ((this.comentario==null && other.getComentario()==null) || 
             (this.comentario!=null &&
              this.comentario.equals(other.getComentario()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras())));
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
        if (getCodigoEvento() != null) {
            _hashCode += getCodigoEvento().hashCode();
        }
        if (getCodigoInterno1() != null) {
            _hashCode += getCodigoInterno1().hashCode();
        }
        if (getCodigoInterno2() != null) {
            _hashCode += getCodigoInterno2().hashCode();
        }
        if (getComentario() != null) {
            _hashCode += getComentario().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosEvento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DatosEvento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEvento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoEvento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoInterno1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoInterno1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoInterno2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoInterno2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comentario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "comentario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extras");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "extras"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DatosExtras"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DatosExtras"));
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
