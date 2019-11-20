package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateAccountAdmin extends AppCompatActivity {
    private Button agreeAndRegister;
    private TextView SignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_admin);
        agreeAndRegister = (Button)findViewById(R.id.agreeAndRegister);
        SignIn = (TextView)findViewById(R.id.SignIn);
    }

    public void agreeAndRegisterButton(View view) {
        Intent intent1= new Intent(CreateAccountAdmin.this,loginAsAdminActivity.class);
        startActivity(intent1);
    }

    public void SignIn(View view) {
        Intent intent2= new Intent(CreateAccountAdmin.this,loginAsAdminActivity.class);
        startActivity(intent2);
    }
}
