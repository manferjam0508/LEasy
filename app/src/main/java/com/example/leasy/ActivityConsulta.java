package com.example.leasy;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityConsulta extends AppCompatActivity {

    private EditText et_codigo, et_nombre, et_prueba, et_fecha, et_puntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);

        et_codigo = (EditText) findViewById(R.id.tx_codigo);
        et_nombre = (EditText) findViewById(R.id.tx_nombre);
        et_prueba = (EditText) findViewById(R.id.tx_prueba);
        et_fecha = (EditText) findViewById(R.id.tx_fecha);
        et_puntos = (EditText) findViewById(R.id.tx_puntos);
    }

    //Métotdo para guardar el registro

    public void Registrar(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "puntaje", null, 1);
        SQLiteDatabase Score = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();
        String nombre = et_nombre.getText().toString();
        String prueba = et_prueba.getText().toString();
        String fecha = et_fecha.getText().toString();
        String puntos = et_puntos.getText().toString();

        if (!codigo.isEmpty() && !nombre.isEmpty() && !prueba.isEmpty() && !fecha.isEmpty() && !puntos.isEmpty()) {
            ContentValues registro = new ContentValues();

            registro.put("codigo", codigo);
            registro.put("nombre", nombre);
            registro.put("prueba", prueba);
            registro.put("fecha", fecha);
            registro.put("puntos", puntos);

            Score.insert("puntaje", null, registro);

            Score.close();
            et_codigo.setText("");
            et_nombre.setText("");
            et_prueba.setText("");
            et_fecha.setText("");
            et_puntos.setText("");

            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }


    //Método para consultar un artículo o producto

    public void buscar(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "puntaje", null, 1);
        SQLiteDatabase Score = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();

        if (!codigo.isEmpty()) {
            Cursor fila = Score.rawQuery
                    ("select nombre, prueba, fecha, puntos from puntaje where codigo =" + codigo, null);

            if (fila.moveToFirst()) {
                et_nombre.setText(fila.getString(0));
                et_prueba.setText(fila.getString(1));
                et_fecha.setText(fila.getString(2));
                et_puntos.setText(fila.getString(3));
                Score.close();
            } else {
                Toast.makeText(this, "No existe el registro", Toast.LENGTH_SHORT).show();
                Score.close();
            }

        } else {
            Toast.makeText(this, "Debes introducir todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    //Método para eliminar un registro

    public void Eliminar(View view){

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper
                (this, "puntaje", null, 1);
        SQLiteDatabase Score = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();

        if(!codigo.isEmpty()){

            int cantidad = Score.delete("puntaje", "codigo=" + codigo, null);
            Score.close();

            et_codigo.setText("");
            et_nombre.setText("");
            et_prueba.setText("");
            et_fecha.setText("");
            et_puntos.setText("");

            if(cantidad == 1){
                Toast.makeText(this, "Registro eliminado exitosamente", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "El registro no existe", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "Debes de introducir todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    // metodo para el boton de listar

    public void listar(View vista) {

        Intent listar = new Intent(this, ActivityListar.class);
        startActivity(listar);

    }

}





