package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
       private Button mainActivity3btnlLaunch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mainActivity3btnlLaunch=findViewById(R.id.mainActivity3btnContinue);
        mainActivity3btnlLaunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivity3=new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intentmainActivity3);
            }
        });
    }
}