package com.example.troubleshooter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SuspiciousMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suspicious_message);

        Button nextPageButton = findViewById(R.id.next_page);

        nextPageButton.setOnClickListener(v -> goToNextPage());
    }

    private void goToNextPage() {
        Intent intent = new Intent(SuspiciousMessageActivity.this, SuspiciousMessageNextActivity.class);
        startActivity(intent);
    }
}