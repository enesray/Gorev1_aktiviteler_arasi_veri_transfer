package com.raytech.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BilgilerActivity extends AppCompatActivity {
    TextView txtBilgiler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgiler);
        txtBilgiler = findViewById(R.id.txt_bilgiler);
        Intent veriAl = getIntent();
        String alinanDeger = veriAl.getStringExtra("DegerExtra");
        if (alinanDeger == null || alinanDeger.equals("")) {
            txtBilgiler.setText("Değer Girilmemiştir.");
        } else {
            txtBilgiler.setText("Girdiğiniz Değer:  " + alinanDeger);
            //ctrl + shif + v
        }

    }
}