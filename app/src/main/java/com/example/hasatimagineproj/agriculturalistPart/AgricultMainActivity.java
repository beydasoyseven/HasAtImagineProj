package com.example.hasatimagineproj.agriculturalistPart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hasatimagineproj.MainActivity;
import com.example.hasatimagineproj.R;

public class AgricultMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agricult_main);

        findViewById(R.id.satisaGonderButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgricultMainActivity.this, AgrShopActivity.class));
            }
        });
    }
}