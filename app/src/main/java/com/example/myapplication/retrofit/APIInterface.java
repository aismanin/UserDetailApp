package com.example.myapplication.retrofit;

import com.example.myapplication.model.UserListResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    @GET(APIEndUrl.USERS_LIST)
    Call<UserListResponse> getUserList();

}
