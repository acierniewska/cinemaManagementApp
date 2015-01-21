package pl.edu.wat.inz.primefaces.converter;

import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import pl.edu.wat.inz.hibernate.data.Animal;
import pl.edu.wat.inz.primefaces.bean.managedBean.AnimalManagedBean;

@FacesConverter("animalConverter")
public class AnimalConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if (value != null && value.trim().length() > 0) {
			try {
				Map<String, Object> map = fc.getExternalContext()
						.getApplicationMap();
				AnimalManagedBean mb = (AnimalManagedBean) map.get("animalMB");
				List<Animal> animalList = mb.getAnimalList();
				for (Animal p : animalList) {
					if (((String) value).equals(p.getAnimalName())) {
						return p;
					}
				}
				return null;
			} catch (NumberFormatException e) {
				throw new ConverterException(new FacesMessage(
						FacesMessage.SEVERITY_ERROR, "B³¹d konwersji",
						"Z³a konwersja"));
			}
		} else {
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		if (object instanceof Animal && object != null) {
			return ((Animal) object).getAnimalName();
		} else {
			return null;
		}
	}
}
