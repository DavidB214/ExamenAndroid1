package com.example.intentsandroid.database;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.intentsandroid.Nota;


/**
 * Esta clase devuelve una instancia de la interfaz NotaDao.
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.07
 */
@Database(entities = {Nota.class}, version = 2)
public abstract class NotaDatabase extends RoomDatabase {
    public abstract NotaDao getNotaDao();
}
