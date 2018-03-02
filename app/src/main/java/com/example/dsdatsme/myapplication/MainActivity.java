package com.example.dsdatsme.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String url = "www.udacity.com";
    private String phoneNumber = "650555555";
    Uri maps = Uri.parse("geo:37.4001293,-122.1105186?q=Udacity,+Latham,+CA");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMapsIntent(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(maps);
        startActivity(intent);

    }

    public void openDialer(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        startActivity(intent);


    }

    public void openBrowser(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
}
