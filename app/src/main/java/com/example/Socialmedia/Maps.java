package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Maps extends AppCompatActivity {

    String url = "https://www.google.com/maps/@21.2403471,72.8869815,15z?entry=ttu";

    WebView Maps ;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Maps = findViewById(R.id.Maps);
        WebSettings settings = Maps.getSettings();
        settings.setJavaScriptEnabled(true);
        Maps.loadUrl(url);
    }
}