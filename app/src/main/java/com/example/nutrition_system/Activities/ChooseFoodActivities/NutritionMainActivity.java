package com.example.nutrition_system.Activities.ChooseFoodActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.nutrition_system.R;

public class NutritionMainActivity extends AppCompatActivity {

    TextView cash;
    Button increase_Cash;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_main);

    }
}