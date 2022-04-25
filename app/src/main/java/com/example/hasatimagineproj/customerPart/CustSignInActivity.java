package com.example.hasatimagineproj.customerPart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hasatimagineproj.MainActivity;
import com.example.hasatimagineproj.R;
import com.example.hasatimagineproj.agriculturalistPart.AgricultSignInActivity;
import com.example.hasatimagineproj.agriculturalistPart.AgricultSignUpActivity;

public class CustSignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_sign_in);

        findViewById(R.id.CustTextSignUpButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustSignInActivity.this, CustSignUpActivity.class));
            }

        });
        findViewById(R.id.CustSignInButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CustSignInActivity.this, CustShopActivity.class));
            }
        });
    }
}