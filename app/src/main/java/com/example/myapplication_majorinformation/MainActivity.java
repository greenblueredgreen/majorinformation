package com.example.myapplication_majorinformation;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mbtn_url;
    Button a;
    Button number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("학과정보");

        mbtn_url = findViewById(R.id.btn_url);

        number = findViewById(R.id.number);
        a = findViewById(R.id.btn_url2);

        mbtn_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hknu.ac.kr"));
                startActivity(urlintent);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hknu.ac.kr/sites/MajorofSoft/index.do"));
                startActivity(urlintent);
            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:031-670-5350"));
                startActivity(urlintent);
            }
        });





    }
}