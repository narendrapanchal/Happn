package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    private Button mainActivityJava4BtnContinue;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        mainActivityJava4BtnContinue = findViewById(R.id.mainActivity4btnContinue);
        mainActivityJava4BtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmainActivity4 = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intentmainActivity4);
            }
        });
    }
    }

