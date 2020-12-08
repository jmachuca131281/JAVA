/**
 * Entrega.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class Entrega  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DatosDelTransportista datosTransportistas;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionDespacho;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionEntrega;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras;

    private java.lang.String fechaEfectivaSalida;

    private java.lang.String fechaEstimada;

    private java.lang.String fechaReal;

    private java.lang.String fechaSolicitada;

    private java.lang.String identificacionTransporte;

    private java.lang.String matriculaTransporte;

    public Entrega() {
    }

    public Entrega(
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DatosDelTransportista datosTransportistas,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionDespacho,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionEntrega,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras,
           java.lang.String fechaEfectivaSalida,
           java.lang.String fechaEstimada,
           java.lang.String fechaReal,
           java.lang.String fechaSolicitada,
           java.lang.String identificacionTransporte,
           java.lang.String matriculaTransporte) {
           this.datosTransportistas = datosTransportistas;
           this.direccionDespacho = direccionDespacho;
           this.direccionEntrega = direccionEntrega;
           this.extras = extras;
           this.fechaEfectivaSalida = fechaEfectivaSalida;
           this.fechaEstimada = fechaEstimada;
           this.fechaReal = fechaReal;
           this.fechaSolicitada = fechaSolicitada;
           this.identificacionTransporte = identificacionTransporte;
           this.matriculaTransporte = matriculaTransporte;
    }


    /**
     * Gets the datosTransportistas value for this Entrega.
     * 
     * @return datosTransportistas
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DatosDelTransportista getDatosTransportistas() {
        return datosTransportistas;
    }


    /**
     * Sets the datosTransportistas value for this Entrega.
     * 
     * @param datosTransportistas
     */
    public void setDatosTransportistas(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.DatosDelTransportista datosTransportistas) {
        this.datosTransportistas = datosTransportistas;
    }


    /**
     * Gets the direccionDespacho value for this Entrega.
     * 
     * @return direccionDespacho
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion getDireccionDespacho() {
        return direccionDespacho;
    }


    /**
     * Sets the direccionDespacho value for this Entrega.
     * 
     * @param direccionDespacho
     */
    public void setDireccionDespacho(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionDespacho) {
        this.direccionDespacho = direccionDespacho;
    }


    /**
     * Gets the direccionEntrega value for this Entrega.
     * 
     * @return direccionEntrega
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion getDireccionEntrega() {
        return direccionEntrega;
    }


    /**
     * Sets the direccionEntrega value for this Entrega.
     * 
     * @param direccionEntrega
     */
    public void setDireccionEntrega(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }


    /**
     * Gets the extras value for this Entrega.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this Entrega.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras) {
        this.extras = extras;
    }


    /**
     * Gets the fechaEfectivaSalida value for this Entrega.
     * 
     * @return fechaEfectivaSalida
     */
    public java.lang.String getFechaEfectivaSalida() {
        return fechaEfectivaSalida;
    }


    /**
     * Sets the fechaEfectivaSalida value for this Entrega.
     * 
     * @param fechaEfectivaSalida
     */
    public void setFechaEfectivaSalida(java.lang.String fechaEfectivaSalida) {
        this.fechaEfectivaSalida = fechaEfectivaSalida;
    }


    /**
     * Gets the fechaEstimada value for this Entrega.
     * 
     * @return fechaEstimada
     */
    public java.lang.String getFechaEstimada() {
        return fechaEstimada;
    }


    /**
     * Sets the fechaEstimada value for this Entrega.
     * 
     * @param fechaEstimada
     */
    public void setFechaEstimada(java.lang.String fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }


    /**
     * Gets the fechaReal value for this Entrega.
     * 
     * @return fechaReal
     */
    public java.lang.String getFechaReal() {
        return fechaReal;
    }


    /**
     * Sets the fechaReal value for this Entrega.
     * 
     * @param fechaReal
     */
    public void setFechaReal(java.lang.String fechaReal) {
        this.fechaReal = fechaReal;
    }


    /**
     * Gets the fechaSolicitada value for this Entrega.
     * 
     * @return fechaSolicitada
     */
    public java.lang.String getFechaSolicitada() {
        return fechaSolicitada;
    }


    /**
     * Sets the fechaSolicitada value for this Entrega.
     * 
     * @param fechaSolicitada
     */
    public void setFechaSolicitada(java.lang.String fechaSolicitada) {
        this.fechaSolicitada = fechaSolicitada;
    }


    /**
     * Gets the identificacionTransporte value for this Entrega.
     * 
     * @return identificacionTransporte
     */
    public java.lang.String getIdentificacionTransporte() {
        return identificacionTransporte;
    }


    /**
     * Sets the identificacionTransporte value for this Entrega.
     * 
     * @param identificacionTransporte
     */
    public void setIdentificacionTransporte(java.lang.String identificacionTransporte) {
        this.identificacionTransporte = identificacionTransporte;
    }


    /**
     * Gets the matriculaTransporte value for this Entrega.
     * 
     * @return matriculaTransporte
     */
    public java.lang.String getMatriculaTransporte() {
        return matriculaTransporte;
    }


    /**
     * Sets the matriculaTransporte value for this Entrega.
     * 
     * @param matriculaTransporte
     */
    public void setMatriculaTransporte(java.lang.String matriculaTransporte) {
        this.matriculaTransporte = matriculaTransporte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrega)) return false;
        Entrega other = (Entrega) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosTransportistas==null && other.getDatosTransportistas()==null) || 
             (this.datosTransportistas!=null &&
              this.datosTransportistas.equals(other.getDatosTransportistas()))) &&
            ((this.direccionDespacho==null && other.getDireccionDespacho()==null) || 
             (this.direccionDespacho!=null &&
              this.direccionDespacho.equals(other.getDireccionDespacho()))) &&
            ((this.direccionEntrega==null && other.getDireccionEntrega()==null) || 
             (this.direccionEntrega!=null &&
              this.direccionEntrega.equals(other.getDireccionEntrega()))) &&
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras()))) &&
            ((this.fechaEfectivaSalida==null && other.getFechaEfectivaSalida()==null) || 
             (this.fechaEfectivaSalida!=null &&
              this.fechaEfectivaSalida.equals(other.getFechaEfectivaSalida()))) &&
            ((this.fechaEstimada==null && other.getFechaEstimada()==null) || 
             (this.fechaEstimada!=null &&
              this.fechaEstimada.equals(other.getFechaEstimada()))) &&
            ((this.fechaReal==null && other.getFechaReal()==null) || 
             (this.fechaReal!=null &&
              this.fechaReal.equals(other.getFechaReal()))) &&
            ((this.fechaSolicitada==null && other.getFechaSolicitada()==null) || 
             (this.fechaSolicitada!=null &&
              this.fechaSolicitada.equals(other.getFechaSolicitada()))) &&
            ((this.identificacionTransporte==null && other.getIdentificacionTransporte()==null) || 
             (this.identificacionTransporte!=null &&
              this.identificacionTransporte.equals(other.getIdentificacionTransporte()))) &&
            ((this.matriculaTransporte==null && other.getMatriculaTransporte()==null) || 
             (this.matriculaTransporte!=null &&
              this.matriculaTransporte.equals(other.getMatriculaTransporte())));
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
        if (getDatosTransportistas() != null) {
            _hashCode += getDatosTransportistas().hashCode();
        }
        if (getDireccionDespacho() != null) {
            _hashCode += getDireccionDespacho().hashCode();
        }
        if (getDireccionEntrega() != null) {
            _hashCode += getDireccionEntrega().hashCode();
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
        if (getFechaEfectivaSalida() != null) {
            _hashCode += getFechaEfectivaSalida().hashCode();
        }
        if (getFechaEstimada() != null) {
            _hashCode += getFechaEstimada().hashCode();
        }
        if (getFechaReal() != null) {
            _hashCode += getFechaReal().hashCode();
        }
        if (getFechaSolicitada() != null) {
            _hashCode += getFechaSolicitada().hashCode();
        }
        if (getIdentificacionTransporte() != null) {
            _hashCode += getIdentificacionTransporte().hashCode();
        }
        if (getMatriculaTransporte() != null) {
            _hashCode += getMatriculaTransporte().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrega.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Entrega"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosTransportistas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "datosTransportistas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DatosDelTransportista"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionDespacho");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "direccionDespacho"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Direccion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "direccionEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Direccion"));
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
        elemField.setFieldName("fechaEfectivaSalida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaEfectivaSalida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaEstimada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaEstimada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaReal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaReal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaSolicitada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaSolicitada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionTransporte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "identificacionTransporte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matriculaTransporte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "matriculaTransporte"));
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
