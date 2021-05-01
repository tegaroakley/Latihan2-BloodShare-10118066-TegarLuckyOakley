package com.example.latihan2_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class halaman_Identitas extends AppCompatActivity {

    //Identitas diri
    //Nama               : Tegar Lucky Oakley
    //Kelas              : IF-2
    //Nim                : 10118066
    //Tanggal Pengerjaan : 01 Mei 2021
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman__identitas);

        Intent intent = getIntent();

    }
}