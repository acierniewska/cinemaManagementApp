package pl.edu.wat.inz.primefaces.bean.enumBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import pl.edu.wat.inz.basic.enums.EventType;

@ManagedBean(name = "eventTypeEB")
@ViewScoped
public class EventTypeEnumBean {
	private int typeId;
	private String type;
	private EventType[] types = EventType.values();

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
		setType(EventType.fromIntValue(typeId).toString());
	}

	public String getType() {
		return type;
	}

	public String getType(int typeId) {
		setTypeId(typeId);
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public EventType[] getTypes() {
		return types;
	}

	public void setTypes(EventType[] types) {
		this.types = types;
	}

}
