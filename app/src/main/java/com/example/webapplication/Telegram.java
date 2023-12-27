package com.example.webapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Telegram extends AppCompatActivity {

    String url = "https://web.telegram.org/k/";

    WebView Telegram;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telegram);

        Telegram = findViewById(R.id.Telegram);
        WebSettings settings = Telegram.getSettings();
        settings.setJavaScriptEnabled(true);
        Telegram.loadUrl(url);
    }
}