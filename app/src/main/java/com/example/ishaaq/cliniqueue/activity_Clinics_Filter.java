package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class activity_Clinics_Filter extends AppCompatActivity {
    private Button filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__clinics__filter);
        filter = (Button)findViewById(R.id.filter);
    }

    public void filter(View view) {
        Intent intent1= new Intent(activity_Clinics_Filter.this,notification.class);
        startActivity(intent1);
    }
}
