package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Drive extends AppCompatActivity {

    String url = "https://accounts.google.com/v3/signin/ide" +
            "ntifier?continue=https%3A%2F%2Fdrive.google.com%2Fdr" +
            "ive%2Fmy-drive&followup=https%3A%2F%2Fdrive.google.com%2Fdr" +
            "ive%2Fmy-drive&ifkv=ASKXGp0zXV7-gOdRek9_7klnRGa006K0BZ30t4Lg6SgQvjbGN" +
            "92bLJRygELBOrR7VQBV-0IoEwLRlA&osid=1&passive=1209600&service=wise&flowName=Gli" +
            "fWebSignIn&flowEntry=ServiceLogin&dsh=S-1257497254%3A1703666320708527&theme=glif";

    WebView Drive;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive);

        Drive = findViewById(R.id.Drive);
        WebSettings settings = Drive.getSettings();
        settings.setJavaScriptEnabled(true);
        Drive.loadUrl(url);
    }
}