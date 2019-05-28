package com.example.gym_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BackActivity extends AppCompatActivity {
    public static final String EXTRA_BACKNO = "backNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        int backNo = (Integer)getIntent().getExtras().get(EXTRA_BACKNO);
        Back back = Back.backExercises[backNo];

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(back.getImageResourceId());
        photo.setContentDescription(back.getName());

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(back.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(back.getDescriptcion());
    }
}
