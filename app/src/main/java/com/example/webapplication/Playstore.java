package com.example.webapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Playstore extends AppCompatActivity {
    String url = "https://play.google.com/store/games?device=windows&utm" +
            "_source=apac_med&hl=en-IN&utm_medium=hasem&utm_content=Jun1223&" +
            "utm_campaign=Evergreen&pcampaignid=MKT-EDR-apac-in-1003227-med-hasem-py-Evergreen-" +
            "Jun1223-Text_Search_BKWS-BKWS%7CONSEM_kwid_43700076783011871_creativeid_662052581180_device" +
            "_c&gclid=Cj0KCQiAkKqsBhC3ARIsAEEjuJjgjhyV7j6ApEp5OFQJ_QhmvoPePAxaZH9BAhgbnOtscv2qDd7ns1AaAo8sEALw_wcB&gclsrc=aw.ds";

    WebView Playstore;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playstore);

        Playstore = findViewById(R.id.Playstore);
        WebSettings settings = Playstore.getSettings();
        settings.setJavaScriptEnabled(true);
        Playstore.loadUrl(url);
    }
}