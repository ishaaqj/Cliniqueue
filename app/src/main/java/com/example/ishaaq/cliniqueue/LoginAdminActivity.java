package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginAdminActivity extends AppCompatActivity {
    private Button login1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_as_admin);

        login1 = (Button)findViewById(R.id.login);

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent gotoClientRequestsActivity = new Intent(LoginAdminActivity.this,ClientRequestsActivity.class);
                startActivity(gotoClientRequestsActivity);

            }
        });
    }


}
