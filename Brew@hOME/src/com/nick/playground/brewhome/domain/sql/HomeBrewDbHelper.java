package com.nick.playground.brewhome.domain.sql;

import com.nick.playground.brewhome.domain.ref.Addition;
import com.nick.playground.brewhome.domain.ref.AdditionType;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class HomeBrewDbHelper extends SQLiteOpenHelper {
	public static final int DATABASE_VERSION = 1;
	public static final String DATABASE_NAME = "HomeBrew.db";

	private static final String TEXT_TYPE = " TEXT";
	private static final String REAL_TYPE = " REAL";
	private static final String INT_TYPE = " INTEGER";
	private static final String COMMA_SEP = ",";

	public HomeBrewDbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	public void onCreate(SQLiteDatabase db) {

		for (AdditionType a : AdditionType.values()) {
			for (Addition add : a.getAdditions()) {
				String creatAdditionTable = "CREATE TABLE "
						+ add.getTableName() + " (" + BaseColumns._ID
						+ " INTEGER PRIMARY KEY," + add.getColumnNameName()
						+ TEXT_TYPE + COMMA_SEP + add.getColumnNameOrigin()
						+ TEXT_TYPE + COMMA_SEP + add.getColumnNameSrm()
						+ INT_TYPE + COMMA_SEP + add.getColumnNamePotentialSg()
						+ REAL_TYPE + " )";
				db.execSQL(creatAdditionTable);
				ContentValues values = new ContentValues();
				values.put(add.getColumnNameName(), add.getName());
				values.put(add.getColumnNameOrigin(), add.getOrigin());
				values.put(add.getColumnNamePotentialSg(), add.getPotentialSG()
						.doubleValue());
				values.put(add.getColumnNameSrm(), add.getSrmColor());
			}
		}

	}

	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

		for (AdditionType a : AdditionType.values()) {
			for (Addition add : a.getAdditions()) {
				String deleteAdditionTable = "DROP TABLE IF EXISTS "
						+ add.getTableName();
				db.execSQL(deleteAdditionTable);

			}
		}
	}

	public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		onUpgrade(db, oldVersion, newVersion);
	}
}