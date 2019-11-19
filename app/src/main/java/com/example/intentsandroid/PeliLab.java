package com.example.intentsandroid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.room.Room;

import com.example.intentsandroid.database.PeliDao;
import com.example.intentsandroid.database.PeliDatabase;

import java.util.List;

public class PeliLab {
    @SuppressLint("StaticFieldLeak")
    private static PeliLab sNotaLab;

    private PeliDao mNotaDao;

    private PeliLab(Context context) {
        Context appContext = context.getApplicationContext();
        PeliDatabase database = Room.databaseBuilder(appContext, PeliDatabase.class, "nota")
                .allowMainThreadQueries().build();
        mNotaDao = database.getNotaDao();
    }

    public static PeliLab get(Context context) {
        if (sNotaLab == null) {
            sNotaLab = new PeliLab(context);
        }
        return sNotaLab;
    }

    public List<Peli> getNotas() {
        return mNotaDao.getNotas();
    }

    public Peli getNota(String id) {
        return mNotaDao.getNota(id);
    }

    public void addNota(Peli peli) {
        mNotaDao.addNota(peli);
    }

    public void updateNota(Peli peli) {
        mNotaDao.updateNota(peli);
    }

    public void deleteNota(Peli peli) {
        mNotaDao.deleteNota(peli);
    }
}
