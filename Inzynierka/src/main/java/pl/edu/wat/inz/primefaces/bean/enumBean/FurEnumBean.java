package pl.edu.wat.inz.primefaces.bean.enumBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import pl.edu.wat.inz.basic.enums.FurColour;
import pl.edu.wat.inz.basic.enums.FurLength;

@ManagedBean(name = "furEB")
@ViewScoped
public class FurEnumBean {
	private int colourId;
	private int lengthId;
	private String colour;
	private String length;
	private FurColour[] colours = FurColour.values();
	private FurLength[] lengths = FurLength.values();

	public int getColourId() {
		return colourId;
	}

	public void setColourId(int colourId) {
		this.colourId = colourId;
		setColour(FurColour.fromIntValue(colourId).toString());
	}

	public int getLengthId() {
		return lengthId;
	}

	public void setLengthId(int lengthId) {
		this.lengthId = lengthId;
		setLength(FurLength.fromIntValue(lengthId).toString());
	}

	public String getLength(int lengthId) {
		setLengthId(lengthId);
		return length;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getColour() {
		return colour;
	}

	public String getColour(int colourId) {
		setColourId(colourId);
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public FurColour[] getColours() {
		return colours;
	}

	public void setColours(FurColour[] colours) {
		this.colours = colours;
	}

	public FurLength[] getLengths() {
		return lengths;
	}

	public void setLengths(FurLength[] lengths) {
		this.lengths = lengths;
	}

}
