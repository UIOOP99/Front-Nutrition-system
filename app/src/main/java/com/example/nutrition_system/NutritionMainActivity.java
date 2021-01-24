package com.example.nutrition_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class NutritionMainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView cash,
                total_Cost,
                sat_date,
                sun_date,
                mon_date,
                tus_date,
                wed_date,
                sat_breakfast_text,
                sun_breakfast_text,
                mon_breakfast_text,
                tus_breakfast_text,
                wed_breakfast_text,
                sat_lunch_text,
                sun_lunch_text,
                mon_lunch_text,
                tus_lunch_text,
                wed_lunch_text,
                sat_dinner_text,
                sun_dinner_text,
                mon_dinner_text,
                tus_dinner_text,
                wed_dinner_text;
    Button increase_Cash,
            submit_Button;
    ImageButton sat_breakfast_Select_Button,
            sun_breakfast_Select_Button,
            mon_breakfast_Select_Button,
            tus_breakfast_Select_Button,
            wed_breakfast_Select_Button,
            sat_lunch_Select_Button,
            sun_lunch_Select_Button,
            mon_lunch_Select_Button,
            tus_lunch_Select_Button,
            wed_lunch_Select_Button,
            sat_dinner_Select_Button,
            sun_dinner_Select_Button,
            mon_dinner_Select_Button,
            tus_dinner_Select_Button,
            wed_dinner_Select_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_main);
        init();
    }

    private void init() {
        cash=findViewById(R.id.amount_cash);
        total_Cost=findViewById(R.id.amountPrice);
        sat_date=findViewById(R.id.sat_date);
        sun_date=findViewById(R.id.sun_date);
        mon_date=findViewById(R.id.mon_date);
        tus_date=findViewById(R.id.tus_date);
        wed_date=findViewById(R.id.wed_date);
        sat_breakfast_text=findViewById(R.id.sat_breakfastFoodText);
        sun_breakfast_text=findViewById(R.id.sun_breakfastFoodText);
        mon_breakfast_text=findViewById(R.id.mon_breakfastFoodText);
        tus_breakfast_text=findViewById(R.id.tus_breakfastFoodText);
        wed_breakfast_text=findViewById(R.id.wed_breakfastFoodText);
        sat_lunch_text=findViewById(R.id.sat_lunchfoodText);
        sun_lunch_text=findViewById(R.id.sun_lunchfoodText);
        mon_lunch_text=findViewById(R.id.mon_lunchfoodText);
        tus_lunch_text=findViewById(R.id.tus_lunchfoodText);
        wed_lunch_text=findViewById(R.id.wed_lunchfoodText);
        sat_dinner_text=findViewById(R.id.sat_dinnerfoodText);
        sun_dinner_text=findViewById(R.id.sun_dinnerfoodText);
        mon_dinner_text=findViewById(R.id.mon_dinnerfoodText);
        tus_dinner_text=findViewById(R.id.tus_dinnerfoodText);
        wed_dinner_text=findViewById(R.id.wed_dinnerfoodText);
        increase_Cash=findViewById(R.id.increase_cash);
        submit_Button=findViewById(R.id.submitButton);
        sat_breakfast_Select_Button=findViewById(R.id.sat_breakfastSelectButton);
        sun_breakfast_Select_Button=findViewById(R.id.sun_breakfastSelectButton);
        mon_breakfast_Select_Button=findViewById(R.id.mon_breakfastSelectButton);
        tus_breakfast_Select_Button=findViewById(R.id.tus_breakfastSelectButton);
        wed_breakfast_Select_Button=findViewById(R.id.wed_breakfastSelectButton);
        sat_lunch_Select_Button=findViewById(R.id.sat_lunchSelectButton);
        sun_lunch_Select_Button=findViewById(R.id.sun_lunchSelectButton);
        mon_lunch_Select_Button=findViewById(R.id.mon_lunchSelectButton);
        tus_lunch_Select_Button=findViewById(R.id.tus_lunchSelectButton);
        wed_lunch_Select_Button=findViewById(R.id.wed_lunchSelectButton);
        sat_dinner_Select_Button=findViewById(R.id.sat_dinnerSelectButton);
        sun_dinner_Select_Button=findViewById(R.id.sun_dinnerSelectButton);
        mon_dinner_Select_Button=findViewById(R.id.mon_dinnerSelectButton);
        tus_dinner_Select_Button=findViewById(R.id.tus_dinnerSelectButton);
        wed_dinner_Select_Button=findViewById(R.id.wed_dinnerSelectButton);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.increase_cash:{
                //TODO implement increase cash button
            }
            break;
            case R.id.submitButton:{
                //TODO implement submit button
            }
            break;
            case R.id.sat_breakfastSelectButton:{
                //TODO
            }
            break;
            case R.id.sun_breakfastSelectButton:{
                //TODO
            }
            break;
            case R.id.mon_breakfastSelectButton:{
                //TODO
            }
            case R.id.tus_breakfastSelectButton:{
                //TODO
            }
            break;
            case R.id.wed_breakfastSelectButton:{
                //TODO
            }
            break;
            case R.id.sat_lunchSelectButton:{
                //TODO
            }
            break;
            case R.id.sun_lunchSelectButton:{
                //TODO
            }
            break;
            case R.id.mon_lunchSelectButton:{
                //TODO
            }
            break;
            case R.id.tus_lunchSelectButton:{
                //TODO
            }
            break;
            case R.id.wed_lunchSelectButton:{
                //TODO
            }
            break;
            case R.id.sat_dinnerSelectButton:{
                //TODO
            }
            break;
            case R.id.sun_dinnerSelectButton:{
                //TODO
            }
            break;
            case R.id.mon_dinnerSelectButton:{
                //TODO
            }
            break;
            case R.id.tus_dinnerSelectButton:{
                //TODO
            }
            break;
            case R.id.wed_dinnerSelectButton:{
                //TODO
            }
            break;
        }
    }
}