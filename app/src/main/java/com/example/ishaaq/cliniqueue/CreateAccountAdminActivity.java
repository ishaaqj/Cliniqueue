package com.example.ishaaq.cliniqueue;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CreateAccountAdminActivity extends AppCompatActivity {
    private Button registerButton;
    private TextView SignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_admin);
        registerButton = findViewById(R.id.registerButton);
        SignIn = findViewById(R.id.SignIn);
    }

    public void agreeAndRegisterButton(View view) {
        Intent intent1= new Intent(CreateAccountAdminActivity.this, LoginAdminActivity.class);
        startActivity(intent1);
        Context context = getApplicationContext();
        CharSequence text = "You have succesfully registered";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        startActivity(intent1);
        toast.show();
    }

    public void SignIn(View view) {
        Intent intent2= new Intent(CreateAccountAdminActivity.this, LoginAdminActivity.class);
        startActivity(intent2);
    }
}
