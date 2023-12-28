package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Linkedin extends AppCompatActivity {

    String url = "https://in.linkedin.com/https://in.linkedin.com/";

    WebView Linkedin ;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedin);

        Linkedin = findViewById(R.id.Linkedin);
        WebSettings settings = Linkedin.getSettings();
        settings.setJavaScriptEnabled(true);
        Linkedin.loadUrl(url);
    }
}