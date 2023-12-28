package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Github extends AppCompatActivity {

    String url = "https://github.com/login";

    WebView Github;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        Github = findViewById(R.id.Github);
        WebSettings settings = Github.getSettings();
        settings.setJavaScriptEnabled(true);
        Github.loadUrl(url);
    }
}