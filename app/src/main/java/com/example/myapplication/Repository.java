package com.example.myapplication;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.myapplication.model.UserListResponse;
import com.example.myapplication.model.Users;
import com.example.myapplication.retrofit.APIInterface;
import com.example.myapplication.retrofit.RetrofitEngine;
import com.example.myapplication.room.NewDatabase;
import com.example.myapplication.room.UserDataTable;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {

    private static Repository Repository;
    static APIInterface apiInterface;
    static NewDatabase db;

    public static Repository getInstance(Context context) {
        if (Repository == null || db == null || apiInterface == null) {
            Repository = new Repository();
            db = NewDatabase.getInstance(context);
            apiInterface = RetrofitEngine.getClient().create(APIInterface.class);
        }
        return Repository;
    }

    public LiveData<List<UserDataTable>> getUserDataTableDataList(){
        return db.userDataDao().getAllUsers();
    }

    public LiveData<UserDataTable> getUserById(int id){
        return db.userDataDao().getUserById(id);
    }

    public void insertUserData(UserDataTable data){
        db.userDataDao().insert(data);
    }

    public void updateUserData(UserDataTable data){
        db.userDataDao().updateData(data);
    }

    public void deleteUserData(){
        db.userDataDao().deleteUserData();
    }


    public LiveData<List<Users>> fetchDataFromServer(){

        MutableLiveData<List<Users>> userListData = new MutableLiveData<>();

        apiInterface.getUserList().enqueue(new Callback<UserListResponse>() {
            @Override
            public void onResponse(@NonNull Call<UserListResponse> call, @NonNull Response<UserListResponse> response) {
                if (response.isSuccessful()) {
                    UserListResponse data = response.body();
                    if(data != null){
                        //Toast.makeText(MainActivity.this, String.valueOf(data.getTotal()), Toast.LENGTH_LONG).show();

                        List<Users> userList = data.getUsers();

                        userListData.setValue(userList);

                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<UserListResponse> call, @NonNull Throwable t) {
                //Toast.makeText(MainActivity.this, "Something went wrong while fetching data "+t, Toast.LENGTH_LONG).show();
                t.printStackTrace();
            }
        });

        return userListData;
    }



}
