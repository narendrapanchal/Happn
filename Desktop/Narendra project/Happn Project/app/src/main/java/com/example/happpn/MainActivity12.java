package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewAnimator;

public class MainActivity12 extends AppCompatActivity {
           private Button mainActivity12mbtnContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        mainActivity12mbtnContinue=findViewById(R.id.mainActivity12btncontinue);
        mainActivity12mbtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivity12 =new Intent(MainActivity12.this,MainActivity13.class);
                    startActivity(intentmainActivity12);
            }
        });
    }
}