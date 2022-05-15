package com.example.hasatimagineproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hasatimagineproj.agriculturalistPart.AgricultMainActivity;

public class uzmanlaGorus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uzmanla_gorus);

        findViewById(R.id.uzmanBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(uzmanlaGorus.this, AgricultMainActivity.class));
            }
        });
    }
}