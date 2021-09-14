package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class belajar extends AppCompatActivity {

    EditText nama, nim, hobby;
    Button simpan;
    TextView hasil;
    String nama1, nim1, hobby1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        nama = findViewById(R.id.nama);
        nim = findViewById(R.id.nim);
        hobby = findViewById(R.id.hobby);
        simpan = findViewById(R.id.simpan);
        hasil = findViewById(R.id.hasil);

    }

    public void simpan(View view) {

        nama1 = nama.getText().toString();
        nim1 = nim.getText().toString();
        hobby1 = hobby.getText().toString();

        hasil.setText("Nama : " + nama1 + "\n" + "Nim : " + nim1 + "\n" + "Hobby : " + hobby1);

    }
}
