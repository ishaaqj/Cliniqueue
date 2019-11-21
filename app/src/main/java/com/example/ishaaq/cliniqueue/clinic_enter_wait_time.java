package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class clinic_enter_wait_time extends AppCompatActivity {
    //private Button confirmWaitTime


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic_enter_wait_time);
        //confirmWaitTime = (Button)findViewById(R.id.confirmWaitTime);
    }
    public void setConfirmWaitTime(View view) {
        // Intent intent1= new Intent(clinic_enter_wait_time.this,clinic_requests.class);
        // startActivity(intent1);
    }
}
