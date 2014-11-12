package pl.edu.wat.inz.primefaces.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import pl.edu.wat.inz.hibernate.data.Cat;
import pl.edu.wat.inz.spring.service.CatService;

@ManagedBean
@SessionScoped
public class RegisterCat {

	@ManagedProperty("#{catService}")
	private CatService catService;

	private Cat cat = new Cat();

	public String register() {
		catService.register(cat);
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage("The cat " + this.cat.getName()
						+ " Is Registered Successfully"));
		return "";
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public CatService getCatService() {
		return catService;
	}

	public void setCatService(CatService catService) {
		this.catService = catService;
	}

}
