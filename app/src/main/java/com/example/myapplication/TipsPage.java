package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class TipsPage extends AppCompatActivity {

    Spinner sp1;
    Button b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_page2);

        sp1 = findViewById(R.id.tips);
        b = findViewById(R.id.check);
        tv = findViewById(R.id.tip_display);

        String[] items = {"Kitchen Utensils", "Basic Tools", "Standard Spices","Cleaning Mechanisms", "Knife Cuts"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, items);
        sp1.setAdapter(ad1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sp1.getSelectedItem().toString() == "Kitchen Utensils" ){
                    tv.setText("Standard cookware to have on hand:\n1. Non-stick frying pan\n2. Saucepan\n3. Stock pot\n4. Sheets pans\n5. Glass baking dish\n6. Cutting board\n7. Colander\n8. Prep bowls\n9. Salad spinner\n");
                }
                if(sp1.getSelectedItem().toString() == "Basic Tools" ){
                    tv.setText("Basic tools to have:\n1. Knives\n2. Measuring spoons\n3. Measuring cups\n4. Grater\n5. Sieve\n6. Wooden spoons\n7. Peeler\n8. Whisk\n9. Tongs\n");
                }
                if(sp1.getSelectedItem().toString() == "Standard Spices" ){
                    tv.setText("Standard spices to stock up on:\n1. Cinnamon\n2. Paprika\n3. Black pepper\n4. Onion powder\n5. Garlic powder\n6. Curry powder\n7. Ginger\n8. Turmeric\n9. Chilli powder\n");
                }
                if(sp1.getSelectedItem().toString() == "Cleaning Mechanisms" ){
                    tv.setText("Common ways to clean utensils:\n1. Keep your disposal smelling fresh\n2. Rejuvenate old baking sheets using hydrogen peroxide and baking soda\n3. Clean your oven while you sleep\n4. Wash your oven rack\n5. Polish woodwork with lemon oil and vinegar");
                }
                if(sp1.getSelectedItem().toString() == "Knife Cuts" ) {
                    tv.setText("Various types of knife cuts:\n1. Julienne\n2. Batonette\n3. Allumete\n4. Brunoise\n5. Macedoine\n6. Chiffonade\n7. Tourne\n8. Mince\n9. Dice");
                }
            }
        });
    }
}