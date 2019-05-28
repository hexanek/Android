package com.example.gym_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChestActivity extends AppCompatActivity {

    public static final String EXTRA_CHESTNO = "chestNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        int chestNo = (Integer)getIntent().getExtras().get(EXTRA_CHESTNO);
        Chest chest = Chest.chestExercises[chestNo];

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(chest.getImageResourceId());
        photo.setContentDescription(chest.getName());

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(chest.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(chest.getDescriptcion());
    }
}



