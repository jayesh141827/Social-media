package com.example.webapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Hotstar extends AppCompatActivity {

    String url = "https://www.hotstar.com/in/paywall?ref=%2Fin";

    WebView Hotstar;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotstar);

        Hotstar = findViewById(R.id.Hotstar);
        WebSettings settings = Hotstar.getSettings();
        settings.setJavaScriptEnabled(true);
        Hotstar.loadUrl(url);
    }
}