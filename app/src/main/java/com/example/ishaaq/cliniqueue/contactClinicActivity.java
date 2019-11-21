package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contactClinicActivity extends AppCompatActivity {

    private Button BookAppointment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_clinic);

        BookAppointment= (Button) findViewById(R.id.BookAppointment);
        BookAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent88= new Intent(contactClinicActivity.this,reasonForVisitActivity.class);
                startActivity(intent88);
            }
        });

    }
}

