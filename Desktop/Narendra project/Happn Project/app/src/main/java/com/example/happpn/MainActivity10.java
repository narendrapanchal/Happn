package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {
       private Button mainActivity10mbtnOccasional;
       private Button mainActivity10mbtnCardio;
       private Button mainactivity10mbtnAllexcise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        mainActivity10mbtnOccasional=findViewById(R.id.mainActivity10BtnOccasional);
        mainActivity10mbtnCardio=findViewById(R.id.mainActivity10BtnCardio);
        mainactivity10mbtnAllexcise=findViewById(R.id.mainActivity10BtnAllExcise);
        mainActivity10mbtnOccasional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivity10=new Intent(MainActivity10.this,MainActivity11.class);
                startActivity(intentmainActivity10);
            }
        });
        mainActivity10mbtnCardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivity10=new Intent(MainActivity10.this,MainActivity11.class);
                startActivity(intentmainActivity10);
            }
        });
        mainactivity10mbtnAllexcise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivity10=new Intent(MainActivity10.this,MainActivity11.class);
                startActivity(intentmainActivity10);
            }
        });
    }
}