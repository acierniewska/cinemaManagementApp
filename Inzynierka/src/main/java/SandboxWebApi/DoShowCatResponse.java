/**
 * DoShowCatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoShowCatResponse  implements java.io.Serializable {
    private SandboxWebApi.InfoCatList[] catParentArray;

    private SandboxWebApi.InfoCatList[] catChildArray;

    private SandboxWebApi.InfoCatList[] catSisterArray;

    private int catItemsCount;

    private int catItemsCountFeatured;

    private SandboxWebApi.SearchResponseType[] catItemsArray;

    public DoShowCatResponse() {
    }

    public DoShowCatResponse(
           SandboxWebApi.InfoCatList[] catParentArray,
           SandboxWebApi.InfoCatList[] catChildArray,
           SandboxWebApi.InfoCatList[] catSisterArray,
           int catItemsCount,
           int catItemsCountFeatured,
           SandboxWebApi.SearchResponseType[] catItemsArray) {
           this.catParentArray = catParentArray;
           this.catChildArray = catChildArray;
           this.catSisterArray = catSisterArray;
           this.catItemsCount = catItemsCount;
           this.catItemsCountFeatured = catItemsCountFeatured;
           this.catItemsArray = catItemsArray;
    }


    /**
     * Gets the catParentArray value for this DoShowCatResponse.
     * 
     * @return catParentArray
     */
    public SandboxWebApi.InfoCatList[] getCatParentArray() {
        return catParentArray;
    }


    /**
     * Sets the catParentArray value for this DoShowCatResponse.
     * 
     * @param catParentArray
     */
    public void setCatParentArray(SandboxWebApi.InfoCatList[] catParentArray) {
        this.catParentArray = catParentArray;
    }


    /**
     * Gets the catChildArray value for this DoShowCatResponse.
     * 
     * @return catChildArray
     */
    public SandboxWebApi.InfoCatList[] getCatChildArray() {
        return catChildArray;
    }


    /**
     * Sets the catChildArray value for this DoShowCatResponse.
     * 
     * @param catChildArray
     */
    public void setCatChildArray(SandboxWebApi.InfoCatList[] catChildArray) {
        this.catChildArray = catChildArray;
    }


    /**
     * Gets the catSisterArray value for this DoShowCatResponse.
     * 
     * @return catSisterArray
     */
    public SandboxWebApi.InfoCatList[] getCatSisterArray() {
        return catSisterArray;
    }


    /**
     * Sets the catSisterArray value for this DoShowCatResponse.
     * 
     * @param catSisterArray
     */
    public void setCatSisterArray(SandboxWebApi.InfoCatList[] catSisterArray) {
        this.catSisterArray = catSisterArray;
    }


    /**
     * Gets the catItemsCount value for this DoShowCatResponse.
     * 
     * @return catItemsCount
     */
    public int getCatItemsCount() {
        return catItemsCount;
    }


    /**
     * Sets the catItemsCount value for this DoShowCatResponse.
     * 
     * @param catItemsCount
     */
    public void setCatItemsCount(int catItemsCount) {
        this.catItemsCount = catItemsCount;
    }


    /**
     * Gets the catItemsCountFeatured value for this DoShowCatResponse.
     * 
     * @return catItemsCountFeatured
     */
    public int getCatItemsCountFeatured() {
        return catItemsCountFeatured;
    }


    /**
     * Sets the catItemsCountFeatured value for this DoShowCatResponse.
     * 
     * @param catItemsCountFeatured
     */
    public void setCatItemsCountFeatured(int catItemsCountFeatured) {
        this.catItemsCountFeatured = catItemsCountFeatured;
    }


    /**
     * Gets the catItemsArray value for this DoShowCatResponse.
     * 
     * @return catItemsArray
     */
    public SandboxWebApi.SearchResponseType[] getCatItemsArray() {
        return catItemsArray;
    }


    /**
     * Sets the catItemsArray value for this DoShowCatResponse.
     * 
     * @param catItemsArray
     */
    public void setCatItemsArray(SandboxWebApi.SearchResponseType[] catItemsArray) {
        this.catItemsArray = catItemsArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoShowCatResponse)) return false;
        DoShowCatResponse other = (DoShowCatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.catParentArray==null && other.getCatParentArray()==null) || 
             (this.catParentArray!=null &&
              java.util.Arrays.equals(this.catParentArray, other.getCatParentArray()))) &&
            ((this.catChildArray==null && other.getCatChildArray()==null) || 
             (this.catChildArray!=null &&
              java.util.Arrays.equals(this.catChildArray, other.getCatChildArray()))) &&
            ((this.catSisterArray==null && other.getCatSisterArray()==null) || 
             (this.catSisterArray!=null &&
              java.util.Arrays.equals(this.catSisterArray, other.getCatSisterArray()))) &&
            this.catItemsCount == other.getCatItemsCount() &&
            this.catItemsCountFeatured == other.getCatItemsCountFeatured() &&
            ((this.catItemsArray==null && other.getCatItemsArray()==null) || 
             (this.catItemsArray!=null &&
              java.util.Arrays.equals(this.catItemsArray, other.getCatItemsArray())));
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
        if (getCatParentArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCatParentArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCatParentArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCatChildArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCatChildArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCatChildArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCatSisterArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCatSisterArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCatSisterArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCatItemsCount();
        _hashCode += getCatItemsCountFeatured();
        if (getCatItemsArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCatItemsArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCatItemsArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoShowCatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doShowCatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catParentArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "catParentArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "InfoCatList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catChildArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "catChildArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "InfoCatList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catSisterArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "catSisterArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "InfoCatList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "catItemsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemsCountFeatured");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "catItemsCountFeatured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "catItemsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "SearchResponseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
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
