package com.shavika.attendance.tracker.api.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class BaseDomain implements Serializable {

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_ON", nullable = true)
	private Date createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_ON", nullable = true)
	private Date modifiedOn;

	@Column(name = "IS_DELETED", columnDefinition = "boolean default false", nullable = false)
	private boolean deleted;

	public BaseDomain() {
		/* Temproverly we hard coded this, need to check @PreUpdate, @PrePersist.. */
		// modifiedOn = createdOn = new Date();
		// deleted = false;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@PreUpdate
	@PrePersist
	public void updateTimeStamps() {
		if (createdOn == null) {
			createdOn = new Date();
			deleted = false;
		}
		modifiedOn = new Date();
	}
}
