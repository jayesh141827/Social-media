package com.example.Socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView Instagram,Facebook,whatsapp,youtube,
            Twitter,Telegram,Playstore, Classroom,
            Chrome,Google,Gmail,Maps,
            Drive,Gpay,Hotstar, Flipcart
            ,Spotify,Github,Angelone,Groww
            ,Linkedin,playmusic,Photos,Snapchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Instagram = findViewById(R.id.Instagram);
        Facebook = findViewById(R.id.Facebook);
        whatsapp = findViewById(R.id.whatsapp);
        youtube = findViewById(R.id.youtube);
        Twitter = findViewById(R.id.Twitter);
        Telegram = findViewById(R.id.Telegram);
        Playstore = findViewById(R.id.Playstore);
        Classroom = findViewById(R.id.Classroom);
        Chrome = findViewById(R.id.Chrome);
        Google = findViewById(R.id.Google);
        Gmail = findViewById(R.id.Gmail);
        Maps = findViewById(R.id.Maps);
        Drive = findViewById(R.id.Drive);
        Gpay = findViewById(R.id.Gpay);
        Hotstar = findViewById(R.id.Hotstar);
        Flipcart = findViewById(R.id.Flipcart);
        Spotify = findViewById(R.id.Spotify);
        Github = findViewById(R.id.Github);
        Angelone = findViewById(R.id.Angelone);
        Groww = findViewById(R.id.Groww);
        Linkedin = findViewById(R.id.Linkedin);
        playmusic = findViewById(R.id.playmusic);
        Photos = findViewById(R.id.Photos);
        Snapchat = findViewById(R.id.Snapchat);


        Instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,intagramweb.class);
                startActivity(intent);
            }
        });
        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Facebook.class);
                startActivity(intent);
            }
        });
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,whatsapp.class);
                startActivity(intent);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,youtube.class);
                startActivity(intent);
            }
        });
        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Twitter.class);
                startActivity(intent);
            }
        });
        Telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Telegram.class);
                startActivity(intent);
            }
        });
        Playstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Playstore.class);
                startActivity(intent);
            }
        });
        Classroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Classroom.class);
                startActivity(intent);
            }
        });
        Chrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Chrome.class);
                startActivity(intent);
            }
        });
        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Google.class);
                startActivity(intent);
            }
        });
        Gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Gmail.class);
                startActivity(intent);
            }
        });
        Maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Maps.class);
                startActivity(intent);
            }
        });
        Drive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Drive.class);
                startActivity(intent);
            }
        });
        Gpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Gpay.class);
                startActivity(intent);
            }
        });
        Hotstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Hotstar.class);
                startActivity(intent);
            }
        });
        Flipcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Flipcart.class);
                startActivity(intent);
            }
        });
        Spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Flipcart.class);
                startActivity(intent);
            }
        });
        Github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Github.class);
                startActivity(intent);
            }
        });
        Angelone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Angelone.class);
                startActivity(intent);
            }
        });
        Groww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Groww.class);
                startActivity(intent);
            }
        });
        Linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Linkedin.class);
                startActivity(intent);
            }
        });
        playmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,playmusic.class);
                startActivity(intent);
            }
        });
        Photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Photos.class);
                startActivity(intent);
            }
        });
        Snapchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Snapchat.class);
                startActivity(intent);
            }
        });
    }
    }
