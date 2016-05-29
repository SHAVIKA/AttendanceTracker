package com.shavika.attendance.tracker.api.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CURRENCY")
public class Currency extends BaseDomain {

	private static final long serialVersionUID = 2588089732949705165L;

	@Id
	@GeneratedValue
	@Column(name = "CURRENCY_ID")
	private long id;

	@Column(name = "NAME", length = 80, nullable = false)
	private String name;

	@Column(name = "CODE", length = 3, nullable = false)
	private String code;

	public Currency() {
		super();
	}

	public Currency(String name, String code) {
		super();
		this.name = name;
		this.code = code;
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

	@Override
	public String toString() {
		return "Currency [id=" + id + ", name=" + name + ", code=" + code + "]";
	}

}
