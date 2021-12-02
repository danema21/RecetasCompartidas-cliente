/**
 * DtReceta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtReceta  implements java.io.Serializable {
    private java.lang.String autor;

    private java.lang.String descripionDelProceso;

    private java.lang.String imagen;

    private java.lang.String ingredientes;

    private java.lang.String nombre;

    public DtReceta() {
    }

    public DtReceta(
           java.lang.String autor,
           java.lang.String descripionDelProceso,
           java.lang.String imagen,
           java.lang.String ingredientes,
           java.lang.String nombre) {
           this.autor = autor;
           this.descripionDelProceso = descripionDelProceso;
           this.imagen = imagen;
           this.ingredientes = ingredientes;
           this.nombre = nombre;
    }


    /**
     * Gets the autor value for this DtReceta.
     * 
     * @return autor
     */
    public java.lang.String getAutor() {
        return autor;
    }


    /**
     * Sets the autor value for this DtReceta.
     * 
     * @param autor
     */
    public void setAutor(java.lang.String autor) {
        this.autor = autor;
    }


    /**
     * Gets the descripionDelProceso value for this DtReceta.
     * 
     * @return descripionDelProceso
     */
    public java.lang.String getDescripionDelProceso() {
        return descripionDelProceso;
    }


    /**
     * Sets the descripionDelProceso value for this DtReceta.
     * 
     * @param descripionDelProceso
     */
    public void setDescripionDelProceso(java.lang.String descripionDelProceso) {
        this.descripionDelProceso = descripionDelProceso;
    }


    /**
     * Gets the imagen value for this DtReceta.
     * 
     * @return imagen
     */
    public java.lang.String getImagen() {
        return imagen;
    }


    /**
     * Sets the imagen value for this DtReceta.
     * 
     * @param imagen
     */
    public void setImagen(java.lang.String imagen) {
        this.imagen = imagen;
    }


    /**
     * Gets the ingredientes value for this DtReceta.
     * 
     * @return ingredientes
     */
    public java.lang.String getIngredientes() {
        return ingredientes;
    }


    /**
     * Sets the ingredientes value for this DtReceta.
     * 
     * @param ingredientes
     */
    public void setIngredientes(java.lang.String ingredientes) {
        this.ingredientes = ingredientes;
    }


    /**
     * Gets the nombre value for this DtReceta.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DtReceta.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtReceta)) return false;
        DtReceta other = (DtReceta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autor==null && other.getAutor()==null) || 
             (this.autor!=null &&
              this.autor.equals(other.getAutor()))) &&
            ((this.descripionDelProceso==null && other.getDescripionDelProceso()==null) || 
             (this.descripionDelProceso!=null &&
              this.descripionDelProceso.equals(other.getDescripionDelProceso()))) &&
            ((this.imagen==null && other.getImagen()==null) || 
             (this.imagen!=null &&
              this.imagen.equals(other.getImagen()))) &&
            ((this.ingredientes==null && other.getIngredientes()==null) || 
             (this.ingredientes!=null &&
              this.ingredientes.equals(other.getIngredientes()))) &&
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
        if (getAutor() != null) {
            _hashCode += getAutor().hashCode();
        }
        if (getDescripionDelProceso() != null) {
            _hashCode += getDescripionDelProceso().hashCode();
        }
        if (getImagen() != null) {
            _hashCode += getImagen().hashCode();
        }
        if (getIngredientes() != null) {
            _hashCode += getIngredientes().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtReceta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtReceta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripionDelProceso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripionDelProceso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imagen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingredientes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingredientes"));
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
