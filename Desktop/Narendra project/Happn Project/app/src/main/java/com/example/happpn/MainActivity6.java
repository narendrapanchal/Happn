package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    private Button mainActivity6mbtnLetsGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        mainActivity6mbtnLetsGo=findViewById(R.id.mainActivity6btnLetsGo);
        mainActivity6mbtnLetsGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivity6=new Intent(MainActivity6.this,MainActivity8.class);
                startActivity(intentmainActivity6);
            }
        });


    }
}