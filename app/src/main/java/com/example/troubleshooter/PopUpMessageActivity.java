package com.example.troubleshooter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PopUpMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_message);
        Button goToSuspiciousMessageButton = findViewById(R.id.suspiciousMessages);
        goToSuspiciousMessageButton.setOnClickListener(v -> goToSuspiciousMessageActivity());
    }

    private void goToSuspiciousMessageActivity() {
        Intent intent = new Intent(PopUpMessageActivity.this, SuspiciousMessageActivity.class);
        startActivity(intent);
    }

}