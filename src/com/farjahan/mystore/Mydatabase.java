package com.farjahan.mystore;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Mydatabase extends SQLiteOpenHelper {

	/**
	 * constructor
	 * 
	 * @param context
	 */
	public Mydatabase(Context context) {
		super(context, "zck.db", null, 3);
		// activity, database name, , version
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// create table at first time
		String sql = "create table if not exists user (name varchar(50), speed integer, high integer, score integer)";
		db.execSQL(sql);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// drop and create table
		db.execSQL("drop table if exists user");
		onCreate(db);
	}

}
