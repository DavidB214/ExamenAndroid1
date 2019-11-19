package com.example.intentsandroid;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.UUID;

@Entity(tableName = "peli")
public class Peli {
    @PrimaryKey
    @NonNull
    private String mId;
    @ColumnInfo(name = "contenido")
    private String mMensaje;

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

    public void setMensaje(String mensaje) {
        mMensaje = mensaje;
    }
}
