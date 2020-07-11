package com.eddelacruz.thetradewarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.eddelacruz.thetradewarproject.APICalls.Auth;
import com.eddelacruz.thetradewarproject.APIClient.ApiClient;
import com.eddelacruz.thetradewarproject.Models.AuthCall;
import com.eddelacruz.thetradewarproject.Models.AuthResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Auth apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = ApiClient.getClient().create(Auth.class);

        loginRetrofit2Api();
    }

    private void loginRetrofit2Api() {
        final AuthCall login = new AuthCall();
        Call<AuthResponse> call1 = apiInterface.createUser(login);
        call1.enqueue(new Callback<AuthResponse>() {
            @Override
            public void onResponse(Call<AuthResponse> call, Response<AuthResponse> response) {
                AuthResponse AuthResponse = response.body();

                Log.e("keshav", "AuthResponse 1 --> " + AuthResponse);
                if (AuthResponse != null) {
                    String responseCode = AuthResponse.getAccess_token();
                    Log.e("keshav", "getResponseCode  -->  " + responseCode);
                    if (responseCode != null && responseCode.equals("404")) {
                        Toast.makeText(MainActivity.this, "Invalid Login Details \n Please try again", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Welcome " + AuthResponse.getAccess_token(), Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<AuthResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "onFailure called ", Toast.LENGTH_SHORT).show();
                call.cancel();
            }
        });
    }
}