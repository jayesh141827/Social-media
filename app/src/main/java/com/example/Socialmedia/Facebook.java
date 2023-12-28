package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Facebook extends AppCompatActivity {


    String url = "https://www.facebook.com/login/";

    WebView Facebook;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        Facebook = findViewById(R.id.Facebook);
        WebSettings settings = Facebook.getSettings();
        settings.setJavaScriptEnabled(true);
        Facebook.loadUrl(url);
    }
}