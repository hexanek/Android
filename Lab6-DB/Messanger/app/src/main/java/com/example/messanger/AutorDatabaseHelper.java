package com.example.messanger;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AutorDatabaseHelper extends SQLiteOpenHelper


{

    private static final String DB_NAME = "autorek"; // Nazwa bazy danych
    private static final int DB_VERSION = 1; // Numer wersji bazy danych

    public AutorDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE AUTOR (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT);");

        ContentValues imieValues = new ContentValues();
        imieValues.put("NAME", "ARTUR_LEWANDOWSKI");
        ContentValues nazwiskoValues = new ContentValues();
        nazwiskoValues.put("NAME", "LEWANDOWSKI");
        ContentValues imienazwiskoValues = new ContentValues();
        imienazwiskoValues.put("NAME", "ARTUR LEWANDOWSKI");
        db.insert("AUTOR",null,imieValues);
        db.insert("AUTOR",null,nazwiskoValues);
        db.insert("AUTOR",null,imienazwiskoValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
