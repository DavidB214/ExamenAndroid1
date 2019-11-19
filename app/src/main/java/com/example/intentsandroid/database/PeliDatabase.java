package com.example.intentsandroid.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.intentsandroid.Peli;

/**
 * Esta clase devuelve una instancia de la interfaz NotaDao.
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.07
 */
@Database(entities = {Peli.class}, version = 2)
public abstract class PeliDatabase extends RoomDatabase {
    public abstract PeliDao getNotaDao();
}
