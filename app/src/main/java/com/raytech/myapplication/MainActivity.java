package com.raytech.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtDeger;
    Button btnGonder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtDeger = findViewById(R.id.edt_ad_alani);
        btnGonder = findViewById(R.id.btn_gonder);
        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String veri = edtDeger.getText().toString();
                if (veri == null || veri.equals("")) {
                    Toast.makeText(getApplicationContext(), "Değer Giriniz", Toast.LENGTH_LONG).show();
                } else {
                    Intent git = new Intent(MainActivity.this, BilgilerActivity.class);
                    git.putExtra("DegerExtra", veri);
                    startActivity(git);
                }
                //ctrl + alt + L

            }
        });
    }
}