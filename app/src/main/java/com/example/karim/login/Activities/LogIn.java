package com.example.karim.login.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.karim.login.Display;
import com.example.karim.login.R;

public class LogIn extends AppCompatActivity {

    private EditText editTextUserName;
    private EditText editTextPassword;
    private String NAME, PASSWORD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        editTextUserName = (EditText) findViewById(R.id.editText1);
        editTextPassword = (EditText) findViewById(R.id.editText2);

    }

    public void login(View view) {
        NAME = editTextUserName.getText().toString();
        PASSWORD = editTextPassword.getText().toString();
        SharedPreferences sharedPref = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        String name = sharedPref.getString("username", "");
        String pw = sharedPref.getString("password", "");
        if (!NAME.equals("") && !PASSWORD.equals("") && NAME.equals(name) && PASSWORD.equals(pw)) {
            Intent intent = new Intent(LogIn.this, Display.class);
            startActivity(intent);
        } else
            Toast.makeText(this, "wrong user name or password", Toast.LENGTH_SHORT).show();
    }
}
