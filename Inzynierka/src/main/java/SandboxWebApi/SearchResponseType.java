/**
 * SearchResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class SearchResponseType  implements java.io.Serializable {
    private long sItId;

    private java.lang.String sItName;

    private float sItPrice;

    private float sItStartingPrice;

    private int sItIsBuyNow;

    private float sItBuyNowPrice;

    private int sItBidCount;

    private int sItFotoCount;

    private long sItStartingTime;

    private long sItEndingTime;

    private long sItTimeLeft;

    private java.lang.String sItCity;

    private int sItState;

    private int sItCountry;

    private int sItCategoryId;

    private int sItFeatured;

    private java.lang.String sItThumbUrl;

    private int sItThumb;

    private float sItPostage;

    private int sItIsForGuests;

    private int sItIsTablicaAdvert;

    private int sItIsAllegroStandard;

    private int sItHasFreeShipping;

    private int sItInstallmentsAvailable;

    private int sItOrderFulfillmentTime;

    private SandboxWebApi.AdvertInfoStruct sItAdvertInfo;

    private SandboxWebApi.SellerInfoStruct sItSellerInfo;

    private SandboxWebApi.AttribStruct[] sItAttribsList;

    private int sItFulfillmentTime;

    public SearchResponseType() {
    }

    public SearchResponseType(
           long sItId,
           java.lang.String sItName,
           float sItPrice,
           float sItStartingPrice,
           int sItIsBuyNow,
           float sItBuyNowPrice,
           int sItBidCount,
           int sItFotoCount,
           long sItStartingTime,
           long sItEndingTime,
           long sItTimeLeft,
           java.lang.String sItCity,
           int sItState,
           int sItCountry,
           int sItCategoryId,
           int sItFeatured,
           java.lang.String sItThumbUrl,
           int sItThumb,
           float sItPostage,
           int sItIsForGuests,
           int sItIsTablicaAdvert,
           int sItIsAllegroStandard,
           int sItHasFreeShipping,
           int sItInstallmentsAvailable,
           int sItOrderFulfillmentTime,
           SandboxWebApi.AdvertInfoStruct sItAdvertInfo,
           SandboxWebApi.SellerInfoStruct sItSellerInfo,
           SandboxWebApi.AttribStruct[] sItAttribsList,
           int sItFulfillmentTime) {
           this.sItId = sItId;
           this.sItName = sItName;
           this.sItPrice = sItPrice;
           this.sItStartingPrice = sItStartingPrice;
           this.sItIsBuyNow = sItIsBuyNow;
           this.sItBuyNowPrice = sItBuyNowPrice;
           this.sItBidCount = sItBidCount;
           this.sItFotoCount = sItFotoCount;
           this.sItStartingTime = sItStartingTime;
           this.sItEndingTime = sItEndingTime;
           this.sItTimeLeft = sItTimeLeft;
           this.sItCity = sItCity;
           this.sItState = sItState;
           this.sItCountry = sItCountry;
           this.sItCategoryId = sItCategoryId;
           this.sItFeatured = sItFeatured;
           this.sItThumbUrl = sItThumbUrl;
           this.sItThumb = sItThumb;
           this.sItPostage = sItPostage;
           this.sItIsForGuests = sItIsForGuests;
           this.sItIsTablicaAdvert = sItIsTablicaAdvert;
           this.sItIsAllegroStandard = sItIsAllegroStandard;
           this.sItHasFreeShipping = sItHasFreeShipping;
           this.sItInstallmentsAvailable = sItInstallmentsAvailable;
           this.sItOrderFulfillmentTime = sItOrderFulfillmentTime;
           this.sItAdvertInfo = sItAdvertInfo;
           this.sItSellerInfo = sItSellerInfo;
           this.sItAttribsList = sItAttribsList;
           this.sItFulfillmentTime = sItFulfillmentTime;
    }


    /**
     * Gets the sItId value for this SearchResponseType.
     * 
     * @return sItId
     */
    public long getSItId() {
        return sItId;
    }


    /**
     * Sets the sItId value for this SearchResponseType.
     * 
     * @param sItId
     */
    public void setSItId(long sItId) {
        this.sItId = sItId;
    }


    /**
     * Gets the sItName value for this SearchResponseType.
     * 
     * @return sItName
     */
    public java.lang.String getSItName() {
        return sItName;
    }


    /**
     * Sets the sItName value for this SearchResponseType.
     * 
     * @param sItName
     */
    public void setSItName(java.lang.String sItName) {
        this.sItName = sItName;
    }


    /**
     * Gets the sItPrice value for this SearchResponseType.
     * 
     * @return sItPrice
     */
    public float getSItPrice() {
        return sItPrice;
    }


    /**
     * Sets the sItPrice value for this SearchResponseType.
     * 
     * @param sItPrice
     */
    public void setSItPrice(float sItPrice) {
        this.sItPrice = sItPrice;
    }


    /**
     * Gets the sItStartingPrice value for this SearchResponseType.
     * 
     * @return sItStartingPrice
     */
    public float getSItStartingPrice() {
        return sItStartingPrice;
    }


    /**
     * Sets the sItStartingPrice value for this SearchResponseType.
     * 
     * @param sItStartingPrice
     */
    public void setSItStartingPrice(float sItStartingPrice) {
        this.sItStartingPrice = sItStartingPrice;
    }


    /**
     * Gets the sItIsBuyNow value for this SearchResponseType.
     * 
     * @return sItIsBuyNow
     */
    public int getSItIsBuyNow() {
        return sItIsBuyNow;
    }


    /**
     * Sets the sItIsBuyNow value for this SearchResponseType.
     * 
     * @param sItIsBuyNow
     */
    public void setSItIsBuyNow(int sItIsBuyNow) {
        this.sItIsBuyNow = sItIsBuyNow;
    }


    /**
     * Gets the sItBuyNowPrice value for this SearchResponseType.
     * 
     * @return sItBuyNowPrice
     */
    public float getSItBuyNowPrice() {
        return sItBuyNowPrice;
    }


    /**
     * Sets the sItBuyNowPrice value for this SearchResponseType.
     * 
     * @param sItBuyNowPrice
     */
    public void setSItBuyNowPrice(float sItBuyNowPrice) {
        this.sItBuyNowPrice = sItBuyNowPrice;
    }


    /**
     * Gets the sItBidCount value for this SearchResponseType.
     * 
     * @return sItBidCount
     */
    public int getSItBidCount() {
        return sItBidCount;
    }


    /**
     * Sets the sItBidCount value for this SearchResponseType.
     * 
     * @param sItBidCount
     */
    public void setSItBidCount(int sItBidCount) {
        this.sItBidCount = sItBidCount;
    }


    /**
     * Gets the sItFotoCount value for this SearchResponseType.
     * 
     * @return sItFotoCount
     */
    public int getSItFotoCount() {
        return sItFotoCount;
    }


    /**
     * Sets the sItFotoCount value for this SearchResponseType.
     * 
     * @param sItFotoCount
     */
    public void setSItFotoCount(int sItFotoCount) {
        this.sItFotoCount = sItFotoCount;
    }


    /**
     * Gets the sItStartingTime value for this SearchResponseType.
     * 
     * @return sItStartingTime
     */
    public long getSItStartingTime() {
        return sItStartingTime;
    }


    /**
     * Sets the sItStartingTime value for this SearchResponseType.
     * 
     * @param sItStartingTime
     */
    public void setSItStartingTime(long sItStartingTime) {
        this.sItStartingTime = sItStartingTime;
    }


    /**
     * Gets the sItEndingTime value for this SearchResponseType.
     * 
     * @return sItEndingTime
     */
    public long getSItEndingTime() {
        return sItEndingTime;
    }


    /**
     * Sets the sItEndingTime value for this SearchResponseType.
     * 
     * @param sItEndingTime
     */
    public void setSItEndingTime(long sItEndingTime) {
        this.sItEndingTime = sItEndingTime;
    }


    /**
     * Gets the sItTimeLeft value for this SearchResponseType.
     * 
     * @return sItTimeLeft
     */
    public long getSItTimeLeft() {
        return sItTimeLeft;
    }


    /**
     * Sets the sItTimeLeft value for this SearchResponseType.
     * 
     * @param sItTimeLeft
     */
    public void setSItTimeLeft(long sItTimeLeft) {
        this.sItTimeLeft = sItTimeLeft;
    }


    /**
     * Gets the sItCity value for this SearchResponseType.
     * 
     * @return sItCity
     */
    public java.lang.String getSItCity() {
        return sItCity;
    }


    /**
     * Sets the sItCity value for this SearchResponseType.
     * 
     * @param sItCity
     */
    public void setSItCity(java.lang.String sItCity) {
        this.sItCity = sItCity;
    }


    /**
     * Gets the sItState value for this SearchResponseType.
     * 
     * @return sItState
     */
    public int getSItState() {
        return sItState;
    }


    /**
     * Sets the sItState value for this SearchResponseType.
     * 
     * @param sItState
     */
    public void setSItState(int sItState) {
        this.sItState = sItState;
    }


    /**
     * Gets the sItCountry value for this SearchResponseType.
     * 
     * @return sItCountry
     */
    public int getSItCountry() {
        return sItCountry;
    }


    /**
     * Sets the sItCountry value for this SearchResponseType.
     * 
     * @param sItCountry
     */
    public void setSItCountry(int sItCountry) {
        this.sItCountry = sItCountry;
    }


    /**
     * Gets the sItCategoryId value for this SearchResponseType.
     * 
     * @return sItCategoryId
     */
    public int getSItCategoryId() {
        return sItCategoryId;
    }


    /**
     * Sets the sItCategoryId value for this SearchResponseType.
     * 
     * @param sItCategoryId
     */
    public void setSItCategoryId(int sItCategoryId) {
        this.sItCategoryId = sItCategoryId;
    }


    /**
     * Gets the sItFeatured value for this SearchResponseType.
     * 
     * @return sItFeatured
     */
    public int getSItFeatured() {
        return sItFeatured;
    }


    /**
     * Sets the sItFeatured value for this SearchResponseType.
     * 
     * @param sItFeatured
     */
    public void setSItFeatured(int sItFeatured) {
        this.sItFeatured = sItFeatured;
    }


    /**
     * Gets the sItThumbUrl value for this SearchResponseType.
     * 
     * @return sItThumbUrl
     */
    public java.lang.String getSItThumbUrl() {
        return sItThumbUrl;
    }


    /**
     * Sets the sItThumbUrl value for this SearchResponseType.
     * 
     * @param sItThumbUrl
     */
    public void setSItThumbUrl(java.lang.String sItThumbUrl) {
        this.sItThumbUrl = sItThumbUrl;
    }


    /**
     * Gets the sItThumb value for this SearchResponseType.
     * 
     * @return sItThumb
     */
    public int getSItThumb() {
        return sItThumb;
    }


    /**
     * Sets the sItThumb value for this SearchResponseType.
     * 
     * @param sItThumb
     */
    public void setSItThumb(int sItThumb) {
        this.sItThumb = sItThumb;
    }


    /**
     * Gets the sItPostage value for this SearchResponseType.
     * 
     * @return sItPostage
     */
    public float getSItPostage() {
        return sItPostage;
    }


    /**
     * Sets the sItPostage value for this SearchResponseType.
     * 
     * @param sItPostage
     */
    public void setSItPostage(float sItPostage) {
        this.sItPostage = sItPostage;
    }


    /**
     * Gets the sItIsForGuests value for this SearchResponseType.
     * 
     * @return sItIsForGuests
     */
    public int getSItIsForGuests() {
        return sItIsForGuests;
    }


    /**
     * Sets the sItIsForGuests value for this SearchResponseType.
     * 
     * @param sItIsForGuests
     */
    public void setSItIsForGuests(int sItIsForGuests) {
        this.sItIsForGuests = sItIsForGuests;
    }


    /**
     * Gets the sItIsTablicaAdvert value for this SearchResponseType.
     * 
     * @return sItIsTablicaAdvert
     */
    public int getSItIsTablicaAdvert() {
        return sItIsTablicaAdvert;
    }


    /**
     * Sets the sItIsTablicaAdvert value for this SearchResponseType.
     * 
     * @param sItIsTablicaAdvert
     */
    public void setSItIsTablicaAdvert(int sItIsTablicaAdvert) {
        this.sItIsTablicaAdvert = sItIsTablicaAdvert;
    }


    /**
     * Gets the sItIsAllegroStandard value for this SearchResponseType.
     * 
     * @return sItIsAllegroStandard
     */
    public int getSItIsAllegroStandard() {
        return sItIsAllegroStandard;
    }


    /**
     * Sets the sItIsAllegroStandard value for this SearchResponseType.
     * 
     * @param sItIsAllegroStandard
     */
    public void setSItIsAllegroStandard(int sItIsAllegroStandard) {
        this.sItIsAllegroStandard = sItIsAllegroStandard;
    }


    /**
     * Gets the sItHasFreeShipping value for this SearchResponseType.
     * 
     * @return sItHasFreeShipping
     */
    public int getSItHasFreeShipping() {
        return sItHasFreeShipping;
    }


    /**
     * Sets the sItHasFreeShipping value for this SearchResponseType.
     * 
     * @param sItHasFreeShipping
     */
    public void setSItHasFreeShipping(int sItHasFreeShipping) {
        this.sItHasFreeShipping = sItHasFreeShipping;
    }


    /**
     * Gets the sItInstallmentsAvailable value for this SearchResponseType.
     * 
     * @return sItInstallmentsAvailable
     */
    public int getSItInstallmentsAvailable() {
        return sItInstallmentsAvailable;
    }


    /**
     * Sets the sItInstallmentsAvailable value for this SearchResponseType.
     * 
     * @param sItInstallmentsAvailable
     */
    public void setSItInstallmentsAvailable(int sItInstallmentsAvailable) {
        this.sItInstallmentsAvailable = sItInstallmentsAvailable;
    }


    /**
     * Gets the sItOrderFulfillmentTime value for this SearchResponseType.
     * 
     * @return sItOrderFulfillmentTime
     */
    public int getSItOrderFulfillmentTime() {
        return sItOrderFulfillmentTime;
    }


    /**
     * Sets the sItOrderFulfillmentTime value for this SearchResponseType.
     * 
     * @param sItOrderFulfillmentTime
     */
    public void setSItOrderFulfillmentTime(int sItOrderFulfillmentTime) {
        this.sItOrderFulfillmentTime = sItOrderFulfillmentTime;
    }


    /**
     * Gets the sItAdvertInfo value for this SearchResponseType.
     * 
     * @return sItAdvertInfo
     */
    public SandboxWebApi.AdvertInfoStruct getSItAdvertInfo() {
        return sItAdvertInfo;
    }


    /**
     * Sets the sItAdvertInfo value for this SearchResponseType.
     * 
     * @param sItAdvertInfo
     */
    public void setSItAdvertInfo(SandboxWebApi.AdvertInfoStruct sItAdvertInfo) {
        this.sItAdvertInfo = sItAdvertInfo;
    }


    /**
     * Gets the sItSellerInfo value for this SearchResponseType.
     * 
     * @return sItSellerInfo
     */
    public SandboxWebApi.SellerInfoStruct getSItSellerInfo() {
        return sItSellerInfo;
    }


    /**
     * Sets the sItSellerInfo value for this SearchResponseType.
     * 
     * @param sItSellerInfo
     */
    public void setSItSellerInfo(SandboxWebApi.SellerInfoStruct sItSellerInfo) {
        this.sItSellerInfo = sItSellerInfo;
    }


    /**
     * Gets the sItAttribsList value for this SearchResponseType.
     * 
     * @return sItAttribsList
     */
    public SandboxWebApi.AttribStruct[] getSItAttribsList() {
        return sItAttribsList;
    }


    /**
     * Sets the sItAttribsList value for this SearchResponseType.
     * 
     * @param sItAttribsList
     */
    public void setSItAttribsList(SandboxWebApi.AttribStruct[] sItAttribsList) {
        this.sItAttribsList = sItAttribsList;
    }


    /**
     * Gets the sItFulfillmentTime value for this SearchResponseType.
     * 
     * @return sItFulfillmentTime
     */
    public int getSItFulfillmentTime() {
        return sItFulfillmentTime;
    }


    /**
     * Sets the sItFulfillmentTime value for this SearchResponseType.
     * 
     * @param sItFulfillmentTime
     */
    public void setSItFulfillmentTime(int sItFulfillmentTime) {
        this.sItFulfillmentTime = sItFulfillmentTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchResponseType)) return false;
        SearchResponseType other = (SearchResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sItId == other.getSItId() &&
            ((this.sItName==null && other.getSItName()==null) || 
             (this.sItName!=null &&
              this.sItName.equals(other.getSItName()))) &&
            this.sItPrice == other.getSItPrice() &&
            this.sItStartingPrice == other.getSItStartingPrice() &&
            this.sItIsBuyNow == other.getSItIsBuyNow() &&
            this.sItBuyNowPrice == other.getSItBuyNowPrice() &&
            this.sItBidCount == other.getSItBidCount() &&
            this.sItFotoCount == other.getSItFotoCount() &&
            this.sItStartingTime == other.getSItStartingTime() &&
            this.sItEndingTime == other.getSItEndingTime() &&
            this.sItTimeLeft == other.getSItTimeLeft() &&
            ((this.sItCity==null && other.getSItCity()==null) || 
             (this.sItCity!=null &&
              this.sItCity.equals(other.getSItCity()))) &&
            this.sItState == other.getSItState() &&
            this.sItCountry == other.getSItCountry() &&
            this.sItCategoryId == other.getSItCategoryId() &&
            this.sItFeatured == other.getSItFeatured() &&
            ((this.sItThumbUrl==null && other.getSItThumbUrl()==null) || 
             (this.sItThumbUrl!=null &&
              this.sItThumbUrl.equals(other.getSItThumbUrl()))) &&
            this.sItThumb == other.getSItThumb() &&
            this.sItPostage == other.getSItPostage() &&
            this.sItIsForGuests == other.getSItIsForGuests() &&
            this.sItIsTablicaAdvert == other.getSItIsTablicaAdvert() &&
            this.sItIsAllegroStandard == other.getSItIsAllegroStandard() &&
            this.sItHasFreeShipping == other.getSItHasFreeShipping() &&
            this.sItInstallmentsAvailable == other.getSItInstallmentsAvailable() &&
            this.sItOrderFulfillmentTime == other.getSItOrderFulfillmentTime() &&
            ((this.sItAdvertInfo==null && other.getSItAdvertInfo()==null) || 
             (this.sItAdvertInfo!=null &&
              this.sItAdvertInfo.equals(other.getSItAdvertInfo()))) &&
            ((this.sItSellerInfo==null && other.getSItSellerInfo()==null) || 
             (this.sItSellerInfo!=null &&
              this.sItSellerInfo.equals(other.getSItSellerInfo()))) &&
            ((this.sItAttribsList==null && other.getSItAttribsList()==null) || 
             (this.sItAttribsList!=null &&
              java.util.Arrays.equals(this.sItAttribsList, other.getSItAttribsList()))) &&
            this.sItFulfillmentTime == other.getSItFulfillmentTime();
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
        _hashCode += new Long(getSItId()).hashCode();
        if (getSItName() != null) {
            _hashCode += getSItName().hashCode();
        }
        _hashCode += new Float(getSItPrice()).hashCode();
        _hashCode += new Float(getSItStartingPrice()).hashCode();
        _hashCode += getSItIsBuyNow();
        _hashCode += new Float(getSItBuyNowPrice()).hashCode();
        _hashCode += getSItBidCount();
        _hashCode += getSItFotoCount();
        _hashCode += new Long(getSItStartingTime()).hashCode();
        _hashCode += new Long(getSItEndingTime()).hashCode();
        _hashCode += new Long(getSItTimeLeft()).hashCode();
        if (getSItCity() != null) {
            _hashCode += getSItCity().hashCode();
        }
        _hashCode += getSItState();
        _hashCode += getSItCountry();
        _hashCode += getSItCategoryId();
        _hashCode += getSItFeatured();
        if (getSItThumbUrl() != null) {
            _hashCode += getSItThumbUrl().hashCode();
        }
        _hashCode += getSItThumb();
        _hashCode += new Float(getSItPostage()).hashCode();
        _hashCode += getSItIsForGuests();
        _hashCode += getSItIsTablicaAdvert();
        _hashCode += getSItIsAllegroStandard();
        _hashCode += getSItHasFreeShipping();
        _hashCode += getSItInstallmentsAvailable();
        _hashCode += getSItOrderFulfillmentTime();
        if (getSItAdvertInfo() != null) {
            _hashCode += getSItAdvertInfo().hashCode();
        }
        if (getSItSellerInfo() != null) {
            _hashCode += getSItSellerInfo().hashCode();
        }
        if (getSItAttribsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSItAttribsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSItAttribsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getSItFulfillmentTime();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "SearchResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItStartingPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItStartingPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItIsBuyNow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItIsBuyNow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItBuyNowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItBuyNowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItBidCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItBidCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItFotoCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItFotoCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItStartingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItStartingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItEndingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItEndingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItTimeLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItTimeLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItFeatured");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItFeatured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItThumbUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItThumbUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItThumb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItThumb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItPostage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItPostage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItIsForGuests");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItIsForGuests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItIsTablicaAdvert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItIsTablicaAdvert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItIsAllegroStandard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItIsAllegroStandard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItHasFreeShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItHasFreeShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItInstallmentsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItInstallmentsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItOrderFulfillmentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItOrderFulfillmentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItAdvertInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItAdvertInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "AdvertInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItSellerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItSellerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "SellerInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItAttribsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItAttribsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "AttribStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SItFulfillmentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sItFulfillmentTime"));
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
