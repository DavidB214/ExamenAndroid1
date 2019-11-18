package com.example.intentsandroid;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

public abstract class PelisRoomDatabase extends RoomDatabase {

    public abstract PelisDao getPeliDao();

    private static volatile PelisRoomDatabase INSTANCE;

    static PelisRoomDatabase getDatabase(final Context context){
        if (INSTANCE == null){
            synchronized (PelisRoomDatabase.class){
                INSTANCE= Room.databaseBuilder(context.getApplicationContext(),PelisRoomDatabase.class,"pelis_database").allowMainThreadQueries().fallbackToDestructiveMigration().build();
            }
        }
        return INSTANCE;
    }
    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @Override
    public void clearAllTables() {

    }
}
