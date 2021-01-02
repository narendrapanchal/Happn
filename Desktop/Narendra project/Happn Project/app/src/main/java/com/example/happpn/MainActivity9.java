package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity9 extends AppCompatActivity {
        private Button mainActivity9btnConfirm;
        private EditText mainActivity9mHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        mainActivity9btnConfirm=findViewById(R.id.mainActivity9btnConfirm);
        isCredentialValid();
        mainActivity9btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isCredentialValid()){
                Intent intentmainActivity9=new Intent(MainActivity9.this,MainActivity10.class);
                startActivity(intentmainActivity9);
            }}
        });
    }
    private Boolean isCredentialValid(){
        Boolean isDataValid=true;
        mainActivity9mHeight=findViewById(R.id.mainActivity9Height);
        if(mainActivity9mHeight.getText().toString().isEmpty()){
            mainActivity9mHeight.setError("InvalidHeight");
            isDataValid=false;
        }
        return isDataValid;
    }
}