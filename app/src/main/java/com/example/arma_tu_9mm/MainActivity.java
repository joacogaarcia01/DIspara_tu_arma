package com.example.arma_tu_9mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btnguardar, btnaprender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnguardar = (Button) findViewById(R.id.btnGuardar);
        btnaprender = (Button) findViewById(R.id.btnAprender);

        btnaprender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, paso1.class);
                startActivity(intent);
            }
        });

        btnguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, apuntarPuntos.class);
                startActivity(intent);
            }
        });
    }
}
