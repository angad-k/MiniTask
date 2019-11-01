package com.example.miniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        String str_name = getIntent().getExtras().getString("name");
        String str_email = getIntent().getExtras().getString("email");
        TextView textView = (TextView) findViewById(R.id.email);
        textView.setText("E-mail is: " + str_email);
        TextView textView2 = (TextView) findViewById(R.id.name);
        textView2.setText("Name is: " + str_name);
    }
}
