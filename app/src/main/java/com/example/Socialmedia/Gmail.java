package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Gmail extends AppCompatActivity {

    String url = "https://www.google.com/gmail/about/";

    WebView Gmail;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);

        Gmail = findViewById(R.id.Gmail);
        WebSettings settings = Gmail.getSettings();
        settings.setJavaScriptEnabled(true);
        Gmail.loadUrl(url);
    }
}