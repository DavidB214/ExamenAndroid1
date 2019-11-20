package com.example.intentsandroid;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MyRates extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        mTextoNota = findViewById(R.id.nomPeli);

        mNotaLab = NotaLab.get(this);
        List<Nota> notas = mNotaLab.getNotas();
        if(notas.size() > 0) {
            mNota = notas.get(0);
            mTextoNota.setText(mNota.getMensaje());
        }
        Log.d("ESTATS","MyRates_on_resume");
    }

    private TextView mTextoNota;
    private NotaLab mNotaLab;
    private Nota mNota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_rates);
        Toolbar toolbar = findViewById(R.id.toolbar);
        mTextoNota = findViewById(R.id.nomPeli);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent goToAddFilm = new Intent(view.getContext(),AddFilm.class);
                startActivity(goToAddFilm);
            }
        });

    }
    protected void onStart(){
        super.onStart();
        Log.d("ESTATS","Start_MyRates");
    }
    protected void onPause(){
        super.onPause();
        Log.d("ESTATS","Pause_MyRates");
    }
    protected void onStop(){
        super.onStop();
        Log.d("ESTATS","Stop_MyRates");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("ESTATS","Destroy_MyRates");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("ESTATS","Restart_MyRates");
    }

}