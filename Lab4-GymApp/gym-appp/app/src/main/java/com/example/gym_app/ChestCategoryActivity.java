package com.example.gym_app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChestCategoryActivity extends ListActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listChest = getListView();
        ArrayAdapter<Chest> listAdapter = new ArrayAdapter<Chest>(
                this,
                android.R.layout.simple_list_item_1,
                Chest.chestExercises);
        listChest.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView,
                                View itemView,
                                int position,
                                long id) {
        Intent intent = new Intent(ChestCategoryActivity.this, ChestActivity.class);
        intent.putExtra(ChestActivity.EXTRA_CHESTNO, (int) id);
        startActivity(intent);
    }

}

