/**
 * Destinatario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class Destinatario  implements java.io.Serializable {
    private java.lang.String canalDeEntrega;

    private java.lang.String[] email;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras;

    private java.lang.String fechaProgramada;

    private java.lang.String mensajePersonalizado;

    private java.lang.String nitProveedorReceptor;

    private java.lang.String telefono;

    public Destinatario() {
    }

    public Destinatario(
           java.lang.String canalDeEntrega,
           java.lang.String[] email,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras,
           java.lang.String fechaProgramada,
           java.lang.String mensajePersonalizado,
           java.lang.String nitProveedorReceptor,
           java.lang.String telefono) {
           this.canalDeEntrega = canalDeEntrega;
           this.email = email;
           this.extras = extras;
           this.fechaProgramada = fechaProgramada;
           this.mensajePersonalizado = mensajePersonalizado;
           this.nitProveedorReceptor = nitProveedorReceptor;
           this.telefono = telefono;
    }


    /**
     * Gets the canalDeEntrega value for this Destinatario.
     * 
     * @return canalDeEntrega
     */
    public java.lang.String getCanalDeEntrega() {
        return canalDeEntrega;
    }


    /**
     * Sets the canalDeEntrega value for this Destinatario.
     * 
     * @param canalDeEntrega
     */
    public void setCanalDeEntrega(java.lang.String canalDeEntrega) {
        this.canalDeEntrega = canalDeEntrega;
    }


    /**
     * Gets the email value for this Destinatario.
     * 
     * @return email
     */
    public java.lang.String[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Destinatario.
     * 
     * @param email
     */
    public void setEmail(java.lang.String[] email) {
        this.email = email;
    }


    /**
     * Gets the extras value for this Destinatario.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this Destinatario.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras) {
        this.extras = extras;
    }


    /**
     * Gets the fechaProgramada value for this Destinatario.
     * 
     * @return fechaProgramada
     */
    public java.lang.String getFechaProgramada() {
        return fechaProgramada;
    }


    /**
     * Sets the fechaProgramada value for this Destinatario.
     * 
     * @param fechaProgramada
     */
    public void setFechaProgramada(java.lang.String fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }


    /**
     * Gets the mensajePersonalizado value for this Destinatario.
     * 
     * @return mensajePersonalizado
     */
    public java.lang.String getMensajePersonalizado() {
        return mensajePersonalizado;
    }


    /**
     * Sets the mensajePersonalizado value for this Destinatario.
     * 
     * @param mensajePersonalizado
     */
    public void setMensajePersonalizado(java.lang.String mensajePersonalizado) {
        this.mensajePersonalizado = mensajePersonalizado;
    }


    /**
     * Gets the nitProveedorReceptor value for this Destinatario.
     * 
     * @return nitProveedorReceptor
     */
    public java.lang.String getNitProveedorReceptor() {
        return nitProveedorReceptor;
    }


    /**
     * Sets the nitProveedorReceptor value for this Destinatario.
     * 
     * @param nitProveedorReceptor
     */
    public void setNitProveedorReceptor(java.lang.String nitProveedorReceptor) {
        this.nitProveedorReceptor = nitProveedorReceptor;
    }


    /**
     * Gets the telefono value for this Destinatario.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this Destinatario.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Destinatario)) return false;
        Destinatario other = (Destinatario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.canalDeEntrega==null && other.getCanalDeEntrega()==null) || 
             (this.canalDeEntrega!=null &&
              this.canalDeEntrega.equals(other.getCanalDeEntrega()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras()))) &&
            ((this.fechaProgramada==null && other.getFechaProgramada()==null) || 
             (this.fechaProgramada!=null &&
              this.fechaProgramada.equals(other.getFechaProgramada()))) &&
            ((this.mensajePersonalizado==null && other.getMensajePersonalizado()==null) || 
             (this.mensajePersonalizado!=null &&
              this.mensajePersonalizado.equals(other.getMensajePersonalizado()))) &&
            ((this.nitProveedorReceptor==null && other.getNitProveedorReceptor()==null) || 
             (this.nitProveedorReceptor!=null &&
              this.nitProveedorReceptor.equals(other.getNitProveedorReceptor()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono())));
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
        if (getCanalDeEntrega() != null) {
            _hashCode += getCanalDeEntrega().hashCode();
        }
        if (getEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getFechaProgramada() != null) {
            _hashCode += getFechaProgramada().hashCode();
        }
        if (getMensajePersonalizado() != null) {
            _hashCode += getMensajePersonalizado().hashCode();
        }
        if (getNitProveedorReceptor() != null) {
            _hashCode += getNitProveedorReceptor().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Destinatario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Destinatario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canalDeEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "canalDeEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
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
        elemField.setFieldName("fechaProgramada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaProgramada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajePersonalizado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "mensajePersonalizado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nitProveedorReceptor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nitProveedorReceptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "telefono"));
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
