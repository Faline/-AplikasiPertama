package edu.uph.m23si3.falineapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KalkulatorSederhanaActivity extends AppCompatActivity {
    public double tambahnilai(int angka1, int angka2) {
        return (angka1 + angka2);
    }

    public double kalinilai(int angka1, int angka2) {
        return (angka1 * angka2);
    }

    public double baginilai(int angka1, int angka2) {
        return (angka1 / angka2);
    }

    EditText edtAngka1, edtAngka2;
    Button btnTambah, btnKali, btnBagi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator_sederhana);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edtAngka1 = findViewById(R.id.edtAngka1);
        edtAngka2 = findViewById(R.id.edtAngka2);
        btnTambah = findViewById(R.id.btnTambah);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        txtHasil = findViewById(R.id.txtHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt(edtAngka1.getText().toString());
                int angka2 = Integer.parseInt(edtAngka2.getText().toString());

                // hitung penjumlahan
                double hasiljumlah = tambahnilai(angka1, angka2);

                txtHasil.setText(String.valueOf((int)hasiljumlah));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt(edtAngka1.getText().toString());
                int angka2 = Integer.parseInt(edtAngka2.getText().toString());

                // hitung perkalian
                double hasilkali = kalinilai(angka1, angka2);

                txtHasil.setText(String.valueOf((int) hasilkali));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt((edtAngka1.getText().toString()));
                int angka2 = Integer.parseInt((edtAngka2.getText().toString()));

                // hitung pembagian
                double hasilbagi = baginilai(angka1, angka2);

                txtHasil.setText(String.valueOf((int) hasilbagi));
            }
        });
    }
}