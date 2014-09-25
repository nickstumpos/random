package com.nick.playground.solcontactlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.nick.playground.solcontactlist.domain.Contact;
import com.nick.playground.solcontactlist.service.ContactFetchException;
import com.nick.playground.solcontactlist.service.ContactService;

public class MainActivity extends ActionBarActivity {

	

	public static final String LOG_TAG="scl";
	
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		new ContactLoader(this).execute();
	}
	class ContactLoader extends AsyncTask<String, String, List<Contact>> {
		/**
		 * 
		 */
		private final MainActivity context;
		/**
		 * @param mainActivity
		 */
		ContactLoader(MainActivity mainActivity) {
			context = mainActivity;
		}

		private ProgressDialog pDialog;
		private ContactService contactService = new ContactService("https://solstice.applauncher.com/external/contacts.json");
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			pDialog = new ProgressDialog(context);
			pDialog.setMessage("Getting Data ...");
			pDialog.setIndeterminate(false);
			pDialog.setCancelable(true);
			pDialog.show();
		}

		@Override
		protected List<Contact> doInBackground(String... args) {
			List<Contact> ret=null;
			try {
				ret = contactService.retrieveContacts();
			} catch (ContactFetchException e) {
				Log.e(MainActivity.LOG_TAG, "Error retrieving Contacts", e);
				pDialog.dismiss();
				
			}
			return ret;
		}

		@Override
		protected void onPostExecute(List<Contact> contacts) {
			pDialog.dismiss();
			if(contacts==null){
				pDialog = new ProgressDialog(context);
				pDialog.setMessage("Error Loading Contacts");
				pDialog.setIndeterminate(false);
				pDialog.setCancelable(true);
				pDialog.show();
			}else{
				final List<Map<String, String>> contactsList = new ArrayList<Map<String,String>>();
				for (Contact c :contacts) {			
					Map<String, String> map = new HashMap<String, String>();
					map.put("name", c.getName());
					
					contactsList.add(map);
//					ImageView image = (ImageView) context.findViewById(R.id.thumb);
//					image.setImageURI(Uri.parse(c.getThumbUri()));
					ListView contactsListView = (ListView) context.findViewById(R.id.list);
					ListAdapter adapter = new SimpleAdapter(context,
							contactsList, R.layout.contact_list_item, new String[] { 
									 "name" }, new int[] {R.id.name});
					contactsListView.setAdapter(adapter);
					contactsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						@Override
						public void onItemClick(AdapterView<?> parent,
								View view, int position, long id) {
							Toast.makeText(
									context,
									"You Clicked at "
											+ contactsList.get(+position).get("name"),
									Toast.LENGTH_SHORT).show();
						}
					});
				}
			}
		}
	}
}
