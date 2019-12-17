package com.example.intentsandroid;

import androidx.annotation.CheckResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class AddFilm extends AppCompatActivity {

    private EditText mTextoNota;
    private EditText mFecha;
    private EditText mDirector;
    private RatingBar mRating;
    private PeliLab mPeliLab;
    private Peli mPeli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_film);
        mTextoNota= findViewById(R.id.nom);
        mRating= findViewById(R.id.ratingBar);
        mFecha=findViewById(R.id.any);
        mDirector=findViewById(R.id.dir);
        mPeliLab = PeliLab.get(this);


    }

    protected void onStart() {
        super.onStart();
        Log.d("ESTATS", "Start_AddFilm");
    }

    protected void onResume() {
        super.onResume();
        Log.d("ESTATS", "Resume_AddFilm");
    }
    @Override
    protected void onPause() {
        super.onPause();
        guardar();
        Intent intent = new Intent(this, MyRates.class);
        startActivity(intent);
        finish();
        Log.d("ESTATS", "AddFilm_on_pause");
        Log.d("ESTATS", "Pause_AddFilm");
    }

    protected void onStop() {
        super.onStop();

    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTATS", "Destroy_AddFilm");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("ESTATS", "Restart_AddFilm");
    }

    private void guardar() {
        String textoPelicula = mTextoNota.getText().toString();
        String rating = mRating.getRating()+"";
        String director = mDirector.getText().toString();
        String fecha = mFecha.getText().toString();
        if(!textoPelicula.equals("")) {
            if(mPeli == null) {
                mPeli = new Peli();
                mPeli.setMensaje(textoPelicula);
                mPeli.setRating(rating);
                mPeli.setDirector(director);
                mPeli.setFecha(fecha);
                mPeli.setRating(rating);
                mPeliLab.addPeli(mPeli);
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage("677055613", null, textoPelicula+" "+rating , null, null);
            }
        } else {
            Toast.makeText(this, "Inserta datos para añadir una Peli",
                    Toast.LENGTH_SHORT).show();
        }
    }

}
