package com.example.android.guitarroom;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToCall(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+306944694334"));
        startActivity(callIntent);
    }

    public void goToWebsite(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.guitarroom.gr"));
        startActivity(browserIntent);
    }

    public void showMap(View view) {
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/?api=1&query=Guitar+Room%2C+Mikinon%2C+Thessaloniki"));
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
}
