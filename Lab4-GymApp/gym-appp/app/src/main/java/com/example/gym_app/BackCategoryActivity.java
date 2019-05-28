package com.example.gym_app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BackCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listBack = getListView();
        ArrayAdapter<Back> listAdapter = new ArrayAdapter<Back>(
                this,
                android.R.layout.simple_list_item_1,
                Back.backExercises);
        listBack.setAdapter(listAdapter);
    }


    @Override
    public void onListItemClick(ListView listView,
                                View itemView,
                                int position,
                                long id) {
        Intent intent = new Intent(BackCategoryActivity.this, BackActivity.class);
        intent.putExtra(BackActivity.EXTRA_BACKNO, (int) id);
        startActivity(intent);
    }
}
