package com.college.chatapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;

public class AuthActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_auth);

        AppCompatButton buttonBack = (AppCompatButton)findViewById(R.id.button_back);
        buttonBack.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, AuthActivity.class);
        startActivity(intent);
    }

}
