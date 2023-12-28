package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Groww extends AppCompatActivity {

    String url = "https://groww.in/";

    WebView Groww;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groww);

        Groww = findViewById(R.id.Groww);
        WebSettings settings = Groww.getSettings();
        settings.setJavaScriptEnabled(true);
        Groww.loadUrl(url);
    }
}
