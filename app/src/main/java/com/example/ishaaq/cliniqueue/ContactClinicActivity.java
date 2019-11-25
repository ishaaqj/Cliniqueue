package com.example.ishaaq.cliniqueue;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactClinicActivity extends AppCompatActivity {

    TextView textView1;
    String string1;

    private Button BookAppointment;
    private Button CallClinicButton;
    private final static int REQUEST_CODE_ASK_PERMISSIONS = 1;
    private static final String[] REQUIRED_SDK_PERMISSIONS = new String[] {
            Manifest.permission.CALL_PHONE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_clinic);

        textView1=findViewById(R.id.clinicName);
        string1=getIntent().getExtras().getString("ClinicName");
        textView1.setText(string1);

        CallClinicButton = findViewById(R.id.callButton);
        BookAppointment= findViewById(R.id.BookAppointment);

        BookAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent88= new Intent(ContactClinicActivity.this, ReasonForVisitActivity.class);
                startActivity(intent88);
            }
        });

        CallClinicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+1234567890"));
                if (ContextCompat.checkSelfPermission(ContactClinicActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ContactClinicActivity.this, new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    startActivity(intent);
                }
            }
        });
    }
}

