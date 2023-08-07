package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class WetPage extends AppCompatActivity {

    Spinner spw1, spw2;
    EditText etw;
    Button bw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wet_page);

        etw = findViewById(R.id.amountw);
        spw1 = findViewById(R.id.fromw);
        spw2 = findViewById(R.id.tow);
        bw = findViewById(R.id.convertw);

        String[] fromw = {"Ounces", "Milliliters", "Cups", "Pints", "Liters"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, fromw);
        spw1.setAdapter(ad1);

        String[] tow = {"Ounces", "Milliliters", "Cups", "Pints", "Liters"};
        ArrayAdapter ad2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, tow);
        spw2.setAdapter(ad2);

        bw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot;
                Double amountw = Double.parseDouble(etw.getText().toString());
                if(spw1.getSelectedItem().toString() == "Ounces" && spw2.getSelectedItem().toString() == "Ounces"){
                    tot = amountw;
                    Toast.makeText(getApplicationContext(), amountw + " ounce(s) is " + tot.toString() + " ounce(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Milliliters" && spw2.getSelectedItem().toString() == "Ounces"){
                    tot = amountw/29.574;
                    Toast.makeText(getApplicationContext(), amountw + " milliliter(s) is " + tot.toString() + " ounce(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Cups" && spw2.getSelectedItem().toString() == "Ounces"){
                    tot = amountw*9.6076;
                    Toast.makeText(getApplicationContext(), amountw + " cup(s) is " + tot.toString() + " ounce(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Pints" && spw2.getSelectedItem().toString() == "Ounces"){
                    tot = amountw*19.2152;
                    Toast.makeText(getApplicationContext(), amountw + " pint(s) is " + tot.toString() + " ounce(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Liters" && spw2.getSelectedItem().toString() == "Ounces"){
                    tot = amountw*38.4304;
                    Toast.makeText(getApplicationContext(), amountw + " liter(s) is " + tot.toString() + " ounce(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Ounces" && spw2.getSelectedItem().toString() == "Milliliters"){
                    tot = amountw*29.574;
                    Toast.makeText(getApplicationContext(), amountw + " ounce(s) is " + tot.toString() + " milliliter(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Milliliters" && spw2.getSelectedItem().toString() == "Milliliters"){
                    tot = amountw;
                    Toast.makeText(getApplicationContext(), amountw + " milliliter(s) is " + tot.toString() + " milliliter(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Cups" && spw2.getSelectedItem().toString() == "Milliliters"){
                    tot = amountw*284.131;
                    Toast.makeText(getApplicationContext(), amountw + " cup(s) is " + tot.toString() + " milliliter(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Pints" && spw2.getSelectedItem().toString() == "Milliliters"){
                    tot = amountw*568.261;
                    Toast.makeText(getApplicationContext(), amountw + " pint(s) is " + tot.toString() + " milliliter(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Liters" && spw2.getSelectedItem().toString() == "Milliliters"){
                    tot = amountw*1000;
                    Toast.makeText(getApplicationContext(), amountw + " liter(s) is " + tot.toString() + " milliliter(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Ounces" && spw2.getSelectedItem().toString() == "Cups"){
                    tot = amountw/8;
                    Toast.makeText(getApplicationContext(), amountw + " ounce(s) is " + tot.toString() + " cup(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Milliliters" && spw2.getSelectedItem().toString() == "Cups"){
                    tot = amountw/237;
                    Toast.makeText(getApplicationContext(), amountw + " milliliter(s) is " + tot.toString() + " cup(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Cups" && spw2.getSelectedItem().toString() == "Cups"){
                    tot = amountw;
                    Toast.makeText(getApplicationContext(), amountw + " cup(s) is " + tot.toString() + " cup(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Pints" && spw2.getSelectedItem().toString() == "Cups"){
                    tot = amountw*2;
                    Toast.makeText(getApplicationContext(), amountw + " pint(s) is " + tot.toString() + " cup(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Liters" && spw2.getSelectedItem().toString() == "Cups"){
                    tot = amountw*4;
                    Toast.makeText(getApplicationContext(), amountw + " liter(s) is " + tot.toString() + " cup(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Ounces" && spw2.getSelectedItem().toString() == "Pints"){
                    tot = amountw*4.167;
                    Toast.makeText(getApplicationContext(), amountw + " ounce(s) is " + tot.toString() + " pint(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Milliliters" && spw2.getSelectedItem().toString() == "Pints"){
                    tot = amountw/473;
                    Toast.makeText(getApplicationContext(), amountw + " milliliter(s) is " + tot.toString() + " pint(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Cups" && spw2.getSelectedItem().toString() == "Pints"){
                    tot = amountw/2;
                    Toast.makeText(getApplicationContext(), amountw + " cup(s) is " + tot.toString() + " pint(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Pints" && spw2.getSelectedItem().toString() == "Pints"){
                    tot = amountw;
                    Toast.makeText(getApplicationContext(), amountw + " pint(s) is " + tot.toString() + " pint(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Liters" && spw2.getSelectedItem().toString() == "Pints"){
                    tot = amountw*2.113;
                    Toast.makeText(getApplicationContext(), amountw + " liter(s) is " + tot.toString() + " pint(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Ounces" && spw2.getSelectedItem().toString() == "Liters"){
                    tot = amountw/33.814;
                    Toast.makeText(getApplicationContext(), amountw + " ounce(s) is " + tot.toString() + " liter(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Milliliters" && spw2.getSelectedItem().toString() == "Liters"){
                    tot = amountw/1000;
                    Toast.makeText(getApplicationContext(), amountw + " milliliter(s) is " + tot.toString() + " liter(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Cups" && spw2.getSelectedItem().toString() == "Liters"){
                    tot = amountw/4.167;
                    Toast.makeText(getApplicationContext(), amountw + " cup(s) is " + tot.toString() + " liter(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Pints" && spw2.getSelectedItem().toString() == "Liters"){
                    tot = amountw/2.113;
                    Toast.makeText(getApplicationContext(), amountw + " pint(s) is " + tot.toString() + " liter(s)", Toast.LENGTH_LONG).show();
                }
                if(spw1.getSelectedItem().toString() == "Liters" && spw2.getSelectedItem().toString() == "Liters"){
                    tot = amountw;
                    Toast.makeText(getApplicationContext(), amountw + " liter(s) is " + tot.toString() + " liter(s)", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}