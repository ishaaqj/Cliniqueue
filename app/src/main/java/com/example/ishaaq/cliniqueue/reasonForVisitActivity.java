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

public class reasonForVisitActivity extends AppCompatActivity {

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
        Button bloodPressure = (Button)findViewById(R.id.bloodpressure);
        Button mentalHealth = (Button)findViewById(R.id.mentalhealth);
        Button headachesAndMigrains = (Button)findViewById(R.id.headaches);
        Button otherReasons = (Button)findViewById(R.id.others);


        allergicReaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(reasonForVisitActivity.this,xtraDetailsActivity.class);

                String ar = "Allergic Reaction";
                intent1.putExtra("reason",ar);
                startActivity(intent1);
               // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));

            }
        });
        skinDisorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(reasonForVisitActivity.this,xtraDetailsActivity.class);

                String ar = "Skin Disorder";
                intent1.putExtra("reason",ar);
                startActivity(intent1);
              //  startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        vaccination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(reasonForVisitActivity.this,xtraDetailsActivity.class);

                String ar = "Vaccination";
                intent1.putExtra("reason",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        jointDisorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(reasonForVisitActivity.this,xtraDetailsActivity.class);

                String ar = "Joint Disorder";
                intent1.putExtra("reason",ar);
                startActivity(intent1);
               // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        backProblems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(reasonForVisitActivity.this,xtraDetailsActivity.class);

                String ar = "Back Problems";
                intent1.putExtra("reason",ar);
                startActivity(intent1);
               // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        cholestrolProblems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(reasonForVisitActivity.this,xtraDetailsActivity.class);

                String ar = "Cholestrol Problems";
                intent1.putExtra("reason",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        diabeticPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(reasonForVisitActivity.this,xtraDetailsActivity.class);

                String ar = "Diabetic Patient";
                intent1.putExtra("reason",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        cutStitches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(reasonForVisitActivity.this,xtraDetailsActivity.class);

                String ar = "Diabetic Patient";
                intent1.putExtra("reason",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        bloodPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(reasonForVisitActivity.this,xtraDetailsActivity.class);

                String ar = "Blood Pressure";
                intent1.putExtra("reason",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        mentalHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(reasonForVisitActivity.this,xtraDetailsActivity.class);

                String ar = "Mental Health";
                intent1.putExtra("reason",ar);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        headachesAndMigrains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(reasonForVisitActivity.this,xtraDetailsActivity.class);

                String ar = "Headaches and Migrains";
                intent1.putExtra("reason",ar);
                startActivity(intent1);
               // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        otherReasons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(reasonForVisitActivity.this,xtraDetailsActivity.class);

                String ar = "Others";
                intent1.putExtra("reason",ar);
                startActivity(intent1);
                // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });

    }
}
