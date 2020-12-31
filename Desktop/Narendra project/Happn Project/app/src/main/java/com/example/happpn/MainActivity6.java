package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    private Button mainActivity6mbtnLaunch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        mainActivity6mbtnLaunch=findViewById(R.id.mainActivity6btnLetsGo);
        mainActivity6mbtnLaunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMainActivity6=new Intent(MainActivity6.this,MainActivity8.class);
                startActivity(intentMainActivity6);
            }
        });


    }
}