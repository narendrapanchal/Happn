package com.example.happpn;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Integer.parseInt;

public class MainActivity5 extends AppCompatActivity {
    private Button mainActivity5btn;
    private EditText mainActivity5mDay;
    private EditText mainActivity5mMonth;
    private EditText mainActivity5mYear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        isCredentialValid();
        mainActivity5btn=findViewById(R.id.mainActivity5btnContinue);
        mainActivity5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(isCredentialValid()){
                Intent inetntmainActivity5=new Intent(MainActivity5.this,MainActivity6.class);
                startActivity(inetntmainActivity5);
          }}
        });
   }

   private Boolean isCredentialValid(){
        Boolean isDataValid=true;
        mainActivity5mMonth=findViewById(R.id.mainActivity5Month);
        mainActivity5mYear=findViewById(R.id.mainActivity5Year);
        mainActivity5mDay=findViewById(R.id.mainActivity5Day);
        if(mainActivity5mDay.getText().toString().isEmpty()){
            mainActivity5mDay.setError("Invalid Date");
            isDataValid=false;
        }
        if(mainActivity5mYear.getText().toString().isEmpty()){
           mainActivity5mYear.setError("Invalid Year");
           isDataValid=false;
       }
        if(mainActivity5mMonth.getText().toString().isEmpty()){
            mainActivity5mMonth.setError("Invalid Month");
            isDataValid=false;
        }
        return isDataValid;
   }

}