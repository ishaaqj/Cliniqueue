package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginAdminActivity extends AppCompatActivity {
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_as_admin);
        login = (Button)findViewById(R.id.login);
    }

    public void login(View view) {
        Intent intent1= new Intent(LoginAdminActivity.this,ClientRequestsActivity.class);
        startActivity(intent1);
    }
}
