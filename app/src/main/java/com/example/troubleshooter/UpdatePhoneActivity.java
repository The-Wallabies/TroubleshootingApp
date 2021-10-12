package com.example.troubleshooter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.sql.SQLOutput;

public class UpdatePhoneActivity extends AppCompatActivity {

    Button btprevious, btnext;
    ImageView myImage;
    public int imageCount = 0;
    public static final int NUMBEROFIMAGES = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_phone);
        Button goToSettingsButton = findViewById(R.id.settings);
        goToSettingsButton.setOnClickListener((View v) -> {
            goToSettings();
        });
        myImage = (ImageView) findViewById(R.id.updatePhoneImages);
        myImage.setImageResource(R.drawable.step01);


        btprevious = (Button) findViewById(R.id.button1);
        btnext = (Button) findViewById(R.id.button2);

        btprevious.setOnClickListener(v -> checkButton(v));
        btnext.setOnClickListener(v -> checkButton(v));

    }

    public void checkButton(View v) {

        switch (v.getId()){
            case R.id.button1:
                imageCount++;

                if(imageCount == NUMBEROFIMAGES +1)
                {
                    imageCount = NUMBEROFIMAGES;
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
                myImage.setImageResource(R.drawable.step01);
                break;

            case 1:
                myImage.setImageResource(R.drawable.step02);
                break;
        }
    }

    private void goToSettings() {
        startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
    }
}