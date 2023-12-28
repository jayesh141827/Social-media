package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class playmusic extends AppCompatActivity {

    String url = "https://music.youtube.com/googleplaymusic";

    WebView playmusic ;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playmusic);

        playmusic = findViewById(R.id.playmusic);
        WebSettings settings = playmusic.getSettings();
        settings.setJavaScriptEnabled(true);
        playmusic.loadUrl(url);
    }
}