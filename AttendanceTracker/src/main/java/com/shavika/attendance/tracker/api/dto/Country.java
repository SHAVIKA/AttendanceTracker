package com.shavika.attendance.tracker.api.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country extends BaseDomain {

	private static final long serialVersionUID = 5147329079717398199L;

	@Id
	@GeneratedValue
	@Column(name = "COUNTRY_ID")
	private long id;

	@Column(name = "NAME", length = 80, nullable = false)
	private String name;

	@Column(name = "CODE", length = 3, nullable = false)
	private String code;

	@Column(name = "OTHER_CODE", length = 2, nullable = false)
	private String otherCode;

	public Country() {
		super();
	}

	public Country(String name, String code, String otherCode) {
		super();
		this.name = name;
		this.code = code;
		this.otherCode = otherCode;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOtherCode() {
		return otherCode;
	}

	public void setOtherCode(String otherCode) {
		this.otherCode = otherCode;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", code=" + code + ", otherCode=" + otherCode + "]";
	}

}
