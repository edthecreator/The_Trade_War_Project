package com.eddelacruz.thetradewarproject.APICalls;

import com.eddelacruz.thetradewarproject.Models.AuthCall;
import com.eddelacruz.thetradewarproject.Models.AuthResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Auth {
    @POST("v1/oauth2/token")
    Call<AuthResponse> createUser(@Body AuthCall login);
}
