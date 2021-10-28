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

        Button wifiButton = findViewById(R.id.wifiButton);
        Button bluetoothButton = findViewById(R.id.bluetoothButton);

        wifiButton.setOnClickListener(v -> goToWifi());
        bluetoothButton.setOnClickListener(v -> goToBluetooth());



    }


    private void goToWifi() {
        Intent intent = new Intent(ConnectivityActivity.this, WifiActivity.class);
        startActivity(intent);
    }

    private void goToBluetooth() {
        Intent intent = new Intent(ConnectivityActivity.this, BluetoothActivity.class);
        startActivity(intent);
    }

}