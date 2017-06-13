package com.example.kimsohee.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class FinishActivity extends AppCompatActivity {

    long lastPressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        Intent intent = new Intent(this.getIntent());


            if (System.currentTimeMillis() - lastPressed < 1500){
                finish();
            }
            Toast.makeText(this,"한번 더 누르면 종료됩니다",Toast.LENGTH_SHORT).show();
            lastPressed = System.currentTimeMillis();


}}
