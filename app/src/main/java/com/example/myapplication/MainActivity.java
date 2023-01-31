package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import model.APIService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
     Button mButton;
     EditText email;
     EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://emsiapp.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService APIService = retrofit.create(APIService.class);

        Call<ResponseBody> isLogin = APIService.isLogin();



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.loginButton);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);




        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<ResponseBody> login = APIService.login(email.getText(),password.getText());
                Intent LoginActivityIntent = new Intent(MainActivity.this, Login_Activity.class);
                startActivity(LoginActivityIntent);
            }
        });
    }
}