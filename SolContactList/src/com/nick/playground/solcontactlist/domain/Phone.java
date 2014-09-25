package com.nick.playground.solcontactlist.domain;

public class Phone {
	private String work;
	private String home;
	private String mobile;
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Phone(String work, String home, String mobile) {
		super();
		this.work = work;
		this.home = home;
		this.mobile = mobile;
	}
}
