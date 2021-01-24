package com.example.nutrition_system;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.nutrition_system.model.Food;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    private TextView button;
    private Food food1,food2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        BottomSheetFragment dialog = new BottomSheetFragment();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetFragment bottomFragment = new BottomSheetFragment();
                bottomFragment.show(getSupportFragmentManager(), bottomFragment.getTag());
                //dialog.getInstance(food1,food2,"sd","sd");
            }
        });
    }

}