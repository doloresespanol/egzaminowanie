package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<String> lista = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText edit = findViewById(R.id.editTextTextPersonName);
        Button btn_dodaj = findViewById(R.id.button4);
        lista.add("Zakupy: chleb, masło, ser");
        lista.add("Do zrobienia: obiad, umyć podłogi");
        lista.add("weekend: kino, spacer z psem");
        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity2.this,android.R.layout.simple_list_item_1,lista);
        listView.setAdapter(adapter);
        btn_dodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit!=null){
                    lista.add(edit.getText().toString());
                    adapter.notifyDataSetChanged();
                }
            }
        });
    }
}