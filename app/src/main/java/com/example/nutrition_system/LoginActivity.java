package com.example.nutrition_system;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nutrition_system.model.Repository;
import com.example.nutrition_system.utils.SetUp;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;


public class LoginActivity extends SetUp {

    private Button login;
    private TextInputEditText username, password;
    private TextView forgetPass, title;
    private String usernameString, passwordString;
    private Typeface type;
    private Repository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        repository = new Repository();
        init();
        login();
        forgetPassword();
    }

    private void forgetPassword() {
        forgetPass.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, PasswordActivity.class));
            finish();
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
        login.setOnClickListener(view -> {
            showProgressDialog();
            usernameString = username.getText().toString().trim();
            passwordString = password.getText().toString().trim();
            if (checkCorrectness(usernameString, passwordString)) {
                repository.checkLogin(usernameString, passwordString).observe(LoginActivity.this, aBoolean -> {
                    if (aBoolean) {
                        hideProgressDialog();
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        finish();
                    }
                    else {
                        hideProgressDialog();
                        View parentLayout = findViewById(android.R.id.content);
                        Snackbar.make(parentLayout, "اطلاعات خود را دوباره وارد کنید", Snackbar.LENGTH_LONG)
                                .setBackgroundTint(getResources().getColor(android.R.color.background_dark))
                                .show();
                    }
                });
            }
        });
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