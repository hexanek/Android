package com.example.gym_app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LegsCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listLegs = getListView();
        ArrayAdapter<Legs> listAdapter = new ArrayAdapter<Legs>(
                this,
                android.R.layout.simple_list_item_1,
                Legs.legsExercises);
        listLegs.setAdapter(listAdapter);
    }


    @Override
    public void onListItemClick(ListView listView,
                                View itemView,
                                int position,
                                long id) {
        Intent intent = new Intent(LegsCategoryActivity.this, LegsActivity.class);
        intent.putExtra(LegsActivity.EXTRA_LEGSNO, (int) id);
        startActivity(intent);
    }
}
