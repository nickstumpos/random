package com.nick.playground.solcontactlist.domain;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	private double latitude;
	private double longitude;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String street, String city, String state,String country, String zip,
			double latitude, double longitude) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.latitude = latitude;
		this.longitude = longitude;
		this.country=country;
	}

}