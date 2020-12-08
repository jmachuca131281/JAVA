/**
 * TasaDeCambio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class TasaDeCambio  implements java.io.Serializable {
    private java.lang.String baseMonedaDestino;

    private java.lang.String baseMonedaOrigen;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras;

    private java.lang.String fechaDeTasaDeCambio;

    private java.lang.String indicadorDeTasa;

    private java.lang.String monedaDestino;

    private java.lang.String monedaOrigen;

    private java.lang.String operadorCalculo;

    private java.lang.String tasaDeCambio;

    public TasaDeCambio() {
    }

    public TasaDeCambio(
           java.lang.String baseMonedaDestino,
           java.lang.String baseMonedaOrigen,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras,
           java.lang.String fechaDeTasaDeCambio,
           java.lang.String indicadorDeTasa,
           java.lang.String monedaDestino,
           java.lang.String monedaOrigen,
           java.lang.String operadorCalculo,
           java.lang.String tasaDeCambio) {
           this.baseMonedaDestino = baseMonedaDestino;
           this.baseMonedaOrigen = baseMonedaOrigen;
           this.extras = extras;
           this.fechaDeTasaDeCambio = fechaDeTasaDeCambio;
           this.indicadorDeTasa = indicadorDeTasa;
           this.monedaDestino = monedaDestino;
           this.monedaOrigen = monedaOrigen;
           this.operadorCalculo = operadorCalculo;
           this.tasaDeCambio = tasaDeCambio;
    }


    /**
     * Gets the baseMonedaDestino value for this TasaDeCambio.
     * 
     * @return baseMonedaDestino
     */
    public java.lang.String getBaseMonedaDestino() {
        return baseMonedaDestino;
    }


    /**
     * Sets the baseMonedaDestino value for this TasaDeCambio.
     * 
     * @param baseMonedaDestino
     */
    public void setBaseMonedaDestino(java.lang.String baseMonedaDestino) {
        this.baseMonedaDestino = baseMonedaDestino;
    }


    /**
     * Gets the baseMonedaOrigen value for this TasaDeCambio.
     * 
     * @return baseMonedaOrigen
     */
    public java.lang.String getBaseMonedaOrigen() {
        return baseMonedaOrigen;
    }


    /**
     * Sets the baseMonedaOrigen value for this TasaDeCambio.
     * 
     * @param baseMonedaOrigen
     */
    public void setBaseMonedaOrigen(java.lang.String baseMonedaOrigen) {
        this.baseMonedaOrigen = baseMonedaOrigen;
    }


    /**
     * Gets the extras value for this TasaDeCambio.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this TasaDeCambio.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras) {
        this.extras = extras;
    }


    /**
     * Gets the fechaDeTasaDeCambio value for this TasaDeCambio.
     * 
     * @return fechaDeTasaDeCambio
     */
    public java.lang.String getFechaDeTasaDeCambio() {
        return fechaDeTasaDeCambio;
    }


    /**
     * Sets the fechaDeTasaDeCambio value for this TasaDeCambio.
     * 
     * @param fechaDeTasaDeCambio
     */
    public void setFechaDeTasaDeCambio(java.lang.String fechaDeTasaDeCambio) {
        this.fechaDeTasaDeCambio = fechaDeTasaDeCambio;
    }


    /**
     * Gets the indicadorDeTasa value for this TasaDeCambio.
     * 
     * @return indicadorDeTasa
     */
    public java.lang.String getIndicadorDeTasa() {
        return indicadorDeTasa;
    }


    /**
     * Sets the indicadorDeTasa value for this TasaDeCambio.
     * 
     * @param indicadorDeTasa
     */
    public void setIndicadorDeTasa(java.lang.String indicadorDeTasa) {
        this.indicadorDeTasa = indicadorDeTasa;
    }


    /**
     * Gets the monedaDestino value for this TasaDeCambio.
     * 
     * @return monedaDestino
     */
    public java.lang.String getMonedaDestino() {
        return monedaDestino;
    }


    /**
     * Sets the monedaDestino value for this TasaDeCambio.
     * 
     * @param monedaDestino
     */
    public void setMonedaDestino(java.lang.String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }


    /**
     * Gets the monedaOrigen value for this TasaDeCambio.
     * 
     * @return monedaOrigen
     */
    public java.lang.String getMonedaOrigen() {
        return monedaOrigen;
    }


    /**
     * Sets the monedaOrigen value for this TasaDeCambio.
     * 
     * @param monedaOrigen
     */
    public void setMonedaOrigen(java.lang.String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }


    /**
     * Gets the operadorCalculo value for this TasaDeCambio.
     * 
     * @return operadorCalculo
     */
    public java.lang.String getOperadorCalculo() {
        return operadorCalculo;
    }


    /**
     * Sets the operadorCalculo value for this TasaDeCambio.
     * 
     * @param operadorCalculo
     */
    public void setOperadorCalculo(java.lang.String operadorCalculo) {
        this.operadorCalculo = operadorCalculo;
    }


    /**
     * Gets the tasaDeCambio value for this TasaDeCambio.
     * 
     * @return tasaDeCambio
     */
    public java.lang.String getTasaDeCambio() {
        return tasaDeCambio;
    }


    /**
     * Sets the tasaDeCambio value for this TasaDeCambio.
     * 
     * @param tasaDeCambio
     */
    public void setTasaDeCambio(java.lang.String tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TasaDeCambio)) return false;
        TasaDeCambio other = (TasaDeCambio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseMonedaDestino==null && other.getBaseMonedaDestino()==null) || 
             (this.baseMonedaDestino!=null &&
              this.baseMonedaDestino.equals(other.getBaseMonedaDestino()))) &&
            ((this.baseMonedaOrigen==null && other.getBaseMonedaOrigen()==null) || 
             (this.baseMonedaOrigen!=null &&
              this.baseMonedaOrigen.equals(other.getBaseMonedaOrigen()))) &&
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras()))) &&
            ((this.fechaDeTasaDeCambio==null && other.getFechaDeTasaDeCambio()==null) || 
             (this.fechaDeTasaDeCambio!=null &&
              this.fechaDeTasaDeCambio.equals(other.getFechaDeTasaDeCambio()))) &&
            ((this.indicadorDeTasa==null && other.getIndicadorDeTasa()==null) || 
             (this.indicadorDeTasa!=null &&
              this.indicadorDeTasa.equals(other.getIndicadorDeTasa()))) &&
            ((this.monedaDestino==null && other.getMonedaDestino()==null) || 
             (this.monedaDestino!=null &&
              this.monedaDestino.equals(other.getMonedaDestino()))) &&
            ((this.monedaOrigen==null && other.getMonedaOrigen()==null) || 
             (this.monedaOrigen!=null &&
              this.monedaOrigen.equals(other.getMonedaOrigen()))) &&
            ((this.operadorCalculo==null && other.getOperadorCalculo()==null) || 
             (this.operadorCalculo!=null &&
              this.operadorCalculo.equals(other.getOperadorCalculo()))) &&
            ((this.tasaDeCambio==null && other.getTasaDeCambio()==null) || 
             (this.tasaDeCambio!=null &&
              this.tasaDeCambio.equals(other.getTasaDeCambio())));
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
        if (getBaseMonedaDestino() != null) {
            _hashCode += getBaseMonedaDestino().hashCode();
        }
        if (getBaseMonedaOrigen() != null) {
            _hashCode += getBaseMonedaOrigen().hashCode();
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
        if (getFechaDeTasaDeCambio() != null) {
            _hashCode += getFechaDeTasaDeCambio().hashCode();
        }
        if (getIndicadorDeTasa() != null) {
            _hashCode += getIndicadorDeTasa().hashCode();
        }
        if (getMonedaDestino() != null) {
            _hashCode += getMonedaDestino().hashCode();
        }
        if (getMonedaOrigen() != null) {
            _hashCode += getMonedaOrigen().hashCode();
        }
        if (getOperadorCalculo() != null) {
            _hashCode += getOperadorCalculo().hashCode();
        }
        if (getTasaDeCambio() != null) {
            _hashCode += getTasaDeCambio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TasaDeCambio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TasaDeCambio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseMonedaDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "baseMonedaDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseMonedaOrigen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "baseMonedaOrigen"));
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
        elemField.setFieldName("fechaDeTasaDeCambio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaDeTasaDeCambio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadorDeTasa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "indicadorDeTasa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monedaDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "monedaDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monedaOrigen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "monedaOrigen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operadorCalculo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "operadorCalculo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasaDeCambio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tasaDeCambio"));
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
