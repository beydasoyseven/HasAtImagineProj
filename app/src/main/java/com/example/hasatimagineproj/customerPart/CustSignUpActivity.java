package com.example.hasatimagineproj.customerPart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hasatimagineproj.R;
import com.example.hasatimagineproj.agriculturalistPart.AgricultSignInActivity;
import com.example.hasatimagineproj.agriculturalistPart.AgricultSignUpActivity;

public class CustSignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_sign_up);

        findViewById(R.id.CustTextSignInButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustSignUpActivity.this, CustSignInActivity.class));
            }
        });
        findViewById(R.id.CustSignUpButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CustSignUpActivity.this, CustShopActivity.class));
            }
        });
    }
}