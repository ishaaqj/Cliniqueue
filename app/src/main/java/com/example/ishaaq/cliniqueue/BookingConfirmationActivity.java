package com.example.ishaaq.cliniqueue;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookingConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_confirmation);
        Button CancelAppointment;
        CancelAppointment = findViewById(R.id.CancelAppointment);

    }

    public void CancelAppointment(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Cancel Appointment?");
        builder.setMessage("Are you sure you want to cancel you appointment?");
        builder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent1 = new Intent(BookingConfirmationActivity.this, Map.class);
                        startActivity(intent1);
                    }
                });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent1 = new Intent(BookingConfirmationActivity.this, BookingConfirmationActivity.class);
                startActivity(intent1);
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
