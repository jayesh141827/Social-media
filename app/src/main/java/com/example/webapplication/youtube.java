package com.example.webapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class youtube extends AppCompatActivity {


     String url = "https://www.youtube.com/";

    WebView youtube;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        youtube = findViewById(R.id.youtube);
        WebSettings settings = youtube.getSettings();
        settings.setJavaScriptEnabled(true);
        youtube.loadUrl(url);
    }
}