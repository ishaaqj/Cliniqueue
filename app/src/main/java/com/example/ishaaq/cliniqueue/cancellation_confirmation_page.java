package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cancellation_confirmation_page extends AppCompatActivity {
    private Button Yes;
    private Button No;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_confirmation);
        Yes = (Button)findViewById(R.id.Yes);
        No = (Button)findViewById(R.id.No);
    }

    public void Yes(View view) {
        Intent intent1= new Intent(cancellation_confirmation_page.this,Map.class);
        startActivity(intent1);
    }

    public void No(View view) {
        Intent intent2= new Intent(cancellation_confirmation_page.this, ShowAppointmentsActivity.class);
        startActivity(intent2);
    }
}
