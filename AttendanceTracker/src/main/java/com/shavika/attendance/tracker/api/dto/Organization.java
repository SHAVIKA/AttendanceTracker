package com.shavika.attendance.tracker.api.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORGANIZATION")
public class Organization extends BaseDomain {

	private static final long serialVersionUID = 338793659661012049L;

	@Id
	@GeneratedValue
	@Column(name = "ORGANIZATION_ID")
	private long id;

	@Column(name = "NAME", length = 80, nullable = false)
	private String name;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ORGANIZATION_TYPE_ID")
	private OrganizationType organizationType;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "parent_id", nullable = true)
	private Organization organization;

	@Column(name = "REGISTRATION_NUMBER", length = 80)
	private String registrationNumber;

	@Column(name = "ADDRESS_LINE_ONE", length = 150, nullable = false)
	private String addressLineOne;

	@Column(name = "ADDRESS_LINE_TWO", length = 150, nullable = false)
	private String addressLineTwo;

	@Column(name = "CITY", length = 50, nullable = false)
	private String city;

	@Column(name = "Province", length = 50, nullable = false)
	private String Province;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "COUNTRY_ID")
	private Country country;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "TIME_ZONE_ID")
	private TimeZone timeZone;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "CURRENCY_ID")
	private Currency currency;

	@Column(name = "LOGO", length = 200)
	private String logo;

	@Column(name = "PHONE_NUMBER1", length = 20, nullable = false)
	private String phoneNumber1;

	@Column(name = "PHONE_NUMBER2", length = 20)
	private String phoneNumber2;

	@Column(name = "FAX", length = 20)
	private String fax;

	@Column(name = "WEBSITE", length = 40)
	private String website;

	@Column(name = "EMAIL", length = 40)
	private String email;

	@Column(name = "ADDITIONAL_INFO", length = 200)
	private String additionalInfo;

	public Organization() {
		super();
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

	public OrganizationType getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(OrganizationType organizationType) {
		this.organizationType = organizationType;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return Province;
	}

	public void setProvince(String province) {
		Province = province;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getPhoneNumber1() {
		return phoneNumber1;
	}

	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public String getPhoneNumber2() {
		return phoneNumber2;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", organizationType=" + organizationType + ", organization=" + organization + ", registrationNumber="
				+ registrationNumber + ", addressLineOne=" + addressLineOne + ", addressLineTwo=" + addressLineTwo + ", city=" + city + ", Province=" + Province
				+ ", country=" + country + ", timeZone=" + timeZone + ", currency=" + currency + ", logo=" + logo + ", phoneNumber1=" + phoneNumber1 + ", phoneNumber2="
				+ phoneNumber2 + ", fax=" + fax + ", website=" + website + ", email=" + email + ", additionalInfo=" + additionalInfo + "]";
	}

}
