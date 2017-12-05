package com.example.karim.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    private TextView textViewUserName, textViewPassword, textViewAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        textViewUserName = (TextView) findViewById(R.id.username);
        textViewPassword = (TextView) findViewById(R.id.password);
        textViewAddress = (TextView) findViewById(R.id.address);
        SharedPreferences sharedPref = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        textViewUserName.setText(sharedPref.getString("username", "").toString());
        textViewPassword.setText(sharedPref.getString("password", "").toString());
        textViewAddress.setText(sharedPref.getString("address", "").toString());
    }
}