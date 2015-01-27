package pl.edu.wat.inz.basic.allegro;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;

import pl.edu.wat.inz.basic.allegro.enums.CategoryType;
import SandboxWebApi.DoGetSellFormFieldsExtRequest;
import SandboxWebApi.DoGetSellFormFieldsExtResponse;
import SandboxWebApi.DoGetSellFormFieldsForCategoryRequest;
import SandboxWebApi.DoGetSellFormFieldsForCategoryResponse;
import SandboxWebApi.DoLoginRequest;
import SandboxWebApi.DoLoginResponse;
import SandboxWebApi.DoNewAuctionExtRequest;
import SandboxWebApi.DoNewAuctionExtResponse;
import SandboxWebApi.DoQuerySysStatusRequest;
import SandboxWebApi.DoQuerySysStatusResponse;
import SandboxWebApi.FieldsValue;
import SandboxWebApi.ItemTemplateCreateStruct;
import SandboxWebApi.ServiceBindingStub;
import SandboxWebApi.VariantQuantityStruct;
import SandboxWebApi.VariantStruct;

public class TestAllegro {

	public static void main(String[] args) {
		try {
			String urlS = "https://webapi.allegro.pl.webapisandbox.pl/service.php";
			java.net.URL url = new java.net.URL(urlS);
			org.apache.axis.client.Service service = new org.apache.axis.client.Service();
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(new java.net.URL(urlS));
			call.setOperationName(new QName("retriveData"));
			ServiceBindingStub proxy = new ServiceBindingStub(url, service);
			String webkey = "s669ce9b";
			String pass = "669ce9b035bb44c2";
			String user = "a_cierniewska";
			int country_code = 1;
			int sysvar = 2;
			DoQuerySysStatusRequest parameters = new DoQuerySysStatusRequest(
					AllegroConst.SYSVAR, AllegroConst.COUNTRY_CODE,
					AllegroConst.WEB_KEY);
			DoQuerySysStatusResponse response = proxy
					.doQuerySysStatus(parameters);

			long verKey = response.getVerKey();
			DoLoginRequest loginReq = new DoLoginRequest(user, pass,
					country_code, webkey, verKey);
			DoLoginResponse loginResponse = proxy.doLogin(loginReq);

			/*
			 * Long userId = new Long(loginResponse.getUserId());
			 * 
			 * DoGetUserItemsRequest userItems = new DoGetUserItemsRequest(
			 * 40760228, webkey, country_code, null, null);
			 * 
			 * DoGetUserItemsResponse userItemResponse = proxy
			 * .doGetUserItems(userItems);
			 * 
			 * UserItemList[] itemList = userItemResponse.getUserItemList(); if
			 * (itemList.length == 0) { System.out.println("pusto :CCCC"); } for
			 * (int i = 0; i < itemList.length; i++) {
			 * System.out.println(userId);
			 * System.out.println(itemList[i].getItId());
			 * System.out.println(itemList[i].getItName());
			 * System.out.println(itemList[i].getItBuyNowPrice());
			 * System.out.println(itemList[i].getItThumbUrl()); }
			 */

			String sessionHandler = loginResponse.getSessionHandlePart();

			DoGetSellFormFieldsExtRequest fields = new DoGetSellFormFieldsExtRequest(
					AllegroConst.COUNTRY_CODE, new Long(3L),
					AllegroConst.WEB_KEY);
			DoGetSellFormFieldsExtResponse fieldsRes = proxy
					.doGetSellFormFieldsExt(fields);

			DoGetSellFormFieldsForCategoryRequest statesre = new DoGetSellFormFieldsForCategoryRequest(
					AllegroConst.WEB_KEY, AllegroConst.COUNTRY_CODE,
					CategoryType.OTHER.getIntValue());
			DoGetSellFormFieldsForCategoryResponse res = proxy
					.doGetSellFormFieldsForCategory(statesre);

			FieldsValue[] values = new FieldsValue[15];
			FieldsValue val1 = createFieldsValue();
			val1.setFid(1);
			val1.setFvalueString("Test");
			values[0] = val1;

			FieldsValue val2 = createFieldsValue();
			val2.setFid(2);
			val2.setFvalueInt(CategoryType.OTHER.getIntValue());
			values[1] = val2;

			FieldsValue val3 = createFieldsValue();
			val3.setFid(4);
			val3.setFvalueInt(1);
			values[2] = val3;

			FieldsValue val4 = createFieldsValue();
			val4.setFid(5);
			val4.setFvalueInt(1);
			values[3] = val4;

			FieldsValue val5 = createFieldsValue();
			val5.setFid(8);
			val5.setFvalueFloat(10.0f);
			values[4] = val5;

			FieldsValue val6 = createFieldsValue();
			val6.setFid(9);
			val6.setFvalueInt(1);
			values[5] = val6;

			FieldsValue val9 = createFieldsValue();
			val9.setFid(10);
			val9.setFvalueInt(7);
			values[6] = val9;

			FieldsValue val10 = createFieldsValue();
			val10.setFid(11);
			val10.setFvalueString("Warszawa");
			values[7] = val10;

			FieldsValue val11 = createFieldsValue();
			val11.setFid(12);
			val11.setFvalueInt(1);
			values[8] = val11;

			FieldsValue val12 = createFieldsValue();
			val12.setFid(13);
			val12.setFvalueInt(1);
			values[9] = val12;

			FieldsValue val14 = createFieldsValue();
			val14.setFid(14);
			val14.setFvalueInt(1);
			values[10] = val14;

			FieldsValue val15 = createFieldsValue();
			val15.setFid(24);
			val15.setFvalueString("Opisik wow");
			values[11] = val15;

			FieldsValue val16 = createFieldsValue();
			val16.setFid(32);
			val16.setFvalueString("00-940");
			values[12] = val16;

			FieldsValue val17 = createFieldsValue();
			val17.setFid(35);
			val17.setFvalueInt(1);
			values[13] = val17;

			FieldsValue val18 = createFieldsValue();
			val18.setFid(19505);
			val18.setFvalueInt(1);
			values[14] = val18;

			VariantStruct[] variant = new VariantStruct[1];
			VariantQuantityStruct[] quanities = new VariantQuantityStruct[1];
			VariantQuantityStruct q = new VariantQuantityStruct(256, 5);
			quanities[0] = q;
			VariantStruct v = new VariantStruct(23604, quanities);
			variant[0] = v;

			DoNewAuctionExtRequest reqac = new DoNewAuctionExtRequest(
					sessionHandler, values, 0, AllegroConst.COUNTRY_CODE,
					new ItemTemplateCreateStruct(0, "nazwa"), null);
			DoNewAuctionExtResponse resac = proxy.doNewAuctionExt(reqac);
			resac.getItemId();

		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	private static FieldsValue createFieldsValue() {
		FieldsValue val = new FieldsValue();
		val.setFvalueString("");
		val.setFvalueDatetime(0.0f);
		val.setFvalueFloat(0.0f);
		val.setFvalueInt(0);
		val.setFvalueDate("");

		return val;
	}
}