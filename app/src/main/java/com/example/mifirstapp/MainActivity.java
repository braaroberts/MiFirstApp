package com.example.mifirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar ab  = super.getSupportActionBar();
        //  ab.setTitle("Nuevo Contacto");
        ab.setDisplayHomeAsUpEnabled(false);
    }
}