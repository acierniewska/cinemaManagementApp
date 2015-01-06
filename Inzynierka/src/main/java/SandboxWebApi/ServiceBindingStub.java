/**
 * ServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class ServiceBindingStub extends org.apache.axis.client.Stub implements SandboxWebApi.ServicePort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[130];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddDescToItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoAddDescToItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoAddDescToItemsRequest"), SandboxWebApi.DoAddDescToItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doAddDescToItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoAddDescToItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doAddDescToItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddPackageInfoToPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoAddPackageInfoToPostBuyFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoAddPackageInfoToPostBuyFormRequest"), SandboxWebApi.DoAddPackageInfoToPostBuyFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doAddPackageInfoToPostBuyFormResponse"));
        oper.setReturnClass(SandboxWebApi.DoAddPackageInfoToPostBuyFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doAddPackageInfoToPostBuyFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoAddToBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoAddToBlackListRequest"), SandboxWebApi.DoAddToBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doAddToBlackListResponse"));
        oper.setReturnClass(SandboxWebApi.DoAddToBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doAddToBlackListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoAddToWatchListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoAddToWatchListRequest"), SandboxWebApi.DoAddToWatchListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doAddToWatchListResponse"));
        oper.setReturnClass(SandboxWebApi.DoAddToWatchListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doAddToWatchListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoBidItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoBidItemRequest"), SandboxWebApi.DoBidItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doBidItemResponse"));
        oper.setReturnClass(SandboxWebApi.DoBidItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doBidItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoCancelBidItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCancelBidItemRequest"), SandboxWebApi.DoCancelBidItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCancelBidItemResponse"));
        oper.setReturnClass(SandboxWebApi.DoCancelBidItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doCancelBidItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoCancelRefundFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCancelRefundFormRequest"), SandboxWebApi.DoCancelRefundFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCancelRefundFormResponse"));
        oper.setReturnClass(SandboxWebApi.DoCancelRefundFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doCancelRefundFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundWarning");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoCancelRefundWarningRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCancelRefundWarningRequest"), SandboxWebApi.DoCancelRefundWarningRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCancelRefundWarningResponse"));
        oper.setReturnClass(SandboxWebApi.DoCancelRefundWarningResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doCancelRefundWarningResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoCancelTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCancelTransactionRequest"), SandboxWebApi.DoCancelTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCancelTransactionResponse"));
        oper.setReturnClass(SandboxWebApi.DoCancelTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doCancelTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoChangeItemFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoChangeItemFieldsRequest"), SandboxWebApi.DoChangeItemFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doChangeItemFieldsResponse"));
        oper.setReturnClass(SandboxWebApi.DoChangeItemFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doChangeItemFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangePriceItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoChangePriceItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoChangePriceItemRequest"), SandboxWebApi.DoChangePriceItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doChangePriceItemResponse"));
        oper.setReturnClass(SandboxWebApi.DoChangePriceItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doChangePriceItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeQuantityItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoChangeQuantityItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoChangeQuantityItemRequest"), SandboxWebApi.DoChangeQuantityItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doChangeQuantityItemResponse"));
        oper.setReturnClass(SandboxWebApi.DoChangeQuantityItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doChangeQuantityItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckItemDescription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoCheckItemDescriptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCheckItemDescriptionRequest"), SandboxWebApi.DoCheckItemDescriptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCheckItemDescriptionResponse"));
        oper.setReturnClass(SandboxWebApi.DoCheckItemDescriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doCheckItemDescriptionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoCheckNewAuctionExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCheckNewAuctionExtRequest"), SandboxWebApi.DoCheckNewAuctionExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCheckNewAuctionExtResponse"));
        oper.setReturnClass(SandboxWebApi.DoCheckNewAuctionExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doCheckNewAuctionExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCreateItemTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoCreateItemTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCreateItemTemplateRequest"), SandboxWebApi.DoCreateItemTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCreateItemTemplateResponse"));
        oper.setReturnClass(SandboxWebApi.DoCreateItemTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doCreateItemTemplateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoFeedbackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoFeedbackRequest"), SandboxWebApi.DoFeedbackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doFeedbackResponse"));
        oper.setReturnClass(SandboxWebApi.DoFeedbackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doFeedbackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedbackMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoFeedbackManyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoFeedbackManyRequest"), SandboxWebApi.DoFeedbackManyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doFeedbackManyResponse"));
        oper.setReturnClass(SandboxWebApi.DoFeedbackManyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doFeedbackManyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoFinishItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoFinishItemRequest"), SandboxWebApi.DoFinishItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doFinishItemResponse"));
        oper.setReturnClass(SandboxWebApi.DoFinishItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doFinishItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoFinishItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoFinishItemsRequest"), SandboxWebApi.DoFinishItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doFinishItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoFinishItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doFinishItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetAdminUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetAdminUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetAdminUserLicenceDateRequest"), SandboxWebApi.DoGetAdminUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetAdminUserLicenceDateResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetAdminUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetAdminUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetArchiveRefundsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetArchiveRefundsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetArchiveRefundsListRequest"), SandboxWebApi.DoGetArchiveRefundsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetArchiveRefundsListResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetArchiveRefundsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetArchiveRefundsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBidItem2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetBidItem2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetBidItem2Request"), SandboxWebApi.DoGetBidItem2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetBidItem2Response"));
        oper.setReturnClass(SandboxWebApi.DoGetBidItem2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetBidItem2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBlackListUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetBlackListUsersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetBlackListUsersRequest"), SandboxWebApi.DoGetBlackListUsersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetBlackListUsersResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetBlackListUsersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetBlackListUsersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCategoryPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetCategoryPathRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetCategoryPathRequest"), SandboxWebApi.DoGetCategoryPathRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetCategoryPathResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetCategoryPathResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetCategoryPathResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetCatsDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetCatsDataRequest"), SandboxWebApi.DoGetCatsDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetCatsDataResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetCatsDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetCatsDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetCatsDataCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetCatsDataCountRequest"), SandboxWebApi.DoGetCatsDataCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetCatsDataCountResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetCatsDataCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetCatsDataCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetCatsDataLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetCatsDataLimitRequest"), SandboxWebApi.DoGetCatsDataLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetCatsDataLimitResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetCatsDataLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetCatsDataLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCountries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetCountriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetCountriesRequest"), SandboxWebApi.DoGetCountriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetCountriesResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetCountriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetCountriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetDealsRequest"), SandboxWebApi.DoGetDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetDealsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetFavouriteCategoriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetFavouriteCategoriesRequest"), SandboxWebApi.DoGetFavouriteCategoriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetFavouriteCategoriesResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetFavouriteCategoriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetFavouriteCategoriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetFavouriteSellersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetFavouriteSellersRequest"), SandboxWebApi.DoGetFavouriteSellersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetFavouriteSellersResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetFavouriteSellersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetFavouriteSellersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetFeedbackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetFeedbackRequest"), SandboxWebApi.DoGetFeedbackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetFeedbackResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetFeedbackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetFeedbackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFilledPostBuyForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetFilledPostBuyFormsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetFilledPostBuyFormsRequest"), SandboxWebApi.DoGetFilledPostBuyFormsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetFilledPostBuyFormsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetFilledPostBuyFormsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetFilledPostBuyFormsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFreeDeliveryAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetFreeDeliveryAmountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetFreeDeliveryAmountRequest"), SandboxWebApi.DoGetFreeDeliveryAmountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetFreeDeliveryAmountResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetFreeDeliveryAmountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetFreeDeliveryAmountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetItemFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetItemFieldsRequest"), SandboxWebApi.DoGetItemFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetItemFieldsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetItemFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetItemFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetItemTemplatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetItemTemplatesRequest"), SandboxWebApi.DoGetItemTemplatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetItemTemplatesResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetItemTemplatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetItemTemplatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetItemsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetItemsInfoRequest"), SandboxWebApi.DoGetItemsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetItemsInfoResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetItemsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetItemsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetItemsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetItemsListRequest"), SandboxWebApi.DoGetItemsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetItemsListResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetItemsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetItemsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMessageToBuyer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMessageToBuyerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMessageToBuyerRequest"), SandboxWebApi.DoGetMessageToBuyerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMessageToBuyerResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMessageToBuyerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMessageToBuyerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyAddressesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyAddressesRequest"), SandboxWebApi.DoGetMyAddressesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyAddressesResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyAddressesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyAddressesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyBidItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyBidItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyBidItemsRequest"), SandboxWebApi.DoGetMyBidItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyBidItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyBidItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyBidItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyCurrentShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyCurrentShipmentPriceTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyCurrentShipmentPriceTypeRequest"), SandboxWebApi.DoGetMyCurrentShipmentPriceTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyCurrentShipmentPriceTypeResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyCurrentShipmentPriceTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyCurrentShipmentPriceTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyDataRequest"), SandboxWebApi.DoGetMyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyDataResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyFutureItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyFutureItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyFutureItemsRequest"), SandboxWebApi.DoGetMyFutureItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyFutureItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyFutureItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyFutureItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyIncomingPaymentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyIncomingPaymentsRequest"), SandboxWebApi.DoGetMyIncomingPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyIncomingPaymentsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyIncomingPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyIncomingPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyIncomingPaymentsRefundsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyIncomingPaymentsRefundsRequest"), SandboxWebApi.DoGetMyIncomingPaymentsRefundsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyIncomingPaymentsRefundsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyIncomingPaymentsRefundsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyIncomingPaymentsRefundsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotSoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyNotSoldItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyNotSoldItemsRequest"), SandboxWebApi.DoGetMyNotSoldItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyNotSoldItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyNotSoldItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyNotSoldItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyNotWonItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyNotWonItemsRequest"), SandboxWebApi.DoGetMyNotWonItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyNotWonItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyNotWonItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyNotWonItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyPaymentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyPaymentsRequest"), SandboxWebApi.DoGetMyPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyPaymentsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyPaymentsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyPaymentsInfoRequest"), SandboxWebApi.DoGetMyPaymentsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyPaymentsInfoResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyPaymentsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyPaymentsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyPaymentsRefundsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyPaymentsRefundsRequest"), SandboxWebApi.DoGetMyPaymentsRefundsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyPaymentsRefundsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyPaymentsRefundsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyPaymentsRefundsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyPayoutsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyPayoutsRequest"), SandboxWebApi.DoGetMyPayoutsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyPayoutsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyPayoutsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyPayoutsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMySellItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMySellItemsRequest"), SandboxWebApi.DoGetMySellItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMySellItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMySellItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMySellItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellRating");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMySellRatingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMySellRatingRequest"), SandboxWebApi.DoGetMySellRatingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMySellRatingResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMySellRatingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMySellRatingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMySoldItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMySoldItemsRequest"), SandboxWebApi.DoGetMySoldItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMySoldItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMySoldItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMySoldItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWatchItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyWatchItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyWatchItemsRequest"), SandboxWebApi.DoGetMyWatchItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyWatchItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyWatchItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyWatchItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWatchedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyWatchedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyWatchedItemsRequest"), SandboxWebApi.DoGetMyWatchedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyWatchedItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyWatchedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyWatchedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetMyWonItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyWonItemsRequest"), SandboxWebApi.DoGetMyWonItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyWonItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetMyWonItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetMyWonItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetPaymentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPaymentDataRequest"), SandboxWebApi.DoGetPaymentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPaymentDataResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetPaymentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetPaymentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetPaymentMethodsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPaymentMethodsRequest"), SandboxWebApi.DoGetPaymentMethodsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPaymentMethodsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetPaymentMethodsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetPaymentMethodsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetPostBuyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPostBuyDataRequest"), SandboxWebApi.DoGetPostBuyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPostBuyDataResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetPostBuyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetPostBuyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForBuyers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetPostBuyFormsDataForBuyersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPostBuyFormsDataForBuyersRequest"), SandboxWebApi.DoGetPostBuyFormsDataForBuyersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPostBuyFormsDataForBuyersResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetPostBuyFormsDataForBuyersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetPostBuyFormsDataForBuyersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetPostBuyFormsDataForSellersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPostBuyFormsDataForSellersRequest"), SandboxWebApi.DoGetPostBuyFormsDataForSellersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPostBuyFormsDataForSellersResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetPostBuyFormsDataForSellersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetPostBuyFormsDataForSellersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetPostBuyFormsIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPostBuyFormsIdsRequest"), SandboxWebApi.DoGetPostBuyFormsIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPostBuyFormsIdsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetPostBuyFormsIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetPostBuyFormsIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyItemInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetPostBuyItemInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPostBuyItemInfoRequest"), SandboxWebApi.DoGetPostBuyItemInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPostBuyItemInfoResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetPostBuyItemInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetPostBuyItemInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetRefundsDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetRefundsDealsRequest"), SandboxWebApi.DoGetRefundsDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetRefundsDealsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetRefundsDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetRefundsDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetRefundsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetRefundsListRequest"), SandboxWebApi.DoGetRefundsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetRefundsListResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetRefundsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetRefundsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetRefundsReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetRefundsReasonsRequest"), SandboxWebApi.DoGetRefundsReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetRefundsReasonsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetRefundsReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetRefundsReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetRelatedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetRelatedItemsRequest"), SandboxWebApi.DoGetRelatedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetRelatedItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetRelatedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetRelatedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormAttribs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSellFormAttribsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSellFormAttribsRequest"), SandboxWebApi.DoGetSellFormAttribsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSellFormAttribsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSellFormAttribsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSellFormAttribsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSellFormFieldsExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSellFormFieldsExtRequest"), SandboxWebApi.DoGetSellFormFieldsExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSellFormFieldsExtResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSellFormFieldsExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSellFormFieldsExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExtLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSellFormFieldsExtLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSellFormFieldsExtLimitRequest"), SandboxWebApi.DoGetSellFormFieldsExtLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSellFormFieldsExtLimitResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSellFormFieldsExtLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSellFormFieldsExtLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsForCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSellFormFieldsForCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSellFormFieldsForCategoryRequest"), SandboxWebApi.DoGetSellFormFieldsForCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSellFormFieldsForCategoryResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSellFormFieldsForCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSellFormFieldsForCategoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellRatingReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSellRatingReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSellRatingReasonsRequest"), SandboxWebApi.DoGetSellRatingReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSellRatingReasonsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSellRatingReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSellRatingReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetServiceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetServiceInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetServiceInfoRequest"), SandboxWebApi.DoGetServiceInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetServiceInfoResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetServiceInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetServiceInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetServiceInfoCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetServiceInfoCategoriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetServiceInfoCategoriesRequest"), SandboxWebApi.DoGetServiceInfoCategoriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetServiceInfoCategoriesResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetServiceInfoCategoriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetServiceInfoCategoriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetServiceTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetServiceTemplatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetServiceTemplatesRequest"), SandboxWebApi.DoGetServiceTemplatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetServiceTemplatesResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetServiceTemplatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetServiceTemplatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetShipmentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetShipmentDataRequest"), SandboxWebApi.DoGetShipmentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetShipmentDataResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetShipmentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetShipmentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentDataForRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetShipmentDataForRelatedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetShipmentDataForRelatedItemsRequest"), SandboxWebApi.DoGetShipmentDataForRelatedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetShipmentDataForRelatedItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetShipmentDataForRelatedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetShipmentDataForRelatedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentPriceTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetShipmentPriceTypesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetShipmentPriceTypesRequest"), SandboxWebApi.DoGetShipmentPriceTypesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetShipmentPriceTypesResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetShipmentPriceTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetShipmentPriceTypesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShopCatsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetShopCatsDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetShopCatsDataRequest"), SandboxWebApi.DoGetShopCatsDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetShopCatsDataResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetShopCatsDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetShopCatsDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSiteJournalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSiteJournalRequest"), SandboxWebApi.DoGetSiteJournalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSiteJournalResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSiteJournalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSiteJournalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSiteJournalDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSiteJournalDealsRequest"), SandboxWebApi.DoGetSiteJournalDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSiteJournalDealsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSiteJournalDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSiteJournalDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDealsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSiteJournalDealsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSiteJournalDealsInfoRequest"), SandboxWebApi.DoGetSiteJournalDealsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSiteJournalDealsInfoResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSiteJournalDealsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSiteJournalDealsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSiteJournalInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSiteJournalInfoRequest"), SandboxWebApi.DoGetSiteJournalInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSiteJournalInfoResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSiteJournalInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSiteJournalInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSitesFlagInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSitesFlagInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSitesFlagInfoRequest"), SandboxWebApi.DoGetSitesFlagInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSitesFlagInfoResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSitesFlagInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSitesFlagInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSitesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSitesInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSitesInfoRequest"), SandboxWebApi.DoGetSitesInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSitesInfoResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSitesInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSitesInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSpecialItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSpecialItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSpecialItemsRequest"), SandboxWebApi.DoGetSpecialItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSpecialItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSpecialItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSpecialItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetStatesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetStatesInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetStatesInfoRequest"), SandboxWebApi.DoGetStatesInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetStatesInfoResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetStatesInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetStatesInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSystemTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetSystemTimeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSystemTimeRequest"), SandboxWebApi.DoGetSystemTimeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSystemTimeResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetSystemTimeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetSystemTimeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetTransactionsIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetTransactionsIDsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetTransactionsIDsRequest"), SandboxWebApi.DoGetTransactionsIDsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetTransactionsIDsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetTransactionsIDsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetTransactionsIDsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetUserIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetUserIDRequest"), SandboxWebApi.DoGetUserIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetUserIDResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetUserIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetUserIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetUserItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetUserItemsRequest"), SandboxWebApi.DoGetUserItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetUserItemsResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetUserItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetUserItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetUserLicenceDateRequest"), SandboxWebApi.DoGetUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetUserLicenceDateResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetUserLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetUserLoginRequest"), SandboxWebApi.DoGetUserLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetUserLoginResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetUserLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetUserLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetWaitingFeedbacksRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetWaitingFeedbacksRequest"), SandboxWebApi.DoGetWaitingFeedbacksRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetWaitingFeedbacksResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetWaitingFeedbacksResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetWaitingFeedbacksResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacksCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoGetWaitingFeedbacksCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetWaitingFeedbacksCountRequest"), SandboxWebApi.DoGetWaitingFeedbacksCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetWaitingFeedbacksCountResponse"));
        oper.setReturnClass(SandboxWebApi.DoGetWaitingFeedbacksCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doGetWaitingFeedbacksCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoLoginRequest"), SandboxWebApi.DoLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doLoginResponse"));
        oper.setReturnClass(SandboxWebApi.DoLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginEnc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoLoginEncRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoLoginEncRequest"), SandboxWebApi.DoLoginEncRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doLoginEncResponse"));
        oper.setReturnClass(SandboxWebApi.DoLoginEncResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doLoginEncResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginWithAccessToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoLoginWithAccessTokenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoLoginWithAccessTokenRequest"), SandboxWebApi.DoLoginWithAccessTokenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doLoginWithAccessTokenResponse"));
        oper.setReturnClass(SandboxWebApi.DoLoginWithAccessTokenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doLoginWithAccessTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccount2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoMyAccount2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyAccount2Request"), SandboxWebApi.DoMyAccount2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyAccount2Response"));
        oper.setReturnClass(SandboxWebApi.DoMyAccount2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doMyAccount2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccountItemsCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoMyAccountItemsCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyAccountItemsCountRequest"), SandboxWebApi.DoMyAccountItemsCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyAccountItemsCountResponse"));
        oper.setReturnClass(SandboxWebApi.DoMyAccountItemsCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doMyAccountItemsCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBilling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoMyBillingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyBillingRequest"), SandboxWebApi.DoMyBillingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyBillingResponse"));
        oper.setReturnClass(SandboxWebApi.DoMyBillingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doMyBillingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBillingItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoMyBillingItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyBillingItemRequest"), SandboxWebApi.DoMyBillingItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyBillingItemResponse"));
        oper.setReturnClass(SandboxWebApi.DoMyBillingItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doMyBillingItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoMyContactRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyContactRequest"), SandboxWebApi.DoMyContactRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyContactResponse"));
        oper.setReturnClass(SandboxWebApi.DoMyContactResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doMyContactResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoMyFeedback2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyFeedback2Request"), SandboxWebApi.DoMyFeedback2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyFeedback2Response"));
        oper.setReturnClass(SandboxWebApi.DoMyFeedback2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doMyFeedback2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2Limit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoMyFeedback2LimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyFeedback2LimitRequest"), SandboxWebApi.DoMyFeedback2LimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyFeedback2LimitResponse"));
        oper.setReturnClass(SandboxWebApi.DoMyFeedback2LimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doMyFeedback2LimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoNewAuctionExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoNewAuctionExtRequest"), SandboxWebApi.DoNewAuctionExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doNewAuctionExtResponse"));
        oper.setReturnClass(SandboxWebApi.DoNewAuctionExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doNewAuctionExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQueryAllSysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoQueryAllSysStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoQueryAllSysStatusRequest"), SandboxWebApi.DoQueryAllSysStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doQueryAllSysStatusResponse"));
        oper.setReturnClass(SandboxWebApi.DoQueryAllSysStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doQueryAllSysStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQuerySysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoQuerySysStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoQuerySysStatusRequest"), SandboxWebApi.DoQuerySysStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doQuerySysStatusResponse"));
        oper.setReturnClass(SandboxWebApi.DoQuerySysStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doQuerySysStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoRemoveFromBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoRemoveFromBlackListRequest"), SandboxWebApi.DoRemoveFromBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doRemoveFromBlackListResponse"));
        oper.setReturnClass(SandboxWebApi.DoRemoveFromBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doRemoveFromBlackListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoRemoveFromWatchListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoRemoveFromWatchListRequest"), SandboxWebApi.DoRemoveFromWatchListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doRemoveFromWatchListResponse"));
        oper.setReturnClass(SandboxWebApi.DoRemoveFromWatchListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doRemoveFromWatchListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoRemoveItemTemplatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoRemoveItemTemplatesRequest"), SandboxWebApi.DoRemoveItemTemplatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doRemoveItemTemplatesResponse"));
        oper.setReturnClass(SandboxWebApi.DoRemoveItemTemplatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doRemoveItemTemplatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestCancelBid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoRequestCancelBidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoRequestCancelBidRequest"), SandboxWebApi.DoRequestCancelBidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doRequestCancelBidResponse"));
        oper.setReturnClass(SandboxWebApi.DoRequestCancelBidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doRequestCancelBidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestPayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoRequestPayoutRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoRequestPayoutRequest"), SandboxWebApi.DoRequestPayoutRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doRequestPayoutResponse"));
        oper.setReturnClass(SandboxWebApi.DoRequestPayoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doRequestPayoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestSurcharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoRequestSurchargeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoRequestSurchargeRequest"), SandboxWebApi.DoRequestSurchargeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doRequestSurchargeResponse"));
        oper.setReturnClass(SandboxWebApi.DoRequestSurchargeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doRequestSurchargeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSearchRequest"), SandboxWebApi.DoSearchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSearchResponse"));
        oper.setReturnClass(SandboxWebApi.DoSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoSellSomeAgainRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSellSomeAgainRequest"), SandboxWebApi.DoSellSomeAgainRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSellSomeAgainResponse"));
        oper.setReturnClass(SandboxWebApi.DoSellSomeAgainResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doSellSomeAgainResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgainInShop");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoSellSomeAgainInShopRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSellSomeAgainInShopRequest"), SandboxWebApi.DoSellSomeAgainInShopRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSellSomeAgainInShopResponse"));
        oper.setReturnClass(SandboxWebApi.DoSellSomeAgainInShopResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doSellSomeAgainInShopResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendEmailToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoSendEmailToUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSendEmailToUserRequest"), SandboxWebApi.DoSendEmailToUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSendEmailToUserResponse"));
        oper.setReturnClass(SandboxWebApi.DoSendEmailToUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doSendEmailToUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoSendPostBuyFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSendPostBuyFormRequest"), SandboxWebApi.DoSendPostBuyFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSendPostBuyFormResponse"));
        oper.setReturnClass(SandboxWebApi.DoSendPostBuyFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doSendPostBuyFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendRefundForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoSendRefundFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSendRefundFormRequest"), SandboxWebApi.DoSendRefundFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSendRefundFormResponse"));
        oper.setReturnClass(SandboxWebApi.DoSendRefundFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doSendRefundFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetFreeDeliveryAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoSetFreeDeliveryAmountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSetFreeDeliveryAmountRequest"), SandboxWebApi.DoSetFreeDeliveryAmountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSetFreeDeliveryAmountResponse"));
        oper.setReturnClass(SandboxWebApi.DoSetFreeDeliveryAmountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doSetFreeDeliveryAmountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoSetShipmentPriceTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSetShipmentPriceTypeRequest"), SandboxWebApi.DoSetShipmentPriceTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSetShipmentPriceTypeResponse"));
        oper.setReturnClass(SandboxWebApi.DoSetShipmentPriceTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doSetShipmentPriceTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoSetUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSetUserLicenceDateRequest"), SandboxWebApi.DoSetUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSetUserLicenceDateResponse"));
        oper.setReturnClass(SandboxWebApi.DoSetUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doSetUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowCat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoShowCatRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoShowCatRequest"), SandboxWebApi.DoShowCatRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doShowCatResponse"));
        oper.setReturnClass(SandboxWebApi.DoShowCatResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doShowCatResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowItemInfoExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoShowItemInfoExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoShowItemInfoExtRequest"), SandboxWebApi.DoShowItemInfoExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doShowItemInfoExtResponse"));
        oper.setReturnClass(SandboxWebApi.DoShowItemInfoExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doShowItemInfoExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoShowUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoShowUserRequest"), SandboxWebApi.DoShowUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doShowUserResponse"));
        oper.setReturnClass(SandboxWebApi.DoShowUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doShowUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUserPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoShowUserPageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoShowUserPageRequest"), SandboxWebApi.DoShowUserPageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doShowUserPageResponse"));
        oper.setReturnClass(SandboxWebApi.DoShowUserPageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doShowUserPageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doVerifyItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:SandboxWebApi", "DoVerifyItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoVerifyItemRequest"), SandboxWebApi.DoVerifyItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doVerifyItemResponse"));
        oper.setReturnClass(SandboxWebApi.DoVerifyItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "doVerifyItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[129] = oper;

    }

    public ServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoAddDescToItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoAddDescToItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doAddDescToItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoAddDescToItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoAddPackageInfoToPostBuyFormRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoAddPackageInfoToPostBuyFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doAddPackageInfoToPostBuyFormResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoAddPackageInfoToPostBuyFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoAddToBlackListRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoAddToBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doAddToBlackListResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoAddToBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoAddToWatchListRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoAddToWatchListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doAddToWatchListResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoAddToWatchListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoBidItemRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoBidItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doBidItemResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoBidItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCancelBidItemRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCancelBidItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCancelBidItemResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCancelBidItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCancelRefundFormRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCancelRefundFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCancelRefundFormResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCancelRefundFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCancelRefundWarningRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCancelRefundWarningRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCancelRefundWarningResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCancelRefundWarningResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCancelTransactionRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCancelTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCancelTransactionResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCancelTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoChangeItemFieldsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoChangeItemFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doChangeItemFieldsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoChangeItemFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoChangePriceItemRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoChangePriceItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doChangePriceItemResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoChangePriceItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoChangeQuantityItemRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoChangeQuantityItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doChangeQuantityItemResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoChangeQuantityItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCheckItemDescriptionRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCheckItemDescriptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCheckItemDescriptionResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCheckItemDescriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCheckNewAuctionExtRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCheckNewAuctionExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCheckNewAuctionExtResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCheckNewAuctionExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoCreateItemTemplateRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCreateItemTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCreateItemTemplateResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoCreateItemTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoFeedbackManyRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoFeedbackManyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doFeedbackManyResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoFeedbackManyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoFeedbackRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoFeedbackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doFeedbackResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoFeedbackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoFinishItemRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoFinishItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doFinishItemResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoFinishItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoFinishItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoFinishItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doFinishItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoFinishItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetAdminUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetAdminUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetAdminUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetAdminUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetArchiveRefundsListRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetArchiveRefundsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetArchiveRefundsListResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetArchiveRefundsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetBidItem2Request");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetBidItem2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetBidItem2Response");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetBidItem2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetBlackListUsersRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetBlackListUsersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetBlackListUsersResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetBlackListUsersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetCategoryPathRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetCategoryPathRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetCategoryPathResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetCategoryPathResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetCatsDataCountRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetCatsDataCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetCatsDataCountResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetCatsDataCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetCatsDataLimitRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetCatsDataLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetCatsDataLimitResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetCatsDataLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetCatsDataRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetCatsDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetCatsDataResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetCatsDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetCountriesRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetCountriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetCountriesResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetCountriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetDealsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetDealsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetFavouriteCategoriesRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetFavouriteCategoriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetFavouriteCategoriesResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetFavouriteCategoriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetFavouriteSellersRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetFavouriteSellersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetFavouriteSellersResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetFavouriteSellersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetFeedbackRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetFeedbackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetFeedbackResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetFeedbackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetFilledPostBuyFormsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetFilledPostBuyFormsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetFilledPostBuyFormsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetFilledPostBuyFormsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetFreeDeliveryAmountRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetFreeDeliveryAmountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetFreeDeliveryAmountResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetFreeDeliveryAmountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetItemFieldsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetItemFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetItemFieldsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetItemFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetItemsInfoRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetItemsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetItemsInfoResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetItemsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetItemsListRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetItemsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetItemsListResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetItemsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetItemTemplatesRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetItemTemplatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetItemTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetItemTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMessageToBuyerRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMessageToBuyerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMessageToBuyerResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMessageToBuyerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyAddressesRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyAddressesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyAddressesResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyAddressesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyBidItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyBidItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyBidItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyBidItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyCurrentShipmentPriceTypeRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyCurrentShipmentPriceTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyCurrentShipmentPriceTypeResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyCurrentShipmentPriceTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyDataRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyDataResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyFutureItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyFutureItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyFutureItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyFutureItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyIncomingPaymentsRefundsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyIncomingPaymentsRefundsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyIncomingPaymentsRefundsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyIncomingPaymentsRefundsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyIncomingPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyIncomingPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyIncomingPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyIncomingPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyNotSoldItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyNotSoldItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyNotSoldItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyNotSoldItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyNotWonItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyNotWonItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyNotWonItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyNotWonItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyPaymentsInfoRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyPaymentsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyPaymentsInfoResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyPaymentsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyPaymentsRefundsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyPaymentsRefundsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyPaymentsRefundsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyPaymentsRefundsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyPayoutsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyPayoutsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyPayoutsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyPayoutsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMySellItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMySellItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMySellItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMySellItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMySellRatingRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMySellRatingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMySellRatingResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMySellRatingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMySoldItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMySoldItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMySoldItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMySoldItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyWatchedItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyWatchedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyWatchedItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyWatchedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyWatchItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyWatchItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyWatchItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyWatchItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetMyWonItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyWonItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyWonItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetMyWonItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPaymentDataRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPaymentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPaymentDataResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPaymentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPaymentMethodsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPaymentMethodsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPaymentMethodsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPaymentMethodsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPostBuyDataRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPostBuyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPostBuyDataResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPostBuyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPostBuyFormsDataForBuyersRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPostBuyFormsDataForBuyersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPostBuyFormsDataForBuyersResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPostBuyFormsDataForBuyersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPostBuyFormsDataForSellersRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPostBuyFormsDataForSellersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPostBuyFormsDataForSellersResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPostBuyFormsDataForSellersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPostBuyFormsIdsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPostBuyFormsIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPostBuyFormsIdsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPostBuyFormsIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetPostBuyItemInfoRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPostBuyItemInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPostBuyItemInfoResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetPostBuyItemInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetRefundsDealsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetRefundsDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetRefundsDealsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetRefundsDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetRefundsListRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetRefundsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetRefundsListResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetRefundsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetRefundsReasonsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetRefundsReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetRefundsReasonsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetRefundsReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetRelatedItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetRelatedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetRelatedItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetRelatedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSellFormAttribsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSellFormAttribsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSellFormAttribsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSellFormAttribsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSellFormFieldsExtLimitRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSellFormFieldsExtLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSellFormFieldsExtLimitResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSellFormFieldsExtLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSellFormFieldsExtRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSellFormFieldsExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSellFormFieldsExtResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSellFormFieldsExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSellFormFieldsForCategoryRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSellFormFieldsForCategoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSellFormFieldsForCategoryResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSellFormFieldsForCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSellRatingReasonsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSellRatingReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSellRatingReasonsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSellRatingReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetServiceInfoCategoriesRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetServiceInfoCategoriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetServiceInfoCategoriesResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetServiceInfoCategoriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetServiceInfoRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetServiceInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetServiceInfoResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetServiceInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetServiceTemplatesRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetServiceTemplatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetServiceTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetServiceTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetShipmentDataForRelatedItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetShipmentDataForRelatedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetShipmentDataForRelatedItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetShipmentDataForRelatedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetShipmentDataRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetShipmentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetShipmentDataResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetShipmentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetShipmentPriceTypesRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetShipmentPriceTypesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetShipmentPriceTypesResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetShipmentPriceTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetShopCatsDataRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetShopCatsDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetShopCatsDataResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetShopCatsDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSiteJournalDealsInfoRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSiteJournalDealsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSiteJournalDealsInfoResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSiteJournalDealsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSiteJournalDealsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSiteJournalDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSiteJournalDealsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSiteJournalDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSiteJournalInfoRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSiteJournalInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSiteJournalInfoResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSiteJournalInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSiteJournalRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSiteJournalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSiteJournalResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSiteJournalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSitesFlagInfoRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSitesFlagInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSitesFlagInfoResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSitesFlagInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSitesInfoRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSitesInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSitesInfoResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSitesInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSpecialItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSpecialItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSpecialItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSpecialItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetStatesInfoRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetStatesInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetStatesInfoResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetStatesInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetSystemTimeRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSystemTimeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSystemTimeResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetSystemTimeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetTransactionsIDsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetTransactionsIDsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetTransactionsIDsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetTransactionsIDsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetUserIDRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetUserIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetUserIDResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetUserIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetUserItemsRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetUserItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetUserItemsResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetUserItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetUserLoginRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetUserLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetUserLoginResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetUserLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetWaitingFeedbacksCountRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetWaitingFeedbacksCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetWaitingFeedbacksCountResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetWaitingFeedbacksCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetWaitingFeedbacksRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetWaitingFeedbacksRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetWaitingFeedbacksResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoGetWaitingFeedbacksResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoLoginEncRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoLoginEncRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doLoginEncResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoLoginEncResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoLoginRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doLoginResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoLoginWithAccessTokenRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoLoginWithAccessTokenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doLoginWithAccessTokenResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoLoginWithAccessTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyAccount2Request");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyAccount2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyAccount2Response");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyAccount2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyAccountItemsCountRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyAccountItemsCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyAccountItemsCountResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyAccountItemsCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyBillingItemRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyBillingItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyBillingItemResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyBillingItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyBillingRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyBillingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyBillingResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyBillingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyContactRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyContactRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyContactResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyContactResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyFeedback2LimitRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyFeedback2LimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyFeedback2LimitResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyFeedback2LimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyFeedback2Request");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyFeedback2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doMyFeedback2Response");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoMyFeedback2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoNewAuctionExtRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoNewAuctionExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doNewAuctionExtResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoNewAuctionExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoQueryAllSysStatusRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoQueryAllSysStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doQueryAllSysStatusResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoQueryAllSysStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoQuerySysStatusRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoQuerySysStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doQuerySysStatusResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoQuerySysStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoRemoveFromBlackListRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoRemoveFromBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doRemoveFromBlackListResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoRemoveFromBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoRemoveFromWatchListRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoRemoveFromWatchListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doRemoveFromWatchListResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoRemoveFromWatchListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoRemoveItemTemplatesRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoRemoveItemTemplatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doRemoveItemTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoRemoveItemTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoRequestCancelBidRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoRequestCancelBidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doRequestCancelBidResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoRequestCancelBidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoRequestPayoutRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoRequestPayoutRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doRequestPayoutResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoRequestPayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoRequestSurchargeRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoRequestSurchargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doRequestSurchargeResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoRequestSurchargeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSearchRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSearchResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSellSomeAgainInShopRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSellSomeAgainInShopRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSellSomeAgainInShopResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSellSomeAgainInShopResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSellSomeAgainRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSellSomeAgainRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSellSomeAgainResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSellSomeAgainResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSendEmailToUserRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSendEmailToUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSendEmailToUserResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSendEmailToUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSendPostBuyFormRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSendPostBuyFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSendPostBuyFormResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSendPostBuyFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSendRefundFormRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSendRefundFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSendRefundFormResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSendRefundFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSetFreeDeliveryAmountRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSetFreeDeliveryAmountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSetFreeDeliveryAmountResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSetFreeDeliveryAmountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSetShipmentPriceTypeRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSetShipmentPriceTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSetShipmentPriceTypeResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSetShipmentPriceTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoSetUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSetUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doSetUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoSetUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoShowCatRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoShowCatRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doShowCatResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoShowCatResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoShowItemInfoExtRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoShowItemInfoExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doShowItemInfoExtResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoShowItemInfoExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoShowUserPageRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoShowUserPageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doShowUserPageResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoShowUserPageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoShowUserRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoShowUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doShowUserResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoShowUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoVerifyItemRequest");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoVerifyItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", ">doVerifyItemResponse");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DoVerifyItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ActionDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ActionDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "AddressInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.AddressInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "AddressUserDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.AddressUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "AdvertInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.AdvertInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "AdvertInfoType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.AdvertInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "AlcoholDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.AlcoholDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "AmountStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.AmountStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArchiveRefundsListTypeStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ArchiveRefundsListTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfActiondatastruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ActionDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ActionDataStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfAddressinfostruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.AddressInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "AddressInfoStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfArchiverefundslisttypestruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ArchiveRefundsListTypeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArchiveRefundsListTypeStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfAttribstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.AttribStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "AttribStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfBiditemstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.BidItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "BidItemStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfBidliststruct2");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.BidListStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "BidListStruct2");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfBillingdatatype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.BillingDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "BillingDataType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfBlacklistresstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.BlackListResStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "BlackListResStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfBlackliststruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.BlackListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "BlackListStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfCategoriesstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CategoriesStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CategoriesStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfCategorydata");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CategoryData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CategoryData");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfCategorypathtype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CategoryPathType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CategoryPathType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfCategorytreetype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CategoryTreeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CategoryTreeType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfCatinfotype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CatInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CatInfoType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfCountryinfotype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CountryInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CountryInfoType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfDealsstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "DealsStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfFavouritescategoriesstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FavouritesCategoriesStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FavouritesCategoriesStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfFavouritessellersstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FavouritesSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FavouritesSellersStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfFeedbacklist");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FeedbackList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FeedbackList");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfFeedbackmanystruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FeedbackManyStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FeedbackManyStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfFeedbackresultstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FeedbackResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FeedbackResultStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfFieldsvalue");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FieldsValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FieldsValue");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfFilteroptionstype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FilterOptionsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FilterOptionsType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfFilterslisttype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FiltersListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FiltersListType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfFiltervaluetype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FilterValueType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FilterValueType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfFinishfailurestruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FinishFailureStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FinishFailureStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfFinishitemsstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FinishItemsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FinishItemsStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfFutureitemstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FutureItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FutureItemStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfInfocatlist");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.InfoCatList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "InfoCatList");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItembilling");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemBilling[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemBilling");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItemcatlist");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemCatList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemCatList");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItemimagelist");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemImageList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemImageList");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfIteminfostruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemInfoStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItempostbuydatastruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemPostBuyDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemPostBuyDataStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItempricestruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemPriceStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemPriceStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItemreminderstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemReminderStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemReminderStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItemremovewatchstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemRemoveWatchStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemRemoveWatchStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItemslisttype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemsListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemsListType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItemsnotaddedstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemsNotAddedStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemsNotAddedStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItemsurchargestruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemSurchargeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemSurchargeStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItemtemplateliststruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemTemplateListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemTemplateListStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItemvariantattributestruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemVariantAttributeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemVariantAttributeStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfItemvariantstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemVariantStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemVariantStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfLong");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfMyaccountstruct2");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.MyAccountStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "MyAccountStruct2");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfMycontactlist");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.MyContactList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "MyContactList");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfMyfeedbackliststruct2");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.MyFeedbackListStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "MyFeedbackListStruct2");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfNewpostbuyformsellerstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.NewPostBuyFormSellerStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "NewPostBuyFormSellerStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfNotsolditemstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.NotSoldItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "NotSoldItemStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfNotwonitemstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.NotWonItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "NotWonItemStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPackageinfostruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PackageInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PackageInfoStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfParameterinfotype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ParameterInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ParameterInfoType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPaymentdetailsstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PaymentDetailsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PaymentDetailsStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPaymentitemsstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PaymentItemsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PaymentItemsStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPaymentmethodstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PaymentMethodStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PaymentMethodStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPaymentsellersstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PaymentSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PaymentSellersStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPhotoinfotype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PhotoInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PhotoInfoType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPostagestruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostageStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostageStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPostbuyformdatastruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormDataStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPostbuyformforbuyersdatastruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormForBuyersDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormForBuyersDataStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPostbuyformitemdealsstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormItemDealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormItemDealsStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPostbuyformitemstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormItemStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPostbuyformsellersstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormSellersStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPostbuyformshipmenttrackingstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormShipmentTrackingStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormShipmentTrackingStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPostbuyiteminfostruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyItemInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyItemInfoStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfPriceinfotype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PriceInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PriceInfoType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfProductparametersgroupstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ProductParametersGroupStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ProductParametersGroupStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfProductparametersstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ProductParametersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ProductParametersStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfReasoninfotype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ReasonInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ReasonInfoType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfRefundlisttype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RefundListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RefundListType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfRefundsdealslisttype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RefundsDealsListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RefundsDealsListType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfRelateditemstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RelatedItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RelatedItemStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSearchresponsetype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SearchResponseType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SearchResponseType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSellershipmentdatastruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellerShipmentDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellerShipmentDataStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSellformtype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellFormType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellFormType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSellitemstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellItemStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSellratingaveragepermonthstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingAveragePerMonthStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingAveragePerMonthStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSellratingaveragestruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingAverageStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingAverageStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSellratingdetailstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingDetailStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingDetailStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSellratingestimationstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingEstimationStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingEstimationStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSellratinginfostruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingInfoStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSellratingreasonstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingReasonStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingReasonStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSellratingreasonsumstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingReasonSumStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingReasonSumStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSellratingstatsstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingStatsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingStatsStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfServiceinfocatstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ServiceInfoCatStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ServiceInfoCatStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfServiceinfostruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ServiceInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ServiceInfoStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfShipmentdatastruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ShipmentDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ShipmentDataStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfShipmentpaymentinfostruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ShipmentPaymentInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ShipmentPaymentInfoStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfShipmentpricetypestruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ShipmentPriceTypeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ShipmentPriceTypeStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSiteflaginfotype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SiteFlagInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SiteFlagInfoType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSiteinfotype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SiteInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SiteInfoType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSitejournal");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SiteJournal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SiteJournal");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSitejournaldealsstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SiteJournalDealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SiteJournalDealsStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSolditemstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SoldItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SoldItemStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSpecialauctionstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SpecialAuctionStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SpecialAuctionStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfStateinfostruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.StateInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "StateInfoStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfStructsellagain");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.StructSellAgain[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "StructSellAgain");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfStructsellfailed");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.StructSellFailed[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "StructSellFailed");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfSysstatustype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SysStatusType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SysStatusType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfTemplateinfotype");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.TemplateInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "TemplateInfoType");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfUserblacklistaddresultstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserBlackListAddResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserBlackListAddResultStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfUserblackliststruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserBlackListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserBlackListStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfUserincomingpaymentrefundsstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserIncomingPaymentRefundsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserIncomingPaymentRefundsStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfUserincomingpaymentstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserIncomingPaymentStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserIncomingPaymentStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfUseritemlist");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserItemList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserItemList");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfUserpaymentrefundsstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserPaymentRefundsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserPaymentRefundsStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfUserpaymentstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserPaymentStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserPaymentStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfUserpayoutstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserPayoutStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserPayoutStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfUserpostbuydatastruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserPostBuyDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserPostBuyDataStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfVariantquantitystruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.VariantQuantityStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "VariantQuantityStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfVariantstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.VariantStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "VariantStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfWaitfeedbackstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.WaitFeedbackStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "WaitFeedbackStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfWatcheditemstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.WatchedItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "WatchedItemStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfWatchitemstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.WatchItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "WatchItemStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ArrayOfWonitemstruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.WonItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "WonItemStruct");
            qName2 = new javax.xml.namespace.QName("urn:SandboxWebApi", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "AttribStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.AttribStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "BidItemStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.BidItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "BidListStruct2");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.BidListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "BillingDataType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.BillingDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "BlackListResStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.BlackListResStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "BlackListStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.BlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CategoriesListType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CategoriesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CategoriesStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CategoriesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CategoryData");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CategoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CategoryPathType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CategoryPathType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CategoryTreeType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CategoryTreeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CatInfoType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CatInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ChangedItemStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ChangedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CompanyExtraDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CompanyExtraDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CompanyInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CompanyInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CompanySecondAddressStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CompanySecondAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CountryInfoType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CountryInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "CreatedItemTemplateStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.CreatedItemTemplateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "DealsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "DurationInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DurationInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "DurationTimeInfo");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.DurationTimeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FavouritesCategoriesStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FavouritesCategoriesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FavouritesSellersStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FavouritesSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FeedbackList");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FeedbackList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FeedbackManyStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FeedbackManyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FeedbackResultStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FeedbackResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FieldsValue");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FieldsValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FilledPostBuyFormsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FilledPostBuyFormsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FilterOptionsType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FilterOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FilterPriceStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FilterPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FilterRelationType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FilterRelationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FiltersListType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FiltersListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FilterValueType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FilterValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FinishFailureStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FinishFailureStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FinishItemsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FinishItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FulfillmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FulfillmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FutureFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FutureFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "FutureItemStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.FutureItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "InfoCatList");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.InfoCatList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "InvoiceDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.InvoiceDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "InvoiceInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.InvoiceInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemBilling");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemBilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemCatList");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemCatList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemDescriptionStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemDescriptionStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemImageList");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemImageList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemInfo");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemInfoExt");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemInfoExt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemPaymentOptions");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemPaymentOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemPriceStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemReminderStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemReminderStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemRemoveWatchStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemRemoveWatchStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemsListType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemsNotAddedStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemsNotAddedStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemSurchargeStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemSurchargeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemTemplateCreateStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemTemplateCreateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemTemplateListStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemTemplateListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemTemplatesStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemTemplatesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemVariantAttributeStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemVariantAttributeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ItemVariantStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ItemVariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "MessageToBuyerStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.MessageToBuyerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "MyAccountStruct2");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.MyAccountStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "MyContactList");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.MyContactList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "MyFeedbackListStruct2");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.MyFeedbackListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "NewPostBuyFormCommonStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.NewPostBuyFormCommonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "NewPostBuyFormSellerStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.NewPostBuyFormSellerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "NotSoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.NotSoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "NotSoldItemStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.NotSoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "NotWonItemStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.NotWonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ParameterInfoType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ParameterInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PaymentDetailsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PaymentDetailsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PaymentItemsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PaymentItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PaymentMethodStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PaymentMethodStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PaymentSellersStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PaymentSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PaymentsInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PaymentsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PaymentsPayoutStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PaymentsPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PaymentsUserDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PaymentsUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PayoutAutoFrequencyStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PayoutAutoFrequencyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PayoutAutoSettingsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PayoutAutoSettingsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PharmacyDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PharmacyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PharmacyRecipientDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PharmacyRecipientDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PhotoInfoType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PhotoInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostageStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormAddressStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormForBuyersDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormForBuyersDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormItemDealsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormItemDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormItemStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormPackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormPackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormSellersStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormShipmentTrackingStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormShipmentTrackingStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyFormStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PostBuyItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PriceCatInfo");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PriceCatInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "PriceInfoType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.PriceInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ProductParametersGroupStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ProductParametersGroupStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ProductParametersStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ProductParametersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ProductStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ProductStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RangeDateValueStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RangeDateValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RangeFloatValueStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RangeFloatValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RangeIntValueStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RangeIntValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RangeValueType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RangeValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ReasonInfoType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ReasonInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RefundDetailsType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RefundDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RefundListType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RefundListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RefundsDealsListType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RefundsDealsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RelatedItemsShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RelatedItemsShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RelatedItemsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RelatedItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RelatedItemStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RelatedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RelatedPersonsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RelatedPersonsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RemovedItemTemplatesStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RemovedItemTemplatesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "RequestPayoutStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.RequestPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SearchOptType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SearchOptType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SearchResponseType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SearchResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellerInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellerInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellerPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellerPaymentInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellerShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellerShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellFormFieldsForCategoryStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellFormFieldsForCategoryStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellFormType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellItemStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingAveragePerMonthStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingAveragePerMonthStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingAverageStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingAverageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingDetailStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingDetailStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingEstimationStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingEstimationStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingReasonStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingReasonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingReasonSumStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingReasonSumStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingStatsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SellRatingStatsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ServiceInfoCatStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ServiceInfoCatStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ServiceInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ServiceInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ShipmentPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ShipmentPaymentInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ShipmentPriceTypeStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ShipmentPriceTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ShipmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ShipmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "ShowUserFeedbacks");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.ShowUserFeedbacks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SiteFlagInfoType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SiteFlagInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SiteInfoType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SiteInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SiteJournal");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SiteJournal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SiteJournalDealsInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SiteJournalDealsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SiteJournalDealsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SiteJournalDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SiteJournalInfo");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SiteJournalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SoldItemStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SortOptionsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SortOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SortOptionsType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SortOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SpecialAuctionStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SpecialAuctionStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "StateInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.StateInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "StructSellAgain");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.StructSellAgain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "StructSellFailed");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.StructSellFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "SysStatusType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.SysStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "TemplateInfoType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.TemplateInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "TransactionPayByLinkStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.TransactionPayByLinkStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserBlackListAddResultStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserBlackListAddResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserBlackListStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserBlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserIncomingPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserIncomingPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserIncomingPaymentStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserIncomingPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserInfoType");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserItemList");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserPaymentStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserPayoutStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "UserSentToDataStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.UserSentToDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "VariantQuantityStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.VariantQuantityStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "VariantStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.VariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "WaitFeedbackStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.WaitFeedbackStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "WatchedItemStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.WatchedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "WatchItemStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.WatchItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "WatchListInfoStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.WatchListInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SandboxWebApi", "WonItemStruct");
            cachedSerQNames.add(qName);
            cls = SandboxWebApi.WonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public SandboxWebApi.DoAddDescToItemsResponse doAddDescToItems(SandboxWebApi.DoAddDescToItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddDescToItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddDescToItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoAddDescToItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoAddDescToItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoAddDescToItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoAddPackageInfoToPostBuyFormResponse doAddPackageInfoToPostBuyForm(SandboxWebApi.DoAddPackageInfoToPostBuyFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddPackageInfoToPostBuyForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddPackageInfoToPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoAddPackageInfoToPostBuyFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoAddPackageInfoToPostBuyFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoAddPackageInfoToPostBuyFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoAddToBlackListResponse doAddToBlackList(SandboxWebApi.DoAddToBlackListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddToBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddToBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoAddToBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoAddToBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoAddToBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoAddToWatchListResponse doAddToWatchList(SandboxWebApi.DoAddToWatchListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddToWatchList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddToWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoAddToWatchListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoAddToWatchListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoAddToWatchListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoBidItemResponse doBidItem(SandboxWebApi.DoBidItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doBidItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoBidItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoBidItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoBidItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoCancelBidItemResponse doCancelBidItem(SandboxWebApi.DoCancelBidItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelBidItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoCancelBidItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoCancelBidItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoCancelBidItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoCancelRefundFormResponse doCancelRefundForm(SandboxWebApi.DoCancelRefundFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelRefundForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoCancelRefundFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoCancelRefundFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoCancelRefundFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoCancelRefundWarningResponse doCancelRefundWarning(SandboxWebApi.DoCancelRefundWarningRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundWarning");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelRefundWarning"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoCancelRefundWarningResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoCancelRefundWarningResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoCancelRefundWarningResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoCancelTransactionResponse doCancelTransaction(SandboxWebApi.DoCancelTransactionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoCancelTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoCancelTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoCancelTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoChangeItemFieldsResponse doChangeItemFields(SandboxWebApi.DoChangeItemFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeItemFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangeItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoChangeItemFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoChangeItemFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoChangeItemFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoChangePriceItemResponse doChangePriceItem(SandboxWebApi.DoChangePriceItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangePriceItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangePriceItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoChangePriceItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoChangePriceItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoChangePriceItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoChangeQuantityItemResponse doChangeQuantityItem(SandboxWebApi.DoChangeQuantityItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeQuantityItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangeQuantityItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoChangeQuantityItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoChangeQuantityItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoChangeQuantityItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoCheckItemDescriptionResponse doCheckItemDescription(SandboxWebApi.DoCheckItemDescriptionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckItemDescription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckItemDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoCheckItemDescriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoCheckItemDescriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoCheckItemDescriptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoCheckNewAuctionExtResponse doCheckNewAuctionExt(SandboxWebApi.DoCheckNewAuctionExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckNewAuctionExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoCheckNewAuctionExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoCheckNewAuctionExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoCheckNewAuctionExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoCreateItemTemplateResponse doCreateItemTemplate(SandboxWebApi.DoCreateItemTemplateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCreateItemTemplate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCreateItemTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoCreateItemTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoCreateItemTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoCreateItemTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoFeedbackResponse doFeedback(SandboxWebApi.DoFeedbackRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFeedback");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoFeedbackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoFeedbackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoFeedbackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoFeedbackManyResponse doFeedbackMany(SandboxWebApi.DoFeedbackManyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFeedbackMany");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFeedbackMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoFeedbackManyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoFeedbackManyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoFeedbackManyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoFinishItemResponse doFinishItem(SandboxWebApi.DoFinishItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFinishItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFinishItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoFinishItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoFinishItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoFinishItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoFinishItemsResponse doFinishItems(SandboxWebApi.DoFinishItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFinishItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFinishItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoFinishItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoFinishItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoFinishItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetAdminUserLicenceDateResponse doGetAdminUserLicenceDate(SandboxWebApi.DoGetAdminUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetAdminUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetAdminUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetAdminUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetAdminUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetAdminUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetArchiveRefundsListResponse doGetArchiveRefundsList(SandboxWebApi.DoGetArchiveRefundsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetArchiveRefundsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetArchiveRefundsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetArchiveRefundsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetArchiveRefundsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetArchiveRefundsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetBidItem2Response doGetBidItem2(SandboxWebApi.DoGetBidItem2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetBidItem2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetBidItem2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetBidItem2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetBidItem2Response) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetBidItem2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetBlackListUsersResponse doGetBlackListUsers(SandboxWebApi.DoGetBlackListUsersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetBlackListUsers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetBlackListUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetBlackListUsersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetBlackListUsersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetBlackListUsersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetCategoryPathResponse doGetCategoryPath(SandboxWebApi.DoGetCategoryPathRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCategoryPath");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCategoryPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetCategoryPathResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetCategoryPathResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetCategoryPathResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetCatsDataResponse doGetCatsData(SandboxWebApi.DoGetCatsDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetCatsDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetCatsDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetCatsDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetCatsDataCountResponse doGetCatsDataCount(SandboxWebApi.DoGetCatsDataCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsDataCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsDataCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetCatsDataCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetCatsDataCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetCatsDataCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetCatsDataLimitResponse doGetCatsDataLimit(SandboxWebApi.DoGetCatsDataLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsDataLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsDataLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetCatsDataLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetCatsDataLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetCatsDataLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetCountriesResponse doGetCountries(SandboxWebApi.DoGetCountriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCountries");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCountries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetCountriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetCountriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetCountriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetDealsResponse doGetDeals(SandboxWebApi.DoGetDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetFavouriteCategoriesResponse doGetFavouriteCategories(SandboxWebApi.DoGetFavouriteCategoriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFavouriteCategories");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFavouriteCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetFavouriteCategoriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetFavouriteCategoriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetFavouriteCategoriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetFavouriteSellersResponse doGetFavouriteSellers(SandboxWebApi.DoGetFavouriteSellersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFavouriteSellers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFavouriteSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetFavouriteSellersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetFavouriteSellersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetFavouriteSellersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetFeedbackResponse doGetFeedback(SandboxWebApi.DoGetFeedbackRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFeedback");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetFeedbackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetFeedbackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetFeedbackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetFilledPostBuyFormsResponse doGetFilledPostBuyForms(SandboxWebApi.DoGetFilledPostBuyFormsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFilledPostBuyForms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFilledPostBuyForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetFilledPostBuyFormsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetFilledPostBuyFormsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetFilledPostBuyFormsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetFreeDeliveryAmountResponse doGetFreeDeliveryAmount(SandboxWebApi.DoGetFreeDeliveryAmountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFreeDeliveryAmount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFreeDeliveryAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetFreeDeliveryAmountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetFreeDeliveryAmountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetFreeDeliveryAmountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetItemFieldsResponse doGetItemFields(SandboxWebApi.DoGetItemFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetItemFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetItemFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetItemFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetItemTemplatesResponse doGetItemTemplates(SandboxWebApi.DoGetItemTemplatesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetItemTemplatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetItemTemplatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetItemTemplatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetItemsInfoResponse doGetItemsInfo(SandboxWebApi.DoGetItemsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetItemsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetItemsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetItemsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetItemsListResponse doGetItemsList(SandboxWebApi.DoGetItemsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetItemsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetItemsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetItemsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMessageToBuyerResponse doGetMessageToBuyer(SandboxWebApi.DoGetMessageToBuyerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMessageToBuyer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMessageToBuyer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMessageToBuyerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMessageToBuyerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMessageToBuyerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyAddressesResponse doGetMyAddresses(SandboxWebApi.DoGetMyAddressesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyAddresses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyAddressesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyAddressesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyAddressesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyBidItemsResponse doGetMyBidItems(SandboxWebApi.DoGetMyBidItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyBidItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyBidItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyBidItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyBidItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyBidItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyCurrentShipmentPriceTypeResponse doGetMyCurrentShipmentPriceType(SandboxWebApi.DoGetMyCurrentShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyCurrentShipmentPriceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyCurrentShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyCurrentShipmentPriceTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyCurrentShipmentPriceTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyCurrentShipmentPriceTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyDataResponse doGetMyData(SandboxWebApi.DoGetMyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyFutureItemsResponse doGetMyFutureItems(SandboxWebApi.DoGetMyFutureItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyFutureItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyFutureItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyFutureItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyFutureItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyFutureItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyIncomingPaymentsResponse doGetMyIncomingPayments(SandboxWebApi.DoGetMyIncomingPaymentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyIncomingPayments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyIncomingPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyIncomingPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyIncomingPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyIncomingPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyIncomingPaymentsRefundsResponse doGetMyIncomingPaymentsRefunds(SandboxWebApi.DoGetMyIncomingPaymentsRefundsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyIncomingPaymentsRefunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyIncomingPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyIncomingPaymentsRefundsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyIncomingPaymentsRefundsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyIncomingPaymentsRefundsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyNotSoldItemsResponse doGetMyNotSoldItems(SandboxWebApi.DoGetMyNotSoldItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyNotSoldItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyNotSoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyNotSoldItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyNotSoldItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyNotSoldItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyNotWonItemsResponse doGetMyNotWonItems(SandboxWebApi.DoGetMyNotWonItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyNotWonItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyNotWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyNotWonItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyNotWonItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyNotWonItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyPaymentsResponse doGetMyPayments(SandboxWebApi.DoGetMyPaymentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyPaymentsInfoResponse doGetMyPaymentsInfo(SandboxWebApi.DoGetMyPaymentsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPaymentsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPaymentsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyPaymentsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyPaymentsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyPaymentsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyPaymentsRefundsResponse doGetMyPaymentsRefunds(SandboxWebApi.DoGetMyPaymentsRefundsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPaymentsRefunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyPaymentsRefundsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyPaymentsRefundsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyPaymentsRefundsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyPayoutsResponse doGetMyPayouts(SandboxWebApi.DoGetMyPayoutsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayouts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyPayoutsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyPayoutsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyPayoutsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMySellItemsResponse doGetMySellItems(SandboxWebApi.DoGetMySellItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySellItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySellItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMySellItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMySellItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMySellItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMySellRatingResponse doGetMySellRating(SandboxWebApi.DoGetMySellRatingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySellRating");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySellRating"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMySellRatingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMySellRatingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMySellRatingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMySoldItemsResponse doGetMySoldItems(SandboxWebApi.DoGetMySoldItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySoldItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMySoldItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMySoldItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMySoldItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyWatchItemsResponse doGetMyWatchItems(SandboxWebApi.DoGetMyWatchItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWatchItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWatchItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyWatchItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyWatchItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyWatchItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyWatchedItemsResponse doGetMyWatchedItems(SandboxWebApi.DoGetMyWatchedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWatchedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWatchedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyWatchedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyWatchedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyWatchedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetMyWonItemsResponse doGetMyWonItems(SandboxWebApi.DoGetMyWonItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWonItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetMyWonItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetMyWonItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetMyWonItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetPaymentDataResponse doGetPaymentData(SandboxWebApi.DoGetPaymentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPaymentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPaymentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetPaymentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetPaymentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetPaymentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetPaymentMethodsResponse doGetPaymentMethods(SandboxWebApi.DoGetPaymentMethodsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPaymentMethods");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPaymentMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetPaymentMethodsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetPaymentMethodsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetPaymentMethodsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetPostBuyDataResponse doGetPostBuyData(SandboxWebApi.DoGetPostBuyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetPostBuyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetPostBuyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetPostBuyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetPostBuyFormsDataForBuyersResponse doGetPostBuyFormsDataForBuyers(SandboxWebApi.DoGetPostBuyFormsDataForBuyersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsDataForBuyers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsDataForBuyers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetPostBuyFormsDataForBuyersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetPostBuyFormsDataForBuyersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetPostBuyFormsDataForBuyersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetPostBuyFormsDataForSellersResponse doGetPostBuyFormsDataForSellers(SandboxWebApi.DoGetPostBuyFormsDataForSellersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsDataForSellers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsDataForSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetPostBuyFormsDataForSellersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetPostBuyFormsDataForSellersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetPostBuyFormsDataForSellersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetPostBuyFormsIdsResponse doGetPostBuyFormsIds(SandboxWebApi.DoGetPostBuyFormsIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetPostBuyFormsIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetPostBuyFormsIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetPostBuyFormsIdsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetPostBuyItemInfoResponse doGetPostBuyItemInfo(SandboxWebApi.DoGetPostBuyItemInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyItemInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyItemInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetPostBuyItemInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetPostBuyItemInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetPostBuyItemInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetRefundsDealsResponse doGetRefundsDeals(SandboxWebApi.DoGetRefundsDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetRefundsDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetRefundsDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetRefundsDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetRefundsListResponse doGetRefundsList(SandboxWebApi.DoGetRefundsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetRefundsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetRefundsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetRefundsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetRefundsReasonsResponse doGetRefundsReasons(SandboxWebApi.DoGetRefundsReasonsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetRefundsReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetRefundsReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetRefundsReasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetRelatedItemsResponse doGetRelatedItems(SandboxWebApi.DoGetRelatedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRelatedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetRelatedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetRelatedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetRelatedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSellFormAttribsResponse doGetSellFormAttribs(SandboxWebApi.DoGetSellFormAttribsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormAttribs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormAttribs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSellFormAttribsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSellFormAttribsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSellFormAttribsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSellFormFieldsExtResponse doGetSellFormFieldsExt(SandboxWebApi.DoGetSellFormFieldsExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSellFormFieldsExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSellFormFieldsExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSellFormFieldsExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSellFormFieldsExtLimitResponse doGetSellFormFieldsExtLimit(SandboxWebApi.DoGetSellFormFieldsExtLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsExtLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsExtLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSellFormFieldsExtLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSellFormFieldsExtLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSellFormFieldsExtLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSellFormFieldsForCategoryResponse doGetSellFormFieldsForCategory(SandboxWebApi.DoGetSellFormFieldsForCategoryRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsForCategory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsForCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSellFormFieldsForCategoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSellFormFieldsForCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSellFormFieldsForCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSellRatingReasonsResponse doGetSellRatingReasons(SandboxWebApi.DoGetSellRatingReasonsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellRatingReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellRatingReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSellRatingReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSellRatingReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSellRatingReasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetServiceInfoResponse doGetServiceInfo(SandboxWebApi.DoGetServiceInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetServiceInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetServiceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetServiceInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetServiceInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetServiceInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetServiceInfoCategoriesResponse doGetServiceInfoCategories(SandboxWebApi.DoGetServiceInfoCategoriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetServiceInfoCategories");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetServiceInfoCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetServiceInfoCategoriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetServiceInfoCategoriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetServiceInfoCategoriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetServiceTemplatesResponse doGetServiceTemplates(SandboxWebApi.DoGetServiceTemplatesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetServiceTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetServiceTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetServiceTemplatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetServiceTemplatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetServiceTemplatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetShipmentDataResponse doGetShipmentData(SandboxWebApi.DoGetShipmentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetShipmentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetShipmentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetShipmentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetShipmentDataForRelatedItemsResponse doGetShipmentDataForRelatedItems(SandboxWebApi.DoGetShipmentDataForRelatedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentDataForRelatedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentDataForRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetShipmentDataForRelatedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetShipmentDataForRelatedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetShipmentDataForRelatedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetShipmentPriceTypesResponse doGetShipmentPriceTypes(SandboxWebApi.DoGetShipmentPriceTypesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentPriceTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentPriceTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetShipmentPriceTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetShipmentPriceTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetShipmentPriceTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetShopCatsDataResponse doGetShopCatsData(SandboxWebApi.DoGetShopCatsDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShopCatsData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShopCatsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetShopCatsDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetShopCatsDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetShopCatsDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSiteJournalResponse doGetSiteJournal(SandboxWebApi.DoGetSiteJournalRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSiteJournalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSiteJournalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSiteJournalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSiteJournalDealsResponse doGetSiteJournalDeals(SandboxWebApi.DoGetSiteJournalDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSiteJournalDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSiteJournalDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSiteJournalDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSiteJournalDealsInfoResponse doGetSiteJournalDealsInfo(SandboxWebApi.DoGetSiteJournalDealsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalDealsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalDealsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSiteJournalDealsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSiteJournalDealsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSiteJournalDealsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSiteJournalInfoResponse doGetSiteJournalInfo(SandboxWebApi.DoGetSiteJournalInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSiteJournalInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSiteJournalInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSiteJournalInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSitesFlagInfoResponse doGetSitesFlagInfo(SandboxWebApi.DoGetSitesFlagInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSitesFlagInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSitesFlagInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSitesFlagInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSitesFlagInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSitesFlagInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSitesInfoResponse doGetSitesInfo(SandboxWebApi.DoGetSitesInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSitesInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSitesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSitesInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSitesInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSitesInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSpecialItemsResponse doGetSpecialItems(SandboxWebApi.DoGetSpecialItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSpecialItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSpecialItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSpecialItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSpecialItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSpecialItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetStatesInfoResponse doGetStatesInfo(SandboxWebApi.DoGetStatesInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetStatesInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetStatesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetStatesInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetStatesInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetStatesInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetSystemTimeResponse doGetSystemTime(SandboxWebApi.DoGetSystemTimeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSystemTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSystemTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetSystemTimeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetSystemTimeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetSystemTimeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetTransactionsIDsResponse doGetTransactionsIDs(SandboxWebApi.DoGetTransactionsIDsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetTransactionsIDs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetTransactionsIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetTransactionsIDsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetTransactionsIDsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetTransactionsIDsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetUserIDResponse doGetUserID(SandboxWebApi.DoGetUserIDRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetUserIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetUserIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetUserIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetUserItemsResponse doGetUserItems(SandboxWebApi.DoGetUserItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetUserItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetUserItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetUserItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetUserLicenceDateResponse doGetUserLicenceDate(SandboxWebApi.DoGetUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetUserLoginResponse doGetUserLogin(SandboxWebApi.DoGetUserLoginRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetUserLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetUserLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetUserLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetWaitingFeedbacksResponse doGetWaitingFeedbacks(SandboxWebApi.DoGetWaitingFeedbacksRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetWaitingFeedbacks");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetWaitingFeedbacks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetWaitingFeedbacksResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetWaitingFeedbacksResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetWaitingFeedbacksResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoGetWaitingFeedbacksCountResponse doGetWaitingFeedbacksCount(SandboxWebApi.DoGetWaitingFeedbacksCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetWaitingFeedbacksCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetWaitingFeedbacksCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoGetWaitingFeedbacksCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoGetWaitingFeedbacksCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoGetWaitingFeedbacksCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoLoginResponse doLogin(SandboxWebApi.DoLoginRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoLoginEncResponse doLoginEnc(SandboxWebApi.DoLoginEncRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLoginEnc");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLoginEnc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoLoginEncResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoLoginEncResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoLoginEncResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoLoginWithAccessTokenResponse doLoginWithAccessToken(SandboxWebApi.DoLoginWithAccessTokenRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLoginWithAccessToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLoginWithAccessToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoLoginWithAccessTokenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoLoginWithAccessTokenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoLoginWithAccessTokenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoMyAccount2Response doMyAccount2(SandboxWebApi.DoMyAccount2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyAccount2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyAccount2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoMyAccount2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoMyAccount2Response) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoMyAccount2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoMyAccountItemsCountResponse doMyAccountItemsCount(SandboxWebApi.DoMyAccountItemsCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyAccountItemsCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyAccountItemsCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoMyAccountItemsCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoMyAccountItemsCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoMyAccountItemsCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoMyBillingResponse doMyBilling(SandboxWebApi.DoMyBillingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyBilling");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyBilling"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoMyBillingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoMyBillingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoMyBillingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoMyBillingItemResponse doMyBillingItem(SandboxWebApi.DoMyBillingItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyBillingItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyBillingItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoMyBillingItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoMyBillingItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoMyBillingItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoMyContactResponse doMyContact(SandboxWebApi.DoMyContactRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyContact");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoMyContactResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoMyContactResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoMyContactResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoMyFeedback2Response doMyFeedback2(SandboxWebApi.DoMyFeedback2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyFeedback2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyFeedback2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoMyFeedback2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoMyFeedback2Response) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoMyFeedback2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoMyFeedback2LimitResponse doMyFeedback2Limit(SandboxWebApi.DoMyFeedback2LimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyFeedback2Limit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyFeedback2Limit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoMyFeedback2LimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoMyFeedback2LimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoMyFeedback2LimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoNewAuctionExtResponse doNewAuctionExt(SandboxWebApi.DoNewAuctionExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doNewAuctionExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoNewAuctionExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoNewAuctionExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoNewAuctionExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoQueryAllSysStatusResponse doQueryAllSysStatus(SandboxWebApi.DoQueryAllSysStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doQueryAllSysStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doQueryAllSysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoQueryAllSysStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoQueryAllSysStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoQueryAllSysStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoQuerySysStatusResponse doQuerySysStatus(SandboxWebApi.DoQuerySysStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doQuerySysStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doQuerySysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoQuerySysStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoQuerySysStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoQuerySysStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoRemoveFromBlackListResponse doRemoveFromBlackList(SandboxWebApi.DoRemoveFromBlackListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveFromBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveFromBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoRemoveFromBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoRemoveFromBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoRemoveFromBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoRemoveFromWatchListResponse doRemoveFromWatchList(SandboxWebApi.DoRemoveFromWatchListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveFromWatchList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveFromWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoRemoveFromWatchListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoRemoveFromWatchListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoRemoveFromWatchListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoRemoveItemTemplatesResponse doRemoveItemTemplates(SandboxWebApi.DoRemoveItemTemplatesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveItemTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoRemoveItemTemplatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoRemoveItemTemplatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoRemoveItemTemplatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoRequestCancelBidResponse doRequestCancelBid(SandboxWebApi.DoRequestCancelBidRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestCancelBid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestCancelBid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoRequestCancelBidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoRequestCancelBidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoRequestCancelBidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoRequestPayoutResponse doRequestPayout(SandboxWebApi.DoRequestPayoutRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestPayout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestPayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoRequestPayoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoRequestPayoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoRequestPayoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoRequestSurchargeResponse doRequestSurcharge(SandboxWebApi.DoRequestSurchargeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestSurcharge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestSurcharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoRequestSurchargeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoRequestSurchargeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoRequestSurchargeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoSearchResponse doSearch(SandboxWebApi.DoSearchRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoSellSomeAgainResponse doSellSomeAgain(SandboxWebApi.DoSellSomeAgainRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSellSomeAgain");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSellSomeAgain"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoSellSomeAgainResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoSellSomeAgainResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoSellSomeAgainResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoSellSomeAgainInShopResponse doSellSomeAgainInShop(SandboxWebApi.DoSellSomeAgainInShopRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSellSomeAgainInShop");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSellSomeAgainInShop"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoSellSomeAgainInShopResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoSellSomeAgainInShopResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoSellSomeAgainInShopResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoSendEmailToUserResponse doSendEmailToUser(SandboxWebApi.DoSendEmailToUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendEmailToUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendEmailToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoSendEmailToUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoSendEmailToUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoSendEmailToUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoSendPostBuyFormResponse doSendPostBuyForm(SandboxWebApi.DoSendPostBuyFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendPostBuyForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoSendPostBuyFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoSendPostBuyFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoSendPostBuyFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoSendRefundFormResponse doSendRefundForm(SandboxWebApi.DoSendRefundFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendRefundForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendRefundForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoSendRefundFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoSendRefundFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoSendRefundFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoSetFreeDeliveryAmountResponse doSetFreeDeliveryAmount(SandboxWebApi.DoSetFreeDeliveryAmountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetFreeDeliveryAmount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetFreeDeliveryAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoSetFreeDeliveryAmountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoSetFreeDeliveryAmountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoSetFreeDeliveryAmountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoSetShipmentPriceTypeResponse doSetShipmentPriceType(SandboxWebApi.DoSetShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetShipmentPriceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoSetShipmentPriceTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoSetShipmentPriceTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoSetShipmentPriceTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoSetUserLicenceDateResponse doSetUserLicenceDate(SandboxWebApi.DoSetUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoSetUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoSetUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoSetUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoShowCatResponse doShowCat(SandboxWebApi.DoShowCatRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowCat");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowCat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoShowCatResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoShowCatResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoShowCatResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoShowItemInfoExtResponse doShowItemInfoExt(SandboxWebApi.DoShowItemInfoExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowItemInfoExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowItemInfoExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoShowItemInfoExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoShowItemInfoExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoShowItemInfoExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoShowUserResponse doShowUser(SandboxWebApi.DoShowUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoShowUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoShowUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoShowUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoShowUserPageResponse doShowUserPage(SandboxWebApi.DoShowUserPageRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowUserPage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowUserPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoShowUserPageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoShowUserPageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoShowUserPageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SandboxWebApi.DoVerifyItemResponse doVerifyItem(SandboxWebApi.DoVerifyItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doVerifyItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doVerifyItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SandboxWebApi.DoVerifyItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SandboxWebApi.DoVerifyItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SandboxWebApi.DoVerifyItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
