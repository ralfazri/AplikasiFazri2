package com.example.liburanyuks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class GuideDetail extends AppCompatActivity {

    private TextView nama, namaPanjang, title, gender, umur, detail, nomer;
    private ImageView image;
    int imagenya;

    @Override
    protected void onCreate(Bundle savedinstanceState){
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_detail);

        image = findViewById(R.id.imgGuideDetail);
        nama = findViewById(R.id.namaPanggilan_guide);
        namaPanjang = findViewById(R.id.namaPanjang_guide);
        title = findViewById(R.id.dataSingkat_guide);
        gender = findViewById(R.id.tvGender);
        umur = findViewById(R.id.tvUmur);
        detail = findViewById(R.id.tvdeskripsi_guide);
        nomer = findViewById(R.id.tvNomer);


        nomer.setText(getIntent().getStringExtra("Nomer"));
        imagenya = getIntent().getIntExtra("Image", 0);
        image.setImageResource(imagenya);
        nama.setText(getIntent().getStringExtra("Nama"));
        namaPanjang.setText(getIntent().getStringExtra("NamaP"));
        title.setText(getIntent().getStringExtra("Title"));
        gender.setText(getIntent().getStringExtra("Gender"));
        umur.setText(getIntent().getStringExtra("Umur"));
        detail.setText(getIntent().getStringExtra("Detail"));
    }
}
