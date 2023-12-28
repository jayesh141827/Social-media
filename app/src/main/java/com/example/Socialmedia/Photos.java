package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Photos extends AppCompatActivity {

    String url = "https://www.google.com/photos/about/";

    WebView Photos;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);

        Photos = findViewById(R.id.Photos);
        WebSettings settings = Photos.getSettings();
        settings.setJavaScriptEnabled(true);
        Photos.loadUrl(url);
    }
}