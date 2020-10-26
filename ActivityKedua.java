package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    TextView tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        tampil = findViewById(R.id.hasil);

        if (getIntent().getExtras()!= null){

            Bundle b = getIntent().getExtras();
            String nama = getIntent().getStringExtra("nama");
            String nim = getIntent().getStringExtra("nim");
            String nohp = getIntent().getStringExtra("nohp");
            String email = getIntent().getStringExtra("email");
            String radio = getIntent().getStringExtra("radio");
            String setuju = getIntent().getStringExtra("setuju");
            tampil.setText(   "Nama : " + nama + System.lineSeparator() +
                    "NIM : " + nim + System.lineSeparator() +
                    "No HP : " + nohp + System.lineSeparator() +
                    "Email : " + email + System.lineSeparator() +
                    "Jenis Test : " + radio + System.lineSeparator() +
                    "Sudah Memeriksa Isian :" + setuju
            );
        }
    }
}