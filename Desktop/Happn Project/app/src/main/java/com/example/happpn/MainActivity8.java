package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity{
     private TextView mainActivity8mARelationShip;
     private TextView mainActivity8mNothingSerious;
     private TextView mainActivity8mIWillKnowWhenIFindIt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        mainActivity8mARelationShip=findViewById(R.id.mainActivity8ARelationship);
        mainActivity8mNothingSerious=findViewById(R.id.mainActivity8NothingSerious);
        mainActivity8mIWillKnowWhenIFindIt=findViewById(R.id.mainActivity8IWillKnowWhenIFindIt);
        mainActivity8mARelationShip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivity8=new Intent(MainActivity8.this,MainActivity9.class);
                startActivity(intentmainActivity8);
            }
        });
        mainActivity8mNothingSerious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivity8=new Intent(MainActivity8.this,MainActivity9.class);
                startActivity(intentmainActivity8);
            }
        });
        mainActivity8mIWillKnowWhenIFindIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivity8=new Intent(MainActivity8.this,MainActivity9.class);
                startActivity(intentmainActivity8);
            }
        });

    }
}