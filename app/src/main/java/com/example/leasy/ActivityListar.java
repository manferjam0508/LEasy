package com.example.leasy;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;


public class ActivityListar extends AppCompatActivity {

    private ListView lv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        lv1=(ListView)findViewById(R.id.listaPoint);

        ArrayList<String> punt = new ArrayList<>();
        AdminSQLiteOpenHelper ranking = new AdminSQLiteOpenHelper(this, "puntaje", null, 1);

        SQLiteDatabase Score= ranking.getWritableDatabase();
        Cursor fila= Score.rawQuery("Select fecha, codigo, nombre, prueba, puntos from puntaje", null);

        if(fila.moveToFirst()) {
            do {
                punt.add(fila.getString(0) + "-" + fila.getString(1)+ "-" + fila.getString(2) + "-" + fila.getString(3) + "-" + fila.getString(4));
            } while (fila.moveToNext());
        }
        Score.close();

            ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, punt);
            lv1.setAdapter(adapter);
        }




    // metodo para el boton de retorno al menu suma

    public void volver(View vista) {

        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);

    }

    // metodo para el boton de retorno a la opcion consultar

    public void consultar(View vista) {

        Intent consultar = new Intent(this, ActivityConsulta.class);
        startActivity(consultar);

    }
}
