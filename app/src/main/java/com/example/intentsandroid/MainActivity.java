package com.example.intentsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button profile = findViewById(R.id.profileBTN);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(v.getContext(),Profile.class);
                startActivity(profile);
            }
        });


        final Button myRates = findViewById(R.id.myRatesBTN);
        myRates.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent goToMyRates = new Intent(v.getContext(),MyRates.class);
                startActivity(goToMyRates);
            }
        });

    }
}