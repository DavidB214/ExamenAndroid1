package com.example.intentsandroid.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.intentsandroid.Peli;

import java.util.List;

@Dao
public interface PeliDao {

    @Query("SELECT * FROM peli")
    List<Peli> getNotas();

    @Query("SELECT * FROM peli WHERE mId LIKE :uuid")
    Peli getNota(String uuid);

    @Insert
    void addNota(Peli book);

    @Delete
    void deleteNota(Peli book);

    @Update
    void updateNota(Peli book);
}
