package com.example.mad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class batteryswap extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batteryswap);

        Button button = findViewById(R.id.button11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(batteryswap.this, evs.class);
                startActivity(intent);
            }
        });

        TextView txt = findViewById(R.id.address5);
        txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "Sun Mobility Charging Station";  // Replace with the desired location

                // Create an Intent with the location data
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(location));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");  // Specify the package name of the maps application

                // Check if there is a maps application available to handle the intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    // Start the maps application
                    startActivity(mapIntent);
                }
                else{
                    startActivity(mapIntent);
                }
            }
        });

        TextView txt2 = findViewById(R.id.address6);
        txt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "Kazam Charging Station";  // Replace with the desired location

                // Create an Intent with the location data
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(location));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");  // Specify the package name of the maps application

                // Check if there is a maps application available to handle the intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    // Start the maps application
                    startActivity(mapIntent);
                }
            }
        });

        TextView txt3 = findViewById(R.id.address7);
        txt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "YULU";  // Replace with the desired location

                // Create an Intent with the location data
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(location));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");  // Specify the package name of the maps application

                // Check if there is a maps application available to handle the intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    // Start the maps application
                    startActivity(mapIntent);
                }
            }
        });

        TextView txt4 = findViewById(R.id.address8);
        txt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "TATA Charging Station";  // Replace with the desired location

                // Create an Intent with the location data
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(location));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");  // Specify the package name of the maps application

                // Check if there is a maps application available to handle the intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    // Start the maps application
                    startActivity(mapIntent);
                }
            }
        });

        TextView t5 = findViewById(R.id.contact5);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = t5.getText().toString().trim();

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));

                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        TextView t6 = findViewById(R.id.contact6);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = t6.getText().toString().trim();

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));

                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        TextView t7 = findViewById(R.id.contact7);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = t7.getText().toString().trim();

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));

                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        TextView t8 = findViewById(R.id.contact8);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = t8.getText().toString().trim();

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));

                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });
    }
}
