package com.example.nutrition_system;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.nutrition_system.model.Food;
import com.example.nutrition_system.model.Repository;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.snackbar.Snackbar;

public class BottomSheetFragment extends BottomSheetDialogFragment {

    private View view;
    private Button selectFood;

    private TextView mealType;
    private TextView date;
    private TextView nameFoodOne, nameFoodTwo;
    private TextView priceFoodOne, priceFoodTwo;
    private ImageView pictureFoodOne, pictureFoodTwo;
    private Food food1, food2;
    private String dateString;
    private String mealTypeString;
    private LinearLayout lnFood1, lnFood2;
    private boolean isFood1Selection, isFood2Selection;
    private Repository repository;
    private Button select;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.bottom_sheet, container, false);
        repository = new Repository();
        init();
        selectFood();
        saveFood();
        return view;
    }

    private void saveFood() {

        select.setOnClickListener(view -> {
            if (isFood1Selection) {
                repository.reserveFood("1", "1", "2021-01-16");
            } else if (isFood2Selection) {
                repository.reserveFood("1", "1", "2021-01-16");
            }
        });
    }

    private void selectFood() {
        lnFood1.setOnClickListener(view -> {
            lnFood1.setBackgroundColor(getResources().getColor(R.color.selection));
            lnFood2.setBackgroundColor(0);
            isFood1Selection = true;
            isFood2Selection = false;
        });
        lnFood2.setOnClickListener(view -> {
            lnFood2.setBackgroundColor(getResources().getColor(R.color.selection));
            lnFood1.setBackgroundColor(0);
            isFood2Selection = true;
            isFood1Selection = false;
        });
    }

    public void getInstance(Food food1, Food food2, String date, String mealType) {
        this.food1 = food1;
        this.food2 = food2;
        dateString = date;
        mealTypeString = mealType;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lnFood1.setBackgroundColor(getResources().getColor(R.color.selection));
        isFood1Selection = true;
        isFood2Selection = false;
        //  setUpView();
    }

    private void setUpView() {
        nameFoodOne.setText(food1.getName());
        nameFoodTwo.setText(food2.getName());
        priceFoodOne.setText(food1.getPrice() + "");
        priceFoodTwo.setText(food2.getPrice() + "");
        mealType.setText(mealTypeString);
        date.setText(dateString);

        Glide.with(this)
                .load(food1.getImage())
                .apply(new RequestOptions().override(100, 100))
                .into(pictureFoodOne);
        Glide.with(this)
                .load(food2.getImage())
                .apply(new RequestOptions().override(100, 100))
                .into(pictureFoodTwo);

    }

    private void init() {

        selectFood = view.findViewById(R.id.select_food);
        mealType = view.findViewById(R.id.choose_food);
        date = view.findViewById(R.id.date);
        nameFoodOne = view.findViewById(R.id.name_Food_one);
        nameFoodTwo = view.findViewById(R.id.name_Food_two);
        priceFoodOne = view.findViewById(R.id.price_food_one);
        priceFoodTwo = view.findViewById(R.id.price_food_two);
        lnFood1 = view.findViewById(R.id.food_one);
        lnFood2 = view.findViewById(R.id.food_two);
        pictureFoodOne = view.findViewById(R.id.image_food_one);
        pictureFoodTwo = view.findViewById(R.id.image_food_two);
        select = view.findViewById(R.id.select_food);

    }


}
