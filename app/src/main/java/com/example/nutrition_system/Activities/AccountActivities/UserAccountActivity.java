package com.example.nutrition_system.Activities.AccountActivities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nutrition_system.R;

public class UserAccountActivity extends AppCompatActivity {

    boolean editName=false;
    boolean editLastName=false;
    boolean editPhoneNumber=false;
    boolean editStudentNumber=false;
    boolean editPassword=false;
    ImageButton nameEditButton,lastNameEditButton,phoneNumberEditButton,studentNumberEditButton,passwordEditButton;
    EditText nameEditText,lastNameEditText,phoneNumberEditText,studentNumberEditText,passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_account);

        nameEditButton=findViewById(R.id.nameEditImage);
        lastNameEditButton=findViewById(R.id.lastNameEditImage);
        phoneNumberEditButton=findViewById(R.id.phoneNumbweEditImage);
        studentNumberEditButton=findViewById(R.id.studentNumberEditImage);
        passwordEditButton=findViewById(R.id.passwordEditImage);

        nameEditText=findViewById(R.id.nameEditText);
        lastNameEditText=findViewById(R.id.lastNameEditText);
        phoneNumberEditText=findViewById(R.id.phoneNumberEditText);
        studentNumberEditText=findViewById(R.id.studentNumberEditText);
        passwordEditText=findViewById(R.id.passwordEditText);

        nameEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!editName)
                {
                nameEditText.setEnabled(true);
                nameEditButton.setImageResource(R.drawable.ic_baseline_done_24);
                }
                else{
                    nameEditText.setEnabled(false);
                    nameEditButton.setImageResource(R.drawable.ic_baseline_edit_24);
                }
                editName=!editName;
            }
        });
        lastNameEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!editLastName)
                {
                    lastNameEditText.setEnabled(true);
                    lastNameEditButton.setImageResource(R.drawable.ic_baseline_done_24);
                }
                else{
                    lastNameEditText.setEnabled(false);
                    lastNameEditButton.setImageResource(R.drawable.ic_baseline_edit_24);
                }
                editLastName=!editLastName;
            }
        });
        phoneNumberEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!editPhoneNumber)
                {
                    phoneNumberEditText.setEnabled(true);
                    phoneNumberEditButton.setImageResource(R.drawable.ic_baseline_done_24);
                }
                else{
                    phoneNumberEditText.setEnabled(false);
                    phoneNumberEditButton.setImageResource(R.drawable.ic_baseline_edit_24);
                }
                editPhoneNumber=!editPhoneNumber;
            }
        });
        studentNumberEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!editStudentNumber)
                {
                    studentNumberEditText.setEnabled(true);
                    studentNumberEditButton.setImageResource(R.drawable.ic_baseline_done_24);
                }
                else{
                    studentNumberEditText.setEnabled(false);
                    studentNumberEditButton.setImageResource(R.drawable.ic_baseline_edit_24);
                }
                editStudentNumber=!editStudentNumber;
            }
        });
        passwordEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!editPassword)
                {
                    passwordEditText.setEnabled(true);
                    passwordEditButton.setImageResource(R.drawable.ic_baseline_done_24);
                }
                else{
                    passwordEditText.setEnabled(false);
                    passwordEditButton.setImageResource(R.drawable.ic_baseline_edit_24);
                }
                editPassword=!editPassword;
            }
        });


    }

}