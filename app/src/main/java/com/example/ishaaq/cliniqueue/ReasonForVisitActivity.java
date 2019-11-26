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
    String reason;
    MyGlobalVariables g;

    private List<String> liste;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        g = MyGlobalVariables.getInstance();
        setContentView(R.layout.activity_reason_for_visit);

        Button allergicReaction = findViewById(R.id.allergiReaction);
        Button skinDisorder = findViewById(R.id.skinDisorder);
        Button vaccination = findViewById(R.id.vaccination);
        Button jointDisorder = findViewById(R.id.jointDisorder);
        Button backProblems = findViewById(R.id.backProblems);
        Button cholestrolProblems = findViewById(R.id.cholestrolProblems);
        Button diabeticPatient = findViewById(R.id.diabeticPatient);
        Button cutStitches = findViewById(R.id.cutStitches);
        Button bloodpressure = findViewById(R.id.bloodpressure);
        Button mentalhealth = findViewById(R.id.mentalhealth);
        Button headaches = findViewById(R.id.headaches);



        allergicReaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                reason = "Allergic Reaction";
                //MyGlobalVariables g = ((MyGlobalVariables)getApplication());
                g.setReasonForVisit(reason);
                startActivity(intent1);
               // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));

            }
        });
        skinDisorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                reason = "Skin Disorder";
                g.setReasonForVisit(reason);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        vaccination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

               // MyGlobalVariables g = ((MyGlobalVariables)getApplication());
                g.setReasonForVisit(reason);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        jointDisorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                reason = "Joint Disorder";
                //MyGlobalVariables g = ((MyGlobalVariables)getApplication());
                g.setReasonForVisit(reason);
                startActivity(intent1);
               // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        backProblems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                reason = "Back Problems";
               // MyGlobalVariables g = ((MyGlobalVariables)getApplication());
                g.setReasonForVisit(reason);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        cholestrolProblems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                reason = "Cholestrol Problems";
               // MyGlobalVariables g = ((MyGlobalVariables)getApplication());
                g.setReasonForVisit(reason);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        diabeticPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                reason = "Diabetic Patient";
               // MyGlobalVariables g = ((MyGlobalVariables)getApplication());
                g.setReasonForVisit(reason);
                startActivity(intent1);
              //  startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        cutStitches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                reason = "Cut Stitches";
               // MyGlobalVariables g = ((MyGlobalVariables)getApplication());
                g.setReasonForVisit(reason);
                startActivity(intent1);
               // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        bloodpressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                reason = "Blood Pressure";
               // MyGlobalVariables g = ((MyGlobalVariables)getApplication());
                g.setReasonForVisit(reason);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        mentalhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                reason = "Mental Health";
//                MyGlobalVariables g = ((MyGlobalVariables)getApplication());
                g.setReasonForVisit(reason);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });
        headaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ReasonForVisitActivity.this,ExtraDetailsActivity.class);

                reason = "Headaches and Migrains";
               // MyGlobalVariables g = ((MyGlobalVariables)getApplication());
                g.setReasonForVisit(reason);
                startActivity(intent1);
                //startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));
            }
        });

    }
}
