package com.example.hasatimagineproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hasatimagineproj.agriculturalistPart.AgricultMainActivity;

public class hastaliktespit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hastaliktespit);

        findViewById(R.id.hastalikBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(hastaliktespit.this, AgricultMainActivity.class));
            }
        });
    }
}