package com.example.ishaaq.cliniqueue;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ClinicsListActivity extends Activity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinics_list);

       // Toast.makeText(this, "coming from admin login", Toast.LENGTH_SHORT).show();

        textView2= findViewById(R.id.clinic2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ClinicsListActivity.this,ContactClinicActivity.class);
                startActivity(intent);

            }
        });
        textView3= findViewById(R.id.clinic3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ClinicsListActivity.this,ContactClinicActivity.class);
                startActivity(intent);

            }
        });
        textView4= findViewById(R.id.clinic4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ClinicsListActivity.this,ContactClinicActivity.class);
                startActivity(intent);

            }
        });
        textView5= findViewById(R.id.clinic5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ClinicsListActivity.this,ContactClinicActivity.class);
                startActivity(intent);

            }
        });
        textView6= findViewById(R.id.clinic6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ClinicsListActivity.this,ContactClinicActivity.class);
                startActivity(intent);

            }
        });
        textView1= findViewById(R.id.clinic1);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ClinicsListActivity.this,ContactClinicActivity.class);

                String ar = "Uottawa Health Services";
                intent1.putExtra("ClinicName",ar);
                startActivity(intent1);
                // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));

            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ClinicsListActivity.this,ContactClinicActivity.class);

                String ar = "Rideau-Friel Medical Centre";
                intent1.putExtra("ClinicName",ar);
                startActivity(intent1);
                // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));

            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ClinicsListActivity.this,ContactClinicActivity.class);

                String ar = "Appletree Medical Group-Sparks";
                intent1.putExtra("ClinicName",ar);
                startActivity(intent1);
                // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));

            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ClinicsListActivity.this,ContactClinicActivity.class);

                String ar = "Carleton University Medical Services";
                intent1.putExtra("ClinicName",ar);
                startActivity(intent1);
                // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));

            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ClinicsListActivity.this,ContactClinicActivity.class);

                String ar = "Appletree Medical Group-Bank";
                intent1.putExtra("ClinicName",ar);
                startActivity(intent1);
                // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));

            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ClinicsListActivity.this,ContactClinicActivity.class);

                String ar = "Appletree Medical Group-Slater";
                intent1.putExtra("ClinicName",ar);
                startActivity(intent1);
                // startActivity(new Intent(reasonForVisitActivity.this, xtraDetailsActivity.class));

            }
        });

}

    public void addFilter(View view) {
        Intent intent = new Intent(this, ClinicsFilterActivity.class);
        startActivity(intent);
    }
}
