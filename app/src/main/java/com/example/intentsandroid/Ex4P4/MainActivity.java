package com.example.intentsandroid.Ex4P4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intentsandroid.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button profile = findViewById(R.id.dwnl);
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

        Button dwnlB=findViewById(R.id.dwnlButton);
        dwnlB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TrailerDownload.class);
                startActivity(i);
            }
        });

    }
    protected void onStart(){
        super.onStart();
        Log.d("ESTATS","Start_MainActivity");
    }
    protected void onResume(){
        super.onResume();
        Log.d("ESTATS","Resume_MainActivity");
    }
    protected void onPause(){
        super.onPause();
        Log.d("ESTATS","Pause_MainActivity");
    }
    protected void onStop(){
        super.onStop();
        Log.d("ESTATS","Stop_MainActivity");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("ESTATS","Destroy_MainActivity");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("ESTATS","Restart_MainActivity");
    }
}