package com.example.emangoassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

     Spinner name;
     Spinner exam;
     Spinner college;
    String country[] = {"India", "America", "Africa", "Canada"};
String examsd[]={"True","False"};
String colleges[]={"True","False"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         name = findViewById(R.id.spinner);
        exam = findViewById(R.id.exams);
        college = findViewById(R.id.coleges);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,country);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        name.setAdapter(adapter);
        name.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String value = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


    });

        ArrayAdapter<String> adaptere = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,examsd);
        adaptere.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exam.setAdapter(adaptere);
        exam.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String examis = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


        });
        ArrayAdapter<String> adapterc = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,colleges);
        adapterc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        college.setAdapter(adapterc);
        college.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valuec = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


        });
}
    public void activityEvent(View view)
    {
        Toast.makeText(this, "Data is Submitting", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,Carrer.class);
        startActivity(intent);
    }
}


//ViewHolder

