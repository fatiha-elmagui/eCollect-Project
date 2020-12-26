package com.example.egreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.egreen.Entreprise.notification;
import com.example.egreen.Geolocalisation.Gelocalisation;

public class Principale extends AppCompatActivity {
    Button geoloco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principale);
        geoloco=findViewById(R.id.geo);
        geoloco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Principale.this, Gelocalisation.class));

            }
        });
    }

    public void onclick(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }

    public void myClick(View view) {
        startActivity(new Intent(this, notification.class));

    }

}
