package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {
        private Button mainActivity9btnConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        mainActivity9btnConfirm=findViewById(R.id.mainActivity9btnConfirm);
        mainActivity9btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivity9=new Intent(MainActivity9.this,MainActivity10.class);
                startActivity(intentmainActivity9);
            }
        });
    }
}