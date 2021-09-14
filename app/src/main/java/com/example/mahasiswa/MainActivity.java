package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bsimpan;
    EditText enpm, enama, etempatlahir, etanggallahir;
    TextView thasil;
    RadioGroup rgjk;
    Spinner skelas, sagama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bsimpan = findViewById(R.id.simpan);
        enpm = findViewById(R.id.isinpm);
        enama = findViewById(R.id.isinama);
        thasil = findViewById(R.id.hasil);
        rgjk = findViewById(R.id.jk);
        skelas = findViewById(R.id.kelas);
        sagama  = findViewById(R.id.agama);
        etempatlahir = findViewById(R.id.tempatlahir);
        etanggallahir = findViewById(R.id.tanggallahir);

        bsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputnpm = enpm.getText().toString();
                String inputnama = enama.getText().toString();
                String inputtempatlahir = etempatlahir.getText().toString();
                String inputtanggallahir = etanggallahir.getText().toString();

                int gender = rgjk.getCheckedRadioButtonId();
                RadioButton jk = findViewById(gender);
                String inputjk = jk.getText().toString();

                thasil.setText("\n" + "NPM\t\t\t\t\t\t\t\t\t\t\t: " + inputnpm + "\n" +
                        "Nama\t\t\t\t\t\t\t\t\t\t: " + inputnama + "\n" +
                        "Jenis Kelamin\t\t: " + inputjk + "\n" +
                        "Kelas\t\t\t\t\t\t\t\t\t\t: " + skelas.getSelectedItem().toString() + "\n" +
                        "Agama\t\t\t\t\t\t\t\t\t: " + sagama.getSelectedItem().toString() + "\n" +
                        "Jenis Kelamin\t\t: " + inputtempatlahir + "\n" +
                        "Tanggal Lahir\t\t\t: " + inputtanggallahir + "\n");
            }
        });
    }
}
