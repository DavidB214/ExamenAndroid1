package com.example.intentsandroid;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="taula_de_pelis")
public class Pelis {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name="peli")

    private String mPeli;

    private int mRating;

    public void setPeli(@NonNull String mPeli) {
        this.mPeli = mPeli;
    }

    public void setRating(int mRating) {
        this.mRating = mRating;
    }

    public String getNom(){
        return mPeli;
    }
}
