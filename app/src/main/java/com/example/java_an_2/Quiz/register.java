package com.example.java_an_2.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.java_an_2.R;

public class register extends AppCompatActivity {
    private EditText etUsername;
    private EditText etEmail;
    private EditText etDateofBirth;
    private EditText etPassword;
    private RadioGroup radioGroupGender;
    private RadioButton radioMale;
    private RadioButton radioFemale;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


        etUsername = findViewById(R.id.etUsername);
        etEmail = findViewById(R.id.etEmail);
        etDateofBirth = findViewById(R.id.etDateofBirth);
        etPassword = findViewById(R.id.etPassword);
        radioMale = findViewById(R.id.radio_male);
        radioFemale = findViewById(R.id.radio_female);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            private String getSelectedGender() {
                if (radioMale.isChecked()) {
                    return "Male";
                } else if (radioFemale.isChecked()) {
                    return "Female";
                }
                return null;
            }
            @Override
            public void onClick(View v) {
                if(etUsername.getText().toString().isEmpty() ||
                        etEmail.getText().toString().isEmpty() ||
                        etDateofBirth.getText().toString().isEmpty() ||
                        etPassword.getText().toString().isEmpty()) {
                    if(etUsername.getText().toString().isEmpty()) {
                        etUsername.setError("Username cannot be empty");
                    }
                    if(etEmail.getText().toString().isEmpty()) {
                        etEmail.setError("Email cannot be empty");
                    }
                    if(etDateofBirth.getText().toString().isEmpty()) {
                        etDateofBirth.setError("Date of Birth cannot be empty");
                    }
                    if(etPassword.getText().toString().isEmpty()) {
                        etPassword.setError("Password cannot be empty");
                    }
                    return;
                }

                Intent intent = new Intent();
                intent.putExtra("username", etUsername.getText().toString());
                intent.putExtra("email", etEmail.getText().toString());
                intent.putExtra("dob", etDateofBirth.getText().toString());
                intent.putExtra("password", etPassword.getText().toString());
                intent.putExtra("gender", getSelectedGender());

                setResult(RESULT_OK, intent);
                String message = "Register Success";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                finish();
            }



        });
    }
}
