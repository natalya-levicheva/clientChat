package com.college.chatapp.api;

import com.college.chatapp.dao.User;
import com.college.chatapp.dto.RegistrationDto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ChatApi {

    @POST("/registration")
    public Call<RegistrationDto> isRegistered(@Body User user);
}
