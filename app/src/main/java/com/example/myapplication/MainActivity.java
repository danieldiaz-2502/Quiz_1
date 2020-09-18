package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
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
    protected void onResume() {
        super.onResume();

        SharedPreferences preferences = getSharedPreferences("nombres", MODE_PRIVATE);
        String registros = preferences.getString("registroFinal", "no hay");

        //Para dividir los usuarios que completan la encuesta en una lista
        String[] lista = registros.split(":");

        for(int i = 0; i < lista.length; i++){
            personasText.append(lista[i] + "\n");
        }

        personasText.setText(registros);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.registrarBoton:
                Intent i = new Intent(this, registro_activity.class);
                startActivity(i);

                break;
        }

    }
}