package com.example.async;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Autor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autor);
        new autorTask().execute();

    }
        private class autorTask extends AsyncTask<Integer, Void, Boolean> {
            TextView textView = findViewById(R.id.textView);
            TextView textView2 = findViewById(R.id.nazwisko);

            public void onPreExecute() {

            }

            @Override
            protected Boolean doInBackground(Integer... integers) {


                try {
                    SQLiteOpenHelper databaseHelper = new AutorDatabaseHelper(Autor.this);
                    SQLiteDatabase db = databaseHelper.getReadableDatabase();

                    Cursor cursor = db.query("AUTOR",
                            new String[]{"NAME"}, null, null,
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
                    return true;

                } catch (SQLiteException e) {
                    Toast toast = Toast.makeText(Autor.this, "Baza danych jest niedostępna", Toast.LENGTH_SHORT);
                    toast.show();
                    return false;
                }


            }

            protected void onPostExecute(Boolean success) {
                if (!success) {
                    Toast toast = Toast.makeText(Autor.this,
                            "Baza danych jest niedostępna", Toast.LENGTH_SHORT);
                    toast.show();
                }


            }

        }
    }







