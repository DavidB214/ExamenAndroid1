package com.example.intentsandroid.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.intentsandroid.Nota;

import java.util.List;

/**
 * Esta interfaz define los métodos para interactuar con la base de datos.
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.07
 */

@Dao
public interface NotaDao {

    @Query("SELECT * FROM nota")
    List<Nota> getNotas();

    @Query("SELECT * FROM nota WHERE mId LIKE :uuid")
    Nota getNota(String uuid);

    @Insert
    void addNota(Nota book);

    @Delete
    void deleteNota(Nota book);

    @Update
    void updateNota(Nota book);
}