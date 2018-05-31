package com.dalemathieu.namegameandroid;

import retrofit2.Call;
import retrofit2.http.GET;

public interface INameGameService
{
    @GET("/api/v1.0/profiles")
    Call<List<Profile>> getAllProfiles();
}
