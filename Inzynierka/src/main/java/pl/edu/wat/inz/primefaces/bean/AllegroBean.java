package pl.edu.wat.inz.primefaces.bean;

import static pl.edu.wat.inz.basic.allegro.AllegroConst.COUNTRY_CODE;
import static pl.edu.wat.inz.basic.allegro.AllegroConst.WEB_KEY;

import java.rmi.RemoteException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pl.edu.wat.inz.spring.service.AllegroService;
import SandboxWebApi.DoGetUserItemsRequest;
import SandboxWebApi.DoGetUserItemsResponse;
import SandboxWebApi.ServiceBindingStub;
import SandboxWebApi.UserItemList;

@ManagedBean(name = "allegroBean")
@SessionScoped
public class AllegroBean {
	@ManagedProperty("#{AllegroService}")
	private AllegroService service;

	private int itemNr;
	private UserItemList item;
	private long userId = -1;
	private ServiceBindingStub proxy;
	private UserItemList[] itemList;

	@PostConstruct
	public void init() {
		if (proxy == null || userId == -1) {
			service.logToAllegro();
			proxy = service.getProxy();
			userId = service.getUserId();
		}

		if (itemList == null) {
			DoGetUserItemsRequest userItems = new DoGetUserItemsRequest(
					39800168, WEB_KEY, COUNTRY_CODE, null, null);
			try {
				DoGetUserItemsResponse userItemResponse = proxy
						.doGetUserItems(userItems);
				itemList = userItemResponse.getUserItemList();
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}

		if (itemList.length == 0) {

		} else {
			itemNr = 0;
			item = itemList[itemNr];
		}
	}

	public String getAllegroSandboxUrl() {
		return "http://allegro.pl.webapisandbox.pl/i" + item.getItId()
				+ ".html";
	}

	public long getUserId() {
		return userId;
	}

	public long getItemId() {
		return item.getItId();
	}

	public String getItemName() {
		return item.getItName();
	}

	public String getThumbUrl() {
		return item.getItThumbUrl();
	}

	public float getPrice() {
		return item.getItBuyNowPrice();
	}

	public void incrementUserNr() {
		if (itemNr + 1 < itemList.length) {
			itemNr++;
			reloadItem();
		}
	}

	public void decrementUserNr() {
		if (itemNr - 1 >= 0) {
			itemNr--;
			reloadItem();
		}
	}

	private void reloadItem() {
		item = itemList[itemNr];
	}

	public AllegroService getService() {
		return service;
	}

	public void setService(AllegroService service) {
		this.service = service;
	}

}
