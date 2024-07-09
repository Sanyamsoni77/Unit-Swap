package com.example.unitswap;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editTextNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editTextNumber = findViewById(R.id.editTextNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Kg to Pound Converted..", Toast.LENGTH_SHORT).show();
                String us = editTextNumber.getText().toString();
                int kg = Integer.parseInt(us);
                double pound = 2.205 * kg;
                textView.setText("The corresponding value in Pounds is "+pound);

            }
        });
    }
}