package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Dzień dobry");
        lista.add("Buenos dias");
        lista.add("Good morning");
        Button btn_zmien = findViewById(R.id.button5);
    }
}