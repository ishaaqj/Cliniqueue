package com.example.ishaaq.cliniqueue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reasonForVisitActivity extends AppCompatActivity {
    private List<String> liste;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reason_for_visit);

        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2" };
        liste = new ArrayList<String>();
        Collections.addAll(liste, values);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, liste);
    }
}
