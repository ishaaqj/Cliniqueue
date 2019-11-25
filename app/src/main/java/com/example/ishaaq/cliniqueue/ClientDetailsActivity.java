package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ClientDetailsActivity extends AppCompatActivity {
    Button acceptButton;
    Button declineButton;

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
    MyGlobalVariables g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g = MyGlobalVariables.getInstance();
        setContentView(R.layout.activity_client_details);
        acceptButton = findViewById(R.id.accept);
        declineButton = findViewById(R.id.decline);

        textView1=findViewById(R.id.Name);
        string1=getIntent().getExtras().getString("clientName");
        textView1.setText(string1);
        //Toast.makeText(this, string1, Toast.LENGTH_SHORT).show();

        textView2=findViewById(R.id.reason);
      //  string2=getIntent().getExtras().getString("reasonForVisit");
        String reasonForVisit = g.getReasonForVisit();
        textView2.setText(reasonForVisit);
        Toast.makeText(this, reasonForVisit, Toast.LENGTH_SHORT).show();

        textView3=findViewById(R.id.symptoms);
        //string3=getIntent().getExtras().getString("Value2");
        String symptoms = g.getSymptoms();
        textView3.setText(symptoms);

        textView4=findViewById(R.id.allergies);
       // string4=getIntent().getExtras().getString("Value3");
        String allergies = g.getAllergies();
        textView4.setText(allergies);

        textView5=findViewById(R.id.History);
       // string5=getIntent().getExtras().getString("Value5");
        String history =  g.getHistory();
        textView5.setText(history);

        textView6=findViewById(R.id.Age);
       // string6=getIntent().getExtras().getString("Value6");
        String age = g.getAge();
        textView6.setText(age);

        textView7=findViewById(R.id.Weight);
       // string7=getIntent().getExtras().getString("Value7");
        String weight = g.getWeight();
        textView7.setText(weight);



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
