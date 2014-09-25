package com.nick.playground.solcontactlist.service;

public class ContactFetchException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7923088925005800044L;

	public ContactFetchException() {
		super();
	}

	public ContactFetchException(String detailMessage, Throwable throwable) {
		super(detailMessage, throwable);
	}

	public ContactFetchException(String detailMessage) {
		super(detailMessage);
	}

	public ContactFetchException(Throwable throwable) {
		super(throwable);
	}

}
