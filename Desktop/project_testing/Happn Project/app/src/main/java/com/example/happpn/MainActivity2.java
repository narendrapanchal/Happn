package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
private Button mainActivityJava2BtnContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
            mainActivityJava2BtnContinue = findViewById(R.id.mainActivity2btnContinue);
            mainActivityJava2BtnContinue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentmainActivity2 = new Intent(MainActivity2.this,MainActivity3.class);
                    startActivity(intentmainActivity2);
                }
            });
    }
}