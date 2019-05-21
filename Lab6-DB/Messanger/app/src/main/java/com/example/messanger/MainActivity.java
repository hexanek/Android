package com.example.messanger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMessanger(View view){
        Button button = findViewById(R.id.button);
        Intent intent = new Intent(this,Messager.class);
        startActivity(intent);
    }

    public void onClickAutor(View view){
        Button button = findViewById(R.id.button_autor);
        Intent intent = new Intent(this,Autor.class);
        startActivity(intent);
    }
}
