package com.sean.bmi6;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi(View view){
        EditText edW = (EditText)findViewById(R.id.edW);
        EditText edH = (EditText)findViewById(R.id.edH);
        float weight = Float.parseFloat(edW.getText().toString());
        float height = Float.parseFloat(edH.getText().toString());
        float bmi = weight /(height*height);
        new AlertDialog.Builder(this).setMessage("BMI is "+bmi).setPositiveButton("OK", null).show();
    }
}
