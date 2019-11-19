package com.example.intentsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class AddFilm extends AppCompatActivity {

    private PeliLab mNotaLab;
    private Peli mNota;

    private EditText mTextoNota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_film);
        final EditText mTextoNota= findViewById(R.id.nom);

        Button b = findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoNota = mTextoNota.getText().toString();
                Log.d("ESTATS", "coso");
                if(!textoNota.equals("")) {
                    if(mNota == null) {
                        mNota = new Peli();
                        Log.d("ESTATS", "Peli done");
                        mNota.setMensaje(textoNota);
                        Log.d("ESTATS", textoNota+" setMensaje");
                        mNotaLab.addNota(mNota);
                    } else {
                        mNota.setMensaje(textoNota);
                        mNotaLab.updateNota(mNota);
                    }
                }
            }
        });

//        Intent sendIntent = new Intent(Intent.ACTION_SEND);
//    }
//    public void pruebaIntent(View v){
//
//        Intent sendIntent = new Intent();
//        TextInputEditText text = findViewById(R.id.textInput);
//        sendIntent.setAction(Intent.ACTION_SEND);
//        sendIntent.putExtra(Intent.EXTRA_TEXT, text.getText().toString());
//        sendIntent.setType("text/plain");
//
//        if (sendIntent.resolveActivity(getPackageManager()) != null) {
//            startActivity(sendIntent);
//        }
    }

    protected void onStart() {
        super.onStart();
        Log.d("ESTATS", "Start_AddFilm");
    }

    protected void onResume() {
        super.onResume();
        Log.d("ESTATS", "Resume_AddFilm");
    }

    protected void onPause() {
        super.onPause();
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
}
