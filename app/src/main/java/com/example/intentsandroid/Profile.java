package com.example.intentsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button btn = findViewById(R.id.webBTN);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent downloadIntent = new Intent(v.getContext(), Profile.class);
                //downloadIntent.setData(Uri.parse("https://www.rottentomatoes.com/"));

                Uri web = Uri.parse("https://www.rottentomatoes.com/");
                Intent gotoWeb = new Intent(Intent.ACTION_WEB_SEARCH);
                gotoWeb.putExtra(SearchManager.QUERY,"https://www.rottentomatoes.com/");
                startActivity(gotoWeb);

            }
        });
    }
}