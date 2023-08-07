package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class SwitchPage extends AppCompatActivity {

    Spinner sp1;
    Button b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_page2);

        sp1 = findViewById(R.id.ingredient);
        b = findViewById(R.id.subsitute);
        tv = findViewById(R.id.display);

        String[] items = {"Baking Powder", "Baking Soda", "Bread Flour","Brown Sugar", "Butter", "Buttermilk", "Cheese", "Chicken","Cocoa Powder","Condensed Milk", "Cornstarch","Cream", "Cream Cheese", "Eggs", "Egg Whites","Fish","Ketchup","Sour Cream","Sugar","Vanilla Extract"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, items);
        sp1.setAdapter(ad1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sp1.getSelectedItem().toString() == "Baking Powder" ){
                    tv.setText("Baking Powder Substitutes:\nNormal:\nButtermilk\nVegetarian:\nPlain Yogurt\nVegan:\nCream of Tartar");
                }
                if(sp1.getSelectedItem().toString() == "Baking Soda" ){
                    tv.setText("Baking Soda Substitutes:\nNormal:\nEgg whites\nVegetarian:\nBaker's Ammonia\nVegan:\nSelf-rising flour");
                }
                if(sp1.getSelectedItem().toString() == "Bread Flour" ){
                    tv.setText("Bread Flour Substitutes:\nNormal:\nAll-purpose flour\nVegetarian:\nAll-purpose flour\nVegan:\nAll-purpose flour");
                }
                if(sp1.getSelectedItem().toString() == "Brown Sugar" ){
                    tv.setText("Brown Sugar Substitutes:\nNormal:\nWhite sugar with molasses\nVegetarian:\nHoney and coconut sugar\nVegan:\nMolasses and coconut sugar");
                }
                if(sp1.getSelectedItem().toString() == "Butter" ){
                    tv.setText("Butter Substitutes:\nNormal:\nGreek Yogurt\nVegetarian:\nGhee\nVegan:\nCoconut oil");
                }
                if(sp1.getSelectedItem().toString() == "Buttermilk" ){
                    tv.setText("Buttermilk Substitutes:\nNormal:\nMilk and lemon juice\nVegetarian:\nMilk and lemon juice\nVegan:\nAlmond milk and lemon juice");
                }
                if(sp1.getSelectedItem().toString() == "Cheese" ){
                    tv.setText("Cheese Substitutes:\nNormal:\nTahini spread\nVegetarian:\nHummus\nVegan:\nSeasoned cashew paste");
                }
                if(sp1.getSelectedItem().toString() == "Chicken" ){
                    tv.setText("Chicken Substitutes:\nNormal:\nQuail\nVegetarian:\nCottage cheese\nVegan:\nSeitan");
                }
                if(sp1.getSelectedItem().toString() == "Cocoa Powder" ){
                    tv.setText("Cocoa Powder Substitutes:\nNormal:\nPowdered unsweetened chocolate\nVegetarian:\nCarob powder\nVegan:\nCarob powder");
                }
                if(sp1.getSelectedItem().toString() == "Condensed Milk" ){
                    tv.setText("Condensed Milk Substitutes:\nNormal:\nEvaporated milk\nVegetarian:\nEvaporated milk\nVegan:\nCoconut cream");
                }
                if(sp1.getSelectedItem().toString() == "Cornstarch" ){
                    tv.setText("Cornstarch Substitutes:\nNormal:\nRice flour\nVegetarian:\nPotato starch\nVegan:\nPotato starch");
                }
                if(sp1.getSelectedItem().toString() == "Cream" ){
                    tv.setText("Cream Substitutes:\nNormal:\nMilk and butter\nVegetarian:\nMilk and butter\nVegan:\nCashew cream and Soy milk");
                }
                if(sp1.getSelectedItem().toString() == "Cream Cheese" ){
                    tv.setText("Cream Cheese Substitutes:\nNormal:\nGreek Yogurt\nVegetarian:\nMascarpone cheese\nVegan:\nThink tofu paste");
                }
                if(sp1.getSelectedItem().toString() == "Eggs" ){
                    tv.setText("Egg Substitutes:\nNormal:\nFlax seeds\nVegetarian:\nFlax seeds\nVegan:\nCFlax seeds");
                }
                if(sp1.getSelectedItem().toString() == "Egg Whites" ){
                    tv.setText("Egg White Substitutes:\nNormal:\nAquafaba\nVegetarian:\nBean juice\nVegan:\nBean juice");
                }
                if(sp1.getSelectedItem().toString() == "Fish" ){
                    tv.setText("Fish Substitutes:\nNormal:\nPrawn\nVegetarian:\nTofu and carrots\nVegan:\nTofu and carrots");
                }
                if(sp1.getSelectedItem().toString() == "Ketchup" ){
                    tv.setText("Ketchup Substitutes:\nNormal:\nSeasoned tomato paste\nVegetarian:\nTSeasoned tomato paste\nVegan:\nSeasoned tomato paste");
                }
                if(sp1.getSelectedItem().toString() == "Sour Cream" ){
                    tv.setText("Sour Cream Substitutes:\nNormal:\nGreek Yogurt\nVegetarian:\nThickened buttermilk\nVegan:\nSilken tofu and lemon juice paste");
                }
                if(sp1.getSelectedItem().toString() == "Sugar" ){
                    tv.setText("Sugar Substitutes:\nNormal:\nHoney\nVegetarian:\nJaggery syrup\nVegan:\nMaple syrup");
                }
                if(sp1.getSelectedItem().toString() == "Vanilla Extract" ){
                    tv.setText("Vanilla Extract Substitutes:\nNormal:\nHoney\nVegetarian:\nAlmond extract\nVegan:\nAlmond extract");
                }
            }
        });
    }
}