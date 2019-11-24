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
        Button skinDisorder = (Button)findViewById(R.id.skinDisorder);
        Button vaccination = (Button)findViewById(R.id.vaccination);
        Button jointDisorder = (Button)findViewById(R.id.jointDisorder);
        Button backProblems = (Button)findViewById(R.id.backProblems);
        Button cholestrolProblems = (Button)findViewById(R.id.cholestrolProblems);
        Button diabeticPatient = (Button)findViewById(R.id.diabeticPatient);
        Button cutStitches = (Button)findViewById(R.id.cutStitches);
        Button bloodpressure = (Button)findViewById(R.id.bloodpressure);
        Button mentalhealth = (Button)findViewById(R.id.mentalhealth);
        Button headaches = (Button)findViewById(R.id.headaches);


        allergicReaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                String ar = "Allergic Reaction";
                intent1.putExtra("reasonForVisit",ar);
                startActivity(intent1);
               // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));

            }
        });
        skinDisorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                String ar = "Skin Disorder";
                intent1.putExtra("reasonForVisit",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        vaccination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                String ar = "Vaccination";
                intent1.putExtra("reasonForVisit",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        jointDisorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                String ar = "Joint Disorder";
                intent1.putExtra("reasonForVisit",ar);
                startActivity(intent1);
               // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        backProblems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                String ar = "Back Problems";
                intent1.putExtra("reasonForVisit",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        cholestrolProblems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                String ar = "Cholestrol Problems";
                intent1.putExtra("reasonForVisit",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        diabeticPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                String ar = "Diabetic Patient";
                intent1.putExtra("reasonForVisit",ar);
                startActivity(intent1);
              //  startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        cutStitches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                String ar = "Cut Stitches";
                intent1.putExtra("reasonForVisit",ar);
                startActivity(intent1);
               // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        bloodpressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                String ar = "Blood Pressure";
                intent1.putExtra("reasonForVisit",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        mentalhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                String ar = "Mental Health";
                intent1.putExtra("reasonForVisit",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        headaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                String ar = "Headaches and Migrains";
                intent1.putExtra("reasonForVisit",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });

    }
}
