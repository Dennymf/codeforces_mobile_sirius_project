package com.seva.marsel.goodteam.codeforcesmobilenew20.connectionAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserInterface {
    @GET("/api/user.info")
    Call<User> getUsers(@Query("handles") String handles);
    @GET("/api/get")
    Call<List<User>> getUserList(@Query("handles") String handles);
}

