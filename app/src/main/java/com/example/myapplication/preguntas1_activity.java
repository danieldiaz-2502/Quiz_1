package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class preguntas1_activity extends AppCompatActivity implements View.OnClickListener {
    
    private Button continuarBoton;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    public int puntaje = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas1_activity);

        continuarBoton = findViewById(R.id.continuarBoton);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        ;
        continuarBoton.setOnClickListener(this);
        checkBox1.setOnClickListener(this);
        checkBox2.setOnClickListener(this);
        checkBox3.setOnClickListener(this);
        checkBox4.setOnClickListener(this);
        checkBox5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        //Para que no pase a la siguiente actividad a menos que haya checado por los menos un checkbox

            switch (v.getId()) {

                case R.id.continuarBoton:
                    if (checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked() || checkBox4.isChecked() || checkBox5.isChecked()) {
                        Intent i = new Intent(this, activity_preguntas2.class);
                        SharedPreferences preferences = getSharedPreferences("puntos", MODE_PRIVATE);
                        preferences.edit().putInt("puntaje", puntaje).apply();
                        startActivity(i);
                    }
                    break;

                case R.id.checkBox1:
                    checkBox1.isChecked();
                    if(checkBox1.isChecked()) {
                        puntaje += 3;
                    } else {
                        puntaje -= 3;
                    }
                    break;
                case R.id.checkBox2:
                    checkBox2.isChecked();
                    if(checkBox2.isChecked()) {
                        puntaje += 3;
                    } else {
                        puntaje -= 3;
                    }
                    break;
                case R.id.checkBox3:
                    checkBox3.isChecked();
                    if(checkBox3.isChecked()) {
                        puntaje += 3;
                    } else {
                        puntaje -= 3;
                    }
                    break;
                case R.id.checkBox4:
                    checkBox4.isChecked();
                    if(checkBox4.isChecked()) {
                        puntaje += 3;
                    } else {
                        puntaje -= 3;
                    }
                    break;
                case R.id.checkBox5:
                    checkBox5.isChecked();

                    break;

            }
        Toast.makeText(this, "" + puntaje,Toast.LENGTH_SHORT).show();
        }
    }
