package com.example.arma_tu_9mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class paso1 extends AppCompatActivity {

    private Button btnS1, btnV1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso1);

        btnS1 = (Button) findViewById(R.id.btnS1);
        btnV1 = (Button) findViewById(R.id.btnV1);

        btnS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paso1.this, paso2.class);
                startActivity(intent);
            }
        });

        btnV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paso1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
