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

public class ActivityCompletar extends AppCompatActivity {

    private EditText et1,et2,et3,et4,et5;
    private TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,txp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completar);

        //se realiza casting de las variables

        et1= (EditText)findViewById(R.id.editText1);
        et2= (EditText)findViewById(R.id.editText2);
        et3= (EditText)findViewById(R.id.editText3);
        et4= (EditText)findViewById(R.id.editText4);
        et5= (EditText)findViewById(R.id.editText5);
        txp= (TextView)findViewById(R.id.txtpuntos);

        SharedPreferences preferences= getSharedPreferences("datos", Context.MODE_PRIVATE);
        String v=String.valueOf(preferences.getInt("puntos", 0));
        txp.setText(v);
    }


    //metodo del boton del primer igual

    public void comprobar1(View ver){

        String sum2=et1.getText().toString();
        String pts=txp.getText().toString();

        //se realiza parseo de modo cadena a modo entero

        int num2=Integer.parseInt(sum2);


        if(num2== 15){
            int points=Integer.parseInt(pts);
            int i=20;
            int score;
            score=points+i;
            txp.setText(String.valueOf(score));
            Toast.makeText(this,"Este numero es correcto, tienes 20 puntos", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();

        } else {
            Toast.makeText(this,"numero incorrecto, intentelo de nuevo", Toast.LENGTH_LONG).show();
        }


    }

    //metodo del boton del segundo igual

    public void comprobar2(View ver){

        String sum3=et2.getText().toString();
        String pts=txp.getText().toString();

        //se realiza parseo de modo cadena a modo entero

        int num3=Integer.parseInt(sum3);

        if(num3== 11){
            int points=Integer.parseInt(pts);
            int i=20;
            int score;
            score=points+i;
            txp.setText(String.valueOf(score));
            Toast.makeText(this,"Vas bien, tienes 40 puntos", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();

        } else {
            Toast.makeText(this,"numero incorrecto, intentelo de nuevo", Toast.LENGTH_LONG).show();
        }


    }

    //metodo del boton del tercer igual

    public void comprobar3(View ver){

        String sum4=et3.getText().toString();
        String pts=txp.getText().toString();

        //se realiza parseo de modo cadena a modo entero

        int num6=Integer.parseInt(sum4);

        if(num6== 41){
            int points=Integer.parseInt(pts);
            int i=20;
            int score;
            score=points+i;
            txp.setText(String.valueOf(score));
            Toast.makeText(this,"Casi lo tienes, ganas 60 puntos", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();
        } else {
            Toast.makeText(this,"numero incorrecto, intentelo de nuevo", Toast.LENGTH_LONG).show();
        }


    }

    //metodo del boton del cuarto igual

    public void comprobar4(View ver){

        String sum5=et4.getText().toString();
        String sum6=et5.getText().toString();
        String pts=txp.getText().toString();

        //se realiza parseo de modo cadena a modo entero

        int num7=Integer.parseInt(sum5);
        int num8=Integer.parseInt(sum6);

        if(num7== 41 && num8== 46){
            int points=Integer.parseInt(pts);
            int i=40;
            int score;
            score=points+i;
            txp.setText(String.valueOf(score));
            Toast.makeText(this,"Lo lograste, ganas 100 puntos, FELICIDADES!", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();
        } if(num7== 35 && num8== 52){
            int points=Integer.parseInt(pts);
            int i=40;
            int score;
            score=points+i;
            txp.setText(String.valueOf(score));
            Toast.makeText(this,"Lo lograste, ganas 100 puntos, FELICIDADES!", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();
        } if(num7== 27 && num8== 60) {
            int points=Integer.parseInt(pts);
            int i=40;
            int score;
            score=points+i;
            txp.setText(String.valueOf(score));
            Toast.makeText(this, "Lo lograste, ganas 100 puntos, FELICIDADES!", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();
        } if(num7== 19 && num8== 68) {
            int points=Integer.parseInt(pts);
            int i=40;
            int score;
            score=points+i;
            txp.setText(String.valueOf(score));
            Toast.makeText(this, "Lo lograste, ganas 100 puntos, FELICIDADES!", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();
        }if(num7== 71 && num8== 16) {
            int points=Integer.parseInt(pts);
            int i=40;
            int score;
            score=points+i;
            txp.setText(String.valueOf(score));
            Toast.makeText(this, "Lo lograste, ganas 100 puntos, FELICIDADES!", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putInt("puntos",points);
            editor.commit();
        } else {
            Toast.makeText(this,"numeros incorrectos, intentelo nuevamente", Toast.LENGTH_LONG).show();
        }


    }

    //metodo para el boton terminar

    public void abre_dialogo1(View view){
       AlertDialog.Builder builder= new AlertDialog.Builder(this);
       builder.setTitle(R.string.terminar);
       builder.setMessage("Desea terminar esta prueba sin guardar?");
       builder.setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(ActivityCompletar.this,R.string.terminar, Toast.LENGTH_SHORT).show();
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

    public void anterior (View vista){

        Intent anterior = new Intent(this,MainActivity.class);
        startActivity (anterior);

    }

    //metodo para el boton ayuda

    public void ayuda1 (View vista){

        Intent ayuda1 = new Intent(this,Activity_help1.class);
        startActivity (ayuda1);

    }






    }




