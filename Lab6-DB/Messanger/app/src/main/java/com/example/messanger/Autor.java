package com.example.messanger;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Autor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autor);

        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.nazwisko);
        try {
            SQLiteOpenHelper databaseHelper = new AutorDatabaseHelper(this);
            SQLiteDatabase db = databaseHelper.getReadableDatabase();

            Cursor cursor = db.query("AUTOR",
                    new String[]{"NAME"},null,null,
                    null, null, null);

            cursor.moveToFirst();


            String name = cursor.getString(0);
            textView.setText(name);



                String nazwisko = cursor.getString(0);
                textView2.setText(nazwisko);

//            cursor.moveToFirst();
//            while(!cursor.isAfterLast()) {
//
//                textView.setText(getString(cursor.getColumnIndex("AUTOR")));
//
//                cursor.moveToNext();
//            }



            cursor.close();
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Baza danych jest niedostępna", Toast.LENGTH_SHORT);
            toast.show();
        }



    }

    }





