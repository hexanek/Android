package com.example.gymapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    ArrayAdapter<Chest> listChestAdapter = new ArrayAdapter<Chest>(this,
            android.R.layout.simple_list_item_1,Chest.chestExercises);

    ListView listView = findViewById(R.id.listExercise);

    

    public ListView getListView() {
        return listView;
    }
}
