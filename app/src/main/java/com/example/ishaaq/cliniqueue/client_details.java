package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class client_details extends AppCompatActivity {

    TextView textView1;
    String string1;
    TextView textView2;
    String string2;
    TextView textView3;
    String string3;
    TextView textView4;
    String string4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_details);

        textView1=findViewById(R.id.Name);
        string1=getIntent().getExtras().getString("userName");
        textView1.setText(string1);
        //Toast.makeText(this, string1, Toast.LENGTH_SHORT).show();

        textView2=findViewById(R.id.reason);
        string2=getIntent().getExtras().getString("reasonForVisit");
        textView2.setText(string2);

        textView3=findViewById(R.id.symptoms);
        string3=getIntent().getExtras().getString("Value2");
        textView3.setText(string3);

        textView4=findViewById(R.id.allergies);
        string4=getIntent().getExtras().getString("Value3");
        textView4.setText(string4);



    }
}
