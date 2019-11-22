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

    Button button2;

    ProgressBar progressbar;
    Button confirm;
    TextView showBooking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting_for_confirmation);

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

