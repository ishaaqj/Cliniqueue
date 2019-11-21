package com.example.ishaaq.cliniqueue;

import android.app.DatePickerDialog;
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

import java.util.Calendar;

public class CreateAccountUserActivity extends AppCompatActivity {

    Button button;
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


        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(CreateAccountUserActivity.this, PatientLoginActivity.class);
                string1=editText1.getText().toString();
                intent1.putExtra("Value",string1);
                startActivity(intent1);
            }
        });

        textView=(TextView)findViewById(R.id.textView2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(CreateAccountUserActivity.this, PatientLoginActivity.class);
                startActivity(intent);

            }
        });

        mDisplayDate = (EditText) findViewById(R.id.datepicker);
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
