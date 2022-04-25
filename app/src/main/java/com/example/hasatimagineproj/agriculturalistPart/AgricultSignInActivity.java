package com.example.hasatimagineproj.agriculturalistPart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hasatimagineproj.MainActivity;
import com.example.hasatimagineproj.R;

public class AgricultSignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agricult_sign_in);

        findViewById(R.id.agrTextSignUpButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AgricultSignInActivity.this, AgricultSignUpActivity.class));
            }
        });
        findViewById(R.id.agrSignInButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgricultSignInActivity.this, AgricultMainActivity.class));
            }
        });
    }
}