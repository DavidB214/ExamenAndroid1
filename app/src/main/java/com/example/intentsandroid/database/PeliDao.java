package com.example.intentsandroid.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.intentsandroid.Ex4P5.Peli;

import java.util.List;

/**
 * Esta interfaz define los métodos para interactuar con la base de datos.
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.07
 */

@Dao
public interface PeliDao {

    @Query("SELECT * FROM peli")
    List<Peli> getPelis();

    @Query("SELECT * FROM peli WHERE mId LIKE :uuid")
    Peli getPeli(String uuid);

    @Insert
    void addPeli(Peli peli);

    @Delete
    void deletePeli(Peli peli);

}