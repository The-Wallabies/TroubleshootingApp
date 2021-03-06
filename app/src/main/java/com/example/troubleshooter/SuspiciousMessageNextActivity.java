package com.example.troubleshooter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SuspiciousMessageNextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suspicious_message_next);
        Button goToSettingsButton = findViewById(R.id.settings);
        goToSettingsButton.setOnClickListener(v -> goToSettings());
    }

    private void goToSettings() {
        startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
    }
}