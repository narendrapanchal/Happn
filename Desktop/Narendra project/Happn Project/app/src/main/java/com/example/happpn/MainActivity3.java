package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
       private Button mainActivity3btnlLaunch;
       private EditText mainActivity3mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        isCredentialValid();
        mainActivity3btnlLaunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isCredentialValid()){
                Intent intentmainActivity3=new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intentmainActivity3);
            }}
        });
    }
    private Boolean isCredentialValid(){
        Boolean isDataValid=true;
        mainActivity3btnlLaunch=findViewById(R.id.mainActivity3btnContinue);
        mainActivity3mPassword=findViewById(R.id.mainActivity3Password);
        if(mainActivity3mPassword.getText().toString().length()<7){
            mainActivity3mPassword.setError("Password length is short");
            isDataValid=false;
        }
        return isDataValid;
    }

}