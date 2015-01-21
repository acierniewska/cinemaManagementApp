package pl.edu.wat.inz.primefaces.bean.enumBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import pl.edu.wat.inz.basic.enums.AnimalContractType;

@ManagedBean(name = "animalContractTypeEB")
@ViewScoped
public class AnimalContractTypeEnumBean {
	private int typeId;
	private String type;
	private AnimalContractType[] types = AnimalContractType.values();

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
		setType(AnimalContractType.fromIntValue(typeId).toString());
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

	public AnimalContractType[] getTypes() {
		return types;
	}

	public void setTypes(AnimalContractType[] types) {
		this.types = types;
	}

}
