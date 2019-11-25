package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ClientRequestsActivity extends AppCompatActivity {
    private TextView Abdelrahman;
    private TextView Nour;
    private TextView Tanisha;
    private TextView Jimit;
    private TextView Ishaaq;
    private TextView Michael;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_requests);
        Abdelrahman = findViewById(R.id.Abdelrahman);
        Nour = findViewById(R.id.Nour);
        Tanisha = findViewById(R.id.Tanisha);
        Jimit = findViewById(R.id.Jimit);
        Ishaaq = findViewById(R.id.Ishaaq);
        Michael = findViewById(R.id.Michael);

        //Toast.makeText(this, "coming from admin login", Toast.LENGTH_SHORT).show();
    }

    public void Abdelrahman(View view) {
        Intent intent1= new Intent(ClientRequestsActivity.this, ClientDetailsActivity.class);
        String name = "Abdelrahman Mohamad";
        intent1.putExtra("clientName",name);
        startActivity(intent1);
    }

    public void Nour(View view) {
        Intent intent2= new Intent(ClientRequestsActivity.this, ClientDetailsActivity.class);
        String name = "Nour Dowedkar";
        intent2.putExtra("clientName",name);
        startActivity(intent2);
    }

    public void Tanisha(View view) {
        Intent intent3= new Intent(ClientRequestsActivity.this, ClientDetailsActivity.class);
        String name = "Tanisha Jain";
        intent3.putExtra("clientName",name);
        startActivity(intent3);
    }

    public void Jimit(View view) {
        Intent intent4= new Intent(ClientRequestsActivity.this, ClientDetailsActivity.class);
        String name = "Jimit Modi";
        intent4.putExtra("clientName",name);
        startActivity(intent4);
    }

    public void Ishaaq(View view) {
        Intent intent5= new Intent(ClientRequestsActivity.this, ClientDetailsActivity.class);
        String name = "Ishaqq Jiffry";
        intent5.putExtra("clientName",name);
        startActivity(intent5);
    }

    public void Michael(View view) {
        Intent intent6= new Intent(ClientRequestsActivity.this, ClientDetailsActivity.class);
        String name = "Michael Zalewski";
        intent6.putExtra("clientName",name);
        startActivity(intent6);
    }
}
