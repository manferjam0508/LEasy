package com.example.leasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_help1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help1);
    }

    // metodo para el boton volver a la actividad

    public void completar (View vista){

        Intent completar = new Intent(this,ActivityCompletar.class);
        startActivity (completar);

    }
}
