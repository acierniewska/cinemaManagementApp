package pl.edu.wat.inz.primefaces.converter;

import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import pl.edu.wat.inz.hibernate.data.Person;
import pl.edu.wat.inz.primefaces.bean.managedBean.PersonManagedBean;

@FacesConverter("personConverter")
public class PersonConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if (value != null && value.trim().length() > 0) {
			try {
				Map<String, Object> map = fc.getExternalContext()
						.getApplicationMap();
				PersonManagedBean mb = (PersonManagedBean) map.get("personMB");
				List<Person> personList = mb.getPersonList();
				for (Person p : personList) {
					if (((String) value).equals(p.getPersonName())) {
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
		if (object instanceof Person && object != null) {
			return ((Person) object).getPersonName();
		} else {
			return null;
		}
	}

}
