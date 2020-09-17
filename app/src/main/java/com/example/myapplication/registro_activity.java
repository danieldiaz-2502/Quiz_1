package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registro_activity extends AppCompatActivity implements View.OnClickListener {

    private Button continuarBoton;
    private EditText nombreEdit;
    private EditText identiEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_activity);

        continuarBoton = findViewById(R.id.continuarBoton);
        nombreEdit = findViewById(R.id.nombreEdit);
        identiEdit = findViewById(R.id.identiEdit);
        continuarBoton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.continuarBoton:
                Intent i = new Intent(this, preguntas1_activity.class);
                startActivity(i);
                String username = nombreEdit.getText().toString();
                SharedPreferences preferences = getSharedPreferences("nombre", MODE_PRIVATE);

                preferences.edit().putString("username", username).apply();

                break;
        }

    }
}