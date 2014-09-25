package com.nick.playground.solcontactlist.integration.map;

import java.util.Calendar;
import java.util.Locale;

import org.json.JSONException;
import org.json.JSONObject;



import com.nick.playground.solcontactlist.domain.Address;
import com.nick.playground.solcontactlist.domain.Contact;
import com.nick.playground.solcontactlist.domain.ContactDetails;
import com.nick.playground.solcontactlist.domain.Phone;

public class ContactDetailsMapper {
	
	private static final String FAV = "favorite";
	private static final String ID = "employeeId";
	private static final String IMAGE_URI = "largeImageURL";
	private static final String EMAIL = "email";
	private static final String WWW = "website";
	private static final String ADD = "address";
	private static final String STREET = "street";
	private static final String CITY = "city";
	private static final String STATE = "state";
	private static final String ZIP = "zip";
	private static final String COUNTRY = "country";
	private static final String LAT = "latitude";
	private static final String LONGITUDE = "longitude";
	public final static ContactDetails  map(JSONObject obj) throws JSONException{
		ContactDetails contact=null;
		if (obj!=null) {
			boolean favorite = Boolean.valueOf(obj.getString(FAV));
			Long id = obj.getLong(ID);
			String imgURI = obj.getString(IMAGE_URI);
			String email = obj.getString(EMAIL);
			String www = obj.getString(WWW);
			JSONObject addObj = obj.getJSONObject(ADD);
			String street = addObj.getString(STREET);
			String city = addObj.getString(CITY);
			String state = addObj.getString(STATE);
			String zip = addObj.getString(ZIP);
			String country = addObj.getString(COUNTRY);
			Double lat = addObj.getDouble(LAT);
			Double longitude = addObj.getDouble(LONGITUDE);
			Address address = new Address(street, city, state, country,zip, lat, longitude);
			contact = new ContactDetails(favorite, imgURI, email, www, address, id);

		}
		return contact;
	}
}
