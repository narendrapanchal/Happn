package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity13 extends AppCompatActivity {
    private Button mainActivity13mNotifications;
    private Button mainActivity13mMessage;
    private Button mainActivity13mProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        mainActivity13mNotifications=findViewById(R.id.mainActivity13Notification);
        mainActivity13mMessage=findViewById(R.id.mainActivity13message);
        mainActivity13mProfile=findViewById(R.id.mainActivity13Profile);
        mainActivity13mMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActvity13M=new Intent(MainActivity13.this,ChatActivity.class);
                startActivity(intentmainActvity13M);
            }
        });
        mainActivity13mNotifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActvity13N=new Intent(MainActivity13.this,Notification.class);
                startActivity(intentmainActvity13N);
            }
        });
                mainActivity13mProfile.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentmainActvity13P=new Intent(MainActivity13.this,ProfileActivity.class);
                        startActivity(intentmainActvity13P);
                    }
                });
    }
}