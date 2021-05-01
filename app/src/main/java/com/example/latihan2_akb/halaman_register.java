package com.example.latihan2_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class halaman_register extends AppCompatActivity {

    //Identitas diri
    //Nama               : Tegar Lucky Oakley
    //Kelas              : IF-2
    //Nim                : 10118066
    //Tanggal Pengerjaan : 01 Mei 2021

    public void pindah2(View view){

        Intent intent = new Intent(this, halaman_verify.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_register);

        Intent intent = getIntent();

        Spinner spinner1 =findViewById(R.id.spiner1);
        Spinner spinner2 =findViewById(R.id.spiner2);
        Spinner spinner3 =findViewById(R.id.spiner3);

    }
}