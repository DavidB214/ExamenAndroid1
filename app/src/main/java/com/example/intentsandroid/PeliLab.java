package com.example.intentsandroid;
import android.annotation.SuppressLint;
import android.content.Context;

import com.example.intentsandroid.database.PeliDao;
import com.example.intentsandroid.database.PelisRoomDatabase;

import java.util.List;

/**
 * Esta clase hace uso de la interfaz NotaDao e interactúa con la base de datos.
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.07
 */
public class PeliLab {
    @SuppressLint("StaticFieldLeak")
    private static PeliLab sPeliLab;

    private PeliDao mPeliDao;

    private PeliLab(Context context) {
        PelisRoomDatabase database = PelisRoomDatabase.getDatabase(context);
        mPeliDao=database.getPeliDao();
    }

    public static PeliLab get(Context context) {
        if (sPeliLab == null) {
            sPeliLab = new PeliLab(context);
        }
        return sPeliLab;
    }

    public List<Peli> getPelis() {
        return mPeliDao.getPelis();
    }

    public Peli getPeli(String id) {
        return mPeliDao.getPeli(id);
    }

    public void addPeli(Peli peli) {
        mPeliDao.addPeli(peli);
    }

    public void deleteNota(Peli peli) {
        mPeliDao.deletePeli(peli);
    }
}
