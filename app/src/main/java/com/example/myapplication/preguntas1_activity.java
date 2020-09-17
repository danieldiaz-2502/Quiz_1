package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class preguntas1_activity extends AppCompatActivity implements View.OnClickListener {

    private Button continuarBoton;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;

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


        continuarBoton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Para que no pase a la siguiente actividad a menos que haya checado por los menos un checkbox
        if (checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked() || checkBox4.isChecked() || checkBox5.isChecked()) {
            switch (v.getId()) {

                case R.id.continuarBoton:
                    Intent i = new Intent(this, activity_preguntas2.class);
                    startActivity(i);

            }
        }
    }
}