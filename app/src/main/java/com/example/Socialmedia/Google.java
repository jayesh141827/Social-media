package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Google extends AppCompatActivity {

    String url = "https://www.google.co.in/";

    WebView Google;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        Google = findViewById(R.id.Google);
        WebSettings settings = Google.getSettings();
        settings.setJavaScriptEnabled(true);
        Google.loadUrl(url);
    }
}