package com.example.calcdodatki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickPlus(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        int result = firstNumber + secondNumber;
        calculate.setText(String.valueOf(result));
    }

    public void onClickMinus(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        int result = firstNumber - secondNumber;
        calculate.setText(String.valueOf(result));
    }
    public void onClickMnoz(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        int result = firstNumber * secondNumber;
        calculate.setText(String.valueOf(result));
    }
    public void onClickDziel(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        int result = firstNumber / secondNumber;
        calculate.setText(String.valueOf(result));
    }
    public void onClickSin(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        double result = sin(firstNumber);
        calculate.setText(String.valueOf(result));
    }

    public void onClickCos(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        double result = cos(firstNumber);
        calculate.setText(String.valueOf(result));
    }
    public void onClickTan(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        double result = tan(firstNumber);
        calculate.setText(String.valueOf(result));
    }

    public void onClickCtan(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        double result = 1/tan(firstNumber);
        calculate.setText(String.valueOf(result));
    }

    public void onClickSqrt(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        double result = sqrt(firstNumber);
        calculate.setText(String.valueOf(result));
    }
}
