package pl.edu.wat.inz.hibernate.data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@Column(name = "ROLE_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roleId;

	@Column(name = "ROLE_TYPE", nullable = false, length = 32)
	private String roleType;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID") }, inverseJoinColumns = { @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID") })
	private Set<User> userRoles = new HashSet<User>();

	@ManyToMany(targetEntity = Event.class)
	@org.hibernate.annotations.Cascade({
			org.hibernate.annotations.CascadeType.SAVE_UPDATE,
			org.hibernate.annotations.CascadeType.LOCK })
	@JoinTable(name = "event_for_role", joinColumns = { @JoinColumn(name = "ROLE_ID") }, inverseJoinColumns = { @JoinColumn(name = "EVENT_ID") })
	private Set<Event> event = new HashSet<Event>();

	public Integer getId() {
		return roleId;
	}

	public void setId(Integer id) {
		this.roleId = id;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String role) {
		this.roleType = role;
	}

	public Set<User> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<User> userRoles) {
		this.userRoles = userRoles;
	}

}