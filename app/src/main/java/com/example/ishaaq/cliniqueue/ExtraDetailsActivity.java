package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ExtraDetailsActivity extends AppCompatActivity {
    EditText editText3;
    String string3;
    EditText editText4;
    String string4;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xtra_details);

        editText3=findViewById(R.id.editText8);
        editText4=findViewById(R.id.editText10);

        button= (Button) findViewById(R.id.registerButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(ExtraDetailsActivity.this,waitingForConfirmationActivity.class);
                string3=editText3.getText().toString();
                intent1.putExtra("Value2",string3);
                string4=editText4.getText().toString();
                intent1.putExtra("Value3",string4);
               String string1=getIntent().getExtras().getString("Value");
                intent1.putExtra("userName",string1);
                String reasonForVisit = getIntent().getExtras().getString("reason");
                intent1.putExtra("reasonForVisit",reasonForVisit);
                startActivity(intent1);
            }
        });
    }
}