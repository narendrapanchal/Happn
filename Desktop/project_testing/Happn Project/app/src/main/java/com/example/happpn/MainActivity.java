package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private TextView mcontinueWithPhoneID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcontinueWithPhoneID=findViewById(R.id.continueWithPhoneTextID);
        mcontinueWithPhoneID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivty=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intentmainActivty);
            }
        });
    }
}