package com.dalemathieu.namegameandroid.network;

import com.dalemathieu.namegameandroid.network.model.AllProfiles;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NameGameApi {
    @GET("/api/v1.0/profiles")
    Call<AllProfiles> getProfiles;
}
