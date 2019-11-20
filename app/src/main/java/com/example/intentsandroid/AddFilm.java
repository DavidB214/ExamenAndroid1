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

    private EditText mTextoNota;

    private NotaLab mNotaLab;
    private Nota mNota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_film);
        mTextoNota= findViewById(R.id.nom);

        mNotaLab=NotaLab.get(this);

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
        if(!textoPelicula.equals("")) {
            if(mNota == null) {
                mNota = new Nota();
                mNota.setMensaje(textoPelicula);
                mNotaLab.addNota(mNota);
                Toast.makeText(this, "Creada",
                        Toast.LENGTH_SHORT).show();
            } else {
                mNota.setMensaje(textoPelicula);
                mNotaLab.updateNota(mNota);
                Toast.makeText(this, "Actualizada",
                        Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Crea nota primero",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
