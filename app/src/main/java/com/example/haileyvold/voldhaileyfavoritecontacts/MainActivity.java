package com.example.haileyvold.voldhaileyfavoritecontacts;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCallIzzy, btnCallTrace, btnCallMom;
    Button btnTextIzzy, btnTextTrace, btnTextMom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButtonClickEvents();
    }

    private void setupButtonClickEvents() {

        // ----- CALL -----

        btnCallIzzy = (Button) findViewById(R.id.buttonCallIzzy);
        btnCallIzzy.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   {
                      Intent phoneIntent = new Intent(Intent.ACTION_CALL);
                      phoneIntent.setData(Uri.parse("tel:1231231574"));
                      if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                             startActivity(phoneIntent);
                      }
                   }
               }
        });

        btnCallTrace = (Button) findViewById(R.id.buttonCallTrace);
        btnCallTrace.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    {
                        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
                        phoneIntent.setData(Uri.parse("tel:5621841453"));
                        if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(phoneIntent);
                        }
                    }
                }

        });

        btnCallMom = (Button) findViewById(R.id.buttonCallMom);
        btnCallMom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                {
                    Intent phoneIntent = new Intent(Intent.ACTION_CALL);
                    phoneIntent.setData(Uri.parse("tel:7237026573"));
                    if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(phoneIntent);
                    }
                }
            }

        });

        btnTextIzzy = (Button) findViewById(R.id.buttonTextIzzy);
        btnTextIzzy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                {
                    Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                    sendIntent.setData(Uri.parse("sms:1231231574"));
                    sendIntent.putExtra("sms_body", "Hi");
                    startActivity(sendIntent);
                }
            }
    });

        // ----- TEXT -----

        btnTextTrace = (Button) findViewById(R.id.buttonTextTrace);
        btnTextTrace.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                {
                    Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                    sendIntent.setData(Uri.parse("sms:5621841453"));
                    sendIntent.putExtra("sms_body", "Hi");
                    startActivity(sendIntent);
                }
            }
        });
        btnTextMom = (Button) findViewById(R.id.buttonTextMom);
        btnTextMom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                {
                    Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                    sendIntent.setData(Uri.parse("sms:7237026573"));
                    sendIntent.putExtra("sms_body", "Hi");
                    startActivity(sendIntent);
                }
            }
        });

    }
}
