package com.example.placeholder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class PremadeBowls extends AppCompatActivity {

    Button calib, tritrib, macfergusb, hawaiianb, vegeterianb, farmerb;
    String cali, tritri, macfergus, hawaiian, vegeterian, farmer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premade_bowls);

        //BUTTONS
        calib=findViewById(R.id.addCali);
        tritrib=findViewById(R.id.addTriTri);
        macfergusb=findViewById(R.id.addMacFergus);
        hawaiianb=findViewById(R.id.addHawaiian);
        vegeterianb=findViewById(R.id.addVegetarian);
        farmerb=findViewById(R.id.addFarmer);

        //STRINGS
        cali=findViewById(R.id.caliBowl).toString();
        tritri=findViewById(R.id.tritriBowl).toString();
        macfergus=findViewById(R.id.macfergusBowl).toString();
        hawaiian=findViewById(R.id.hawaiianBowl).toString();
        vegeterian =findViewById(R.id.vegetarianBowl).toString();
        farmer=findViewById(R.id.farmerBowl).toString();
    }
}