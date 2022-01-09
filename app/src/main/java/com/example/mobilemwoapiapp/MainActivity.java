package com.example.mobilemwoapiapp;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnstart;
    TextView tvstarus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart = findViewById(R.id.btn_start);
        tvstarus = findViewById(R.id.status_text);

        btnstart.setOnClickListener(view -> {
            //ttesttag

        });
    }

    @Override
    public void onClick(View view) {

    }
}