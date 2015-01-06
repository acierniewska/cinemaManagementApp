package pl.edu.wat.inz.primefaces.bean;

import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

@ManagedBean(name = "securityBean")
@SessionScoped
public class SecurityHolderBean {

	private boolean isUserAdmin = false;
	private boolean isUserModer = false;
	private boolean isUser = false;

	/** The show admin personal page. */
	private boolean showAdminPersonalPage = false;

	/**
	 * Gets the checks if is user admin.
	 * 
	 * @return the checks if is user admin
	 */
	public boolean getIsUserAdmin() {
		isUserAdmin = false;
		Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();
		for (GrantedAuthority grantedAuthority : authentication
				.getAuthorities()) {
			if ("ROLE_ADMIN".equals(grantedAuthority.getAuthority())) {
				isUserAdmin = true;
				break;
			}
		}
		return isUserAdmin;
	}

	/**
	 * Gets the checks if is user guest.
	 * 
	 * @return the checks if is user guest
	 */
	public boolean getIsUserModer() {
		isUserModer = false;
		Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();
		for (GrantedAuthority grantedAuthority : authentication
				.getAuthorities()) {
			if ("ROLE_MODERATOR".equals(grantedAuthority.getAuthority())) {
				isUserModer = true;
				break;
			}
		}
		return isUserModer;
	}

	/**
	 * Sets the user admin.
	 * 
	 * @param isUserAdmin
	 *            the new user admin
	 */
	public void setUserAdmin(boolean isUserAdmin) {
		this.isUserAdmin = isUserAdmin;
	}

	/**
	 * Sets the user guest.
	 * 
	 * @param isUserModer
	 *            the new user guest
	 */
	public void setUserModer(boolean isUserModer) {
		this.isUserModer = isUserModer;
	}

	/**
	 * Sets the user.
	 * 
	 * @param isUser
	 *            the new user
	 */
	public void setIsUser(boolean isUser) {
		this.isUser = isUser;
	}

	/**
	 * Checks if is user.
	 * 
	 * @return true, if is user
	 */
	public boolean getIsUser() {
		isUser = false;
		Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();
		for (GrantedAuthority grantedAuthority : authentication
				.getAuthorities()) {
			if ("ROLE_USER".equals(grantedAuthority.getAuthority())) {
				isUser = true;
				break;
			}
		}
		return isUser;
	}

	/**
	 * Sets the show admin personal page.
	 * 
	 * @param showAdminPersonalPage
	 *            the new show admin personal page
	 */
	public void setShowAdminPersonalPage(boolean showAdminPersonalPage) {
		this.showAdminPersonalPage = showAdminPersonalPage;
	}

	/**
	 * Gets the show admin personal page.
	 * 
	 * @return the show admin personal page
	 */
	public boolean getShowAdminPersonalPage() {
		showAdminPersonalPage = false;
		if (getIsUserAdmin()) {
			showAdminPersonalPage = true;
		} else {
			/**
			 * Randomly decide whether to show admin Personal Page or not.
			 */
			Random random = new Random();
			if (random.nextInt(2) % 2 == 0) {
				showAdminPersonalPage = true;
			}
		}
		return showAdminPersonalPage;
	}
}