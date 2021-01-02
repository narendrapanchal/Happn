package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity11 extends AppCompatActivity {
        private TextView mainActivity11mIAmInBedByMidNight;
    private TextView mainActivity11mIPartyInModeration;
    private TextView mainActivity11mIAmNightOwl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        mainActivity11mIAmInBedByMidNight=findViewById(R.id. mainActivity11IAmInBedByMidNight);
        mainActivity11mIPartyInModeration=findViewById(R.id. mainActivity11IPartyInModeration);
        mainActivity11mIAmNightOwl=findViewById(R.id. mainActivity11IAmANightOwl);
        mainActivity11mIAmInBedByMidNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivity11=new Intent(MainActivity11.this,MainActivity12.class);
                startActivity(intentmainActivity11);
            }

        });

        mainActivity11mIPartyInModeration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivity11=new Intent(MainActivity11.this,MainActivity12.class);
                startActivity(intentmainActivity11);
            }

        });

                mainActivity11mIAmNightOwl.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentmainActivity11=new Intent(MainActivity11.this,MainActivity12.class);
                        startActivity(intentmainActivity11);
                    }

                });
    }
}