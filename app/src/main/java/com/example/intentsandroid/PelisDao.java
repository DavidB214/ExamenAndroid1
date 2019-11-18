package com.example.intentsandroid;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PelisDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Pelis peli);

    @Query("DELETE FROM taula_de_pelis")
    void deleteAll();

    @Query("SELECT*FROM taula_de_pelis ORDER BY peli Asc")
    List<Pelis> getPelis();
}
