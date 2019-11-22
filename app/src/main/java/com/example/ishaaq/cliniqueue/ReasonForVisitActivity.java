package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReasonForVisitActivity extends AppCompatActivity {

    String string1;

    private List<String> liste;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reason_for_visit);

        Button allergicReaction = (Button)findViewById(R.id.allergiReaction);
        Button button2 = (Button)findViewById(R.id.skinDisorder);
        Button button3 = (Button)findViewById(R.id.vaccination);
        Button button4 = (Button)findViewById(R.id.jointDisorder);
        Button button5 = (Button)findViewById(R.id.backProblems);
        Button button6 = (Button)findViewById(R.id.cholestrolProblems);
        Button button7 = (Button)findViewById(R.id.diabeticPatient);
        Button button8 = (Button)findViewById(R.id.cutStitches);
        Button button9 = (Button)findViewById(R.id.bloodpressure);
        Button button10 = (Button)findViewById(R.id.mentalhealth);
        Button button11 = (Button)findViewById(R.id.headaches);
        Button button12 = (Button)findViewById(R.id.others);


        allergicReaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this, ExtraDetailsActivity.class);
                startActivity(intent1);
                String ar = "AllergicReaction";
                intent1.putExtra("allergicReaction",ar);
               // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReasonForVisitActivity.this, ExtraDetailsActivity.class));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReasonForVisitActivity.this, ExtraDetailsActivity.class));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReasonForVisitActivity.this, ExtraDetailsActivity.class));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReasonForVisitActivity.this, ExtraDetailsActivity.class));
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReasonForVisitActivity.this, ExtraDetailsActivity.class));
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReasonForVisitActivity.this, ExtraDetailsActivity.class));
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReasonForVisitActivity.this, ExtraDetailsActivity.class));
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReasonForVisitActivity.this, ExtraDetailsActivity.class));
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReasonForVisitActivity.this, ExtraDetailsActivity.class));
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReasonForVisitActivity.this, ExtraDetailsActivity.class));
            }
        });

    }
}
