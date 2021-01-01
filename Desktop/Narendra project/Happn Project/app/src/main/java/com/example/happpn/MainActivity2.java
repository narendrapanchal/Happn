package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button mainActivityJava2BtnContinue;
    private EditText mainActivity2mtextPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        isCredentialValid();
        mainActivityJava2BtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isCredentialValid()){
                Intent intentmainActivity2 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intentmainActivity2);
            }}
        });
    }
            private Boolean isCredentialValid(){
            Boolean isDatavalid=true;
                mainActivityJava2BtnContinue = findViewById(R.id.mainActivity2btnContinue);
                mainActivity2mtextPhoneNumber=findViewById(R.id.mainActivity2textPhoneNumber);
            if(mainActivity2mtextPhoneNumber.getText().toString().length()!=10){
                mainActivity2mtextPhoneNumber.setError("Not a valid number");
                isDatavalid=false;
            }

           return isDatavalid;
            }


}