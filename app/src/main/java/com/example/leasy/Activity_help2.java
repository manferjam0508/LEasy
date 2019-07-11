package com.example.leasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_help2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help2);
    }

    // metodo para el boton volver a la actividad

    public void series (View vista){

        Intent series = new Intent(this,ActivitySeries.class);
        startActivity (series);

    }
}
