package pl.edu.wat.inz.basic.allegro;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;

import SandboxWebApi.DoGetUserItemsRequest;
import SandboxWebApi.DoGetUserItemsResponse;
import SandboxWebApi.DoLoginRequest;
import SandboxWebApi.DoLoginResponse;
import SandboxWebApi.DoQuerySysStatusRequest;
import SandboxWebApi.DoQuerySysStatusResponse;
import SandboxWebApi.ServiceBindingStub;
import SandboxWebApi.UserItemList;

public class TestAllegro {

	public static void main(String[] args) {
		/*
		 * AllegroWebApiPortType allegro = allegroWebApiService
		 * .getAllegroWebApiPort(); String userLogin = "a_cierniewska"; // tutaj
		 * login allegro String userPassword = "669ce9b035bb44c2"; // tutaj
		 * has³o allegro int countryCode = 1; String webapiKey = "s669ce9b"; //
		 * klucz webapi long localVersion = 1409580573; // klucz wersji
		 * StringHolder sessionHandlePart = new StringHolder(); // tutaj //
		 * znajdzie // sie id // sesji po // zalogowaniu LongHolder userId = new
		 * LongHolder(); // tutaj znajdzie sie nasz // identyfikator LongHolder
		 * serverTime = new LongHolder(); // czas allegro.doLogin(userLogin,
		 * userPassword, countryCode, webapiKey, localVersion,
		 * sessionHandlePart, userId, serverTime); // jesli nie wyskoczy zaden
		 * exception, to znaczy, ¿e logowanie sie // udalo... // to wyœwietlmy
		 * kilka danych System.out.println("Id: " + userId.value);
		 * System.out.println("identyfikator sesji: " +
		 * sessionHandlePart.value);
		 */
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
					sysvar, country_code, webkey);
			DoQuerySysStatusResponse response = proxy
					.doQuerySysStatus(parameters);

			long verKey = response.getVerKey();
			DoLoginRequest loginReq = new DoLoginRequest(user, pass,
					country_code, webkey, verKey);
			DoLoginResponse loginResponse = proxy.doLogin(loginReq);

			Long userId = new Long(loginResponse.getUserId());

			DoGetUserItemsRequest userItems = new DoGetUserItemsRequest(
					40760228, webkey, country_code, null, null);

			DoGetUserItemsResponse userItemResponse = proxy
					.doGetUserItems(userItems);

			UserItemList[] itemList = userItemResponse.getUserItemList();
			if (itemList.length == 0) {
				System.out.println("pusto :CCCC");
			}
			for (int i = 0; i < itemList.length; i++) {
				System.out.println(userId);
				System.out.println(itemList[i].getItId());
				System.out.println(itemList[i].getItName());
				System.out.println(itemList[i].getItBuyNowPrice());
				System.out.println(itemList[i].getItThumbUrl());
			}

		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}