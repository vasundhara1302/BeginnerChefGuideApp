package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MeasurePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure_page);
    }
    public void openActivityDry(View v) {
        Intent intent = new Intent(this,DryPage.class);
        startActivity(intent);
    }
    public void openActivityWet(View v) {
        Intent intent = new Intent(this,WetPage.class);
        startActivity(intent);
    }
    public void openActivityTemp(View v) {
        Intent intent = new Intent(this,TempPage.class);
        startActivity(intent);
    }
}