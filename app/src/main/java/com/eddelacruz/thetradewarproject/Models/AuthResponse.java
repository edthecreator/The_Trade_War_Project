package com.eddelacruz.thetradewarproject.Models;

import android.graphics.Bitmap;

import com.google.gson.annotations.SerializedName;

public class AuthResponse {
    @SerializedName("access_token")
    private String access_token;

    @SerializedName("refresh_token")
    private String refresh_token;

    @SerializedName("token_type")
    private String token_type;

    @SerializedName("expires_in")
    private Integer expires_in;

    @SerializedName("scope")
    private String scope;

    @SerializedName("refresh_token_expires_in")
    private Integer refresh_token_expires_in;


    public AuthResponse() {

    }
    public AuthResponse(String access_token, String refresh_token, String token_type, Integer expires_in, String scope, Integer refresh_token_expires_in) {
        this.access_token = access_token;
        this.refresh_token = refresh_token;
        this.token_type = token_type;
        this.expires_in = expires_in;
        this.scope = scope;
        this.refresh_token_expires_in = refresh_token_expires_in;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public Integer getRefresh_token_expires_in() {
        return refresh_token_expires_in;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setRefresh_token_expires_in(Integer refresh_token_expires_in) {
        this.refresh_token_expires_in = refresh_token_expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public String getScope() {
        return scope;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}

