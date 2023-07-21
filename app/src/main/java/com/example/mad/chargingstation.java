package com.example.mad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class chargingstation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chargingstation);

        Button button = findViewById(R.id.button12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chargingstation.this, evs.class);
                startActivity(intent);
            }
        });

        TextView txt = findViewById(R.id.address1);
        txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "Bescom Charging Station";  // Replace with the desired location

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

        TextView txt2 = findViewById(R.id.address2);
        txt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "AtherGrid Charging Station";  // Replace with the desired location

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

        TextView txt3 = findViewById(R.id.address3);
        txt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "Electro Charging Point";  // Replace with the desired location

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

        TextView txt4 = findViewById(R.id.address4);
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

        TextView t1 = findViewById(R.id.contact1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = t1.getText().toString().trim();

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));

                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        TextView t2 = findViewById(R.id.contact2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = t2.getText().toString().trim();

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));

                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        TextView t3 = findViewById(R.id.contact3);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = t3.getText().toString().trim();

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));

                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        TextView t4 = findViewById(R.id.contact4);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = t4.getText().toString().trim();

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));

                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });
    }
}
