package com.example.troubleshooter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class WifiActivity extends AppCompatActivity {

    Button prevButton, nextButton;
    ImageView myImage;
    TextView stepCounterText;
    public int imageCount = 1;
    public static final int NUMBER_OF_IMAGES = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
        Button goToSettingsButton = findViewById(R.id.settings);
        goToSettingsButton.setOnClickListener(v -> goToSettings());

        prevButton = (Button) findViewById(R.id.nextButton);
        nextButton = (Button) findViewById(R.id.prevButton);

        myImage = (ImageView) findViewById(R.id.wifiImages);
        myImage.setImageResource(R.drawable.settings_button_image);

        stepCounterText = findViewById(R.id.stepCounter);

        prevButton.setOnClickListener(this::checkButton);
        nextButton.setOnClickListener(this::checkButton);
    }

    public void checkButton(View v) {

        switch (v.getId()){
            case R.id.nextButton:
                imageCount++;

                if(imageCount == NUMBER_OF_IMAGES +1)
                {
                    imageCount = NUMBER_OF_IMAGES;
                }
                changeImage();
                break;

            case R.id.prevButton:
                imageCount--;

                if(imageCount == 0)
                {
                    imageCount = 1;
                }
                changeImage();
                break;
        }
    }

    public void changeImage() {
        myImage = (ImageView) findViewById(R.id.wifiImages);

        switch (imageCount) {

            case 1:
                myImage.setImageResource(R.drawable.settings_button_image);
                stepCounterText.setText("Step 1");
                break;

            case 2:
                myImage.setImageResource(R.drawable.no_internet_02);
                stepCounterText.setText("Step 2");
                break;
            case 3:
                myImage.setImageResource(R.drawable.no_internet_03);
                stepCounterText.setText("Step 3");
                break;
            case 4:
                myImage.setImageResource(R.drawable.no_internet_04);
                stepCounterText.setText("Step 4");
                break;
            case 5:
                myImage.setImageResource(R.drawable.no_internet_05);
                stepCounterText.setText("Step 5");
                break;
            case 6:
                myImage.setImageResource(R.drawable.no_internet_06);
                stepCounterText.setText("Step 6");
                break;
            case 7:
                myImage.setImageResource(R.drawable.no_internet_07);
                stepCounterText.setText("Step 7");
                break;
        }
    }

    private void goToSettings() {
        startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
    }
}