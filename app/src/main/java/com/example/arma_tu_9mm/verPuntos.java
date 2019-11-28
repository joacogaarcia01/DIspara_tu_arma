package com.example.arma_tu_9mm;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class verPuntos extends AppCompatActivity {

    private ListView listView;
    ArrayList<String> nombre_tareas;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_puntos);

        nombre_tareas = new ArrayList<String>();
        nombre_tareas = (ArrayList<String>) getIntent().getSerializableExtra("tareas");

        listView = (ListView) findViewById(R.id.lsita);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombre_tareas);
        listView.setAdapter(adapter);

     }

}