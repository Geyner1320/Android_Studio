package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2,et3,et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.cedula);
        et2 = (EditText)findViewById(R.id.nombre);
        et3 = (EditText)findViewById(R.id.cole);
        et4 = (EditText)findViewById(R.id.mes);
    }

    public void insertar(View v){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion", null , 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String ced = et1.getText().toString();
        String nom = et2.getText().toString();
        String col = et3.getText().toString();
        String mesa = et4.getText().toString();
        ContentValues registro = new ContentValues();
        registro.put("cedula",ced);
        registro.put("nombre",nom);
        registro.put("colegio",col);
        registro.put("nromesa",mesa);
        bd.insert("votantes",null,registro);
        bd.close();
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
        Toast.makeText(this,"Se cargaron los datos de la persona",Toast.LENGTH_SHORT);

    }

    public void consulta(View v){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion",null,1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String ced = et1.getText().toString();
        Cursor fila =bd.rawQuery("SELECT nombre,colegio,nromesa from votantes where cedula="+ced,null);
        if(fila.moveToFirst()){
            et2.setText(fila.getString(0));
            et3.setText(fila.getString(1));
            et4.setText(fila.getString(2));
        }else{
            Toast.makeText(this,"No existe una persona con dicha cedula",Toast.LENGTH_SHORT);
        }
        bd.close();
    }

    public void eliminar(View v){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion",null,1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String ced = et1.getText().toString();
        int cant = bd.delete("votantes","cedula="+ced,null);
        bd.close();
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
        if(cant == 1){
            Toast.makeText(this,"Se borró la persona con dicho documento",Toast.LENGTH_SHORT);
        }else{
            Toast.makeText(this,"No existe una persona con dicho documento",Toast.LENGTH_SHORT);
        }
    }

    public void modificar(View v){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion", null , 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String ced = et1.getText().toString();
        String nom = et2.getText().toString();
        String col = et3.getText().toString();
        String mesa = et4.getText().toString();
        ContentValues registro = new ContentValues();
        registro.put("cedula",ced);
        registro.put("nombre",nom);
        registro.put("colegio",col);
        registro.put("nromesa",mesa);
        int cant = bd.update("votantes",registro,"cedula="+ced,null);
        bd.close();
        if(cant == 1){
            Toast.makeText(this,"Se modificaron los datos",Toast.LENGTH_SHORT);
        }else{
            Toast.makeText(this,"No existe una persona con dicho documento",Toast.LENGTH_SHORT);
        }
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
    }
}