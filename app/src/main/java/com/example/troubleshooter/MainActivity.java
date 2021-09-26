package com.example.troubleshooter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button connectivityButton = findViewById(R.id.connectivity);

        connectivityButton.setOnClickListener(v -> {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Restarting your phone!");
            builder.setMessage("Before trying any of the troubleshooting steps outlined further, it is best to try restarting your phone");
            builder.setPositiveButton("OK", (dialog, which) -> {
                goToConnectivity();
            });
            builder.setCancelable(false);
            builder.show();

        });
    }

    private void goToConnectivity() {
        Intent intent = new Intent(MainActivity.this, ConnectivityActivity.class);
        startActivity(intent);
    }
}