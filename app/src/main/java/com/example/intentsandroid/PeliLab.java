package com.example.intentsandroid;

import android.content.Context;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.List;

public class PeliLab {
    private static PeliLab sPeliLab;
    private static PelisDao mPeliDao;

    private PeliLab(Context context){
        Context appContext= context.getApplicationContext();

        PelisRoomDatabase database= PelisRoomDatabase.getDatabase(context);
        mPeliDao=database.getPeliDao();
    }
    public static PeliLab get(Context context){
        if(sPeliLab==null){
            sPeliLab = new PeliLab(context);
        }
        return sPeliLab;
    }
    public List<Pelis> getPelis() {return mPeliDao.getPelis();}
    public void addPeli(Pelis peli){mPeliDao.insert(peli);}
    public void deleteAll(){mPeliDao.deleteAll();}

    //crear




}
