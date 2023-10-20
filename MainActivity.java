package com.example.jmm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;

    // Hardcoded username and password
    private static final String CORRECT_USERNAME = "cho123";
    private static final String CORRECT_PASSWORD = "kobe24";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.editTextUsername);
        passwordEditText = findViewById(R.id.editTextPassword);
        Button loginButton = findViewById(R.id.buttonLogin);
        findViewById(R.id.checkboxRememberMe);

        loginButton.setOnClickListener(v -> {
            String enteredUsername = usernameEditText.getText().toString();
            String enteredPassword = passwordEditText.getText().toString();

            if (enteredUsername.equals(CORRECT_USERNAME) && enteredPassword.equals(CORRECT_PASSWORD)) {
                Intent intent = new Intent(MainActivity.this, homepage.class);
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                usernameEditText.setText(""); // Clear username text
                passwordEditText.setText(""); // Clear password text
            }
        });

    }
}