package com.example.leasy;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitySeries extends AppCompatActivity {

    private EditText etsr1, etsr2, etsr3, etsr4, etsr5, etsr6, etsr7;
    private TextView txpt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);

        //Se realiza casting de variables

        etsr1=(EditText)findViewById(R.id.ssr1);
        etsr2=(EditText)findViewById(R.id.ssr2);
        etsr3=(EditText)findViewById(R.id.ssr3);
        etsr4=(EditText)findViewById(R.id.ssr4);
        etsr5=(EditText)findViewById(R.id.ssr5);
        etsr6=(EditText)findViewById(R.id.ssr6);
        etsr7=(EditText)findViewById(R.id.ssr7);
        txpt2=(TextView)findViewById(R.id.txtpoint2);

        SharedPreferences preferences= getSharedPreferences("datos", Context.MODE_PRIVATE);
        String v=String.valueOf(preferences.getInt("puntos", 0));
        txpt2.setText(v);


    }

    //metodo para el boton de la serie uno

    public void serie1(View ver){

        String ser1=etsr1.getText().toString();
        String pts=txpt2.getText().toString();

        //se realiza parseo de modo cadena a modo entero

        int num1=Integer.parseInt(ser1);

        if(num1== 7){
            int points=Integer.parseInt(pts);
            int i=20;
            int score;
            score=points+i;
            txpt2.setText(String.valueOf(score));
            Toast.makeText(this,"Este numero es correcto, tienes 20 puntos", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();


        } else {
            Toast.makeText(this,"numero incorrecto, intentelo de nuevo", Toast.LENGTH_LONG).show();
        }


    }

    //metodo para el boton de la serie dos

    public void serie2(View ver){

        String ser2=etsr2.getText().toString();
        String pts=txpt2.getText().toString();


        //se realiza parseo de modo cadena a modo entero

        int num2=Integer.parseInt(ser2);

        if(num2== 10){
            int points=Integer.parseInt(pts);
            int i=20;
            int score;
            score=points+i;
            txpt2.setText(String.valueOf(score));
            Toast.makeText(this,"Tienes 40 puntos, avanza a la siguiente serie", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();

        } else {
            Toast.makeText(this,"numero incorrecto, intentelo de nuevo", Toast.LENGTH_LONG).show();
        }

    }

    //metodo para el boton de la serie tres

    public void serie3(View ver){

        String ser3=etsr3.getText().toString();
        String pts=txpt2.getText().toString();


        //se realiza parseo de modo cadena a modo entero

        int num3=Integer.parseInt(ser3);

        if(num3== 21){
            int points=Integer.parseInt(pts);
            int i=20;
            int score;
            score=points+i;
            txpt2.setText(String.valueOf(score));
            Toast.makeText(this,"Tienes 60 puntos, avanza a la siguiente serie", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();

        } else {
            Toast.makeText(this,"numero incorrecto, intentelo de nuevo", Toast.LENGTH_LONG).show();
        }


    }

    //metodo para el boton de la serie cuatro

    public void serie4(View ver){

        String ser4=etsr4.getText().toString();
        String pts=txpt2.getText().toString();


        //se realiza parseo de modo cadena a modo entero

        int num4=Integer.parseInt(ser4);

        if(num4== 35){
            int points=Integer.parseInt(pts);
            int i=20;
            int score;
            score=points+i;
            txpt2.setText(String.valueOf(score));
            Toast.makeText(this,"Tienes 80 puntos, avanza a la siguiente serie", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();

        } else {
            Toast.makeText(this,"numero incorrecto, intentelo de nuevo", Toast.LENGTH_LONG).show();
        }


    }

    //metodo para el boton de la serie cinco

    public void serie5(View ver){

        String ser5=etsr5.getText().toString();
        String pts=txpt2.getText().toString();


        //se realiza parseo de modo cadena a modo entero

        int num5=Integer.parseInt(ser5);

        if(num5== 61){
            int points=Integer.parseInt(pts);
            int i=20;
            int score;
            score=points+i;
            txpt2.setText(String.valueOf(score));
            Toast.makeText(this,"Tienes 100 puntos, avanza a la siguiente serie", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();

        } else {
            Toast.makeText(this,"numero incorrecto, intentelo de nuevo", Toast.LENGTH_LONG).show();
        }


    }

    //metodo para el boton de la serie seis

    public void serie6(View ver){

        String ser6=etsr6.getText().toString();
        String pts=txpt2.getText().toString();


        //se realiza parseo de modo cadena a modo entero

        int num6=Integer.parseInt(ser6);

        if(num6== 98){
            int points=Integer.parseInt(pts);
            int i=20;
            int score;
            score=points+i;
            txpt2.setText(String.valueOf(score));
            Toast.makeText(this,"Tienes 120 puntos, avanza a la ultima serie", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();

        } else {
            Toast.makeText(this,"numero incorrecto, intentelo de nuevo", Toast.LENGTH_LONG).show();
        }


    }

    //metodo para el boton de la serie siete

    public void serie7(View ver){

        String ser7=etsr7.getText().toString();
        String pts=txpt2.getText().toString();


        //se realiza parseo de modo cadena a modo entero

        int num7=Integer.parseInt(ser7);

        if(num7== 146){
            int points=Integer.parseInt(pts);
            int i=20;
            int score;
            score=points+i;
            txpt2.setText(String.valueOf(score));
            Toast.makeText(this,"Tienes 120 puntos, FELICIDADES, TERMINASTE LA PRUEBA!", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();

        } else {
            Toast.makeText(this,"numero incorrecto, intentelo de nuevo", Toast.LENGTH_LONG).show();
        }


    }

    //metodo para el boton terminar

    public void abre_dialogo2(View view){
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle(R.string.terminar);
        builder.setMessage("Desea terminar la prueba sin guardar?");
        builder.setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(ActivitySeries.this,R.string.terminar, Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton(android.R.string.cancel, null);
        Dialog dialog=builder.create();
        dialog.show();


    }

    //metodo para el boton guardar

    public void guardar (View vista){

        Intent guardar = new Intent(this,ActivityConsulta.class);
        startActivity (guardar);

    }



    //metodo para el boton volver al menu suma

    public void anterior (View vista) {

        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

    //metodo para el boton ayuda

    public void ayuda2 (View vista) {

        Intent ayuda2 = new Intent(this, Activity_help2.class);
        startActivity(ayuda2);
    }
}
