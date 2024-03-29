/**
 * DoFeedbackManyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoFeedbackManyResponse  implements java.io.Serializable {
    private SandboxWebApi.FeedbackResultStruct[] feResults;

    public DoFeedbackManyResponse() {
    }

    public DoFeedbackManyResponse(
           SandboxWebApi.FeedbackResultStruct[] feResults) {
           this.feResults = feResults;
    }


    /**
     * Gets the feResults value for this DoFeedbackManyResponse.
     * 
     * @return feResults
     */
    public SandboxWebApi.FeedbackResultStruct[] getFeResults() {
        return feResults;
    }


    /**
     * Sets the feResults value for this DoFeedbackManyResponse.
     * 
     * @param feResults
     */
    public void setFeResults(SandboxWebApi.FeedbackResultStruct[] feResults) {
        this.feResults = feResults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoFeedbackManyResponse)) return false;
        DoFeedbackManyResponse other = (DoFeedbackManyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feResults==null && other.getFeResults()==null) || 
             (this.feResults!=null &&
              java.util.Arrays.equals(this.feResults, other.getFeResults())));
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
        if (getFeResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeResults(), i);
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
        new org.apache.axis.description.TypeDesc(DoFeedbackManyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doFeedbackManyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "feResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "FeedbackResultStruct"));
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
