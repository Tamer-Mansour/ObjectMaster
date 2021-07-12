package com.example.objectmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class HumanTest extends AppCompatActivity {
    EditText etTest,etTest2,etTest3;
    Wizard w = new Wizard(100,"10","+100",Human.getHealth());
    Ninja n = new Ninja(120,"20","+200",100);
    Samurai s = new Samurai(200,"30","+150",100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTest = findViewById(R.id.etTest);
        etTest2 = findViewById(R.id.etTest2);
        etTest3 = findViewById(R.id.etTest3);
        etTest.setText("Wizard : " + w.health);
        etTest2.setText("Ninja"+ n.toString());
        etTest3.setText("Samurai" + s.intelligence);

    }
}