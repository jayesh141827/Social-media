package com.example.webapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Twitter extends AppCompatActivity {

    String url = "https://twitter.com/i/flow/login";

    WebView twitter;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        twitter = findViewById(R.id.twitter);
        WebSettings settings = twitter.getSettings();
        settings.setJavaScriptEnabled(true);
        twitter.loadUrl(url);
    }
}