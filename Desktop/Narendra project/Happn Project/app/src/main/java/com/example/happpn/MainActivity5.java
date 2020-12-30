package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    private Button mainActivity5btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        mainActivity5btn=findViewById(R.id.mainActivity5btnContinue);
        mainActivity5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inetntmainActivity5=new Intent(MainActivity5.this,MainActivity6.class);
                startActivity(inetntmainActivity5);
            }
        });
   }
}