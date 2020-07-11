package com.eddelacruz.thetradewarproject.Models;

import com.google.gson.annotations.SerializedName;

public class AuthCall {

    @SerializedName("grant_type")
    private String grant_type;

    @SerializedName("refresh_token")
    private String refresh_token;

    @SerializedName("access_type")
    private String access_type;

    @SerializedName("code")
    private String code;

    @SerializedName("client_id")
    private String client_id;

    @SerializedName("redirect_uri")
    private String redirect_uri;


    public AuthCall() {

    }
    public AuthCall(String grant_type, String refresh_token, String access_type, String code, String client_id, String redirect_uri) {
        this.grant_type = grant_type;
        this.refresh_token = refresh_token;
        this.access_type = access_type;
        this.code = code;
        this.client_id = client_id;
        this.redirect_uri = redirect_uri;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public String getAccess_type() {
        return access_type;
    }

    public String getClient_id() {
        return client_id;
    }

    public String getCode() {
        return code;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public void setAccess_type(String access_type) {
        this.access_type = access_type;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }
}
