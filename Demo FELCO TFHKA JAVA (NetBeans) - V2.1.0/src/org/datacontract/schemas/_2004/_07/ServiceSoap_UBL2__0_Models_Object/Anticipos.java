/**
 * Anticipos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class Anticipos  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras;

    private java.lang.String fechaDeRecibido;

    private java.lang.String fechadePago;

    private java.lang.String horaDePago;

    private java.lang.String id;

    private java.lang.String instrucciones;

    private java.lang.String montoPagado;

    public Anticipos() {
    }

    public Anticipos(
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras,
           java.lang.String fechaDeRecibido,
           java.lang.String fechadePago,
           java.lang.String horaDePago,
           java.lang.String id,
           java.lang.String instrucciones,
           java.lang.String montoPagado) {
           this.extras = extras;
           this.fechaDeRecibido = fechaDeRecibido;
           this.fechadePago = fechadePago;
           this.horaDePago = horaDePago;
           this.id = id;
           this.instrucciones = instrucciones;
           this.montoPagado = montoPagado;
    }


    /**
     * Gets the extras value for this Anticipos.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this Anticipos.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras) {
        this.extras = extras;
    }


    /**
     * Gets the fechaDeRecibido value for this Anticipos.
     * 
     * @return fechaDeRecibido
     */
    public java.lang.String getFechaDeRecibido() {
        return fechaDeRecibido;
    }


    /**
     * Sets the fechaDeRecibido value for this Anticipos.
     * 
     * @param fechaDeRecibido
     */
    public void setFechaDeRecibido(java.lang.String fechaDeRecibido) {
        this.fechaDeRecibido = fechaDeRecibido;
    }


    /**
     * Gets the fechadePago value for this Anticipos.
     * 
     * @return fechadePago
     */
    public java.lang.String getFechadePago() {
        return fechadePago;
    }


    /**
     * Sets the fechadePago value for this Anticipos.
     * 
     * @param fechadePago
     */
    public void setFechadePago(java.lang.String fechadePago) {
        this.fechadePago = fechadePago;
    }


    /**
     * Gets the horaDePago value for this Anticipos.
     * 
     * @return horaDePago
     */
    public java.lang.String getHoraDePago() {
        return horaDePago;
    }


    /**
     * Sets the horaDePago value for this Anticipos.
     * 
     * @param horaDePago
     */
    public void setHoraDePago(java.lang.String horaDePago) {
        this.horaDePago = horaDePago;
    }


    /**
     * Gets the id value for this Anticipos.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Anticipos.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the instrucciones value for this Anticipos.
     * 
     * @return instrucciones
     */
    public java.lang.String getInstrucciones() {
        return instrucciones;
    }


    /**
     * Sets the instrucciones value for this Anticipos.
     * 
     * @param instrucciones
     */
    public void setInstrucciones(java.lang.String instrucciones) {
        this.instrucciones = instrucciones;
    }


    /**
     * Gets the montoPagado value for this Anticipos.
     * 
     * @return montoPagado
     */
    public java.lang.String getMontoPagado() {
        return montoPagado;
    }


    /**
     * Sets the montoPagado value for this Anticipos.
     * 
     * @param montoPagado
     */
    public void setMontoPagado(java.lang.String montoPagado) {
        this.montoPagado = montoPagado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Anticipos)) return false;
        Anticipos other = (Anticipos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras()))) &&
            ((this.fechaDeRecibido==null && other.getFechaDeRecibido()==null) || 
             (this.fechaDeRecibido!=null &&
              this.fechaDeRecibido.equals(other.getFechaDeRecibido()))) &&
            ((this.fechadePago==null && other.getFechadePago()==null) || 
             (this.fechadePago!=null &&
              this.fechadePago.equals(other.getFechadePago()))) &&
            ((this.horaDePago==null && other.getHoraDePago()==null) || 
             (this.horaDePago!=null &&
              this.horaDePago.equals(other.getHoraDePago()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.instrucciones==null && other.getInstrucciones()==null) || 
             (this.instrucciones!=null &&
              this.instrucciones.equals(other.getInstrucciones()))) &&
            ((this.montoPagado==null && other.getMontoPagado()==null) || 
             (this.montoPagado!=null &&
              this.montoPagado.equals(other.getMontoPagado())));
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
        if (getFechaDeRecibido() != null) {
            _hashCode += getFechaDeRecibido().hashCode();
        }
        if (getFechadePago() != null) {
            _hashCode += getFechadePago().hashCode();
        }
        if (getHoraDePago() != null) {
            _hashCode += getHoraDePago().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInstrucciones() != null) {
            _hashCode += getInstrucciones().hashCode();
        }
        if (getMontoPagado() != null) {
            _hashCode += getMontoPagado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Anticipos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Anticipos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extras");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "extras"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Extensible"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Extensible"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDeRecibido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaDeRecibido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechadePago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechadePago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaDePago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "horaDePago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrucciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "instrucciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoPagado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "montoPagado"));
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
