package com.example.intentsandroid.database;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.intentsandroid.Peli;


/**
 * Esta clase devuelve una instancia de la interfaz NotaDao.
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.07
 */
@Database(entities = {Peli.class}, version = 1)
public abstract class PelisRoomDatabase extends RoomDatabase {
    public abstract PeliDao getPeliDao();

    private static volatile PelisRoomDatabase INSTANCE;

    public static PelisRoomDatabase getDatabase(final Context context){
        if (INSTANCE== null){
            synchronized (PelisRoomDatabase.class){
                if(INSTANCE==null){
                    INSTANCE= Room.databaseBuilder(context.getApplicationContext(),
                            PelisRoomDatabase.class,"pelis_database").allowMainThreadQueries().fallbackToDestructiveMigration().build();
                }
            }
        }return INSTANCE;
    }
}
