package pl.edu.wat.inz.primefaces.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

@ManagedBean(name = "loginMgmtBean")
@SessionScoped
public class LoginBean {

	private String userName = null;
	private String password = null;

	@ManagedProperty(value = "#{authenticationManager}")
	private AuthenticationManager authenticationManager = null;

	public String login() {
		try {
			Authentication request = new UsernamePasswordAuthenticationToken(
					this.getUserName(), this.getPassword());
			Authentication result = authenticationManager.authenticate(request);
			SecurityContextHolder.getContext().setAuthentication(result);
		} catch (AuthenticationException e) {
			e.printStackTrace();
			return "incorrect";
		}
		return "correct";
	}

	public String cancel() {
		return null;
	}

	public String register() {
		return "register";
	}

	public String logout() {
		SecurityContextHolder.clearContext();
		return "loggedout";
	}

	public AuthenticationManager getAuthenticationManager() {
		return authenticationManager;
	}

	public void setAuthenticationManager(
			AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	public String getUserName() {
		if (userName == null) {
			String name = SecurityContextHolder.getContext()
					.getAuthentication().getName();
			if (!name.equals("anonymousUser")) {
				userName = name;
			}
		}

		return userName;

	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}