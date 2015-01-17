package pl.edu.wat.inz.primefaces.bean.enumBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import pl.edu.wat.inz.basic.enums.ApplicationType;

@ManagedBean(name = "appTypeEB")
@ViewScoped
public class ApplicationTypeEnumBean {
	private int typeId;
	private String type;
	private ApplicationType[] types = ApplicationType.values();

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
		setType(ApplicationType.fromIntValue(typeId).toString());
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

	public ApplicationType[] getTypes() {
		return types;
	}

	public void setTypes(ApplicationType[] types) {
		this.types = types;
	}

}
