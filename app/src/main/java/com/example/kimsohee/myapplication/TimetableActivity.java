package com.example.kimsohee.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class TimetableActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        Intent intent = new Intent(this.getIntent());

        Spinner spinner1 = (Spinner) findViewById(R.id.MON);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(
                this, R.array.MON, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        Spinner spinner2 = (Spinner) findViewById(R.id.TUE);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(
                this, R.array.TUE, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        Spinner spinner3 = (Spinner) findViewById(R.id.WED);
        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(
                this, R.array.WED, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        Spinner spinner4 = (Spinner) findViewById(R.id.THU);
        ArrayAdapter adapter4 = ArrayAdapter.createFromResource(
                this, R.array.THU, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);

        Spinner spinner5 = (Spinner) findViewById(R.id.FRI);
        ArrayAdapter adapter5 = ArrayAdapter.createFromResource(
                this, R.array.FRI, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);
    }
}