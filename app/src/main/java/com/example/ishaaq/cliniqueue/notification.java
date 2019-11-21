package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class notification extends AppCompatActivity {
    private Button yes;
    private Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        yes = (Button)findViewById(R.id.yes);
        no = (Button)findViewById(R.id.no);
    }

    public void yes(View view) {
        Intent intent1= new Intent(notification.this,Map.class);
        startActivity(intent1);
    }

    public void no(View view) {
        Intent intent2= new Intent(notification.this, ClinicsListActivity.class);
        startActivity(intent2);
    }
}
