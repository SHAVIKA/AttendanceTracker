package com.shavika.attendance.tracker.api.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.shavika.attendance.tracker.common.dao.RoleDao;

@Entity
@Table(name = "ROLE")
@NamedQueries({ @NamedQuery(name = RoleDao.GET_USER_ROLE_BY_ROLE_NAME, query = "from Roles as roles where (roles.role=?)"),
	@NamedQuery(name = RoleDao.GET_USER_ROLE_BY_ROLE_ID, query = "from Roles as roles where (roles.id=?)") })
public class Roles extends BaseDomain {

	private static final long serialVersionUID = 1517936975119656721L;

	@Id
	@GeneratedValue
	@Column(name = "ROLE_ID")
	private long id;

	@Column(name = "ROLE", length = 50, nullable = false)
	private String role;

	@Column(name = "DESCRIPTION", length = 80)
	private String description;

	@Column(name = "IS_SYSTEM_ROLE", columnDefinition = "boolean default true", nullable = false)
	private boolean isSystemRole;

	@OneToMany(mappedBy = "roles", cascade = CascadeType.ALL)
	private Set<UserLogin> userLogin;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinTable(name = "ROLE_PRIVILEGE", joinColumns = { @JoinColumn(name = "ROLE_ID") }, inverseJoinColumns = { @JoinColumn(name = "PRIVILEGE_ID") })
	private Set<Privilege> privileges = new HashSet<Privilege>();

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roles(String role, String description, boolean isSystemRole, Set<UserLogin> userLogin, Set<Privilege> privileges) {
		super();
		this.role = role;
		this.description = description;
		this.isSystemRole = isSystemRole;
		this.userLogin = userLogin;
		this.privileges = privileges;
	}

	public Roles(String role, String description, boolean isSystemRole, Set<Privilege> privileges) {
		super();
		this.role = role;
		this.description = description;
		this.isSystemRole = isSystemRole;
		this.privileges = privileges;
	}

	public Roles(String role, String description, boolean isSystemRole) {
		super();
		this.role = role;
		this.description = description;
		this.isSystemRole = isSystemRole;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isSystemRole() {
		return isSystemRole;
	}

	public void setSystemRole(boolean isSystemRole) {
		this.isSystemRole = isSystemRole;
	}

	public Set<UserLogin> getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(Set<UserLogin> userLogin) {
		this.userLogin = userLogin;
	}

	public Set<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}

	@Override
	public String toString() {
		return "Roles [id=" + id + ", role=" + role + ", description=" + description + ", isSystemRole=" + isSystemRole + ", userLogin=" + userLogin + ", privileges="
				+ privileges + "]";
	}
}