package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Notification extends AppCompatActivity {
     private Button activityNotificationmHomeIcon;
     private Button activityNotificationmChatIcon;
     private Button activityNotificationmPersonIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        activityNotificationmHomeIcon=findViewById(R.id.activityNotificationHomeIcon);
        activityNotificationmChatIcon=findViewById(R.id.activityNotificationChatIcon);
        activityNotificationmPersonIcon=findViewById(R.id.activityNotificationPersonIcon);

        activityNotificationmHomeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNotificationH=new Intent(Notification.this,MainActivity13.class);
                startActivity(intentNotificationH);
            }
        });
        activityNotificationmChatIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNotificationC=new Intent(Notification.this,ChatActivity.class);
                startActivity(intentNotificationC);
            }
        });
        activityNotificationmPersonIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNotificationP=new Intent(Notification.this,ProfileActivity.class);
                startActivity(intentNotificationP);
            }
        });
    }
}