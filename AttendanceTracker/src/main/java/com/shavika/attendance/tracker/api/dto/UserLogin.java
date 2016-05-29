package com.shavika.attendance.tracker.api.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.shavika.attendance.tracker.common.dao.UserDao;

@Entity
@Table(name = "USER_LOGIN")
@NamedQueries({ @NamedQuery(name = UserDao.GET_USER_BY_NAME, query = "from UserLogin as userLogin where (userLogin.username=? and userLogin.status =1)"),
	@NamedQuery(name = UserDao.GET_USER_BY_EMAIL, query = "from UserLogin as userLogin where (userLogin.email=? and userLogin.status =1)"),
	@NamedQuery(name = UserDao.GET_ANY_USER_BY_NAME, query = "from UserLogin as userLogin where (userLogin.username=?)") })
public class UserLogin extends BaseDomain {

	private static final long serialVersionUID = 7837303325516366834L;

	@Id
	@GeneratedValue
	@Column(name = "USER_LOGIN_ID")
	private long id;

	@Column(name = "EMAIL", length = 80, nullable = false)
	private String email;

	@Column(name = "USERNAME", length = 55, nullable = false)
	private String username;

	@Column(name = "PASSWORD", length = 80, nullable = false)
	private String password;

	@Column(name = "STATUS", columnDefinition = "boolean default true", nullable = false)
	private boolean status;

	@Column(name = "LOGIN_ATTEMPTS", nullable = false)
	private int loginAttempts;

	@Column(name = "USER_INDENTIFICATION_NO", length = 60)
	private String userIdentificationNo;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ROLE_ID")
	private Roles roles;

	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLogin(String email, String username, String password, boolean status, int loginAttempts, String userIdentificationNo, Roles roles) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.status = status;
		this.loginAttempts = loginAttempts;
		this.userIdentificationNo = userIdentificationNo;
		this.roles = roles;
	}

	public UserLogin(String email, String username, String password, boolean status, int loginAttempts, String userIdentificationNo) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.status = status;
		this.loginAttempts = loginAttempts;
		this.userIdentificationNo = userIdentificationNo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getLoginAttempts() {
		return loginAttempts;
	}

	public void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;
	}

	public String getUserIdentificationNo() {
		return userIdentificationNo;
	}

	public void setUserIdentificationNo(String userIdentificationNo) {
		this.userIdentificationNo = userIdentificationNo;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "UserLogin [id=" + id + ", email=" + email + ", username=" + username + ", password=" + password + ", status=" + status + ", loginAttempts="
				+ loginAttempts + ", userIdentificationNo=" + userIdentificationNo + ", roles=" + roles + "]";
	}
}
