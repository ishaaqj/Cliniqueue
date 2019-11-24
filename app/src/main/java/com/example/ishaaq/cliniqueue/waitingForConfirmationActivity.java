package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class waitingForConfirmationActivity extends AppCompatActivity {

    TextView textView1;
    String string1;
    TextView textView2;
    String string2;
    TextView textView3;
    String string3;
    TextView textView4;
    String string4;
    TextView textView5;
    String string5;
    TextView textView6;
    String string6;
    TextView textView7;
    String string7;

    Button button2;

    ProgressBar progressbar;
    Button confirm;
    TextView showBooking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting_for_confirmation);

        textView1=findViewById(R.id.Name);
        string1=getIntent().getExtras().getString("userName");
        textView1.setText(string1);
        //Toast.makeText(this, string1, Toast.LENGTH_SHORT).show();

        textView2=findViewById(R.id.reason);
        string2=getIntent().getExtras().getString("reasonForVisit");
        textView2.setText(string2);

        textView3=findViewById(R.id.symptoms);
        string3=getIntent().getExtras().getString("Value2");
        textView3.setText(string3);

        textView4=findViewById(R.id.allergies);
        string4=getIntent().getExtras().getString("Value3");
        textView4.setText(string4);

        textView5=findViewById(R.id.History);
        string5=getIntent().getExtras().getString("Value5");
        textView5.setText(string5);

        textView6=findViewById(R.id.Age);
        string6=getIntent().getExtras().getString("Value6");
        textView6.setText(string6);

        textView7=findViewById(R.id.Weight);
        string7=getIntent().getExtras().getString("Value7");
        textView7.setText(string7);


        button2= (Button) findViewById(R.id.confirmBooking);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(waitingForConfirmationActivity.this, BookingConfirmationActivity.class);
                startActivity(intent1);
            }
        });
        progressbar = (ProgressBar)findViewById(R.id.progressBar);
        confirm  = (Button)findViewById(R.id.confirmBooking);
        showBooking = (TextView)findViewById(R.id.showText);
    }

    public void confirmBookingButton(final View view) {
        showBooking.setText("Booking response has been sent.\n Please wait for a resposne");
        progressbar.setVisibility(View.VISIBLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent myIntent = new Intent(view.getContext(), BookingConfirmationActivity.class);
                startActivityForResult(myIntent, 0);
            }
        }, 3000);
    }

}

