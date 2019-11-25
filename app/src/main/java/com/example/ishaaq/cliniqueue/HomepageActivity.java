package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class HomepageActivity extends AppCompatActivity {
    private Button button14;
    private Button button13;
    private Button button12;
    private Button button15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        button14= findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(HomepageActivity.this, CreateAccountUserActivity.class);
                startActivity(intent1);
            }
        });

        button12= findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(HomepageActivity.this, PatientLoginActivity.class);
                startActivity(intent2);
            }
        });


        button13= findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(HomepageActivity.this, LoginAdminActivity.class);
                startActivity(intent3);
            }
        });


        button15= findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4= new Intent(HomepageActivity.this, CreateAccountAdminActivity.class);
                startActivity(intent4);
            }
        });

    }

}
