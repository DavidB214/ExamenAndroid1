package com.example.intentsandroid;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MyRates extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
//        mTextoNota = findViewById(R.id.nomPeli);

        mNotaLab = NotaLab.get(this);
        List<Nota> notas = mNotaLab.getNotas();
        LinearLayout llBotonera = (LinearLayout) findViewById(R.id.listado);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        llBotonera.setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
        llBotonera.setGravity(Gravity.CENTER);
        int numBotones = notas.size();
        llBotonera.setY(180);
        for (int i=0; i<numBotones; i++){
            Button button = new Button(this);
            button.setLayoutParams(lp);
            button.setBackgroundResource(R.drawable.button_style);
            TextView tx=new TextView(this);
            tx.setX(50);
//            tx.setLayoutParams(lp);
            //Asignamos propiedades de layout al boton
            //Asignamos Texto al botón
            //Añadimos el botón a la botonera
            button.setText(notas.get(i).getMensaje());
            tx.setText(notas.get(i).getRating()+"/5"+"    Director: "+notas.get(i).getDirector()+"       Fecha: "+notas.get(i).getFecha());
            llBotonera.addView(button);
            llBotonera.addView(tx);
        }
//        if(notas.size() > 0) {
//            mNota = notas.get(notas.size()-1);
//            mTextoNota.setText(mNota.getMensaje());
//        }
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
//        mTextoNota = findViewById(R.id.nomPeli);

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
        finish();
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