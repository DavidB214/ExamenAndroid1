package com.example.intentsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
    protected void onStart(){
        super.onStart();
        Log.d("ESTATS","Start_Profile");
        EditText usr=findViewById(R.id.userName);
        EditText em=findViewById(R.id.email);
        EditText name=findViewById(R.id.nom);
        EditText cog=findViewById(R.id.cognom);
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        usr.setHint(sharedPref.getString("userName","@string/nomUser"));
        em.setHint(sharedPref.getString("email","@string/email"));
        name.setHint(sharedPref.getString("nom","@string/nom"));
        cog.setHint(sharedPref.getString("cognom","@string/cognom"));
    }
    protected void onResume(){
        super.onResume();
        Log.d("ESTATS","Resume_Profile");
    }
    protected void onPause(){
        super.onPause();
        Log.d("ESTATS","Pause_Profile");
    }
    protected void onStop(){
        super.onStop();
        Log.d("ESTATS","Stop_Profile");
    }
    protected void onDestroy(){
        super.onDestroy();
        EditText usr=findViewById(R.id.userName);
        String userName = usr.getText().toString();
        EditText em=findViewById(R.id.email);
        String email = em.getText().toString();
        EditText name=findViewById(R.id.nom);
        String nom = name.getText().toString();
        EditText cog=findViewById(R.id.cognom);
        String cognom = cog.getText().toString();
        Log.d("ESTATS","Destroy_Profile");
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("userName", userName);
        editor.putString("email", email);
        editor.putString("nom", nom);
        editor.putString("cognom", cognom);
        editor.commit();
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("ESTATS","Restart_Profile");
    }
}