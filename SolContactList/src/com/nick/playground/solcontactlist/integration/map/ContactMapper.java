package com.nick.playground.solcontactlist.integration.map;

import java.util.Calendar;

import org.json.JSONException;
import org.json.JSONObject;

import com.nick.playground.solcontactlist.domain.Contact;
import com.nick.playground.solcontactlist.domain.Phone;

public class ContactMapper {
	
	private static final String NAME = "name";
	private static final String ID = "employeeId";
	private static final String COMPANY = "company";
	private static final String DETAILS_URL = "detailsURL";
	private static final String THUMB = "smallImageURL";
	private static final String DOB = "birthdate";
	private static final String PHONE = "phone";
	private static final String WORK = "work";
	private static final String HOME = "home";
	private static final String MOBILE = "mobile";
	public final static Contact map(JSONObject obj) throws JSONException{
		Contact contact=null;
		if ( obj!=null) {
			String name = obj.getString(NAME);
			Long id = obj.getLong(ID);
			String company = obj.getString(COMPANY);
			String detailsURL = obj.getString(DETAILS_URL);
			String thumb = obj.getString(THUMB);
			Calendar dob = Calendar.getInstance();
			dob.setTimeInMillis(obj.getLong(DOB));
			JSONObject phoneObj = obj.getJSONObject(PHONE);
			String workPhone = phoneObj.getString(WORK);
			String homePhone = phoneObj.getString(HOME);
			String mobilePhone = phoneObj.getString(MOBILE);
			Phone phone = new Phone(workPhone, homePhone, mobilePhone);
			contact= new Contact(id, name, dob, thumb, company, detailsURL, phone);
		}
		return contact;
	}
}
