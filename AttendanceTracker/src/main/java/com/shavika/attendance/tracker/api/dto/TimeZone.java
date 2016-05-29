package com.shavika.attendance.tracker.api.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIME_ZONE")
public class TimeZone extends BaseDomain {

	private static final long serialVersionUID = 4952785433436937016L;

	@Id
	@GeneratedValue
	@Column(name = "TIME_ZONE_ID")
	private long id;

	@Column(name = "TIME_ZONE_NAME", length = 80, nullable = false)
	private String name;

	@Column(name = "TIME", length = 6, nullable = false)
	private String time;

	public TimeZone() {
		super();
	}

	public TimeZone(String name, String time) {
		super();
		this.name = name;
		this.time = time;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "TimeZone [id=" + id + ", name=" + name + ", time=" + time + "]";
	}
}
