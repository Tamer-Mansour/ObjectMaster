package com.example.objectmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class HumanTest extends AppCompatActivity {
    EditText etTest;
    Wizard w = new Wizard(100,"","",100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTest = findViewById(R.id.etTest);

    }
}