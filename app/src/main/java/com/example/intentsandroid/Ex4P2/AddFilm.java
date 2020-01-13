package com.example.intentsandroid.Ex4P2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intentsandroid.R;
import com.google.android.material.textfield.TextInputEditText;

public class AddFilm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_film);
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
    }
    public void pruebaIntent(View v){

        Intent sendIntent = new Intent();
        TextInputEditText text = findViewById(R.id.textInput);
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, text.getText().toString());
        sendIntent.setType("text/plain");

        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }
    }
    protected void onStart(){
        super.onStart();
        Log.d("ESTATS","Start_AddFilm");
    }
    protected void onResume(){
        super.onResume();
        Log.d("ESTATS","Resume_AddFilm");
    }
    protected void onPause(){
        super.onPause();
        Log.d("ESTATS","Pause_AddFilm");
    }
    protected void onStop(){
        super.onStop();
        Log.d("ESTATS","Stop_AddFilm");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("ESTATS","Destroy_AddFilm");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("ESTATS","Restart_AddFilm");
    }
}
