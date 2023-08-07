package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class TempPage extends AppCompatActivity {

    Spinner spt1, spt2;
    EditText ett;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_page);

        ett = findViewById(R.id.amountt);
        spt1 = findViewById(R.id.fromt);
        spt2 = findViewById(R.id.tot);
        bt = findViewById(R.id.convertt);

        String[] fromt = {"Fahrenheit", "Celsius"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, fromt);
        spt1.setAdapter(ad1);

        String[] tot = {"Fahrenheit", "Celsius"};
        ArrayAdapter ad2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, tot);
        spt2.setAdapter(ad2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tott;
                Double amountt = Double.parseDouble(ett.getText().toString());
                if(spt1.getSelectedItem().toString() == "Fahrenheit" && spt2.getSelectedItem().toString() == "Fahrenheit"){
                    tott = amountt;
                    Toast.makeText(getApplicationContext(), amountt + " degree(s) F is " + tott.toString() + " degree(s) F", Toast.LENGTH_LONG).show();
                }
                if(spt1.getSelectedItem().toString() == "Celsius" && spt2.getSelectedItem().toString() == "Fahrenheit"){
                    tott = ((amountt*9)/5)+32;
                    Toast.makeText(getApplicationContext(), amountt + " degree(s) C is " + tott.toString() + " degree(s) F", Toast.LENGTH_LONG).show();
                }
                if(spt1.getSelectedItem().toString() == "Fahrenheit" && spt2.getSelectedItem().toString() == "Celsius"){
                    tott = ((amountt-32)*5)/9;
                    Toast.makeText(getApplicationContext(), amountt + " degree(s) F is " + tott.toString() + " degree(s) C", Toast.LENGTH_LONG).show();
                }
                if(spt1.getSelectedItem().toString() == "Celsius" && spt2.getSelectedItem().toString() == "Celsius"){
                    tott = amountt;
                    Toast.makeText(getApplicationContext(), amountt + " degree(s) C is " + tott.toString() + " degree(s) C", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}