package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class preguntas1_activity extends AppCompatActivity implements View.OnClickListener {

    private TextView numeroPrueba;
    private Button continuarBoton;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    private int puntaje = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas1_activity);

        continuarBoton = findViewById(R.id.continuarBoton);
        numeroPrueba = findViewById(R.id.numeroPrueba);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);

        continuarBoton.setBackgroundColor(Color.rgb(205,205,205));

        if (checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked() || checkBox4.isChecked() || checkBox5.isChecked()) {
            continuarBoton.setBackgroundColor(Color.rgb(255, 23, 124));
        }
        String username = getSharedPreferences("nombre", MODE_PRIVATE).getString("username", "no user");
        numeroPrueba.setText(" " + puntaje);
        continuarBoton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Para que no pase a la siguiente actividad a menos que haya checado por los menos un checkbox
            continuarBoton.setBackgroundColor(Color.rgb(255,23,124));
            switch (v.getId()) {

                case R.id.continuarBoton:
                    if (checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked() || checkBox4.isChecked() || checkBox5.isChecked()) {
                        Intent i = new Intent(this, activity_preguntas2.class);
                        startActivity(i);
                    }
                    break;
                case R.id.checkBox1:
                    checkBox1.isChecked();
                    if (checkBox1.isChecked()){
                        puntaje += 3;
                        Toast.makeText(getApplicationContext(),puntaje,Toast.LENGTH_SHORT).show();
                    }
                    break;

            }
        Log.e(" ", String.valueOf(puntaje));
        }
    }
