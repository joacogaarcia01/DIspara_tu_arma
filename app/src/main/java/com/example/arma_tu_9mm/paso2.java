package com.example.arma_tu_9mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class paso2 extends AppCompatActivity {

    private Button btnS2, btnV2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso2);

        btnS2 = (Button) findViewById(R.id.btnS2);
        btnV2 = (Button) findViewById(R.id.btnV2);

        btnS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paso2.this, paso3.class);
                startActivity(intent);
            }
        });

        btnV2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paso2.this, paso1.class);
                startActivity(intent);
            }
        });
    }
}
