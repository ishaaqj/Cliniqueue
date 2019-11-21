package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ClinicRequestsActivity extends AppCompatActivity {
    private TextView Abdelrahman;
    private TextView Nour;
    private TextView Tanisha;
    private TextView Jimit;
    private TextView Ishaaq;
    private TextView Michael;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinics_list);
        Abdelrahman = (TextView)findViewById(R.id.Abdelrahman);
        Nour = (TextView)findViewById(R.id.Nour);
        Tanisha = (TextView)findViewById(R.id.Tanisha);
        Jimit = (TextView)findViewById(R.id.Jimit);
        Ishaaq = (TextView)findViewById(R.id.Ishaaq);
        Michael = (TextView)findViewById(R.id.Michael);
    }

    public void Abdelrahman(View view) {
        Intent intent1= new Intent(ClinicRequestsActivity.this, ClientDetailsActivity.class);
        startActivity(intent1);
    }

    public void Nour(View view) {
        Intent intent2= new Intent(ClinicRequestsActivity.this, ClientDetailsActivity.class);
        startActivity(intent2);
    }

    public void Tanisha(View view) {
        Intent intent3= new Intent(ClinicRequestsActivity.this, ClientDetailsActivity.class);
        startActivity(intent3);
    }

    public void Jimit(View view) {
        Intent intent4= new Intent(ClinicRequestsActivity.this, ClientDetailsActivity.class);
        startActivity(intent4);
    }

    public void Ishaaq(View view) {
        Intent intent5= new Intent(ClinicRequestsActivity.this, ClientDetailsActivity.class);
        startActivity(intent5);
    }

    public void Michael(View view) {
        Intent intent6= new Intent(ClinicRequestsActivity.this, ClientDetailsActivity.class);
        startActivity(intent6);
    }
}
