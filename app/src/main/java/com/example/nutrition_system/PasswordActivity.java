package com.example.nutrition_system;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nutrition_system.utils.SetUp;

public class PasswordActivity extends SetUp {

    private Button sendCode;
    private EditText mobile;
    private ImageView back;
    private Typeface type;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        init();
        back();
    }

    private void back() {
        back.setOnClickListener(view -> {
            startActivity(new Intent(PasswordActivity.this, LoginActivity.class));
            finish();
        });
    }

    private void init() {
        sendCode = findViewById(R.id.send_code_btn);
        mobile = findViewById(R.id.mobile_et);
        back = findViewById(R.id.back_btn);
        title = findViewById(R.id.forget_password);
        type = Typeface.createFromAsset(getAssets(), "fonts/bkoodak.ttf");
        title.setTypeface(type);
    }

}