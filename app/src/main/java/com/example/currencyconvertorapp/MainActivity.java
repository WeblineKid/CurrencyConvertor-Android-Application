package com.example.currencyconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText edt = findViewById(R.id.edt);

                String message = edt.getText().toString();

                int valInDollar = Integer.parseInt(message);

                int valInRuppees = valInDollar * 70;

                String answer = String.valueOf(valInRuppees);

                Toast.makeText(MainActivity.this, answer, Toast.LENGTH_SHORT).show();
            }
        });
    }
}