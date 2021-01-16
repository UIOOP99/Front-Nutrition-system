package com.example.nutrition_system.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.nutrition_system.R;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class SetUp extends AppCompatActivity {
    private Dialog mProgressDialog;
    boolean doubleBackToExitPressedOnce = false;

    public void showProgressDialog() {
        mProgressDialog = new Dialog(this);
        mProgressDialog.setContentView(R.layout.dialog_progress);
        mProgressDialog.show();
    }

    private void hideProgressDialog() {
        mProgressDialog.dismiss();
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "لطفا دوباره کلیک کنید تا خارج شوید", Toast.LENGTH_SHORT).show();
        final Runnable r = new Runnable() {
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        };
        new Handler().postDelayed(r , 2000);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
}