package com.example.nutrition_system.Activities.AuthenticationActivities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.nutrition_system.MainActivity;
import com.example.nutrition_system.R;
import com.example.nutrition_system.utils.SetUp;
import com.google.android.material.textfield.TextInputEditText;


public class LoginActivity extends SetUp {

    private Button login;
    private TextInputEditText username, password;
    private TextView forgetPass, title;
    private String usernameString, passwordString;
    private Typeface type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        login();
        forgetPassword();

    }

    private void forgetPassword() {
        forgetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, PasswordActivity.class));
                finish();
            }
        });
    }

    private boolean checkCorrectness(String userName, String passWord) {
        if (userName.isEmpty() || passWord.isEmpty()) {
            if (userName.isEmpty())
                username.setError("نام کاربری خود را وارد کنید");
            if (passWord.isEmpty())
                password.setError(" رمز عبور خود را وارد کنید");
            return false;
        } else {
            return true;
        }
    }

    private void login() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usernameString = username.getText().toString().trim();
                passwordString = password.getText().toString().trim();
                if (checkCorrectness(usernameString, passwordString)) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                }
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString(getToke(username,password),"usertoken");
                editor.apply();
            }

        });
    }

    private String getToke(TextInputEditText username, TextInputEditText password) {
    }

    private void init() {
        login = findViewById(R.id.login_btn);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        forgetPass = findViewById(R.id.forget_pass);
        title = findViewById(R.id.self_title);
        type = Typeface.createFromAsset(getAssets(), "fonts/bkoodak.ttf");
        title.setTypeface(type);
    }
}