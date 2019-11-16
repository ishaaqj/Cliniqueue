package com.example.ishaaq.cliniqueue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        /*final Button button = findViewById(R.id.buttonLogin);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText username = (EditText) findViewById(R.id.editText1);
                EditText password = (EditText) findViewById(R.id.editText2);
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    //correcct password
                } else {
                    //wrong password
                }
            }
        });*/
    }
}
