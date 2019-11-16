package com.example.ishaaq.cliniqueue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class waitingForConfirmationActivity extends AppCompatActivity {

    ProgressBar progressbar;
    Button confirm;
    TextView showBooking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting_for_confirmation);
        progressbar = (ProgressBar)findViewById(R.id.progressBar);
        confirm  = (Button)findViewById(R.id.confirmBooking);
        showBooking = (TextView)findViewById(R.id.showText);
    }

    public void confirmBookingButton(View view) {
        showBooking.setText("Booking response has been sent.\n Please wait for a resposne");
        progressbar.setVisibility(View.VISIBLE);
    }
}

