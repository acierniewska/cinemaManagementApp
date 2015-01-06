/**
 * DoShowItemInfoExtResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoShowItemInfoExtResponse  implements java.io.Serializable {
    private SandboxWebApi.ItemInfoExt itemListInfoExt;

    private SandboxWebApi.ItemCatList[] itemCatPath;

    private SandboxWebApi.ItemImageList[] itemImgList;

    private SandboxWebApi.AttribStruct[] itemAttribList;

    private SandboxWebApi.PostageStruct[] itemPostageOptions;

    private SandboxWebApi.ItemPaymentOptions itemPaymentOptions;

    private SandboxWebApi.CompanyInfoStruct itemCompanyInfo;

    private SandboxWebApi.ProductStruct itemProductInfo;

    private SandboxWebApi.ItemVariantStruct[] itemVariants;

    public DoShowItemInfoExtResponse() {
    }

    public DoShowItemInfoExtResponse(
           SandboxWebApi.ItemInfoExt itemListInfoExt,
           SandboxWebApi.ItemCatList[] itemCatPath,
           SandboxWebApi.ItemImageList[] itemImgList,
           SandboxWebApi.AttribStruct[] itemAttribList,
           SandboxWebApi.PostageStruct[] itemPostageOptions,
           SandboxWebApi.ItemPaymentOptions itemPaymentOptions,
           SandboxWebApi.CompanyInfoStruct itemCompanyInfo,
           SandboxWebApi.ProductStruct itemProductInfo,
           SandboxWebApi.ItemVariantStruct[] itemVariants) {
           this.itemListInfoExt = itemListInfoExt;
           this.itemCatPath = itemCatPath;
           this.itemImgList = itemImgList;
           this.itemAttribList = itemAttribList;
           this.itemPostageOptions = itemPostageOptions;
           this.itemPaymentOptions = itemPaymentOptions;
           this.itemCompanyInfo = itemCompanyInfo;
           this.itemProductInfo = itemProductInfo;
           this.itemVariants = itemVariants;
    }


    /**
     * Gets the itemListInfoExt value for this DoShowItemInfoExtResponse.
     * 
     * @return itemListInfoExt
     */
    public SandboxWebApi.ItemInfoExt getItemListInfoExt() {
        return itemListInfoExt;
    }


    /**
     * Sets the itemListInfoExt value for this DoShowItemInfoExtResponse.
     * 
     * @param itemListInfoExt
     */
    public void setItemListInfoExt(SandboxWebApi.ItemInfoExt itemListInfoExt) {
        this.itemListInfoExt = itemListInfoExt;
    }


    /**
     * Gets the itemCatPath value for this DoShowItemInfoExtResponse.
     * 
     * @return itemCatPath
     */
    public SandboxWebApi.ItemCatList[] getItemCatPath() {
        return itemCatPath;
    }


    /**
     * Sets the itemCatPath value for this DoShowItemInfoExtResponse.
     * 
     * @param itemCatPath
     */
    public void setItemCatPath(SandboxWebApi.ItemCatList[] itemCatPath) {
        this.itemCatPath = itemCatPath;
    }


    /**
     * Gets the itemImgList value for this DoShowItemInfoExtResponse.
     * 
     * @return itemImgList
     */
    public SandboxWebApi.ItemImageList[] getItemImgList() {
        return itemImgList;
    }


    /**
     * Sets the itemImgList value for this DoShowItemInfoExtResponse.
     * 
     * @param itemImgList
     */
    public void setItemImgList(SandboxWebApi.ItemImageList[] itemImgList) {
        this.itemImgList = itemImgList;
    }


    /**
     * Gets the itemAttribList value for this DoShowItemInfoExtResponse.
     * 
     * @return itemAttribList
     */
    public SandboxWebApi.AttribStruct[] getItemAttribList() {
        return itemAttribList;
    }


    /**
     * Sets the itemAttribList value for this DoShowItemInfoExtResponse.
     * 
     * @param itemAttribList
     */
    public void setItemAttribList(SandboxWebApi.AttribStruct[] itemAttribList) {
        this.itemAttribList = itemAttribList;
    }


    /**
     * Gets the itemPostageOptions value for this DoShowItemInfoExtResponse.
     * 
     * @return itemPostageOptions
     */
    public SandboxWebApi.PostageStruct[] getItemPostageOptions() {
        return itemPostageOptions;
    }


    /**
     * Sets the itemPostageOptions value for this DoShowItemInfoExtResponse.
     * 
     * @param itemPostageOptions
     */
    public void setItemPostageOptions(SandboxWebApi.PostageStruct[] itemPostageOptions) {
        this.itemPostageOptions = itemPostageOptions;
    }


    /**
     * Gets the itemPaymentOptions value for this DoShowItemInfoExtResponse.
     * 
     * @return itemPaymentOptions
     */
    public SandboxWebApi.ItemPaymentOptions getItemPaymentOptions() {
        return itemPaymentOptions;
    }


    /**
     * Sets the itemPaymentOptions value for this DoShowItemInfoExtResponse.
     * 
     * @param itemPaymentOptions
     */
    public void setItemPaymentOptions(SandboxWebApi.ItemPaymentOptions itemPaymentOptions) {
        this.itemPaymentOptions = itemPaymentOptions;
    }


    /**
     * Gets the itemCompanyInfo value for this DoShowItemInfoExtResponse.
     * 
     * @return itemCompanyInfo
     */
    public SandboxWebApi.CompanyInfoStruct getItemCompanyInfo() {
        return itemCompanyInfo;
    }


    /**
     * Sets the itemCompanyInfo value for this DoShowItemInfoExtResponse.
     * 
     * @param itemCompanyInfo
     */
    public void setItemCompanyInfo(SandboxWebApi.CompanyInfoStruct itemCompanyInfo) {
        this.itemCompanyInfo = itemCompanyInfo;
    }


    /**
     * Gets the itemProductInfo value for this DoShowItemInfoExtResponse.
     * 
     * @return itemProductInfo
     */
    public SandboxWebApi.ProductStruct getItemProductInfo() {
        return itemProductInfo;
    }


    /**
     * Sets the itemProductInfo value for this DoShowItemInfoExtResponse.
     * 
     * @param itemProductInfo
     */
    public void setItemProductInfo(SandboxWebApi.ProductStruct itemProductInfo) {
        this.itemProductInfo = itemProductInfo;
    }


    /**
     * Gets the itemVariants value for this DoShowItemInfoExtResponse.
     * 
     * @return itemVariants
     */
    public SandboxWebApi.ItemVariantStruct[] getItemVariants() {
        return itemVariants;
    }


    /**
     * Sets the itemVariants value for this DoShowItemInfoExtResponse.
     * 
     * @param itemVariants
     */
    public void setItemVariants(SandboxWebApi.ItemVariantStruct[] itemVariants) {
        this.itemVariants = itemVariants;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoShowItemInfoExtResponse)) return false;
        DoShowItemInfoExtResponse other = (DoShowItemInfoExtResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemListInfoExt==null && other.getItemListInfoExt()==null) || 
             (this.itemListInfoExt!=null &&
              this.itemListInfoExt.equals(other.getItemListInfoExt()))) &&
            ((this.itemCatPath==null && other.getItemCatPath()==null) || 
             (this.itemCatPath!=null &&
              java.util.Arrays.equals(this.itemCatPath, other.getItemCatPath()))) &&
            ((this.itemImgList==null && other.getItemImgList()==null) || 
             (this.itemImgList!=null &&
              java.util.Arrays.equals(this.itemImgList, other.getItemImgList()))) &&
            ((this.itemAttribList==null && other.getItemAttribList()==null) || 
             (this.itemAttribList!=null &&
              java.util.Arrays.equals(this.itemAttribList, other.getItemAttribList()))) &&
            ((this.itemPostageOptions==null && other.getItemPostageOptions()==null) || 
             (this.itemPostageOptions!=null &&
              java.util.Arrays.equals(this.itemPostageOptions, other.getItemPostageOptions()))) &&
            ((this.itemPaymentOptions==null && other.getItemPaymentOptions()==null) || 
             (this.itemPaymentOptions!=null &&
              this.itemPaymentOptions.equals(other.getItemPaymentOptions()))) &&
            ((this.itemCompanyInfo==null && other.getItemCompanyInfo()==null) || 
             (this.itemCompanyInfo!=null &&
              this.itemCompanyInfo.equals(other.getItemCompanyInfo()))) &&
            ((this.itemProductInfo==null && other.getItemProductInfo()==null) || 
             (this.itemProductInfo!=null &&
              this.itemProductInfo.equals(other.getItemProductInfo()))) &&
            ((this.itemVariants==null && other.getItemVariants()==null) || 
             (this.itemVariants!=null &&
              java.util.Arrays.equals(this.itemVariants, other.getItemVariants())));
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
        if (getItemListInfoExt() != null) {
            _hashCode += getItemListInfoExt().hashCode();
        }
        if (getItemCatPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemCatPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemCatPath(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemImgList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemImgList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemImgList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemAttribList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemAttribList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemAttribList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemPostageOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemPostageOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemPostageOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemPaymentOptions() != null) {
            _hashCode += getItemPaymentOptions().hashCode();
        }
        if (getItemCompanyInfo() != null) {
            _hashCode += getItemCompanyInfo().hashCode();
        }
        if (getItemProductInfo() != null) {
            _hashCode += getItemProductInfo().hashCode();
        }
        if (getItemVariants() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemVariants());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemVariants(), i);
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
        new org.apache.axis.description.TypeDesc(DoShowItemInfoExtResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doShowItemInfoExtResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemListInfoExt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "itemListInfoExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemInfoExt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCatPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "itemCatPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemCatList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemImgList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "itemImgList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemImageList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAttribList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "itemAttribList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "AttribStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPostageOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "itemPostageOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "PostageStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPaymentOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "itemPaymentOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemPaymentOptions"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCompanyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "itemCompanyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "CompanyInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemProductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "itemProductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "ProductStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemVariants");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "itemVariants"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemVariantStruct"));
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
