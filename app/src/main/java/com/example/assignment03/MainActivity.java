package com.example.assignment03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Button add, show;
    EditText name, id;
    Switch isactive;
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextTextPersonName);
        id=findViewById(R.id.editTextTextPersonName2);
        add=findViewById(R.id.button);
        show=findViewById(R.id.button2);
        isactive=findViewById(R.id.switch1);
        list=findViewById(R.id.liste);
    }
}