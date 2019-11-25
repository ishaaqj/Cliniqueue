package com.example.ishaaq.cliniqueue;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class CreateAccountUserActivity extends AppCompatActivity {

    Button registerButton;
    EditText editText1;
    String string1;
    TextView textView;

    private EditText mDisplayDate;
    private DatePickerDialog.OnDateSetListener  mDateSetlistener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_user);

        editText1=findViewById(R.id.editText);




        registerButton= findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(CreateAccountUserActivity.this, PatientLoginActivity.class);
                Context context = getApplicationContext();
                CharSequence text = "You have succesfully registered";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                string1=editText1.getText().toString();
                intent1.putExtra("Value",string1);
                startActivity(intent1);
                toast.show();
            }
        });

        textView= findViewById(R.id.textView2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(CreateAccountUserActivity.this, PatientLoginActivity.class);
                startActivity(intent);

            }
        });

        mDisplayDate = findViewById(R.id.datepicker);
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year  = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(CreateAccountUserActivity.this,
                        android.R.style.Theme_Holo_Light,
                        mDateSetlistener, year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        mDateSetlistener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

            }
        };
    }
}
