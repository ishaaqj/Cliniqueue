package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClinicsListActivity extends AppCompatActivity {
    private Button Filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinics_list);
        Filter = (Button)findViewById(R.id.Filter);
    }

    public void Filter(View view) {
        Intent intent1= new Intent(ClinicsListActivity.this, ClinicsFilterActivity.class);
        startActivity(intent1);
    }
}
