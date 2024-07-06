//package com.example.java_an_2;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//
//public class MainActivity2 extends AppCompatActivity {
//   private TextView usernameEditText,emailEditText,genderRadioGroup;
//   private  Button btnBack;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity2_main);
//        btnBack = findViewById(R.id.btnBack);
//        usernameEditText = findViewById(R.id.username);
//        emailEditText = findViewById(R.id.email);
//        genderRadioGroup = findViewById(R.id.gender);
//        Bundle bundle = getIntent().getExtras();
//        usernameEditText.setText(bundle.getString("username"));
//        emailEditText.setText(bundle.getString("email"));
//        genderRadioGroup.setText(bundle.getString("gender"));
//
//        btnBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//              startActivity(intent);
//
//
//            }
//        });
//    }
//}