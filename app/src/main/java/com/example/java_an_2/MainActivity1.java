package com.example.java_an_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {
    private Button btnsubmit;
    private EditText txtinput;
    @Override
     protected  void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.display_main);
         btnsubmit = findViewById(R.id.btnsubmit);
         txtinput = findViewById(R.id.textinput);

         btnsubmit.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent();
                 intent.putExtra("msg",txtinput.getText().toString());
                 setResult(RESULT_OK,intent);
                 finish();

             }
         });
     }
}
