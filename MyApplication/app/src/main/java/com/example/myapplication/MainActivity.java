package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button shbutton = findViewById(R.id.buttonsh);
        Button ybutton = findViewById(R.id.buttony);
        Button dbutton = findViewById(R.id.buttond);
        Button sbutton = findViewById(R.id.buttons);
        Button chbutton = findViewById(R.id.buttonch);
        Button pbutton = findViewById(R.id.buttonp);
        Button jbutton = findViewById(R.id.buttonj);
        shbutton.setText(FaNum.convert("ش" +
                "\n" +
                "\n" +
                "9" +
                "\n" +
                "\n"+
                "9"));
        ybutton.setText(FaNum.convert("ی" +
                "\n" +
                "\n" +
                "9" +
                "\n" +
                "\n"+
                "10"));
        dbutton.setText(FaNum.convert("د" +
                "\n" +
                "\n" +
                "9" +
                "\n" +
                "\n"+
                "11"));
        sbutton.setText(FaNum.convert("س" +
                "\n" +
                "\n" +
                "9" +
                "\n" +
                "\n"+
                "12"));
        chbutton.setText(FaNum.convert("چ" +
                "\n" +
                "\n" +
                "9" +
                "\n" +
                "\n"+
                "13"));
        pbutton.setText(FaNum.convert("پ" +
                "\n" +
                "\n" +
                "9" +
                "\n" +
                "\n"+
                "14"));
        jbutton.setText(FaNum.convert("ج" +
                "\n" +
                "\n" +
                "9" +
                "\n" +
                "\n"+
                "15"));
    }
}