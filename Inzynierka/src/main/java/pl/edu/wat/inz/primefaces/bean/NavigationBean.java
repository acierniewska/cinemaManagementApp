package pl.edu.wat.inz.primefaces.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "naviBean")
@RequestScoped
public class NavigationBean {
	private int activeindex;

	public int getActiveindex() {
		return activeindex;
	}

	public void setActiveindex(int activeindex) {
		this.activeindex = activeindex;
	}

	public String navigate(int pom) {
		setActiveindex(pom);
		String val = null;
		if (pom == 1) {
			val = "index";
		} else if (pom == 2) {
			val = "list";
		}

		return val;
	}
}
