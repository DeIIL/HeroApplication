package com.example.heroapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnBatman,btnZatanna,btnBeetle,btnSuperman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBatman = (ImageButton) findViewById(R.id.imageButtonBatman);
        btnBeetle = (ImageButton) findViewById(R.id.imageButtonBeetle);
        btnZatanna = (ImageButton) findViewById(R.id.imageButtonZatanna);
        btnSuperman = (ImageButton) findViewById(R.id.imageButtonSuperman);

        btnBatman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ActivityBatman.class);
            }
        });
        btnBeetle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,ActivityBeetle.class);
            }
        });
        btnZatanna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this,ActivityZatanna.class);
            }
        });
        btnSuperman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(MainActivity.this,ActivitySuperman.class);
            }
        });
    }
}