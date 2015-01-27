package pl.edu.wat.inz.primefaces.bean;

import static pl.edu.wat.inz.basic.allegro.AllegroConst.COUNTRY_CODE;
import static pl.edu.wat.inz.basic.allegro.AllegroConst.USER_ID;
import static pl.edu.wat.inz.basic.allegro.AllegroConst.WEB_KEY;

import java.io.Serializable;
import java.rmi.RemoteException;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import pl.edu.wat.inz.basic.allegro.AllegroConst;
import pl.edu.wat.inz.basic.allegro.NewAllegroItem;
import pl.edu.wat.inz.basic.allegro.enums.CategoryType;
import pl.edu.wat.inz.spring.service.AllegroService;
import SandboxWebApi.DoGetUserItemsRequest;
import SandboxWebApi.DoGetUserItemsResponse;
import SandboxWebApi.DoNewAuctionExtRequest;
import SandboxWebApi.DoNewAuctionExtResponse;
import SandboxWebApi.FieldsValue;
import SandboxWebApi.ItemTemplateCreateStruct;
import SandboxWebApi.ServiceBindingStub;
import SandboxWebApi.UserItemList;
import SandboxWebApi.VariantQuantityStruct;
import SandboxWebApi.VariantStruct;

@ManagedBean(name = "allegroBean")
@SessionScoped
public class AllegroBean implements Serializable {
	private static final long serialVersionUID = -1953648889877863559L;

	@ManagedProperty("#{AllegroService}")
	private AllegroService service;
	private ServiceBindingStub proxy;
	private UserItemList[] itemList;
	private UserItemList item;
	private long userId = -1;
	private int itemNr = -1;
	private NewAllegroItem newAllegroItem = new NewAllegroItem();

	@PostConstruct
	public void init() {
		if (proxy == null || userId == -1) {
			service.logToAllegro();
			proxy = service.getProxy();
			userId = service.getUserId();
		}
		DoGetUserItemsRequest userItems = new DoGetUserItemsRequest(USER_ID,
				WEB_KEY, COUNTRY_CODE, null, null);
		try {
			DoGetUserItemsResponse userItemResponse = proxy
					.doGetUserItems(userItems);
			itemList = userItemResponse.getUserItemList();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		if (itemList != null && itemList.length > 0) {
			itemNr = 0;
			item = itemList[itemNr];
		}
	}

	public void addNewAllegroItem() {
		FieldsValue[] values = new FieldsValue[15];
		FieldsValue val1 = createFieldsValue();
		val1.setFid(1);
		val1.setFvalueString(newAllegroItem.getName());
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
		val4.setFvalueInt(newAllegroItem.getNumberOfItems());
		values[3] = val4;

		FieldsValue val5 = createFieldsValue();
		val5.setFid(8);
		val5.setFvalueFloat(newAllegroItem.getAmount());
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
		val15.setFvalueString(newAllegroItem.getDesciption());
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
				service.getSessionHandler(), values, 0,
				AllegroConst.COUNTRY_CODE, new ItemTemplateCreateStruct(0,
						"nazwa"), null);
		try {
			DoNewAuctionExtResponse resac = proxy.doNewAuctionExt(reqac);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		addMessage("Aukcja zosta³a dodana pomyœlnie");
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

	public String getAllegroSandboxUrl() {
		return item == null ? "" : "http://allegro.pl.webapisandbox.pl/i"
				+ item.getItId() + ".html";
	}

	public long getUserId() {
		return userId;
	}

	public long getItemId() {
		return item == null ? 0 : item.getItId();
	}

	public String getItemName() {
		return item == null ? "Brak" : item.getItName();
	}

	public String getThumbUrl() {
		return item == null ? "" : item.getItThumbUrl();
	}

	public float getPrice() {
		return item == null ? 0.0f : item.getItBuyNowPrice();
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

	public ServiceBindingStub getProxy() {
		return proxy;
	}

	public void setProxy(ServiceBindingStub proxy) {
		this.proxy = proxy;
	}

	public UserItemList[] getItemList() {
		return itemList;
	}

	public void setItemList(UserItemList[] itemList) {
		this.itemList = itemList;
	}

	public UserItemList getItem() {
		return item;
	}

	public void setItem(UserItemList item) {
		this.item = item;
	}

	public int getItemNr() {
		return itemNr;
	}

	public void setItemNr(int itemNr) {
		this.itemNr = itemNr;
	}

	public NewAllegroItem getNewAllegroItem() {
		return newAllegroItem;
	}

	public void setNewAllegroItem(NewAllegroItem newAllegroItem) {
		this.newAllegroItem = newAllegroItem;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

}
