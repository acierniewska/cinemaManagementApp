/**
 * DoGetServiceInfoCategoriesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoGetServiceInfoCategoriesResponse  implements java.io.Serializable {
    private SandboxWebApi.ServiceInfoCatStruct[] serviceInfoCatsList;

    public DoGetServiceInfoCategoriesResponse() {
    }

    public DoGetServiceInfoCategoriesResponse(
           SandboxWebApi.ServiceInfoCatStruct[] serviceInfoCatsList) {
           this.serviceInfoCatsList = serviceInfoCatsList;
    }


    /**
     * Gets the serviceInfoCatsList value for this DoGetServiceInfoCategoriesResponse.
     * 
     * @return serviceInfoCatsList
     */
    public SandboxWebApi.ServiceInfoCatStruct[] getServiceInfoCatsList() {
        return serviceInfoCatsList;
    }


    /**
     * Sets the serviceInfoCatsList value for this DoGetServiceInfoCategoriesResponse.
     * 
     * @param serviceInfoCatsList
     */
    public void setServiceInfoCatsList(SandboxWebApi.ServiceInfoCatStruct[] serviceInfoCatsList) {
        this.serviceInfoCatsList = serviceInfoCatsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetServiceInfoCategoriesResponse)) return false;
        DoGetServiceInfoCategoriesResponse other = (DoGetServiceInfoCategoriesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceInfoCatsList==null && other.getServiceInfoCatsList()==null) || 
             (this.serviceInfoCatsList!=null &&
              java.util.Arrays.equals(this.serviceInfoCatsList, other.getServiceInfoCatsList())));
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
        if (getServiceInfoCatsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceInfoCatsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceInfoCatsList(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetServiceInfoCategoriesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetServiceInfoCategoriesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceInfoCatsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "serviceInfoCatsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "ServiceInfoCatStruct"));
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
