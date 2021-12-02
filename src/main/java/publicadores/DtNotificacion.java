/**
 * DtNotificacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtNotificacion  implements java.io.Serializable {
    private java.lang.String autorDeReceta;

    private java.lang.String fechaDePublicacion;

    private java.lang.String imagenDeReceta;

    private java.lang.String nombreReceta;

    public DtNotificacion() {
    }

    public DtNotificacion(
           java.lang.String autorDeReceta,
           java.lang.String fechaDePublicacion,
           java.lang.String imagenDeReceta,
           java.lang.String nombreReceta) {
           this.autorDeReceta = autorDeReceta;
           this.fechaDePublicacion = fechaDePublicacion;
           this.imagenDeReceta = imagenDeReceta;
           this.nombreReceta = nombreReceta;
    }


    /**
     * Gets the autorDeReceta value for this DtNotificacion.
     * 
     * @return autorDeReceta
     */
    public java.lang.String getAutorDeReceta() {
        return autorDeReceta;
    }


    /**
     * Sets the autorDeReceta value for this DtNotificacion.
     * 
     * @param autorDeReceta
     */
    public void setAutorDeReceta(java.lang.String autorDeReceta) {
        this.autorDeReceta = autorDeReceta;
    }


    /**
     * Gets the fechaDePublicacion value for this DtNotificacion.
     * 
     * @return fechaDePublicacion
     */
    public java.lang.String getFechaDePublicacion() {
        return fechaDePublicacion;
    }


    /**
     * Sets the fechaDePublicacion value for this DtNotificacion.
     * 
     * @param fechaDePublicacion
     */
    public void setFechaDePublicacion(java.lang.String fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }


    /**
     * Gets the imagenDeReceta value for this DtNotificacion.
     * 
     * @return imagenDeReceta
     */
    public java.lang.String getImagenDeReceta() {
        return imagenDeReceta;
    }


    /**
     * Sets the imagenDeReceta value for this DtNotificacion.
     * 
     * @param imagenDeReceta
     */
    public void setImagenDeReceta(java.lang.String imagenDeReceta) {
        this.imagenDeReceta = imagenDeReceta;
    }


    /**
     * Gets the nombreReceta value for this DtNotificacion.
     * 
     * @return nombreReceta
     */
    public java.lang.String getNombreReceta() {
        return nombreReceta;
    }


    /**
     * Sets the nombreReceta value for this DtNotificacion.
     * 
     * @param nombreReceta
     */
    public void setNombreReceta(java.lang.String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtNotificacion)) return false;
        DtNotificacion other = (DtNotificacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autorDeReceta==null && other.getAutorDeReceta()==null) || 
             (this.autorDeReceta!=null &&
              this.autorDeReceta.equals(other.getAutorDeReceta()))) &&
            ((this.fechaDePublicacion==null && other.getFechaDePublicacion()==null) || 
             (this.fechaDePublicacion!=null &&
              this.fechaDePublicacion.equals(other.getFechaDePublicacion()))) &&
            ((this.imagenDeReceta==null && other.getImagenDeReceta()==null) || 
             (this.imagenDeReceta!=null &&
              this.imagenDeReceta.equals(other.getImagenDeReceta()))) &&
            ((this.nombreReceta==null && other.getNombreReceta()==null) || 
             (this.nombreReceta!=null &&
              this.nombreReceta.equals(other.getNombreReceta())));
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
        if (getAutorDeReceta() != null) {
            _hashCode += getAutorDeReceta().hashCode();
        }
        if (getFechaDePublicacion() != null) {
            _hashCode += getFechaDePublicacion().hashCode();
        }
        if (getImagenDeReceta() != null) {
            _hashCode += getImagenDeReceta().hashCode();
        }
        if (getNombreReceta() != null) {
            _hashCode += getNombreReceta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtNotificacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtNotificacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorDeReceta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autorDeReceta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDePublicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaDePublicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagenDeReceta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imagenDeReceta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreReceta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreReceta"));
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
