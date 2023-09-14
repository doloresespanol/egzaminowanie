package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    int id=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView textView = findViewById(R.id.textView5);
        TextView textView_db = findViewById(R.id.textView6);
        SeekBar seekBar = findViewById(R.id.seekBar);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Dzień dobry");
        lista.add("Good morning");
        lista.add("Buenos dias");
        Button btn_zmien = findViewById(R.id.button5);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView_db.setTextSize(i);
                textView.setText("Rozmiar: "+Integer.toString(i));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btn_zmien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_db.setText(lista.get(id));
                if(id==2){
                    id=0;
                }else{
                    id++;
                }
            }
        });

    }
}