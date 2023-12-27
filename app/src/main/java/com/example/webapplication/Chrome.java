package com.example.webapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Chrome extends AppCompatActivity {

    String url = "https://www.google.com/chrome/";

    WebView Chrome;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chrome);

        Chrome = findViewById(R.id.chrome);
        WebSettings settings = Chrome.getSettings();
        settings.setJavaScriptEnabled(true);
        Chrome.loadUrl(url);
    }
}