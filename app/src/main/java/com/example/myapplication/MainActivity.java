package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int like = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_polub = findViewById(R.id.button);
        Button btn_usun = findViewById(R.id.button2);
        Button btn_zapisz = findViewById(R.id.button3);
        TextView polubienia = findViewById(R.id.textView);

        btn_usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(like>0){
                    like=like-1;
                    polubienia.setText(like+" polubień");
                }
            }
        });

        btn_polub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                like++;
                polubienia.setText(like+" polubień");
            }
        });


    }
}