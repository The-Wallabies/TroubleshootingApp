package com.example.troubleshooter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class UpdatePhoneActivity extends AppCompatActivity {

    Button prevButton, nextButton;
    ImageView myImage;
    TextView stepCounterText;
    public int imageCount = 1;
    public static final int NUMBER_OF_IMAGES = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_phone);
        Button goToSettingsButton = findViewById(R.id.settings);
        goToSettingsButton.setOnClickListener((View v) -> {
            goToSettings();
        });
        myImage = (ImageView) findViewById(R.id.updatePhoneImages);
        myImage.setImageResource(R.drawable.settings_button_image);

        stepCounterText = findViewById(R.id.stepCounter);

        prevButton = (Button) findViewById(R.id.button1);
        nextButton = (Button) findViewById(R.id.button2);

        prevButton.setOnClickListener(v -> checkButton(v));
        nextButton.setOnClickListener(v -> checkButton(v));
    }

    public void checkButton(View v) {

        switch (v.getId()){
            case R.id.button1:
                imageCount++;

                if(imageCount == NUMBER_OF_IMAGES +1)
                {
                    imageCount = NUMBER_OF_IMAGES;
                }
                changeImage();
                break;

            case R.id.button2:
                imageCount--;

                if(imageCount == -1)
                {
                    imageCount = 0;
                }
                changeImage();
                break;
        }
    }

    public void changeImage() {
        myImage = (ImageView) findViewById(R.id.updatePhoneImages);

        switch (imageCount) {

            case 0:
                myImage.setImageResource(R.drawable.settings_button_image);
                stepCounterText.setText("Step 1");
                break;

            case 1:
                myImage.setImageResource(R.drawable.install_update_02);
                stepCounterText.setText("Step 2");
                break;
            case 2:
                myImage.setImageResource(R.drawable.install_update_03);
                stepCounterText.setText("Step 3");
                break;
            case 3:
                myImage.setImageResource(R.drawable.install_update_04);
                stepCounterText.setText("Step 4");
                break;
        }
    }

    private void goToSettings() {
        startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
    }
}