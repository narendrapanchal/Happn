package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private Button mContinueWithPhoneID1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContinueWithPhoneID1=findViewById(R.id.continueWithPhoneTextID1);
        mContinueWithPhoneID1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmainActivty=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intentmainActivty);
            }
        });
    }
}