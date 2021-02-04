package com.college.chatapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.college.chatapp.dao.User;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatButton buttonLogin = (AppCompatButton)findViewById(R.id.button_window_login);
        buttonLogin.setOnClickListener(this);
        AppCompatButton buttonRegistration = (AppCompatButton)findViewById(R.id.button_window_registration);
        buttonLogin.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, AuthActivity.class);
        startActivity(intent);
    }

    public void onClickReg(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }

    private void registration(View view){
        User user = new User();

        EditText editTextUsername = (EditText) findViewById(R.id.edit_username);
        user.setUsername(editTextUsername.getText().toString());

        EditText editTextEmail = (EditText) findViewById(R.id.edit_email);
        user.setEmail(editTextEmail.getText().toString());

        EditText editTextPassword = (EditText) findViewById(R.id.edit_password);
        user.setPassword(editTextPassword.getText().toString());
        
        EditText editTextConfirmPassword = (EditText) findViewById(R.id.edit_confirm_password);
        user.setConfirmPassword(editTextConfirmPassword.getText().toString());

    }

}