package com.example.myapplication.room;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@androidx.room.Dao
public interface UserDataDao {

    @Insert
    void insert(UserDataTable data);
    @Update
    void updateData(UserDataTable data);

    @Query("SELECT * FROM UserDataTable ORDER BY Id ASC")
    LiveData<List<UserDataTable>> getAllUsers();

    @Query("SELECT * FROM UserDataTable WHERE id =:id")
    LiveData<UserDataTable> getUserById(int id);

    @Query("Delete FROM UserDataTable")
    void deleteUserData();
}
