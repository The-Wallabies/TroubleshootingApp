package com.example.troubleshooter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DeviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);

        Button updateButton = findViewById(R.id.updateButton);
        Button spaceButton = findViewById(R.id.spaceButton);
        Button slowButton = findViewById(R.id.slowButton);
        Button batteryButton = findViewById(R.id.batteryButton);

        updateButton.setOnClickListener(v -> goToUpdate());
        spaceButton.setOnClickListener(v -> goToNoSpace());
        slowButton.setOnClickListener(v -> goToSlow());
        batteryButton.setOnClickListener(v -> goToBattery());

    }

    private void goToUpdate() {
        Intent intent = new Intent(DeviceActivity.this, UpdatePhoneActivity.class);
        startActivity(intent);
    }

    private void goToNoSpace() {
        Intent intent = new Intent(DeviceActivity.this, NoSpaceActivity.class);
        startActivity(intent);
    }
    private void goToSlow() {
        Intent intent = new Intent(DeviceActivity.this, SlowPhoneActivity.class);
        startActivity(intent);
    }

    private void goToBattery() {
        Intent intent = new Intent(DeviceActivity.this, BadBatteryActivity.class);
        startActivity(intent);
    }
}