package com.nick.playground.solcontactlist.domain;

import java.util.Calendar;

public class Contact {
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	private long id;
	private String name;
	private Calendar dob;
	private String thumbUri;
	private String company;
	private String detailsURL;
	private Phone phone;
	public Contact(long id, String name, Calendar dob, String thumbUri,
			String company, String detailsURL, Phone phone) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.thumbUri = thumbUri;
		this.company = company;
		this.detailsURL = detailsURL;
		this.phone = phone;
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
	public Calendar getDob() {
		return dob;
	}
	public void setDob(Calendar dob) {
		this.dob = dob;
	}
	public String getThumbUri() {
		return thumbUri;
	}
	public void setThumbUri(String thumbUri) {
		this.thumbUri = thumbUri;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDetailsURL() {
		return detailsURL;
	}
	public void setDetailsURL(String detailsURL) {
		this.detailsURL = detailsURL;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}
