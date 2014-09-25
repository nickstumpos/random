package com.nick.playground.solcontactlist.service;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import com.nick.playground.solcontactlist.MainActivity;
import com.nick.playground.solcontactlist.domain.Contact;
import com.nick.playground.solcontactlist.integration.json.JSONParser;
import com.nick.playground.solcontactlist.integration.map.ContactMapper;

public class ContactService {
	String url;

	public ContactService(String url) {
		super();
		this.url = url;
	}

	public List<Contact> retrieveContacts() throws ContactFetchException{
		JSONArray jsonContacts = new JSONParser().getJSONFromUrl(url);
		List<Contact> ret = new ArrayList<Contact>();
		try {
		for (int i = 0; i < jsonContacts.length(); i++) {			
				ret.add(ContactMapper.map(jsonContacts.getJSONObject(i)));					
		}
		} catch (JSONException e) {
			Log.e(MainActivity.LOG_TAG, "Error parsing Contact List", e);
			throw new ContactFetchException(e);
		}		
		return ret;
	}
	
}
