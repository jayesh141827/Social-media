package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Snapchat extends AppCompatActivity {
    String url = "https://www.snapchat.com/";

    WebView Snapchat;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snapchat);

        Snapchat = findViewById(R.id.Snapchat);
        WebSettings settings = Snapchat.getSettings();
        settings.setJavaScriptEnabled(true);
        Snapchat.loadUrl(url);
    }
}