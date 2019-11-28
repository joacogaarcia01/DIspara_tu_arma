package com.example.arma_tu_9mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class apuntarPuntos extends AppCompatActivity {

    private EditText edtPuntos;
    private Button btnGuardar, btn_ver;
    ArrayList<String> tarea;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apuntar_puntos);

        tarea = new ArrayList<String>();
        edtPuntos = (EditText) findViewById(R.id.edtPuntos);
        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        btn_ver = (Button) findViewById(R.id.btn_ver);
        imageView = (ImageView) findViewById(R.id.imgVolver);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btn_ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar_datos();
            }
        });

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardar_datos();
            }
        });
    }

    public void guardar_datos(){
        String tareas;
        tareas = edtPuntos.getText().toString();
        tarea.add(tareas);
    }

    public void enviar_datos(){
        Intent intent = new Intent(apuntarPuntos.this, verPuntos.class);
        intent.putExtra("tareas", tarea);
        startActivity(intent);
    }
}

