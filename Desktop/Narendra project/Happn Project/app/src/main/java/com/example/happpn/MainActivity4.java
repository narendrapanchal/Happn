package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {
    private Button mainActivityJava4BtnContinue;
    private EditText mainActivity4mtextName;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        isCredentialValid();
        mainActivityJava4BtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isCredentialValid()){
                Intent intentmainActivity4 = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intentmainActivity4);
            }}
        });
    }
    private Boolean isCredentialValid(){
        Boolean isDataValid=true;
        mainActivityJava4BtnContinue = findViewById(R.id.mainActivity4btnContinue);
        mainActivity4mtextName=findViewById(R.id.mainActivity4textName);
        if(mainActivity4mtextName.getText().toString().length()<5){
            mainActivity4mtextName.setError("Name is too short");
            isDataValid=false;
        }
        return isDataValid;
    }

}

