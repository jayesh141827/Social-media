package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Spotify extends AppCompatActivity {
    String url = "https://open.spotify.com/";

    WebView Spotify;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotify);

        Spotify = findViewById(R.id.Spotify);
        WebSettings settings = Spotify.getSettings();
        settings.setJavaScriptEnabled(true);
        Spotify.loadUrl(url);
    }
}