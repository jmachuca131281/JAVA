/**
 * TerminosDeEntrega.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class TerminosDeEntrega  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargosDescuentos[] cargosDescuentos;

    private java.lang.String codigoCondicionEntrega;

    private java.lang.String costoTransporte;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionEntrega;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras;

    private java.lang.String identificacion;

    private java.lang.String monto;

    private java.lang.String responsableEntrega;

    public TerminosDeEntrega() {
    }

    public TerminosDeEntrega(
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargosDescuentos[] cargosDescuentos,
           java.lang.String codigoCondicionEntrega,
           java.lang.String costoTransporte,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionEntrega,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras,
           java.lang.String identificacion,
           java.lang.String monto,
           java.lang.String responsableEntrega) {
           this.cargosDescuentos = cargosDescuentos;
           this.codigoCondicionEntrega = codigoCondicionEntrega;
           this.costoTransporte = costoTransporte;
           this.direccionEntrega = direccionEntrega;
           this.extras = extras;
           this.identificacion = identificacion;
           this.monto = monto;
           this.responsableEntrega = responsableEntrega;
    }


    /**
     * Gets the cargosDescuentos value for this TerminosDeEntrega.
     * 
     * @return cargosDescuentos
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargosDescuentos[] getCargosDescuentos() {
        return cargosDescuentos;
    }


    /**
     * Sets the cargosDescuentos value for this TerminosDeEntrega.
     * 
     * @param cargosDescuentos
     */
    public void setCargosDescuentos(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.CargosDescuentos[] cargosDescuentos) {
        this.cargosDescuentos = cargosDescuentos;
    }


    /**
     * Gets the codigoCondicionEntrega value for this TerminosDeEntrega.
     * 
     * @return codigoCondicionEntrega
     */
    public java.lang.String getCodigoCondicionEntrega() {
        return codigoCondicionEntrega;
    }


    /**
     * Sets the codigoCondicionEntrega value for this TerminosDeEntrega.
     * 
     * @param codigoCondicionEntrega
     */
    public void setCodigoCondicionEntrega(java.lang.String codigoCondicionEntrega) {
        this.codigoCondicionEntrega = codigoCondicionEntrega;
    }


    /**
     * Gets the costoTransporte value for this TerminosDeEntrega.
     * 
     * @return costoTransporte
     */
    public java.lang.String getCostoTransporte() {
        return costoTransporte;
    }


    /**
     * Sets the costoTransporte value for this TerminosDeEntrega.
     * 
     * @param costoTransporte
     */
    public void setCostoTransporte(java.lang.String costoTransporte) {
        this.costoTransporte = costoTransporte;
    }


    /**
     * Gets the direccionEntrega value for this TerminosDeEntrega.
     * 
     * @return direccionEntrega
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion getDireccionEntrega() {
        return direccionEntrega;
    }


    /**
     * Sets the direccionEntrega value for this TerminosDeEntrega.
     * 
     * @param direccionEntrega
     */
    public void setDireccionEntrega(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }


    /**
     * Gets the extras value for this TerminosDeEntrega.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this TerminosDeEntrega.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras) {
        this.extras = extras;
    }


    /**
     * Gets the identificacion value for this TerminosDeEntrega.
     * 
     * @return identificacion
     */
    public java.lang.String getIdentificacion() {
        return identificacion;
    }


    /**
     * Sets the identificacion value for this TerminosDeEntrega.
     * 
     * @param identificacion
     */
    public void setIdentificacion(java.lang.String identificacion) {
        this.identificacion = identificacion;
    }


    /**
     * Gets the monto value for this TerminosDeEntrega.
     * 
     * @return monto
     */
    public java.lang.String getMonto() {
        return monto;
    }


    /**
     * Sets the monto value for this TerminosDeEntrega.
     * 
     * @param monto
     */
    public void setMonto(java.lang.String monto) {
        this.monto = monto;
    }


    /**
     * Gets the responsableEntrega value for this TerminosDeEntrega.
     * 
     * @return responsableEntrega
     */
    public java.lang.String getResponsableEntrega() {
        return responsableEntrega;
    }


    /**
     * Sets the responsableEntrega value for this TerminosDeEntrega.
     * 
     * @param responsableEntrega
     */
    public void setResponsableEntrega(java.lang.String responsableEntrega) {
        this.responsableEntrega = responsableEntrega;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TerminosDeEntrega)) return false;
        TerminosDeEntrega other = (TerminosDeEntrega) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cargosDescuentos==null && other.getCargosDescuentos()==null) || 
             (this.cargosDescuentos!=null &&
              java.util.Arrays.equals(this.cargosDescuentos, other.getCargosDescuentos()))) &&
            ((this.codigoCondicionEntrega==null && other.getCodigoCondicionEntrega()==null) || 
             (this.codigoCondicionEntrega!=null &&
              this.codigoCondicionEntrega.equals(other.getCodigoCondicionEntrega()))) &&
            ((this.costoTransporte==null && other.getCostoTransporte()==null) || 
             (this.costoTransporte!=null &&
              this.costoTransporte.equals(other.getCostoTransporte()))) &&
            ((this.direccionEntrega==null && other.getDireccionEntrega()==null) || 
             (this.direccionEntrega!=null &&
              this.direccionEntrega.equals(other.getDireccionEntrega()))) &&
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras()))) &&
            ((this.identificacion==null && other.getIdentificacion()==null) || 
             (this.identificacion!=null &&
              this.identificacion.equals(other.getIdentificacion()))) &&
            ((this.monto==null && other.getMonto()==null) || 
             (this.monto!=null &&
              this.monto.equals(other.getMonto()))) &&
            ((this.responsableEntrega==null && other.getResponsableEntrega()==null) || 
             (this.responsableEntrega!=null &&
              this.responsableEntrega.equals(other.getResponsableEntrega())));
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
        if (getCargosDescuentos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCargosDescuentos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCargosDescuentos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodigoCondicionEntrega() != null) {
            _hashCode += getCodigoCondicionEntrega().hashCode();
        }
        if (getCostoTransporte() != null) {
            _hashCode += getCostoTransporte().hashCode();
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
        if (getIdentificacion() != null) {
            _hashCode += getIdentificacion().hashCode();
        }
        if (getMonto() != null) {
            _hashCode += getMonto().hashCode();
        }
        if (getResponsableEntrega() != null) {
            _hashCode += getResponsableEntrega().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TerminosDeEntrega.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TerminosDeEntrega"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargosDescuentos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cargosDescuentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "CargosDescuentos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "CargosDescuentos"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCondicionEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoCondicionEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costoTransporte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "costoTransporte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("identificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "identificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "monto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsableEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "responsableEntrega"));
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
