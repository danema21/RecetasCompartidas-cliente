/**
 * DtUsuario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtUsuario  implements java.io.Serializable {
    private java.lang.String apellido;

    private boolean bloqueado;

    private java.lang.String idDeUsuario;

    private java.lang.String imagenDePerfil;

    private java.lang.String nombre;

    public DtUsuario() {
    }

    public DtUsuario(
           java.lang.String apellido,
           boolean bloqueado,
           java.lang.String idDeUsuario,
           java.lang.String imagenDePerfil,
           java.lang.String nombre) {
           this.apellido = apellido;
           this.bloqueado = bloqueado;
           this.idDeUsuario = idDeUsuario;
           this.imagenDePerfil = imagenDePerfil;
           this.nombre = nombre;
    }


    /**
     * Gets the apellido value for this DtUsuario.
     * 
     * @return apellido
     */
    public java.lang.String getApellido() {
        return apellido;
    }


    /**
     * Sets the apellido value for this DtUsuario.
     * 
     * @param apellido
     */
    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }


    /**
     * Gets the bloqueado value for this DtUsuario.
     * 
     * @return bloqueado
     */
    public boolean isBloqueado() {
        return bloqueado;
    }


    /**
     * Sets the bloqueado value for this DtUsuario.
     * 
     * @param bloqueado
     */
    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }


    /**
     * Gets the idDeUsuario value for this DtUsuario.
     * 
     * @return idDeUsuario
     */
    public java.lang.String getIdDeUsuario() {
        return idDeUsuario;
    }


    /**
     * Sets the idDeUsuario value for this DtUsuario.
     * 
     * @param idDeUsuario
     */
    public void setIdDeUsuario(java.lang.String idDeUsuario) {
        this.idDeUsuario = idDeUsuario;
    }


    /**
     * Gets the imagenDePerfil value for this DtUsuario.
     * 
     * @return imagenDePerfil
     */
    public java.lang.String getImagenDePerfil() {
        return imagenDePerfil;
    }


    /**
     * Sets the imagenDePerfil value for this DtUsuario.
     * 
     * @param imagenDePerfil
     */
    public void setImagenDePerfil(java.lang.String imagenDePerfil) {
        this.imagenDePerfil = imagenDePerfil;
    }


    /**
     * Gets the nombre value for this DtUsuario.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DtUsuario.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtUsuario)) return false;
        DtUsuario other = (DtUsuario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellido==null && other.getApellido()==null) || 
             (this.apellido!=null &&
              this.apellido.equals(other.getApellido()))) &&
            this.bloqueado == other.isBloqueado() &&
            ((this.idDeUsuario==null && other.getIdDeUsuario()==null) || 
             (this.idDeUsuario!=null &&
              this.idDeUsuario.equals(other.getIdDeUsuario()))) &&
            ((this.imagenDePerfil==null && other.getImagenDePerfil()==null) || 
             (this.imagenDePerfil!=null &&
              this.imagenDePerfil.equals(other.getImagenDePerfil()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre())));
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
        if (getApellido() != null) {
            _hashCode += getApellido().hashCode();
        }
        _hashCode += (isBloqueado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIdDeUsuario() != null) {
            _hashCode += getIdDeUsuario().hashCode();
        }
        if (getImagenDePerfil() != null) {
            _hashCode += getImagenDePerfil().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtUsuario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtUsuario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bloqueado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bloqueado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDeUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idDeUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagenDePerfil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imagenDePerfil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
