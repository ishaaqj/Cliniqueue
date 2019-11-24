package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ClientDetailsActivity extends AppCompatActivity {
    private Button accept;
    private Button decline;

    TextView textView1;
    String string1;
    TextView textView2;
    String string2;
    TextView textView3;
    String string3;
    TextView textView4;
    String string4;
    TextView textView5;
    String string5;
    TextView textView6;
    String string6;
    TextView textView7;
    String string7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_confirmation);
        accept = (Button)findViewById(R.id.accept);
        decline =(Button)findViewById(R.id.decline);

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

        textView5=findViewById(R.id.History);
        string5=getIntent().getExtras().getString("Value5");
        textView5.setText(string5);

        textView6=findViewById(R.id.Age);
        string6=getIntent().getExtras().getString("Value6");
        textView6.setText(string6);

        textView7=findViewById(R.id.Weight);
        string7=getIntent().getExtras().getString("Value7");
        textView7.setText(string7);



    }

    public void accept(View view) {
        Intent intent1= new Intent(ClientDetailsActivity.this, ClinicEnterWaitTimeActivity.class);
        startActivity(intent1);
    }

    public void decline(View view) {
        Intent intent2= new Intent(ClientDetailsActivity.this, ClientRequestsActivity.class);
        startActivity(intent2);
    }
}
