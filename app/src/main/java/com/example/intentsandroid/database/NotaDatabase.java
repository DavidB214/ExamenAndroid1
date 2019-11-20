package com.example.intentsandroid.database;
import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.intentsandroid.Nota;


/**
 * Esta clase devuelve una instancia de la interfaz NotaDao.
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.07
 */
@Database(entities = {Nota.class}, version = 1)
public abstract class NotaDatabase extends RoomDatabase {
    public abstract NotaDao getNotaDao();
}
