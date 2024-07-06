//package com.example.java_an_2;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//    private Button btnRegister;
//    private EditText usernameEditText, emailEditText;
//    private RadioGroup genderRadioGroup;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        btnRegister = findViewById(R.id.btnRegister);
//        usernameEditText = findViewById(R.id.username);
//        emailEditText = findViewById(R.id.editTextTextEmailAddress);
//        genderRadioGroup = findViewById(R.id.genderRadioGroup);
//
//        btnRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username = usernameEditText.getText().toString();
//                String email = emailEditText.getText().toString();
//                int selectedGenderId = genderRadioGroup.getCheckedRadioButtonId();
//                RadioButton selectedGenderRadioButton = findViewById(selectedGenderId);
//                String gender = selectedGenderRadioButton.getText().toString();
//
//                if (username.isEmpty() || email.isEmpty() || gender.isEmpty()) {
//                    // Handle empty fields
//                    //messageTextView.setText("Please fill in all fields.");
//                    return ;
//                }
//
//                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                intent.putExtra("username", username);
//                intent.putExtra("email", email);
//                intent.putExtra("gender", gender);
//                intent.putExtra("selectedGenderId", selectedGenderId);
//
//                startActivity(intent);
//            }
//        });
//    }
//}
