package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChatActivity extends AppCompatActivity {
 private Button activityChatmProfile;
 private Button activityChatmNotification;
 private Button activityChatmHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        activityChatmProfile=findViewById(R.id.activityChatProfile);
        activityChatmNotification=findViewById(R.id.activityChatNotification);
        activityChatmHome=findViewById(R.id.activityChatHome);
        activityChatmProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inetntactivityChatP=new Intent(ChatActivity.this,ProfileActivity.class);
                startActivity(inetntactivityChatP);
            }
        });
        activityChatmNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inetntactivityChatN=new Intent(ChatActivity.this,Notification.class);
                startActivity(inetntactivityChatN);
            }
        });
        activityChatmHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inetntactivityChatH=new Intent(ChatActivity.this,MainActivity13.class);
                startActivity(inetntactivityChatH);
            }
        });
    }
}