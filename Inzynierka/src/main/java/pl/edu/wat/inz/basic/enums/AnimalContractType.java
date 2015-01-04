package pl.edu.wat.inz.basic.enums;

public enum AnimalContractType {
	ADOPTION(0, "Umowa adopcyjna"), TEMP_HOUSE(1, "Umowa Domu Tymczasowego");

	private int intValue;
	private String name;

	private AnimalContractType(int intValue, String name) {
		this.intValue = intValue;
		this.name = name;
	}

	public static AnimalContractType fromIntValue(int intVal) {
		AnimalContractType[] types = AnimalContractType.values();
		for (int i = 0; i < types.length; i++) {
			if (types[i].intValue == intVal) {
				return types[i];
			}
		}

		return null;
	}

	@Override
	public String toString() {
		return name;
	}

	public int getIntVal() {
		return intValue;
	}

}
