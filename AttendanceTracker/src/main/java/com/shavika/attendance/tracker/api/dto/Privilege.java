package com.shavika.attendance.tracker.api.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRIVILEGE")
// @NamedQueries({ @NamedQuery(name = Privilege.GET_PRIVILEGES_BY_USER_ROLE,
// query = "SELECT DISTINCT P.* FROM PRIVILEGE P INNER JOIN ROLE_PRIVILEGE RP ON RP.PRIVILEGE_ID = P.PRIVILEGE_ID INNER JOIN ROLE R ON R.ROLE_ID =
// RP.ROLE_ID WHERE R.ROLE_ID = ?") })
public class Privilege extends BaseDomain {

	private static final long serialVersionUID = 8249904600217805950L;

	protected static final String GET_PRIVILEGES_BY_USER_ROLE = "getPrivilegesByUserRole";

	@Id
	@GeneratedValue
	@Column(name = "PRIVILEGE_ID")
	private long id;

	@Column(name = "NAME", length = 80, nullable = false)
	private String name;

	@ManyToMany(mappedBy = "privileges")
	private Set<Roles> roles = new HashSet<Roles>();

	public Privilege() {
		super();
	}

	public Privilege(String name, Set<Roles> roles) {
		super();
		this.name = name;
		this.roles = roles;
	}

	public Privilege(String name) {
		super();
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Privilege [id=" + id + ", name=" + name + ", roles=" + roles + "]";
	}

}
