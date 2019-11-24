package com.example.ishaaq.cliniqueue;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClinicsListActivity extends Activity {
    private Button Filter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinics_list);
        Filter = (Button)findViewById(R.id.Filter);

        Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1= new Intent(ClinicsListActivity.this, ClinicsFilterActivity.class);
                startActivity(intent1);

            }
        });


    }



    public void openReasonForVisit(View view) {
        Intent intent1= new Intent(ClinicsListActivity.this, ContactClinicActivity.class);
        startActivity(intent1);
    }
}
