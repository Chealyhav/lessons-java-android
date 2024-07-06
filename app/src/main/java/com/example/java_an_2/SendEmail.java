package com.example.java_an_2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SendEmail extends AppCompatActivity {


    private EditText editTextText;
    private EditText editTextText2;
    private EditText editTextText3;
    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_email);
        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        editTextText3 = findViewById(R.id.editTextText3);
        button = findViewById(R.id.button2);

        button.setOnClickListener(View -> {
            String email = editTextText.getText().toString();
            String subject = editTextText2.getText().toString();
            String body = editTextText3.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra(Intent.EXTRA_EMAIL, email);
            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, body);
            intent.setType("message/rfc822");
            startActivity(intent);
        });



    }




}
