package com.example.ishaaq.cliniqueue;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends Activity {
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button2= (Button) findViewById(R.id.login);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(loginActivity.this, Map.class);
                startActivity(intent1);
            }
        });
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
