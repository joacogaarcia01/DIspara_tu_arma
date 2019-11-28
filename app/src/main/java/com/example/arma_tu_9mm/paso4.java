package com.example.arma_tu_9mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class paso4 extends AppCompatActivity {

    private Button btnV4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso4);

        btnV4 = (Button) findViewById(R.id.btnV4);

        btnV4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paso4.this, paso3.class);
                startActivity(intent);
            }
        });
    }
}
