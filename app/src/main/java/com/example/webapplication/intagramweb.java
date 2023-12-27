package com.example.webapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class intagramweb extends AppCompatActivity {

    String url = "https://www.instagram.com/accounts/login/";

    WebView instagramweb;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intagramweb);

        instagramweb = findViewById(R.id.instagramweb);
        WebSettings settings = instagramweb.getSettings();
        settings.setJavaScriptEnabled(true);
        instagramweb.loadUrl(url);
    }
}