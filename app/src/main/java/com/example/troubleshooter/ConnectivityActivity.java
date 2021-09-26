package com.example.troubleshooter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ConnectivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connectivity);

        Button simCardButton = findViewById(R.id.simCardButton);

        simCardButton.setOnClickListener(v -> goToSimCard());
    }

    private void goToSimCard() {
        Intent intent = new Intent(ConnectivityActivity.this, SimCardActivity.class);
        startActivity(intent);
    }

}