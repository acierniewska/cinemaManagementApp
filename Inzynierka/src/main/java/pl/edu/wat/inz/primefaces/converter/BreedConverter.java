package pl.edu.wat.inz.primefaces.converter;

import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import pl.edu.wat.inz.hibernate.data.Breed;
import pl.edu.wat.inz.primefaces.bean.managedBean.BreedManagedBean;

@FacesConverter("breedConverter")
public class BreedConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if (value != null && value.trim().length() > 0) {
			try {
				Map<String, Object> map = fc.getExternalContext()
						.getApplicationMap();
				BreedManagedBean mb = (BreedManagedBean) map.get("breedMB");
				List<Breed> breedList = mb.getBreedList();
				for (Breed b : breedList) {
					if (((String) value).equals(b.getBreedName())) {
						return b;
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
		if (object instanceof Breed && object != null) {
			return ((Breed) object).getBreedName();
		} else {
			return null;
		}
	}

}
