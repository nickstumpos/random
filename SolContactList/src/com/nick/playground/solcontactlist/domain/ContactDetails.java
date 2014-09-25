package com.nick.playground.solcontactlist.domain;

import java.util.Calendar;

public class ContactDetails extends Contact {
	private boolean favorite;
	private String LargeThumbUri;
	private String email;
	private String websiteUri;
	private Address address;
	private long id;

	public ContactDetails(boolean favorite, String largeThumbUri, String email,
			String websiteUri, Address address, long id) {
		super();
		this.favorite = favorite;
		LargeThumbUri = largeThumbUri;
		this.email = email;
		this.websiteUri = websiteUri;
		this.address = address;
		this.id = id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public String getLargeThumbUri() {
		return LargeThumbUri;
	}
	public void setLargeThumbUri(String largeThumbUri) {
		LargeThumbUri = largeThumbUri;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsiteUri() {
		return websiteUri;
	}
	public void setWebsiteUri(String websiteUri) {
		this.websiteUri = websiteUri;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
