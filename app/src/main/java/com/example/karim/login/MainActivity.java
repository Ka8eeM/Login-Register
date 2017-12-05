package com.example.karim.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.karim.login.Activities.LogIn;
import com.example.karim.login.Activities.Register;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPref = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
                Intent intent;
                if (sharedPref.contains("username")&&sharedPref.contains("password")&&sharedPref.contains("address")) {
                    intent = new Intent(MainActivity.this, LogIn.class);
                    startActivity(intent);
                    finish();

                } else {
                    intent = new Intent(MainActivity.this, Register.class);
                    startActivity(intent);
                }
            }
        }, SPLASH_SCREEN); // wait for 3 seconds and start one of two activities
    }
}
