package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class activity_preguntas2 extends AppCompatActivity implements View.OnClickListener {

    private Button continuarBoton;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    private CheckBox checkBox6;
    private CheckBox checkBox7;
    private int puntaje;
    private String registroAnterior;
    private String registro;
    private String registroFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas2);
        continuarBoton = findViewById(R.id.continuarBoton);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox1);
        //combina el puntaje con el registro guardado anterior
        puntaje = getSharedPreferences("puntos", MODE_PRIVATE).getInt("puntaje", 0);
        registro = getSharedPreferences("nombres", MODE_PRIVATE).getString("registros", "no user");
        continuarBoton.setOnClickListener(this);
        checkBox1.setOnClickListener(this);
        checkBox2.setOnClickListener(this);
        checkBox3.setOnClickListener(this);
        checkBox4.setOnClickListener(this);
        checkBox5.setOnClickListener(this);
        checkBox6.setOnClickListener(this);
        checkBox7.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            switch (v.getId()) {

                case R.id.continuarBoton:
                    if (checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked() || checkBox4.isChecked() || checkBox5.isChecked() || checkBox6.isChecked() || checkBox7.isChecked()){
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);

                        SharedPreferences preferences = getSharedPreferences("nombres", MODE_PRIVATE);

                        registroAnterior = preferences.getString("registroFinal", registroFinal);

                        registroFinal = registroAnterior + ":" + registro + " " + puntaje;

                        preferences.edit().putString("registroFinal", registroFinal).apply();

                        finish();
            }
                    break;
                case R.id.checkBox1:
                    checkBox1.isChecked();
                    if(checkBox1.isChecked()) {
                        puntaje += 4;
                    } else {
                        puntaje -= 4;
                    }
                    break;
                case R.id.checkBox2:
                    checkBox2.isChecked();
                    if(checkBox2.isChecked()) {
                        puntaje += 4;
                    } else {
                        puntaje -= 4;
                    }
                    break;
                case R.id.checkBox3:
                    checkBox3.isChecked();
                    if(checkBox3.isChecked()) {
                        puntaje += 4;
                    } else {
                        puntaje -= 4;
                    }
                    break;
                case R.id.checkBox4:
                    checkBox4.isChecked();
                    if(checkBox4.isChecked()) {
                        puntaje += 4;
                    } else {
                        puntaje -= 4;
                    }
                    break;
                case R.id.checkBox5:
                    checkBox5.isChecked();
                    if(checkBox5.isChecked()) {
                        puntaje += 4;
                    } else {
                        puntaje -= 4;
                    }
                    break;
                case R.id.checkBox6:
                    checkBox6.isChecked();
                    if(checkBox6.isChecked()) {
                        puntaje += 4;
                    } else {
                        puntaje -= 4;
                    }
                    break;
                case R.id.checkBox7:
                    checkBox7.isChecked();

                    break;
            }
        Toast.makeText(this, "" + puntaje,Toast.LENGTH_SHORT).show();
        }
    }