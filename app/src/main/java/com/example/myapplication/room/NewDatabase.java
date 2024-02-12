package com.example.myapplication.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {UserDataTable.class}, version = 1)
public abstract class NewDatabase extends RoomDatabase {

    // below line is to create instance
    // for our database class.
    private static NewDatabase instance;

    // below line is to create
    // abstract variable for dao.
    public abstract UserDataDao userDataDao();

    // on below line we are getting instance for our database.
    public static synchronized NewDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                                    NewDatabase.class, "newDataBase")
                            .fallbackToDestructiveMigration()
                            .allowMainThreadQueries()
                            .build();
        }
        // after creating an instance
        // we are returning our instance
        return instance;
    }
}
