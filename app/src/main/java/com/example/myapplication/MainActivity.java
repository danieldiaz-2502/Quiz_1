package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button registrarBoton;
    private TextView personasText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrarBoton = findViewById(R.id.registrarBoton);
        personasText = findViewById(R.id.personasText);

        registrarBoton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.registrarBoton:
                Intent i = new Intent(this, registro_activity.class);
                startActivity(i);

        }

    }
}