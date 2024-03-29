/**
 * CatInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class CatInfoType  implements java.io.Serializable {
    private int catId;

    private java.lang.String catName;

    private int catParent;

    private int catPosition;

    private int catIsProductCatalogueEnabled;

    public CatInfoType() {
    }

    public CatInfoType(
           int catId,
           java.lang.String catName,
           int catParent,
           int catPosition,
           int catIsProductCatalogueEnabled) {
           this.catId = catId;
           this.catName = catName;
           this.catParent = catParent;
           this.catPosition = catPosition;
           this.catIsProductCatalogueEnabled = catIsProductCatalogueEnabled;
    }


    /**
     * Gets the catId value for this CatInfoType.
     * 
     * @return catId
     */
    public int getCatId() {
        return catId;
    }


    /**
     * Sets the catId value for this CatInfoType.
     * 
     * @param catId
     */
    public void setCatId(int catId) {
        this.catId = catId;
    }


    /**
     * Gets the catName value for this CatInfoType.
     * 
     * @return catName
     */
    public java.lang.String getCatName() {
        return catName;
    }


    /**
     * Sets the catName value for this CatInfoType.
     * 
     * @param catName
     */
    public void setCatName(java.lang.String catName) {
        this.catName = catName;
    }


    /**
     * Gets the catParent value for this CatInfoType.
     * 
     * @return catParent
     */
    public int getCatParent() {
        return catParent;
    }


    /**
     * Sets the catParent value for this CatInfoType.
     * 
     * @param catParent
     */
    public void setCatParent(int catParent) {
        this.catParent = catParent;
    }


    /**
     * Gets the catPosition value for this CatInfoType.
     * 
     * @return catPosition
     */
    public int getCatPosition() {
        return catPosition;
    }


    /**
     * Sets the catPosition value for this CatInfoType.
     * 
     * @param catPosition
     */
    public void setCatPosition(int catPosition) {
        this.catPosition = catPosition;
    }


    /**
     * Gets the catIsProductCatalogueEnabled value for this CatInfoType.
     * 
     * @return catIsProductCatalogueEnabled
     */
    public int getCatIsProductCatalogueEnabled() {
        return catIsProductCatalogueEnabled;
    }


    /**
     * Sets the catIsProductCatalogueEnabled value for this CatInfoType.
     * 
     * @param catIsProductCatalogueEnabled
     */
    public void setCatIsProductCatalogueEnabled(int catIsProductCatalogueEnabled) {
        this.catIsProductCatalogueEnabled = catIsProductCatalogueEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatInfoType)) return false;
        CatInfoType other = (CatInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.catId == other.getCatId() &&
            ((this.catName==null && other.getCatName()==null) || 
             (this.catName!=null &&
              this.catName.equals(other.getCatName()))) &&
            this.catParent == other.getCatParent() &&
            this.catPosition == other.getCatPosition() &&
            this.catIsProductCatalogueEnabled == other.getCatIsProductCatalogueEnabled();
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
        _hashCode += getCatId();
        if (getCatName() != null) {
            _hashCode += getCatName().hashCode();
        }
        _hashCode += getCatParent();
        _hashCode += getCatPosition();
        _hashCode += getCatIsProductCatalogueEnabled();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "CatInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "catId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "catName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catParent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "catParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "catPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catIsProductCatalogueEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "catIsProductCatalogueEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
