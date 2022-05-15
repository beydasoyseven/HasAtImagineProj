package com.example.hasatimagineproj.agriculturalistPart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hasatimagineproj.MainActivity;
import com.example.hasatimagineproj.R;
import com.example.hasatimagineproj.hastaliktespit;
import com.example.hasatimagineproj.newsandopport;
import com.example.hasatimagineproj.urunEkim;
import com.example.hasatimagineproj.uzmanlaGorus;

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

        findViewById(R.id.haberlerbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgricultMainActivity.this, newsandopport.class));
            }
        });

        findViewById(R.id.hastalikbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgricultMainActivity.this, hastaliktespit.class));
            }
        });

        findViewById(R.id.ekimButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgricultMainActivity.this, urunEkim.class));
            }
        });

        findViewById(R.id.uzmanButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgricultMainActivity.this, uzmanlaGorus.class));
            }
        });
        findViewById(R.id.agrBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgricultMainActivity.this, MainActivity.class));
            }
        });
    }
}