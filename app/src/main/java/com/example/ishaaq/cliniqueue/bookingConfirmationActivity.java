package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bookingConfirmationActivity extends AppCompatActivity {
    private Button CancelAppointment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_confirmation);
        CancelAppointment = (Button)findViewById(R.id.CancelAppointment);
    }

    public void CancelAppointment(View view) {
        Intent intent1 = new Intent(bookingConfirmationActivity.this, activity_show_appointments.class);
        startActivity(intent1);
    }
}
