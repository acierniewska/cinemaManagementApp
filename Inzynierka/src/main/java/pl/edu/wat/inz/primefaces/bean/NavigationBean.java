package pl.edu.wat.inz.primefaces.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "naviBean")
@SessionScoped
public class NavigationBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private int activeindex;

	public int getActiveindex() {
		return activeindex;
	}

	public void setActiveindex(int activeindex) {
		this.activeindex = activeindex;
	}

	public String navigate(int pom) {
		String val = null;
		if (pom == 1) {
			val = "index";
			setActiveindex(0);
		} else if (pom == 2) {
			val = "list";
			setActiveindex(0);
		} else if (pom == 3) {
			val = "allCatAdopt";
			setActiveindex(1);
		} else if (pom == 4) {
			val = "application";
			setActiveindex(2);
		} else if (pom == 5) {
			val = "applicationList";
			setActiveindex(2);
		} else if (pom == 10) {
			val = "vetList";
			setActiveindex(5);
		}

		return val;
	}

}
