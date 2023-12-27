package com.example.webapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class whatsapp extends AppCompatActivity {

    String url = "https://web.whatsapp.com/";

    WebView whatsapp;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);

        whatsapp = findViewById(R.id.whatsapp);
        WebSettings settings = whatsapp.getSettings();
        settings.setJavaScriptEnabled(true);
        whatsapp.loadUrl(url);
    }
}