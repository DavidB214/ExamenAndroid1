package com.example.intentsandroid;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.UUID;

/**
 * Esta clase contiene un objeto de tipo Nota, con un id y el texto de dicha Nota.
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.07
 */

@Entity(tableName = "peli")
public class Peli {
    @PrimaryKey
    @NonNull
    private String mId;
    @ColumnInfo(name = "contenido")
    private String mMensaje;

    @ColumnInfo(name = "puntuacion")
    private String rating;

    @ColumnInfo(name = "director")
    private String director;

    @ColumnInfo(name = "fecha")
    private String fecha;

    public Peli() {
        mId = UUID.randomUUID().toString();
    }

    @NonNull
    public String getId() {
        return mId;
    }

    public void setId(@NonNull String id) {
        mId = id;
    }

    public String getMensaje() {
        return mMensaje;
    }
    public String getRating(){
        return rating;
    }
    public String getDirector(){
        return director;
    }
    public String getFecha(){
        return fecha;
    }

    public void setMensaje(String mensaje) {
        mMensaje = mensaje;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
