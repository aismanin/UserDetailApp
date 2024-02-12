package com.example.myapplication;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.model.Users;
import com.example.myapplication.room.UserDataTable;

import java.util.List;

public class MyViewModel extends ViewModel {

    int currentUserId = 0;      //this will be shared among fragments

    Repository repo;

    void initDBR(Context context){
        repo = Repository.getInstance(context);
    }

    public LiveData<List<UserDataTable>> getUserDataTableDataList(Context context){
        initDBR(context);
        return repo.getUserDataTableDataList();
    }

    public LiveData<UserDataTable> getUserById(Context context, int id){
        initDBR(context);
        return repo.getUserById(id);
    }

    public void insertUserData(Context context, UserDataTable data){
        initDBR(context);
        repo.insertUserData(data);
    }

    public void updateUserData(Context context, UserDataTable data){
        initDBR(context);
        repo.updateUserData(data);
    }

    public void deleteUserData(Context context){
        initDBR(context);
        repo.deleteUserData();
    }

    public LiveData<List<Users>> fetchDataFromServer(Context context){
        initDBR(context);
        return repo.fetchDataFromServer();
    }

}
