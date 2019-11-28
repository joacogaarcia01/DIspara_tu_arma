package com.example.arma_tu_9mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class paso3 extends AppCompatActivity {

    private Button btnS3, btnV3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso3);


        btnS3 = (Button) findViewById(R.id.btnS3);
        btnV3 = (Button) findViewById(R.id.btnV3);

        btnS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paso3.this, paso4.class);
                startActivity(intent);
            }
        });

        btnV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paso3.this, paso2.class);
                startActivity(intent);
            }
        });
    }
}
