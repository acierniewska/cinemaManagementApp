package SandboxWebApi;

public class ServicePortProxy implements SandboxWebApi.ServicePort {
  private String _endpoint = null;
  private SandboxWebApi.ServicePort servicePort = null;
  
  public ServicePortProxy() {
    _initServicePortProxy();
  }
  
  public ServicePortProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicePortProxy();
  }
  
  private void _initServicePortProxy() {
    try {
      servicePort = (new SandboxWebApi.ServiceServiceLocator()).getservicePort();
      if (servicePort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicePort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicePort != null)
      ((javax.xml.rpc.Stub)servicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public SandboxWebApi.ServicePort getServicePort() {
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort;
  }
  
  public SandboxWebApi.DoAddDescToItemsResponse doAddDescToItems(SandboxWebApi.DoAddDescToItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doAddDescToItems(parameters);
  }
  
  public SandboxWebApi.DoAddPackageInfoToPostBuyFormResponse doAddPackageInfoToPostBuyForm(SandboxWebApi.DoAddPackageInfoToPostBuyFormRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doAddPackageInfoToPostBuyForm(parameters);
  }
  
  public SandboxWebApi.DoAddToBlackListResponse doAddToBlackList(SandboxWebApi.DoAddToBlackListRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doAddToBlackList(parameters);
  }
  
  public SandboxWebApi.DoAddToWatchListResponse doAddToWatchList(SandboxWebApi.DoAddToWatchListRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doAddToWatchList(parameters);
  }
  
  public SandboxWebApi.DoBidItemResponse doBidItem(SandboxWebApi.DoBidItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doBidItem(parameters);
  }
  
  public SandboxWebApi.DoCancelBidItemResponse doCancelBidItem(SandboxWebApi.DoCancelBidItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCancelBidItem(parameters);
  }
  
  public SandboxWebApi.DoCancelRefundFormResponse doCancelRefundForm(SandboxWebApi.DoCancelRefundFormRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCancelRefundForm(parameters);
  }
  
  public SandboxWebApi.DoCancelRefundWarningResponse doCancelRefundWarning(SandboxWebApi.DoCancelRefundWarningRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCancelRefundWarning(parameters);
  }
  
  public SandboxWebApi.DoCancelTransactionResponse doCancelTransaction(SandboxWebApi.DoCancelTransactionRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCancelTransaction(parameters);
  }
  
  public SandboxWebApi.DoChangeItemFieldsResponse doChangeItemFields(SandboxWebApi.DoChangeItemFieldsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doChangeItemFields(parameters);
  }
  
  public SandboxWebApi.DoChangePriceItemResponse doChangePriceItem(SandboxWebApi.DoChangePriceItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doChangePriceItem(parameters);
  }
  
  public SandboxWebApi.DoChangeQuantityItemResponse doChangeQuantityItem(SandboxWebApi.DoChangeQuantityItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doChangeQuantityItem(parameters);
  }
  
  public SandboxWebApi.DoCheckItemDescriptionResponse doCheckItemDescription(SandboxWebApi.DoCheckItemDescriptionRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCheckItemDescription(parameters);
  }
  
  public SandboxWebApi.DoCheckNewAuctionExtResponse doCheckNewAuctionExt(SandboxWebApi.DoCheckNewAuctionExtRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCheckNewAuctionExt(parameters);
  }
  
  public SandboxWebApi.DoCreateItemTemplateResponse doCreateItemTemplate(SandboxWebApi.DoCreateItemTemplateRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCreateItemTemplate(parameters);
  }
  
  public SandboxWebApi.DoFeedbackResponse doFeedback(SandboxWebApi.DoFeedbackRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doFeedback(parameters);
  }
  
  public SandboxWebApi.DoFeedbackManyResponse doFeedbackMany(SandboxWebApi.DoFeedbackManyRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doFeedbackMany(parameters);
  }
  
  public SandboxWebApi.DoFinishItemResponse doFinishItem(SandboxWebApi.DoFinishItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doFinishItem(parameters);
  }
  
  public SandboxWebApi.DoFinishItemsResponse doFinishItems(SandboxWebApi.DoFinishItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doFinishItems(parameters);
  }
  
  public SandboxWebApi.DoGetAdminUserLicenceDateResponse doGetAdminUserLicenceDate(SandboxWebApi.DoGetAdminUserLicenceDateRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetAdminUserLicenceDate(parameters);
  }
  
  public SandboxWebApi.DoGetArchiveRefundsListResponse doGetArchiveRefundsList(SandboxWebApi.DoGetArchiveRefundsListRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetArchiveRefundsList(parameters);
  }
  
  public SandboxWebApi.DoGetBidItem2Response doGetBidItem2(SandboxWebApi.DoGetBidItem2Request parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetBidItem2(parameters);
  }
  
  public SandboxWebApi.DoGetBlackListUsersResponse doGetBlackListUsers(SandboxWebApi.DoGetBlackListUsersRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetBlackListUsers(parameters);
  }
  
  public SandboxWebApi.DoGetCategoryPathResponse doGetCategoryPath(SandboxWebApi.DoGetCategoryPathRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetCategoryPath(parameters);
  }
  
  public SandboxWebApi.DoGetCatsDataResponse doGetCatsData(SandboxWebApi.DoGetCatsDataRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetCatsData(parameters);
  }
  
  public SandboxWebApi.DoGetCatsDataCountResponse doGetCatsDataCount(SandboxWebApi.DoGetCatsDataCountRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetCatsDataCount(parameters);
  }
  
  public SandboxWebApi.DoGetCatsDataLimitResponse doGetCatsDataLimit(SandboxWebApi.DoGetCatsDataLimitRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetCatsDataLimit(parameters);
  }
  
  public SandboxWebApi.DoGetCountriesResponse doGetCountries(SandboxWebApi.DoGetCountriesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetCountries(parameters);
  }
  
  public SandboxWebApi.DoGetDealsResponse doGetDeals(SandboxWebApi.DoGetDealsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetDeals(parameters);
  }
  
  public SandboxWebApi.DoGetFavouriteCategoriesResponse doGetFavouriteCategories(SandboxWebApi.DoGetFavouriteCategoriesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetFavouriteCategories(parameters);
  }
  
  public SandboxWebApi.DoGetFavouriteSellersResponse doGetFavouriteSellers(SandboxWebApi.DoGetFavouriteSellersRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetFavouriteSellers(parameters);
  }
  
  public SandboxWebApi.DoGetFeedbackResponse doGetFeedback(SandboxWebApi.DoGetFeedbackRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetFeedback(parameters);
  }
  
  public SandboxWebApi.DoGetFilledPostBuyFormsResponse doGetFilledPostBuyForms(SandboxWebApi.DoGetFilledPostBuyFormsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetFilledPostBuyForms(parameters);
  }
  
  public SandboxWebApi.DoGetFreeDeliveryAmountResponse doGetFreeDeliveryAmount(SandboxWebApi.DoGetFreeDeliveryAmountRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetFreeDeliveryAmount(parameters);
  }
  
  public SandboxWebApi.DoGetItemFieldsResponse doGetItemFields(SandboxWebApi.DoGetItemFieldsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetItemFields(parameters);
  }
  
  public SandboxWebApi.DoGetItemTemplatesResponse doGetItemTemplates(SandboxWebApi.DoGetItemTemplatesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetItemTemplates(parameters);
  }
  
  public SandboxWebApi.DoGetItemsInfoResponse doGetItemsInfo(SandboxWebApi.DoGetItemsInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetItemsInfo(parameters);
  }
  
  public SandboxWebApi.DoGetItemsListResponse doGetItemsList(SandboxWebApi.DoGetItemsListRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetItemsList(parameters);
  }
  
  public SandboxWebApi.DoGetMessageToBuyerResponse doGetMessageToBuyer(SandboxWebApi.DoGetMessageToBuyerRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMessageToBuyer(parameters);
  }
  
  public SandboxWebApi.DoGetMyAddressesResponse doGetMyAddresses(SandboxWebApi.DoGetMyAddressesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyAddresses(parameters);
  }
  
  public SandboxWebApi.DoGetMyBidItemsResponse doGetMyBidItems(SandboxWebApi.DoGetMyBidItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyBidItems(parameters);
  }
  
  public SandboxWebApi.DoGetMyCurrentShipmentPriceTypeResponse doGetMyCurrentShipmentPriceType(SandboxWebApi.DoGetMyCurrentShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyCurrentShipmentPriceType(parameters);
  }
  
  public SandboxWebApi.DoGetMyDataResponse doGetMyData(SandboxWebApi.DoGetMyDataRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyData(parameters);
  }
  
  public SandboxWebApi.DoGetMyFutureItemsResponse doGetMyFutureItems(SandboxWebApi.DoGetMyFutureItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyFutureItems(parameters);
  }
  
  public SandboxWebApi.DoGetMyIncomingPaymentsResponse doGetMyIncomingPayments(SandboxWebApi.DoGetMyIncomingPaymentsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyIncomingPayments(parameters);
  }
  
  public SandboxWebApi.DoGetMyIncomingPaymentsRefundsResponse doGetMyIncomingPaymentsRefunds(SandboxWebApi.DoGetMyIncomingPaymentsRefundsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyIncomingPaymentsRefunds(parameters);
  }
  
  public SandboxWebApi.DoGetMyNotSoldItemsResponse doGetMyNotSoldItems(SandboxWebApi.DoGetMyNotSoldItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyNotSoldItems(parameters);
  }
  
  public SandboxWebApi.DoGetMyNotWonItemsResponse doGetMyNotWonItems(SandboxWebApi.DoGetMyNotWonItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyNotWonItems(parameters);
  }
  
  public SandboxWebApi.DoGetMyPaymentsResponse doGetMyPayments(SandboxWebApi.DoGetMyPaymentsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyPayments(parameters);
  }
  
  public SandboxWebApi.DoGetMyPaymentsInfoResponse doGetMyPaymentsInfo(SandboxWebApi.DoGetMyPaymentsInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyPaymentsInfo(parameters);
  }
  
  public SandboxWebApi.DoGetMyPaymentsRefundsResponse doGetMyPaymentsRefunds(SandboxWebApi.DoGetMyPaymentsRefundsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyPaymentsRefunds(parameters);
  }
  
  public SandboxWebApi.DoGetMyPayoutsResponse doGetMyPayouts(SandboxWebApi.DoGetMyPayoutsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyPayouts(parameters);
  }
  
  public SandboxWebApi.DoGetMySellItemsResponse doGetMySellItems(SandboxWebApi.DoGetMySellItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMySellItems(parameters);
  }
  
  public SandboxWebApi.DoGetMySellRatingResponse doGetMySellRating(SandboxWebApi.DoGetMySellRatingRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMySellRating(parameters);
  }
  
  public SandboxWebApi.DoGetMySoldItemsResponse doGetMySoldItems(SandboxWebApi.DoGetMySoldItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMySoldItems(parameters);
  }
  
  public SandboxWebApi.DoGetMyWatchItemsResponse doGetMyWatchItems(SandboxWebApi.DoGetMyWatchItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyWatchItems(parameters);
  }
  
  public SandboxWebApi.DoGetMyWatchedItemsResponse doGetMyWatchedItems(SandboxWebApi.DoGetMyWatchedItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyWatchedItems(parameters);
  }
  
  public SandboxWebApi.DoGetMyWonItemsResponse doGetMyWonItems(SandboxWebApi.DoGetMyWonItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyWonItems(parameters);
  }
  
  public SandboxWebApi.DoGetPaymentDataResponse doGetPaymentData(SandboxWebApi.DoGetPaymentDataRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPaymentData(parameters);
  }
  
  public SandboxWebApi.DoGetPaymentMethodsResponse doGetPaymentMethods(SandboxWebApi.DoGetPaymentMethodsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPaymentMethods(parameters);
  }
  
  public SandboxWebApi.DoGetPostBuyDataResponse doGetPostBuyData(SandboxWebApi.DoGetPostBuyDataRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPostBuyData(parameters);
  }
  
  public SandboxWebApi.DoGetPostBuyFormsDataForBuyersResponse doGetPostBuyFormsDataForBuyers(SandboxWebApi.DoGetPostBuyFormsDataForBuyersRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPostBuyFormsDataForBuyers(parameters);
  }
  
  public SandboxWebApi.DoGetPostBuyFormsDataForSellersResponse doGetPostBuyFormsDataForSellers(SandboxWebApi.DoGetPostBuyFormsDataForSellersRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPostBuyFormsDataForSellers(parameters);
  }
  
  public SandboxWebApi.DoGetPostBuyFormsIdsResponse doGetPostBuyFormsIds(SandboxWebApi.DoGetPostBuyFormsIdsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPostBuyFormsIds(parameters);
  }
  
  public SandboxWebApi.DoGetPostBuyItemInfoResponse doGetPostBuyItemInfo(SandboxWebApi.DoGetPostBuyItemInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPostBuyItemInfo(parameters);
  }
  
  public SandboxWebApi.DoGetRefundsDealsResponse doGetRefundsDeals(SandboxWebApi.DoGetRefundsDealsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetRefundsDeals(parameters);
  }
  
  public SandboxWebApi.DoGetRefundsListResponse doGetRefundsList(SandboxWebApi.DoGetRefundsListRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetRefundsList(parameters);
  }
  
  public SandboxWebApi.DoGetRefundsReasonsResponse doGetRefundsReasons(SandboxWebApi.DoGetRefundsReasonsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetRefundsReasons(parameters);
  }
  
  public SandboxWebApi.DoGetRelatedItemsResponse doGetRelatedItems(SandboxWebApi.DoGetRelatedItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetRelatedItems(parameters);
  }
  
  public SandboxWebApi.DoGetSellFormAttribsResponse doGetSellFormAttribs(SandboxWebApi.DoGetSellFormAttribsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSellFormAttribs(parameters);
  }
  
  public SandboxWebApi.DoGetSellFormFieldsExtResponse doGetSellFormFieldsExt(SandboxWebApi.DoGetSellFormFieldsExtRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSellFormFieldsExt(parameters);
  }
  
  public SandboxWebApi.DoGetSellFormFieldsExtLimitResponse doGetSellFormFieldsExtLimit(SandboxWebApi.DoGetSellFormFieldsExtLimitRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSellFormFieldsExtLimit(parameters);
  }
  
  public SandboxWebApi.DoGetSellFormFieldsForCategoryResponse doGetSellFormFieldsForCategory(SandboxWebApi.DoGetSellFormFieldsForCategoryRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSellFormFieldsForCategory(parameters);
  }
  
  public SandboxWebApi.DoGetSellRatingReasonsResponse doGetSellRatingReasons(SandboxWebApi.DoGetSellRatingReasonsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSellRatingReasons(parameters);
  }
  
  public SandboxWebApi.DoGetServiceInfoResponse doGetServiceInfo(SandboxWebApi.DoGetServiceInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetServiceInfo(parameters);
  }
  
  public SandboxWebApi.DoGetServiceInfoCategoriesResponse doGetServiceInfoCategories(SandboxWebApi.DoGetServiceInfoCategoriesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetServiceInfoCategories(parameters);
  }
  
  public SandboxWebApi.DoGetServiceTemplatesResponse doGetServiceTemplates(SandboxWebApi.DoGetServiceTemplatesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetServiceTemplates(parameters);
  }
  
  public SandboxWebApi.DoGetShipmentDataResponse doGetShipmentData(SandboxWebApi.DoGetShipmentDataRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetShipmentData(parameters);
  }
  
  public SandboxWebApi.DoGetShipmentDataForRelatedItemsResponse doGetShipmentDataForRelatedItems(SandboxWebApi.DoGetShipmentDataForRelatedItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetShipmentDataForRelatedItems(parameters);
  }
  
  public SandboxWebApi.DoGetShipmentPriceTypesResponse doGetShipmentPriceTypes(SandboxWebApi.DoGetShipmentPriceTypesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetShipmentPriceTypes(parameters);
  }
  
  public SandboxWebApi.DoGetShopCatsDataResponse doGetShopCatsData(SandboxWebApi.DoGetShopCatsDataRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetShopCatsData(parameters);
  }
  
  public SandboxWebApi.DoGetSiteJournalResponse doGetSiteJournal(SandboxWebApi.DoGetSiteJournalRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSiteJournal(parameters);
  }
  
  public SandboxWebApi.DoGetSiteJournalDealsResponse doGetSiteJournalDeals(SandboxWebApi.DoGetSiteJournalDealsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSiteJournalDeals(parameters);
  }
  
  public SandboxWebApi.DoGetSiteJournalDealsInfoResponse doGetSiteJournalDealsInfo(SandboxWebApi.DoGetSiteJournalDealsInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSiteJournalDealsInfo(parameters);
  }
  
  public SandboxWebApi.DoGetSiteJournalInfoResponse doGetSiteJournalInfo(SandboxWebApi.DoGetSiteJournalInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSiteJournalInfo(parameters);
  }
  
  public SandboxWebApi.DoGetSitesFlagInfoResponse doGetSitesFlagInfo(SandboxWebApi.DoGetSitesFlagInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSitesFlagInfo(parameters);
  }
  
  public SandboxWebApi.DoGetSitesInfoResponse doGetSitesInfo(SandboxWebApi.DoGetSitesInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSitesInfo(parameters);
  }
  
  public SandboxWebApi.DoGetSpecialItemsResponse doGetSpecialItems(SandboxWebApi.DoGetSpecialItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSpecialItems(parameters);
  }
  
  public SandboxWebApi.DoGetStatesInfoResponse doGetStatesInfo(SandboxWebApi.DoGetStatesInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetStatesInfo(parameters);
  }
  
  public SandboxWebApi.DoGetSystemTimeResponse doGetSystemTime(SandboxWebApi.DoGetSystemTimeRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSystemTime(parameters);
  }
  
  public SandboxWebApi.DoGetTransactionsIDsResponse doGetTransactionsIDs(SandboxWebApi.DoGetTransactionsIDsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetTransactionsIDs(parameters);
  }
  
  public SandboxWebApi.DoGetUserIDResponse doGetUserID(SandboxWebApi.DoGetUserIDRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetUserID(parameters);
  }
  
  public SandboxWebApi.DoGetUserItemsResponse doGetUserItems(SandboxWebApi.DoGetUserItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetUserItems(parameters);
  }
  
  public SandboxWebApi.DoGetUserLicenceDateResponse doGetUserLicenceDate(SandboxWebApi.DoGetUserLicenceDateRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetUserLicenceDate(parameters);
  }
  
  public SandboxWebApi.DoGetUserLoginResponse doGetUserLogin(SandboxWebApi.DoGetUserLoginRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetUserLogin(parameters);
  }
  
  public SandboxWebApi.DoGetWaitingFeedbacksResponse doGetWaitingFeedbacks(SandboxWebApi.DoGetWaitingFeedbacksRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetWaitingFeedbacks(parameters);
  }
  
  public SandboxWebApi.DoGetWaitingFeedbacksCountResponse doGetWaitingFeedbacksCount(SandboxWebApi.DoGetWaitingFeedbacksCountRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetWaitingFeedbacksCount(parameters);
  }
  
  public SandboxWebApi.DoLoginResponse doLogin(SandboxWebApi.DoLoginRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doLogin(parameters);
  }
  
  public SandboxWebApi.DoLoginEncResponse doLoginEnc(SandboxWebApi.DoLoginEncRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doLoginEnc(parameters);
  }
  
  public SandboxWebApi.DoLoginWithAccessTokenResponse doLoginWithAccessToken(SandboxWebApi.DoLoginWithAccessTokenRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doLoginWithAccessToken(parameters);
  }
  
  public SandboxWebApi.DoMyAccount2Response doMyAccount2(SandboxWebApi.DoMyAccount2Request parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyAccount2(parameters);
  }
  
  public SandboxWebApi.DoMyAccountItemsCountResponse doMyAccountItemsCount(SandboxWebApi.DoMyAccountItemsCountRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyAccountItemsCount(parameters);
  }
  
  public SandboxWebApi.DoMyBillingResponse doMyBilling(SandboxWebApi.DoMyBillingRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyBilling(parameters);
  }
  
  public SandboxWebApi.DoMyBillingItemResponse doMyBillingItem(SandboxWebApi.DoMyBillingItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyBillingItem(parameters);
  }
  
  public SandboxWebApi.DoMyContactResponse doMyContact(SandboxWebApi.DoMyContactRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyContact(parameters);
  }
  
  public SandboxWebApi.DoMyFeedback2Response doMyFeedback2(SandboxWebApi.DoMyFeedback2Request parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyFeedback2(parameters);
  }
  
  public SandboxWebApi.DoMyFeedback2LimitResponse doMyFeedback2Limit(SandboxWebApi.DoMyFeedback2LimitRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyFeedback2Limit(parameters);
  }
  
  public SandboxWebApi.DoNewAuctionExtResponse doNewAuctionExt(SandboxWebApi.DoNewAuctionExtRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doNewAuctionExt(parameters);
  }
  
  public SandboxWebApi.DoQueryAllSysStatusResponse doQueryAllSysStatus(SandboxWebApi.DoQueryAllSysStatusRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doQueryAllSysStatus(parameters);
  }
  
  public SandboxWebApi.DoQuerySysStatusResponse doQuerySysStatus(SandboxWebApi.DoQuerySysStatusRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doQuerySysStatus(parameters);
  }
  
  public SandboxWebApi.DoRemoveFromBlackListResponse doRemoveFromBlackList(SandboxWebApi.DoRemoveFromBlackListRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doRemoveFromBlackList(parameters);
  }
  
  public SandboxWebApi.DoRemoveFromWatchListResponse doRemoveFromWatchList(SandboxWebApi.DoRemoveFromWatchListRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doRemoveFromWatchList(parameters);
  }
  
  public SandboxWebApi.DoRemoveItemTemplatesResponse doRemoveItemTemplates(SandboxWebApi.DoRemoveItemTemplatesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doRemoveItemTemplates(parameters);
  }
  
  public SandboxWebApi.DoRequestCancelBidResponse doRequestCancelBid(SandboxWebApi.DoRequestCancelBidRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doRequestCancelBid(parameters);
  }
  
  public SandboxWebApi.DoRequestPayoutResponse doRequestPayout(SandboxWebApi.DoRequestPayoutRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doRequestPayout(parameters);
  }
  
  public SandboxWebApi.DoRequestSurchargeResponse doRequestSurcharge(SandboxWebApi.DoRequestSurchargeRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doRequestSurcharge(parameters);
  }
  
  public SandboxWebApi.DoSearchResponse doSearch(SandboxWebApi.DoSearchRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSearch(parameters);
  }
  
  public SandboxWebApi.DoSellSomeAgainResponse doSellSomeAgain(SandboxWebApi.DoSellSomeAgainRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSellSomeAgain(parameters);
  }
  
  public SandboxWebApi.DoSellSomeAgainInShopResponse doSellSomeAgainInShop(SandboxWebApi.DoSellSomeAgainInShopRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSellSomeAgainInShop(parameters);
  }
  
  public SandboxWebApi.DoSendEmailToUserResponse doSendEmailToUser(SandboxWebApi.DoSendEmailToUserRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSendEmailToUser(parameters);
  }
  
  public SandboxWebApi.DoSendPostBuyFormResponse doSendPostBuyForm(SandboxWebApi.DoSendPostBuyFormRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSendPostBuyForm(parameters);
  }
  
  public SandboxWebApi.DoSendRefundFormResponse doSendRefundForm(SandboxWebApi.DoSendRefundFormRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSendRefundForm(parameters);
  }
  
  public SandboxWebApi.DoSetFreeDeliveryAmountResponse doSetFreeDeliveryAmount(SandboxWebApi.DoSetFreeDeliveryAmountRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSetFreeDeliveryAmount(parameters);
  }
  
  public SandboxWebApi.DoSetShipmentPriceTypeResponse doSetShipmentPriceType(SandboxWebApi.DoSetShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSetShipmentPriceType(parameters);
  }
  
  public SandboxWebApi.DoSetUserLicenceDateResponse doSetUserLicenceDate(SandboxWebApi.DoSetUserLicenceDateRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSetUserLicenceDate(parameters);
  }
  
  public SandboxWebApi.DoShowCatResponse doShowCat(SandboxWebApi.DoShowCatRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doShowCat(parameters);
  }
  
  public SandboxWebApi.DoShowItemInfoExtResponse doShowItemInfoExt(SandboxWebApi.DoShowItemInfoExtRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doShowItemInfoExt(parameters);
  }
  
  public SandboxWebApi.DoShowUserResponse doShowUser(SandboxWebApi.DoShowUserRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doShowUser(parameters);
  }
  
  public SandboxWebApi.DoShowUserPageResponse doShowUserPage(SandboxWebApi.DoShowUserPageRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doShowUserPage(parameters);
  }
  
  public SandboxWebApi.DoVerifyItemResponse doVerifyItem(SandboxWebApi.DoVerifyItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doVerifyItem(parameters);
  }
  
  
}