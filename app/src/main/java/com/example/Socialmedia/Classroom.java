package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Classroom extends AppCompatActivity {

    String url = "https://classroom.google.com/h" +
            "";

    WebView Classroom;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classroom);

        Classroom = findViewById(R.id.Classroom);
        WebSettings settings = Classroom.getSettings();
        settings.setJavaScriptEnabled(true);
        Classroom.loadUrl(url);
    }
}