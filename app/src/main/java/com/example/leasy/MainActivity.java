package com.example.leasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // metodo para el boton de la primera actividad

    public void completar(View vista) {

        Intent completar = new Intent(this, ActivityCompletar.class);
        startActivity(completar);

    }

    // metodo para el boton de la segunda actividad

    public void series(View vista) {

        Intent series = new Intent(this, ActivitySeries.class);
        startActivity(series);

    }

    // metodo para el boton de la consulta de puntajes

    public void consultar(View vista) {

        Intent consultar = new Intent(this, ActivityConsulta.class);
        startActivity(consultar);

    }

    // metodo para el boton de volver a la primera pantalla

    public void regrese(View vista) {

        Intent regrese = new Intent(this, Activityiniciar.class);
        startActivity(regrese);

    }






}
