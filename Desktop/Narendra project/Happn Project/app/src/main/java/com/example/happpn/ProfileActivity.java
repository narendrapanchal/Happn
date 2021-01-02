package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {
    private Button activityProfilemMessage;
    private Button activityProfilemNotification;
    private Button activityProfilemHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        activityProfilemMessage=findViewById(R.id.activityProfilemessage);
                activityProfilemNotification=findViewById(R.id.activityProfileNotification);
        activityProfilemHome=findViewById(R.id.activityProfileHome);
        activityProfilemHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentprofileActivityH=new Intent(ProfileActivity.this,MainActivity13.class);
                startActivity(intentprofileActivityH);
            }
        });
                activityProfilemNotification.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentprofileActivityN=new Intent(ProfileActivity.this,Notification.class);
                        startActivity(intentprofileActivityN);
                    }
                });
        activityProfilemMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentprofileActivityM=new Intent(ProfileActivity.this,ChatActivity.class);
                startActivity(intentprofileActivityM);
            }
        });
    }
}