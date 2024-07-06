package com.example.java_an_2.Quiz;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.java_an_2.R;

public class dashboard extends AppCompatActivity {
    private  TextView username;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        username = findViewById(R.id.username);
        String username = getIntent().getStringExtra("username");

        this.username.setText(username);

    }
}
