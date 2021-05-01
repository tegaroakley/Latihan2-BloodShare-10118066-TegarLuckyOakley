package com.example.latihan2_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class halaman_verify extends AppCompatActivity {

    //Identitas diri
    //Nama               : Tegar Lucky Oakley
    //Kelas              : IF-2
    //Nim                : 10118066
    //Tanggal Pengerjaan : 01 Mei 2021

    public void pindah3(View view){

        Intent intent = new Intent(this, halaman_send_verify.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_verify);

        Intent intent = getIntent();

    }
}