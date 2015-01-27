package pl.edu.wat.inz.spring.service;

import static pl.edu.wat.inz.basic.allegro.AllegroConst.COUNTRY_CODE;
import static pl.edu.wat.inz.basic.allegro.AllegroConst.PASSWORD;
import static pl.edu.wat.inz.basic.allegro.AllegroConst.SYSVAR;
import static pl.edu.wat.inz.basic.allegro.AllegroConst.USER;
import static pl.edu.wat.inz.basic.allegro.AllegroConst.WEB_KEY;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.springframework.stereotype.Service;

import SandboxWebApi.DoLoginRequest;
import SandboxWebApi.DoLoginResponse;
import SandboxWebApi.DoQuerySysStatusRequest;
import SandboxWebApi.DoQuerySysStatusResponse;
import SandboxWebApi.ServiceBindingStub;

@Service("AllegroService")
public class AllegroService {
	private ServiceBindingStub proxy;
	private long userId = -1;
	private String sessionHandler;

	public void logToAllegro() {
		String urlS = "https://webapi.allegro.pl.webapisandbox.pl/service.php";
		java.net.URL url;
		try {
			url = new java.net.URL(urlS);
			org.apache.axis.client.Service service = new org.apache.axis.client.Service();
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(new java.net.URL(urlS));
			call.setOperationName(new QName("retriveData"));
			proxy = new ServiceBindingStub(url, service);
			DoQuerySysStatusRequest parameters = new DoQuerySysStatusRequest(
					SYSVAR, COUNTRY_CODE, WEB_KEY);
			DoQuerySysStatusResponse response = proxy
					.doQuerySysStatus(parameters);

			long verKey = response.getVerKey();
			DoLoginRequest loginReq = new DoLoginRequest(USER, PASSWORD,
					COUNTRY_CODE, WEB_KEY, verKey);
			DoLoginResponse loginResponse = proxy.doLogin(loginReq);

			setUserId(new Long(loginResponse.getUserId()));
			setSessionHandler(loginResponse.getSessionHandlePart());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public ServiceBindingStub getProxy() {
		return proxy;
	}

	public void setProxy(ServiceBindingStub proxy) {
		this.proxy = proxy;
	}

	public String getSessionHandler() {
		return sessionHandler;
	}

	public void setSessionHandler(String sessionHandler) {
		this.sessionHandler = sessionHandler;
	}
}
