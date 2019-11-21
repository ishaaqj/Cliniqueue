package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_confirmation);
        accept = (Button)findViewById(R.id.accept);
        decline =(Button)findViewById(R.id.decline);

        textView1=findViewById(R.id.Name);
        string1=getIntent().getExtras().getString("Value");
        textView1.setText(string1);

        textView2=findViewById(R.id.reason);
        string2=getIntent().getExtras().getString("Value1");
        textView2.setText(string2);

        textView3=findViewById(R.id.symptoms);
        string3=getIntent().getExtras().getString("Value2");
        textView3.setText(string3);

        textView4=findViewById(R.id.allergies);
        string4=getIntent().getExtras().getString("Value3");
        textView4.setText(string4);



    }

    public void accept(View view) {
        Intent intent1= new Intent(ClientDetailsActivity.this, ClinicEnterWaitTimeActivity.class);
        startActivity(intent1);
    }

    public void decline(View view) {
        Intent intent2= new Intent(ClientDetailsActivity.this, ClinicRequestsActivity.class);
        startActivity(intent2);
    }
}
