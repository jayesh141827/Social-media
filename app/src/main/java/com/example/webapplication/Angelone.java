package com.example.webapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Angelone extends AppCompatActivity {

    String url = "https://www.angelone.in/";

    WebView Angelone;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angelone);

        Angelone = findViewById(R.id.Angelone);
        WebSettings settings = Angelone.getSettings();
        settings.setJavaScriptEnabled(true);
        Angelone.loadUrl(url);
    }
}