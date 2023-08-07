package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DryPage extends AppCompatActivity {

    Spinner sp1, sp2;
    EditText et;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dry_page);

        et = findViewById(R.id.amount);
        sp1 = findViewById(R.id.from);
        sp2 = findViewById(R.id.to);
        b = findViewById(R.id.convert);

        String[] from = {"Cups", "Teaspoons", "Tablespoons"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(ad1);

        String[] to = {"Cups", "Teaspoons", "Tablespoons"};
        ArrayAdapter ad2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(ad2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot;
                Double amount = Double.parseDouble(et.getText().toString());
                if(sp1.getSelectedItem().toString() == "Cups" && sp2.getSelectedItem().toString() == "Cups"){
                    tot = amount;
                    Toast.makeText(getApplicationContext(), amount + " cup(s) is " + tot.toString() + " cup(s)", Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Teaspoons" && sp2.getSelectedItem().toString() == "Cups"){
                    tot = amount/48;
                    Toast.makeText(getApplicationContext(), amount + " teaspoon(s) is " + tot.toString() + " cup(s)", Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Tablespoons" && sp2.getSelectedItem().toString() == "Cups"){
                    tot = amount/16;
                    Toast.makeText(getApplicationContext(), amount + " tablespoon(s) is " + tot.toString() + " cup(s)", Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Cups" && sp2.getSelectedItem().toString() == "Teaspoons"){
                    tot = amount*48;
                    Toast.makeText(getApplicationContext(), amount + " cup(s) is " + tot.toString() + " teaspoon(s)", Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Teaspoons" && sp2.getSelectedItem().toString() == "Teaspoons"){
                    tot = amount;
                    Toast.makeText(getApplicationContext(), amount + " teaspoon(s) is " + tot.toString() + " teaspoon(s)", Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Tablespoons" && sp2.getSelectedItem().toString() == "Teaspoons"){
                    tot = amount*3;
                    Toast.makeText(getApplicationContext(), amount + " tablespoon(s) is " + tot.toString() + " teaspoon(s)", Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Cups" && sp2.getSelectedItem().toString() == "Tablespoons") {
                    tot = amount*16;
                    Toast.makeText(getApplicationContext(), amount + " cup(s) is " + tot.toString() + " tablespoon(s)", Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Teaspoons" && sp2.getSelectedItem().toString() == "Tablespoons") {
                    tot = amount/3;
                    Toast.makeText(getApplicationContext(), amount + " teaspoon(s) is " + tot.toString() + " tablespoon(s)", Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "Tablespoons" && sp2.getSelectedItem().toString() == "Tablespoons") {
                    tot = amount;
                    Toast.makeText(getApplicationContext(), amount + " tablespoon(s) is " + tot.toString() + " tablespoon(s)", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}