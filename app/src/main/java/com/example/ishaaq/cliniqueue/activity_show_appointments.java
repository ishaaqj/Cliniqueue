package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_show_appointments extends AppCompatActivity {
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_appointments);
        cancel = (Button)findViewById(R.id.cancel);
    }

    public void cancel(View view) {
        Intent intent1 = new Intent(activity_show_appointments.this, cancellation_confirmation_page.class);
        startActivity(intent1);
    }
}
