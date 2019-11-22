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

public class ContactClinicActivity extends AppCompatActivity {

    private Button BookAppointment;
    private Button CallClinicButton;
    private final static int REQUEST_CODE_ASK_PERMISSIONS = 1;
    private static final String[] REQUIRED_SDK_PERMISSIONS = new String[] {
            Manifest.permission.CALL_PHONE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_clinic);

        CallClinicButton = (Button) findViewById(R.id.callButton);
        BookAppointment= (Button) findViewById(R.id.BookAppointment);

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

