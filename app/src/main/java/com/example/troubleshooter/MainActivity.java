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
        Button deviceButton = findViewById(R.id.device_issues);
        Button suspiciousMessageButton = findViewById(R.id.pop_up_messages);
        Button glossaryButton = findViewById(R.id.glossary);
        Button restartButton = findViewById(R.id.restartButton);
        glossaryButton.setOnClickListener(v -> goToGlossaryActivity());

        restartButton.setOnClickListener(v -> {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Restarting your phone!");
            builder.setMessage("Before trying any of the troubleshooting steps outlined further, it is best to try restarting your phone. It can help the system clear up some memory so that it has more room to run faster and do the things you need quicker.");
            builder.setPositiveButton("OK", (dialog, which) -> {
                dialog.cancel();
            });
            builder.setCancelable(false);
            builder.show();

        });

        connectivityButton.setOnClickListener(v -> goToConnectivity());
        deviceButton.setOnClickListener(v -> goToDeviceActivity());
        suspiciousMessageButton.setOnClickListener(v -> goToPopUpMessageActivity());
    }



    private void goToConnectivity() {
        Intent intent = new Intent(MainActivity.this, ConnectivityActivity.class);
        startActivity(intent);
    }

    private void goToDeviceActivity() {
        Intent intent = new Intent(MainActivity.this, DeviceActivity.class);
        startActivity(intent);
    }

    private void goToPopUpMessageActivity() {
        Intent intent = new Intent(MainActivity.this, PopUpMessageActivity.class);
        startActivity(intent);
    }

    private void goToGlossaryActivity() {
        Intent intent = new Intent(MainActivity.this, GlossaryActivity.class);
        startActivity(intent);
    }
}