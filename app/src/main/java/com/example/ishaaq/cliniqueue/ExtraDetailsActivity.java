package com.example.ishaaq.cliniqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ExtraDetailsActivity extends AppCompatActivity {
    EditText symptoms;
    String string3;
    EditText allergies;
    String string4;
    EditText history;
    String string5;
    EditText age;
    String string6;
    EditText weight;
    String string7;
    private Button button;
    MyGlobalVariables globalvariables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        globalvariables = MyGlobalVariables.getInstance();
        setContentView(R.layout.activity_xtra_details);

        symptoms=findViewById(R.id.symptoms);
        allergies=findViewById(R.id.allergies);
        history=findViewById(R.id.history);
        age=findViewById(R.id.age);
        weight=findViewById(R.id.Weight);



        button= findViewById(R.id.registerButton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(ExtraDetailsActivity.this,waitingForConfirmationActivity.class);
                string3=symptoms.getText().toString();
                intent1.putExtra("Value2",string3);
                globalvariables.setSymptoms(string3);


                string5=allergies.getText().toString();
                intent1.putExtra("Value5",string5);
                //MyGlobalVariables g = ((MyGlobalVariables)getApplication());
                globalvariables.setAllergies(string5);


                string4=history.getText().toString();
                intent1.putExtra("Value3",string4);
               // MyGlobalVariables g = ((MyGlobalVariables)getApplication());
                globalvariables.setHistory(string4);


                string6=age.getText().toString();
                intent1.putExtra("Value6",string6);
                globalvariables.setAge(string6);

                string7=weight.getText().toString();
                intent1.putExtra("Value7",string7);
                globalvariables.setWeight(string7);

                startActivity(intent1);
            }
        });
    }
}
