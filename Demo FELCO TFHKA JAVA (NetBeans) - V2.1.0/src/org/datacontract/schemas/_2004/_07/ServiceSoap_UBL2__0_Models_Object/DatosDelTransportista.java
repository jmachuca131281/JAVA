/**
 * DatosDelTransportista.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class DatosDelTransportista  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Tributos[] detallesTributarios;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionResponsableEntrega;

    private java.lang.String email;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras;

    private java.lang.String indicadordeAtencion;

    private java.lang.String indicadordeCuidado;

    private java.lang.String nombreContacto;

    private java.lang.String nombreResponsableEntrega;

    private java.lang.String nota;

    private java.lang.String numeroIdentificacion;

    private java.lang.String numeroIdentificacionDV;

    private java.lang.String numeroMatriculaMercantil;

    private java.lang.String prefijoFacturacion;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Obligaciones[] responsabilidadesRut;

    private java.lang.String telefax;

    private java.lang.String telefono;

    private java.lang.String tipoIdentificacion;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion transportadorDireccion;

    private java.lang.String transportadorNombre;

    private java.lang.String transportadorNumeroDocumento;

    private java.lang.String transportadorNumeroDocumentoDV;

    private java.lang.String transportadorTipoIdentificacion;

    public DatosDelTransportista() {
    }

    public DatosDelTransportista(
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Tributos[] detallesTributarios,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionResponsableEntrega,
           java.lang.String email,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras,
           java.lang.String indicadordeAtencion,
           java.lang.String indicadordeCuidado,
           java.lang.String nombreContacto,
           java.lang.String nombreResponsableEntrega,
           java.lang.String nota,
           java.lang.String numeroIdentificacion,
           java.lang.String numeroIdentificacionDV,
           java.lang.String numeroMatriculaMercantil,
           java.lang.String prefijoFacturacion,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Obligaciones[] responsabilidadesRut,
           java.lang.String telefax,
           java.lang.String telefono,
           java.lang.String tipoIdentificacion,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion transportadorDireccion,
           java.lang.String transportadorNombre,
           java.lang.String transportadorNumeroDocumento,
           java.lang.String transportadorNumeroDocumentoDV,
           java.lang.String transportadorTipoIdentificacion) {
           this.detallesTributarios = detallesTributarios;
           this.direccionResponsableEntrega = direccionResponsableEntrega;
           this.email = email;
           this.extras = extras;
           this.indicadordeAtencion = indicadordeAtencion;
           this.indicadordeCuidado = indicadordeCuidado;
           this.nombreContacto = nombreContacto;
           this.nombreResponsableEntrega = nombreResponsableEntrega;
           this.nota = nota;
           this.numeroIdentificacion = numeroIdentificacion;
           this.numeroIdentificacionDV = numeroIdentificacionDV;
           this.numeroMatriculaMercantil = numeroMatriculaMercantil;
           this.prefijoFacturacion = prefijoFacturacion;
           this.responsabilidadesRut = responsabilidadesRut;
           this.telefax = telefax;
           this.telefono = telefono;
           this.tipoIdentificacion = tipoIdentificacion;
           this.transportadorDireccion = transportadorDireccion;
           this.transportadorNombre = transportadorNombre;
           this.transportadorNumeroDocumento = transportadorNumeroDocumento;
           this.transportadorNumeroDocumentoDV = transportadorNumeroDocumentoDV;
           this.transportadorTipoIdentificacion = transportadorTipoIdentificacion;
    }


    /**
     * Gets the detallesTributarios value for this DatosDelTransportista.
     * 
     * @return detallesTributarios
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Tributos[] getDetallesTributarios() {
        return detallesTributarios;
    }


    /**
     * Sets the detallesTributarios value for this DatosDelTransportista.
     * 
     * @param detallesTributarios
     */
    public void setDetallesTributarios(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Tributos[] detallesTributarios) {
        this.detallesTributarios = detallesTributarios;
    }


    /**
     * Gets the direccionResponsableEntrega value for this DatosDelTransportista.
     * 
     * @return direccionResponsableEntrega
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion getDireccionResponsableEntrega() {
        return direccionResponsableEntrega;
    }


    /**
     * Sets the direccionResponsableEntrega value for this DatosDelTransportista.
     * 
     * @param direccionResponsableEntrega
     */
    public void setDireccionResponsableEntrega(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionResponsableEntrega) {
        this.direccionResponsableEntrega = direccionResponsableEntrega;
    }


    /**
     * Gets the email value for this DatosDelTransportista.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this DatosDelTransportista.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the extras value for this DatosDelTransportista.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this DatosDelTransportista.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras) {
        this.extras = extras;
    }


    /**
     * Gets the indicadordeAtencion value for this DatosDelTransportista.
     * 
     * @return indicadordeAtencion
     */
    public java.lang.String getIndicadordeAtencion() {
        return indicadordeAtencion;
    }


    /**
     * Sets the indicadordeAtencion value for this DatosDelTransportista.
     * 
     * @param indicadordeAtencion
     */
    public void setIndicadordeAtencion(java.lang.String indicadordeAtencion) {
        this.indicadordeAtencion = indicadordeAtencion;
    }


    /**
     * Gets the indicadordeCuidado value for this DatosDelTransportista.
     * 
     * @return indicadordeCuidado
     */
    public java.lang.String getIndicadordeCuidado() {
        return indicadordeCuidado;
    }


    /**
     * Sets the indicadordeCuidado value for this DatosDelTransportista.
     * 
     * @param indicadordeCuidado
     */
    public void setIndicadordeCuidado(java.lang.String indicadordeCuidado) {
        this.indicadordeCuidado = indicadordeCuidado;
    }


    /**
     * Gets the nombreContacto value for this DatosDelTransportista.
     * 
     * @return nombreContacto
     */
    public java.lang.String getNombreContacto() {
        return nombreContacto;
    }


    /**
     * Sets the nombreContacto value for this DatosDelTransportista.
     * 
     * @param nombreContacto
     */
    public void setNombreContacto(java.lang.String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }


    /**
     * Gets the nombreResponsableEntrega value for this DatosDelTransportista.
     * 
     * @return nombreResponsableEntrega
     */
    public java.lang.String getNombreResponsableEntrega() {
        return nombreResponsableEntrega;
    }


    /**
     * Sets the nombreResponsableEntrega value for this DatosDelTransportista.
     * 
     * @param nombreResponsableEntrega
     */
    public void setNombreResponsableEntrega(java.lang.String nombreResponsableEntrega) {
        this.nombreResponsableEntrega = nombreResponsableEntrega;
    }


    /**
     * Gets the nota value for this DatosDelTransportista.
     * 
     * @return nota
     */
    public java.lang.String getNota() {
        return nota;
    }


    /**
     * Sets the nota value for this DatosDelTransportista.
     * 
     * @param nota
     */
    public void setNota(java.lang.String nota) {
        this.nota = nota;
    }


    /**
     * Gets the numeroIdentificacion value for this DatosDelTransportista.
     * 
     * @return numeroIdentificacion
     */
    public java.lang.String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }


    /**
     * Sets the numeroIdentificacion value for this DatosDelTransportista.
     * 
     * @param numeroIdentificacion
     */
    public void setNumeroIdentificacion(java.lang.String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


    /**
     * Gets the numeroIdentificacionDV value for this DatosDelTransportista.
     * 
     * @return numeroIdentificacionDV
     */
    public java.lang.String getNumeroIdentificacionDV() {
        return numeroIdentificacionDV;
    }


    /**
     * Sets the numeroIdentificacionDV value for this DatosDelTransportista.
     * 
     * @param numeroIdentificacionDV
     */
    public void setNumeroIdentificacionDV(java.lang.String numeroIdentificacionDV) {
        this.numeroIdentificacionDV = numeroIdentificacionDV;
    }


    /**
     * Gets the numeroMatriculaMercantil value for this DatosDelTransportista.
     * 
     * @return numeroMatriculaMercantil
     */
    public java.lang.String getNumeroMatriculaMercantil() {
        return numeroMatriculaMercantil;
    }


    /**
     * Sets the numeroMatriculaMercantil value for this DatosDelTransportista.
     * 
     * @param numeroMatriculaMercantil
     */
    public void setNumeroMatriculaMercantil(java.lang.String numeroMatriculaMercantil) {
        this.numeroMatriculaMercantil = numeroMatriculaMercantil;
    }


    /**
     * Gets the prefijoFacturacion value for this DatosDelTransportista.
     * 
     * @return prefijoFacturacion
     */
    public java.lang.String getPrefijoFacturacion() {
        return prefijoFacturacion;
    }


    /**
     * Sets the prefijoFacturacion value for this DatosDelTransportista.
     * 
     * @param prefijoFacturacion
     */
    public void setPrefijoFacturacion(java.lang.String prefijoFacturacion) {
        this.prefijoFacturacion = prefijoFacturacion;
    }


    /**
     * Gets the responsabilidadesRut value for this DatosDelTransportista.
     * 
     * @return responsabilidadesRut
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Obligaciones[] getResponsabilidadesRut() {
        return responsabilidadesRut;
    }


    /**
     * Sets the responsabilidadesRut value for this DatosDelTransportista.
     * 
     * @param responsabilidadesRut
     */
    public void setResponsabilidadesRut(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Obligaciones[] responsabilidadesRut) {
        this.responsabilidadesRut = responsabilidadesRut;
    }


    /**
     * Gets the telefax value for this DatosDelTransportista.
     * 
     * @return telefax
     */
    public java.lang.String getTelefax() {
        return telefax;
    }


    /**
     * Sets the telefax value for this DatosDelTransportista.
     * 
     * @param telefax
     */
    public void setTelefax(java.lang.String telefax) {
        this.telefax = telefax;
    }


    /**
     * Gets the telefono value for this DatosDelTransportista.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this DatosDelTransportista.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the tipoIdentificacion value for this DatosDelTransportista.
     * 
     * @return tipoIdentificacion
     */
    public java.lang.String getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    /**
     * Sets the tipoIdentificacion value for this DatosDelTransportista.
     * 
     * @param tipoIdentificacion
     */
    public void setTipoIdentificacion(java.lang.String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }


    /**
     * Gets the transportadorDireccion value for this DatosDelTransportista.
     * 
     * @return transportadorDireccion
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion getTransportadorDireccion() {
        return transportadorDireccion;
    }


    /**
     * Sets the transportadorDireccion value for this DatosDelTransportista.
     * 
     * @param transportadorDireccion
     */
    public void setTransportadorDireccion(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion transportadorDireccion) {
        this.transportadorDireccion = transportadorDireccion;
    }


    /**
     * Gets the transportadorNombre value for this DatosDelTransportista.
     * 
     * @return transportadorNombre
     */
    public java.lang.String getTransportadorNombre() {
        return transportadorNombre;
    }


    /**
     * Sets the transportadorNombre value for this DatosDelTransportista.
     * 
     * @param transportadorNombre
     */
    public void setTransportadorNombre(java.lang.String transportadorNombre) {
        this.transportadorNombre = transportadorNombre;
    }


    /**
     * Gets the transportadorNumeroDocumento value for this DatosDelTransportista.
     * 
     * @return transportadorNumeroDocumento
     */
    public java.lang.String getTransportadorNumeroDocumento() {
        return transportadorNumeroDocumento;
    }


    /**
     * Sets the transportadorNumeroDocumento value for this DatosDelTransportista.
     * 
     * @param transportadorNumeroDocumento
     */
    public void setTransportadorNumeroDocumento(java.lang.String transportadorNumeroDocumento) {
        this.transportadorNumeroDocumento = transportadorNumeroDocumento;
    }


    /**
     * Gets the transportadorNumeroDocumentoDV value for this DatosDelTransportista.
     * 
     * @return transportadorNumeroDocumentoDV
     */
    public java.lang.String getTransportadorNumeroDocumentoDV() {
        return transportadorNumeroDocumentoDV;
    }


    /**
     * Sets the transportadorNumeroDocumentoDV value for this DatosDelTransportista.
     * 
     * @param transportadorNumeroDocumentoDV
     */
    public void setTransportadorNumeroDocumentoDV(java.lang.String transportadorNumeroDocumentoDV) {
        this.transportadorNumeroDocumentoDV = transportadorNumeroDocumentoDV;
    }


    /**
     * Gets the transportadorTipoIdentificacion value for this DatosDelTransportista.
     * 
     * @return transportadorTipoIdentificacion
     */
    public java.lang.String getTransportadorTipoIdentificacion() {
        return transportadorTipoIdentificacion;
    }


    /**
     * Sets the transportadorTipoIdentificacion value for this DatosDelTransportista.
     * 
     * @param transportadorTipoIdentificacion
     */
    public void setTransportadorTipoIdentificacion(java.lang.String transportadorTipoIdentificacion) {
        this.transportadorTipoIdentificacion = transportadorTipoIdentificacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosDelTransportista)) return false;
        DatosDelTransportista other = (DatosDelTransportista) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detallesTributarios==null && other.getDetallesTributarios()==null) || 
             (this.detallesTributarios!=null &&
              java.util.Arrays.equals(this.detallesTributarios, other.getDetallesTributarios()))) &&
            ((this.direccionResponsableEntrega==null && other.getDireccionResponsableEntrega()==null) || 
             (this.direccionResponsableEntrega!=null &&
              this.direccionResponsableEntrega.equals(other.getDireccionResponsableEntrega()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras()))) &&
            ((this.indicadordeAtencion==null && other.getIndicadordeAtencion()==null) || 
             (this.indicadordeAtencion!=null &&
              this.indicadordeAtencion.equals(other.getIndicadordeAtencion()))) &&
            ((this.indicadordeCuidado==null && other.getIndicadordeCuidado()==null) || 
             (this.indicadordeCuidado!=null &&
              this.indicadordeCuidado.equals(other.getIndicadordeCuidado()))) &&
            ((this.nombreContacto==null && other.getNombreContacto()==null) || 
             (this.nombreContacto!=null &&
              this.nombreContacto.equals(other.getNombreContacto()))) &&
            ((this.nombreResponsableEntrega==null && other.getNombreResponsableEntrega()==null) || 
             (this.nombreResponsableEntrega!=null &&
              this.nombreResponsableEntrega.equals(other.getNombreResponsableEntrega()))) &&
            ((this.nota==null && other.getNota()==null) || 
             (this.nota!=null &&
              this.nota.equals(other.getNota()))) &&
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
            ((this.responsabilidadesRut==null && other.getResponsabilidadesRut()==null) || 
             (this.responsabilidadesRut!=null &&
              java.util.Arrays.equals(this.responsabilidadesRut, other.getResponsabilidadesRut()))) &&
            ((this.telefax==null && other.getTelefax()==null) || 
             (this.telefax!=null &&
              this.telefax.equals(other.getTelefax()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.tipoIdentificacion==null && other.getTipoIdentificacion()==null) || 
             (this.tipoIdentificacion!=null &&
              this.tipoIdentificacion.equals(other.getTipoIdentificacion()))) &&
            ((this.transportadorDireccion==null && other.getTransportadorDireccion()==null) || 
             (this.transportadorDireccion!=null &&
              this.transportadorDireccion.equals(other.getTransportadorDireccion()))) &&
            ((this.transportadorNombre==null && other.getTransportadorNombre()==null) || 
             (this.transportadorNombre!=null &&
              this.transportadorNombre.equals(other.getTransportadorNombre()))) &&
            ((this.transportadorNumeroDocumento==null && other.getTransportadorNumeroDocumento()==null) || 
             (this.transportadorNumeroDocumento!=null &&
              this.transportadorNumeroDocumento.equals(other.getTransportadorNumeroDocumento()))) &&
            ((this.transportadorNumeroDocumentoDV==null && other.getTransportadorNumeroDocumentoDV()==null) || 
             (this.transportadorNumeroDocumentoDV!=null &&
              this.transportadorNumeroDocumentoDV.equals(other.getTransportadorNumeroDocumentoDV()))) &&
            ((this.transportadorTipoIdentificacion==null && other.getTransportadorTipoIdentificacion()==null) || 
             (this.transportadorTipoIdentificacion!=null &&
              this.transportadorTipoIdentificacion.equals(other.getTransportadorTipoIdentificacion())));
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
        if (getDetallesTributarios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetallesTributarios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetallesTributarios(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDireccionResponsableEntrega() != null) {
            _hashCode += getDireccionResponsableEntrega().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
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
        if (getIndicadordeAtencion() != null) {
            _hashCode += getIndicadordeAtencion().hashCode();
        }
        if (getIndicadordeCuidado() != null) {
            _hashCode += getIndicadordeCuidado().hashCode();
        }
        if (getNombreContacto() != null) {
            _hashCode += getNombreContacto().hashCode();
        }
        if (getNombreResponsableEntrega() != null) {
            _hashCode += getNombreResponsableEntrega().hashCode();
        }
        if (getNota() != null) {
            _hashCode += getNota().hashCode();
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
        if (getResponsabilidadesRut() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponsabilidadesRut());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponsabilidadesRut(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTelefax() != null) {
            _hashCode += getTelefax().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getTipoIdentificacion() != null) {
            _hashCode += getTipoIdentificacion().hashCode();
        }
        if (getTransportadorDireccion() != null) {
            _hashCode += getTransportadorDireccion().hashCode();
        }
        if (getTransportadorNombre() != null) {
            _hashCode += getTransportadorNombre().hashCode();
        }
        if (getTransportadorNumeroDocumento() != null) {
            _hashCode += getTransportadorNumeroDocumento().hashCode();
        }
        if (getTransportadorNumeroDocumentoDV() != null) {
            _hashCode += getTransportadorNumeroDocumentoDV().hashCode();
        }
        if (getTransportadorTipoIdentificacion() != null) {
            _hashCode += getTransportadorTipoIdentificacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosDelTransportista.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DatosDelTransportista"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detallesTributarios");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "detallesTributarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Tributos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Tributos"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionResponsableEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "direccionResponsableEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Direccion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "email"));
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
        elemField.setFieldName("indicadordeAtencion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "indicadordeAtencion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadordeCuidado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "indicadordeCuidado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreContacto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreContacto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreResponsableEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreResponsableEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nota"));
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
        elemField.setFieldName("responsabilidadesRut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "responsabilidadesRut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Obligaciones"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Obligaciones"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "telefax"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoIdentificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transportadorDireccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "transportadorDireccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Direccion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transportadorNombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "transportadorNombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transportadorNumeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "transportadorNumeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transportadorNumeroDocumentoDV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "transportadorNumeroDocumentoDV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transportadorTipoIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "transportadorTipoIdentificacion"));
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
