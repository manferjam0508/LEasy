package com.example.leasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activityiniciar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityiniciar);
    }

    //metodo para acceder al menu suma

    public void comenzar(View vista){

        Intent comenzar= new Intent(this, MainActivity.class);
        startActivity(comenzar);
    }
}
