package com.example.webapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Flipcart extends AppCompatActivity {
    String url = "https://www.flipkart.com/";

    WebView Flipcart;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipcart);

        Flipcart = findViewById(R.id.Flipcart);
        WebSettings settings = Flipcart.getSettings();
        settings.setJavaScriptEnabled(true);
        Flipcart.loadUrl(url);
    }
}