package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Gpay extends AppCompatActivity {

    String url = "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fpay.google.com%2Fgp%2Fw%2Fu%2F0%2Fhome%2Fsignup&followup=https%3A%2F%2Fpay.google.com%2Fgp%2Fw%2Fu%2F0%2Fhome%2Fsignup&ifkv=ASKXGp3QAxNDIu7aX-TUAIYo4dCwUb-S39qnGMyzrss_Wc3D6ZnWgLt7gIIwwtxyPvSVoEfHRIhq&osid=1&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1141780437%3A1703666894207496&theme=glif";

    WebView Gpay;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpay);

        Gpay = findViewById(R.id.Gpay);
        WebSettings settings = Gpay.getSettings();
        settings.setJavaScriptEnabled(true);
        Gpay.loadUrl(url);
    }
}