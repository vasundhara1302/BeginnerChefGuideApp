package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }
    public void openActivityRecipes(View v) {
        Intent intent = new Intent(this,RecipesPage.class);
        startActivity(intent);
    }
    public void openActivitySwitch(View v) {
        Intent intent = new Intent(this,SwitchPage.class);
        startActivity(intent);
    }
    public void openActivityMeasure(View v) {
        Intent intent = new Intent(this,MeasurePage.class);
        startActivity(intent);
    }
    public void openActivityTips(View v) {
        Intent intent = new Intent(this,TipsPage.class);
        startActivity(intent);
    }
}