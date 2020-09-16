package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_preguntas2 extends AppCompatActivity implements View.OnClickListener {

    private Button continuarBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas2);
        continuarBoton = findViewById(R.id.continuarBoton);

        continuarBoton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.registrarBoton:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);

        }
    }
}