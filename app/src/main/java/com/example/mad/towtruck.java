package com.example.mad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class towtruck extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.towtruck);

        Button button = findViewById(R.id.button17);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(towtruck.this, evs.class);
                startActivity(intent);
            }
        });

        TextView txt = findViewById(R.id.address13);
        txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "Quick Towing Services";  // Replace with the desired location

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

        TextView txt2 = findViewById(R.id.address14);
        txt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "Reliable Roadside Assistance";  // Replace with the desired location

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

        TextView txt3 = findViewById(R.id.address15);
        txt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "VK Towing Service";  // Replace with the desired location

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

        TextView txt4 = findViewById(R.id.address16);
        txt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "Maruti Towing Service";  // Replace with the desired location

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

        for (int i = 13; i <= 16; i++) {
            int textViewId = getResources().getIdentifier("contact" + i, "id", getPackageName());
            TextView textView = findViewById(textViewId);

            final String phoneNumber = textView.getText().toString().trim();

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:" + phoneNumber));

                    if (callIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(callIntent);
                    }
                }
            });
        }
    }
}