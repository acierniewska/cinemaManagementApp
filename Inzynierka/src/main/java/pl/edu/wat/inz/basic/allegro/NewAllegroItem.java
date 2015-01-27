package pl.edu.wat.inz.basic.allegro;

import java.io.Serializable;

public class NewAllegroItem implements Serializable {
	private static final long serialVersionUID = 1L;

	public NewAllegroItem(String name, float amount, String description,
			int numberOfItems) {
		this.name = name;
		this.amount = amount;
		this.desciption = description;
		this.numberOfItems = numberOfItems;
	}

	public NewAllegroItem() {
	}

	private String name;
	private float amount;
	private String desciption;
	private int numberOfItems;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

}
