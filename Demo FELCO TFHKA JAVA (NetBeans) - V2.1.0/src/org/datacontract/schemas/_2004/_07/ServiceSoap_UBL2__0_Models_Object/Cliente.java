/**
 * Cliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object;

public class Cliente  implements java.io.Serializable {
    private java.lang.String actividadEconomicaCIIU;

    private java.lang.String apellido;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Destinatario[] destinatario;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Tributos[] detallesTributarios;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionCliente;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionFiscal;

    private java.lang.String email;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.InformacionLegal informacionLegalCliente;

    private java.lang.String nombreComercial;

    private java.lang.String nombreContacto;

    private java.lang.String nombreRazonSocial;

    private java.lang.String nota;

    private java.lang.String notificar;

    private java.lang.String numeroDocumento;

    private java.lang.String numeroIdentificacionDV;

    private org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Obligaciones[] responsabilidadesRut;

    private java.lang.String segundoNombre;

    private java.lang.String telefax;

    private java.lang.String telefono;

    private java.lang.String tipoIdentificacion;

    private java.lang.String tipoPersona;

    public Cliente() {
    }

    public Cliente(
           java.lang.String actividadEconomicaCIIU,
           java.lang.String apellido,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Destinatario[] destinatario,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Tributos[] detallesTributarios,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionCliente,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionFiscal,
           java.lang.String email,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.InformacionLegal informacionLegalCliente,
           java.lang.String nombreComercial,
           java.lang.String nombreContacto,
           java.lang.String nombreRazonSocial,
           java.lang.String nota,
           java.lang.String notificar,
           java.lang.String numeroDocumento,
           java.lang.String numeroIdentificacionDV,
           org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Obligaciones[] responsabilidadesRut,
           java.lang.String segundoNombre,
           java.lang.String telefax,
           java.lang.String telefono,
           java.lang.String tipoIdentificacion,
           java.lang.String tipoPersona) {
           this.actividadEconomicaCIIU = actividadEconomicaCIIU;
           this.apellido = apellido;
           this.destinatario = destinatario;
           this.detallesTributarios = detallesTributarios;
           this.direccionCliente = direccionCliente;
           this.direccionFiscal = direccionFiscal;
           this.email = email;
           this.extras = extras;
           this.informacionLegalCliente = informacionLegalCliente;
           this.nombreComercial = nombreComercial;
           this.nombreContacto = nombreContacto;
           this.nombreRazonSocial = nombreRazonSocial;
           this.nota = nota;
           this.notificar = notificar;
           this.numeroDocumento = numeroDocumento;
           this.numeroIdentificacionDV = numeroIdentificacionDV;
           this.responsabilidadesRut = responsabilidadesRut;
           this.segundoNombre = segundoNombre;
           this.telefax = telefax;
           this.telefono = telefono;
           this.tipoIdentificacion = tipoIdentificacion;
           this.tipoPersona = tipoPersona;
    }


    /**
     * Gets the actividadEconomicaCIIU value for this Cliente.
     * 
     * @return actividadEconomicaCIIU
     */
    public java.lang.String getActividadEconomicaCIIU() {
        return actividadEconomicaCIIU;
    }


    /**
     * Sets the actividadEconomicaCIIU value for this Cliente.
     * 
     * @param actividadEconomicaCIIU
     */
    public void setActividadEconomicaCIIU(java.lang.String actividadEconomicaCIIU) {
        this.actividadEconomicaCIIU = actividadEconomicaCIIU;
    }


    /**
     * Gets the apellido value for this Cliente.
     * 
     * @return apellido
     */
    public java.lang.String getApellido() {
        return apellido;
    }


    /**
     * Sets the apellido value for this Cliente.
     * 
     * @param apellido
     */
    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }


    /**
     * Gets the destinatario value for this Cliente.
     * 
     * @return destinatario
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Destinatario[] getDestinatario() {
        return destinatario;
    }


    /**
     * Sets the destinatario value for this Cliente.
     * 
     * @param destinatario
     */
    public void setDestinatario(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Destinatario[] destinatario) {
        this.destinatario = destinatario;
    }


    /**
     * Gets the detallesTributarios value for this Cliente.
     * 
     * @return detallesTributarios
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Tributos[] getDetallesTributarios() {
        return detallesTributarios;
    }


    /**
     * Sets the detallesTributarios value for this Cliente.
     * 
     * @param detallesTributarios
     */
    public void setDetallesTributarios(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Tributos[] detallesTributarios) {
        this.detallesTributarios = detallesTributarios;
    }


    /**
     * Gets the direccionCliente value for this Cliente.
     * 
     * @return direccionCliente
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion getDireccionCliente() {
        return direccionCliente;
    }


    /**
     * Sets the direccionCliente value for this Cliente.
     * 
     * @param direccionCliente
     */
    public void setDireccionCliente(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionCliente) {
        this.direccionCliente = direccionCliente;
    }


    /**
     * Gets the direccionFiscal value for this Cliente.
     * 
     * @return direccionFiscal
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion getDireccionFiscal() {
        return direccionFiscal;
    }


    /**
     * Sets the direccionFiscal value for this Cliente.
     * 
     * @param direccionFiscal
     */
    public void setDireccionFiscal(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Direccion direccionFiscal) {
        this.direccionFiscal = direccionFiscal;
    }


    /**
     * Gets the email value for this Cliente.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Cliente.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the extras value for this Cliente.
     * 
     * @return extras
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this Cliente.
     * 
     * @param extras
     */
    public void setExtras(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Extensible[] extras) {
        this.extras = extras;
    }


    /**
     * Gets the informacionLegalCliente value for this Cliente.
     * 
     * @return informacionLegalCliente
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.InformacionLegal getInformacionLegalCliente() {
        return informacionLegalCliente;
    }


    /**
     * Sets the informacionLegalCliente value for this Cliente.
     * 
     * @param informacionLegalCliente
     */
    public void setInformacionLegalCliente(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.InformacionLegal informacionLegalCliente) {
        this.informacionLegalCliente = informacionLegalCliente;
    }


    /**
     * Gets the nombreComercial value for this Cliente.
     * 
     * @return nombreComercial
     */
    public java.lang.String getNombreComercial() {
        return nombreComercial;
    }


    /**
     * Sets the nombreComercial value for this Cliente.
     * 
     * @param nombreComercial
     */
    public void setNombreComercial(java.lang.String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }


    /**
     * Gets the nombreContacto value for this Cliente.
     * 
     * @return nombreContacto
     */
    public java.lang.String getNombreContacto() {
        return nombreContacto;
    }


    /**
     * Sets the nombreContacto value for this Cliente.
     * 
     * @param nombreContacto
     */
    public void setNombreContacto(java.lang.String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }


    /**
     * Gets the nombreRazonSocial value for this Cliente.
     * 
     * @return nombreRazonSocial
     */
    public java.lang.String getNombreRazonSocial() {
        return nombreRazonSocial;
    }


    /**
     * Sets the nombreRazonSocial value for this Cliente.
     * 
     * @param nombreRazonSocial
     */
    public void setNombreRazonSocial(java.lang.String nombreRazonSocial) {
        this.nombreRazonSocial = nombreRazonSocial;
    }


    /**
     * Gets the nota value for this Cliente.
     * 
     * @return nota
     */
    public java.lang.String getNota() {
        return nota;
    }


    /**
     * Sets the nota value for this Cliente.
     * 
     * @param nota
     */
    public void setNota(java.lang.String nota) {
        this.nota = nota;
    }


    /**
     * Gets the notificar value for this Cliente.
     * 
     * @return notificar
     */
    public java.lang.String getNotificar() {
        return notificar;
    }


    /**
     * Sets the notificar value for this Cliente.
     * 
     * @param notificar
     */
    public void setNotificar(java.lang.String notificar) {
        this.notificar = notificar;
    }


    /**
     * Gets the numeroDocumento value for this Cliente.
     * 
     * @return numeroDocumento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this Cliente.
     * 
     * @param numeroDocumento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the numeroIdentificacionDV value for this Cliente.
     * 
     * @return numeroIdentificacionDV
     */
    public java.lang.String getNumeroIdentificacionDV() {
        return numeroIdentificacionDV;
    }


    /**
     * Sets the numeroIdentificacionDV value for this Cliente.
     * 
     * @param numeroIdentificacionDV
     */
    public void setNumeroIdentificacionDV(java.lang.String numeroIdentificacionDV) {
        this.numeroIdentificacionDV = numeroIdentificacionDV;
    }


    /**
     * Gets the responsabilidadesRut value for this Cliente.
     * 
     * @return responsabilidadesRut
     */
    public org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Obligaciones[] getResponsabilidadesRut() {
        return responsabilidadesRut;
    }


    /**
     * Sets the responsabilidadesRut value for this Cliente.
     * 
     * @param responsabilidadesRut
     */
    public void setResponsabilidadesRut(org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.Obligaciones[] responsabilidadesRut) {
        this.responsabilidadesRut = responsabilidadesRut;
    }


    /**
     * Gets the segundoNombre value for this Cliente.
     * 
     * @return segundoNombre
     */
    public java.lang.String getSegundoNombre() {
        return segundoNombre;
    }


    /**
     * Sets the segundoNombre value for this Cliente.
     * 
     * @param segundoNombre
     */
    public void setSegundoNombre(java.lang.String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }


    /**
     * Gets the telefax value for this Cliente.
     * 
     * @return telefax
     */
    public java.lang.String getTelefax() {
        return telefax;
    }


    /**
     * Sets the telefax value for this Cliente.
     * 
     * @param telefax
     */
    public void setTelefax(java.lang.String telefax) {
        this.telefax = telefax;
    }


    /**
     * Gets the telefono value for this Cliente.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this Cliente.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the tipoIdentificacion value for this Cliente.
     * 
     * @return tipoIdentificacion
     */
    public java.lang.String getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    /**
     * Sets the tipoIdentificacion value for this Cliente.
     * 
     * @param tipoIdentificacion
     */
    public void setTipoIdentificacion(java.lang.String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }


    /**
     * Gets the tipoPersona value for this Cliente.
     * 
     * @return tipoPersona
     */
    public java.lang.String getTipoPersona() {
        return tipoPersona;
    }


    /**
     * Sets the tipoPersona value for this Cliente.
     * 
     * @param tipoPersona
     */
    public void setTipoPersona(java.lang.String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cliente)) return false;
        Cliente other = (Cliente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actividadEconomicaCIIU==null && other.getActividadEconomicaCIIU()==null) || 
             (this.actividadEconomicaCIIU!=null &&
              this.actividadEconomicaCIIU.equals(other.getActividadEconomicaCIIU()))) &&
            ((this.apellido==null && other.getApellido()==null) || 
             (this.apellido!=null &&
              this.apellido.equals(other.getApellido()))) &&
            ((this.destinatario==null && other.getDestinatario()==null) || 
             (this.destinatario!=null &&
              java.util.Arrays.equals(this.destinatario, other.getDestinatario()))) &&
            ((this.detallesTributarios==null && other.getDetallesTributarios()==null) || 
             (this.detallesTributarios!=null &&
              java.util.Arrays.equals(this.detallesTributarios, other.getDetallesTributarios()))) &&
            ((this.direccionCliente==null && other.getDireccionCliente()==null) || 
             (this.direccionCliente!=null &&
              this.direccionCliente.equals(other.getDireccionCliente()))) &&
            ((this.direccionFiscal==null && other.getDireccionFiscal()==null) || 
             (this.direccionFiscal!=null &&
              this.direccionFiscal.equals(other.getDireccionFiscal()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              java.util.Arrays.equals(this.extras, other.getExtras()))) &&
            ((this.informacionLegalCliente==null && other.getInformacionLegalCliente()==null) || 
             (this.informacionLegalCliente!=null &&
              this.informacionLegalCliente.equals(other.getInformacionLegalCliente()))) &&
            ((this.nombreComercial==null && other.getNombreComercial()==null) || 
             (this.nombreComercial!=null &&
              this.nombreComercial.equals(other.getNombreComercial()))) &&
            ((this.nombreContacto==null && other.getNombreContacto()==null) || 
             (this.nombreContacto!=null &&
              this.nombreContacto.equals(other.getNombreContacto()))) &&
            ((this.nombreRazonSocial==null && other.getNombreRazonSocial()==null) || 
             (this.nombreRazonSocial!=null &&
              this.nombreRazonSocial.equals(other.getNombreRazonSocial()))) &&
            ((this.nota==null && other.getNota()==null) || 
             (this.nota!=null &&
              this.nota.equals(other.getNota()))) &&
            ((this.notificar==null && other.getNotificar()==null) || 
             (this.notificar!=null &&
              this.notificar.equals(other.getNotificar()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.numeroIdentificacionDV==null && other.getNumeroIdentificacionDV()==null) || 
             (this.numeroIdentificacionDV!=null &&
              this.numeroIdentificacionDV.equals(other.getNumeroIdentificacionDV()))) &&
            ((this.responsabilidadesRut==null && other.getResponsabilidadesRut()==null) || 
             (this.responsabilidadesRut!=null &&
              java.util.Arrays.equals(this.responsabilidadesRut, other.getResponsabilidadesRut()))) &&
            ((this.segundoNombre==null && other.getSegundoNombre()==null) || 
             (this.segundoNombre!=null &&
              this.segundoNombre.equals(other.getSegundoNombre()))) &&
            ((this.telefax==null && other.getTelefax()==null) || 
             (this.telefax!=null &&
              this.telefax.equals(other.getTelefax()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.tipoIdentificacion==null && other.getTipoIdentificacion()==null) || 
             (this.tipoIdentificacion!=null &&
              this.tipoIdentificacion.equals(other.getTipoIdentificacion()))) &&
            ((this.tipoPersona==null && other.getTipoPersona()==null) || 
             (this.tipoPersona!=null &&
              this.tipoPersona.equals(other.getTipoPersona())));
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
        if (getActividadEconomicaCIIU() != null) {
            _hashCode += getActividadEconomicaCIIU().hashCode();
        }
        if (getApellido() != null) {
            _hashCode += getApellido().hashCode();
        }
        if (getDestinatario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinatario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinatario(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getDireccionCliente() != null) {
            _hashCode += getDireccionCliente().hashCode();
        }
        if (getDireccionFiscal() != null) {
            _hashCode += getDireccionFiscal().hashCode();
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
        if (getInformacionLegalCliente() != null) {
            _hashCode += getInformacionLegalCliente().hashCode();
        }
        if (getNombreComercial() != null) {
            _hashCode += getNombreComercial().hashCode();
        }
        if (getNombreContacto() != null) {
            _hashCode += getNombreContacto().hashCode();
        }
        if (getNombreRazonSocial() != null) {
            _hashCode += getNombreRazonSocial().hashCode();
        }
        if (getNota() != null) {
            _hashCode += getNota().hashCode();
        }
        if (getNotificar() != null) {
            _hashCode += getNotificar().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getNumeroIdentificacionDV() != null) {
            _hashCode += getNumeroIdentificacionDV().hashCode();
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
        if (getSegundoNombre() != null) {
            _hashCode += getSegundoNombre().hashCode();
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
        if (getTipoPersona() != null) {
            _hashCode += getTipoPersona().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Cliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actividadEconomicaCIIU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "actividadEconomicaCIIU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "apellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "destinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Destinatario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Destinatario"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detallesTributarios");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "detallesTributarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Tributos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Tributos"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "direccionCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Direccion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "direccionFiscal"));
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
        elemField.setFieldName("informacionLegalCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "informacionLegalCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "InformacionLegal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreComercial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreComercial"));
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
        elemField.setFieldName("nombreRazonSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreRazonSocial"));
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
        elemField.setFieldName("notificar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "notificar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroDocumento"));
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
        elemField.setFieldName("responsabilidadesRut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "responsabilidadesRut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Obligaciones"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Obligaciones"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segundoNombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "segundoNombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("tipoPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoPersona"));
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
