package com.shavika.attendance.tracker.api.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORGANIZATION_TYPE")
public class OrganizationType extends BaseDomain implements Serializable {

	private static final long serialVersionUID = -6194676107421561818L;

	@Id
	@GeneratedValue
	@Column(name = "ORGANIZATION_TYPE_ID")
	private long id;

	@Column(name = "TYPE", length = 80, nullable = false)
	private String type;

	@Column(name = "LEVEL", nullable = false)
	private int level;

	public OrganizationType() {
		super();
	}

	public OrganizationType(String type, int level) {
		super();
		this.type = type;
		this.level = level;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", type=" + type + ", level=" + level + "]";
	}
}
