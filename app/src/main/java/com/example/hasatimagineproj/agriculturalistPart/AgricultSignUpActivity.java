package com.example.hasatimagineproj.agriculturalistPart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hasatimagineproj.MainActivity;
import com.example.hasatimagineproj.R;

public class AgricultSignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agricult_sign_up);

        findViewById(R.id.agrTextSignInButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AgricultSignUpActivity.this, AgricultSignInActivity.class));
            }
        });

        findViewById(R.id.agrSignUpButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgricultSignUpActivity.this, AgricultMainActivity.class));
            }
        });
    }
}