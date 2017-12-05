package com.example.karim.login.Activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.karim.login.R;

public class Register extends AppCompatActivity {

    private EditText editTextUserName;
    private EditText editTextPassword;
    private EditText editTextAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editTextUserName = (EditText) findViewById(R.id.editText1);
        editTextPassword = (EditText) findViewById(R.id.editText2);
        editTextAddress = (EditText) findViewById(R.id.editText3);
    }

    public void register(View view) {
        if (editTextAddress.getText().toString().equals("") || editTextPassword.getText().toString().equals("") || editTextUserName.getText().toString().equals(""))
            Toast.makeText(this, "Complete the registration form ", Toast.LENGTH_LONG).show();
        else {

            SharedPreferences sharedPref = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString("username", editTextUserName.getText().toString());
            editor.putString("password", editTextPassword.getText().toString());
            editor.putString("address", editTextAddress.getText().toString());
            editor.apply();
            Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
        }
    }
}
