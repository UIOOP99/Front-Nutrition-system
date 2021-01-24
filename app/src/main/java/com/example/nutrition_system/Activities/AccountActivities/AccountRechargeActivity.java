package com.example.nutrition_system.Activities.AccountActivities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nutrition_system.R;

public class AccountRechargeActivity extends AppCompatActivity {

    Button chargeAccountBtn;
    double price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_recharge);
        chargeAccountBtn.findViewById(R.id.chargeAccount);

        chargeAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
                String token = preferences.getString("usertoken", "");
                chargeAccount(token,price);*/
            }
        });
    }



    private void chargeAccount(String token, double price) {
    }


}