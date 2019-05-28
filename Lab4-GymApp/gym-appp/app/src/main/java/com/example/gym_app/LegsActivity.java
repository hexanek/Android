package com.example.gym_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LegsActivity extends AppCompatActivity {
    public static final String EXTRA_LEGSNO = "legsNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);

        int legsNo = (Integer)getIntent().getExtras().get(EXTRA_LEGSNO);
        Legs legs = Legs.legsExercises[legsNo];

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(legs.getImageResourceId());
        photo.setContentDescription(legs.getName());

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(legs.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(legs.getDescriptcion());
    }
}
