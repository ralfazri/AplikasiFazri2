package com.example.liburanyuks;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.annotation.Inherited;

public class DestinasiDetailActivity extends AppCompatActivity {

    private TextView nama, kota, tentang, hotel, paket, detail;
    private ImageView imageView;
    private RatingBar ratingBar;
    int rating;
    int gambarnya;

    LinearLayout textRating;


    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_destinasi);
        imageView = findViewById(R.id.imgDestinasi);
        nama = findViewById(R.id.titleDestinasi);
        kota = findViewById(R.id.kotaDestinasi);
        tentang = findViewById(R.id.tentangDestinasi);
        hotel = findViewById(R.id.hotelDestinasi);
        paket = findViewById(R.id.paketDestinasi);
        detail = findViewById(R.id.detailDestinasi);
        ratingBar = findViewById(R.id.ratingBar);

        gambarnya = getIntent().getIntExtra("IMAGE",0);
        imageView.setImageResource(gambarnya);
        nama.setText(getIntent().getStringExtra("NAMA"));
        kota.setText(getIntent().getStringExtra("KOTA"));
        tentang.setText(getIntent().getStringExtra("TENTANG"));
        hotel.setText(getIntent().getStringExtra("HOTEL"));
        paket.setText(getIntent().getStringExtra("PAKET"));
        detail.setText(getIntent().getStringExtra("DETAIL"));
        rating = getIntent().getIntExtra("RATING", 0);
        ratingBar.setRating(rating);
        ratingBar.setFocusable(false);
        ratingBar.setIsIndicator(true);

        Button klik = (Button) findViewById(R.id.btnPilih);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Kamu telah memilih destinasi ini untuk booking", Toast.LENGTH_SHORT).show();
            }
        });

        textRating = (LinearLayout) findViewById(R.id.deskRatingText);

        final LinearLayout valueRating= (LinearLayout) findViewById(R.id.valueRating);
        textRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueRating.getVisibility() == View.VISIBLE){
                    valueRating.setVisibility(View.GONE);
                }else {
                    valueRating.setVisibility(View.VISIBLE);
                }
            }
        });

    }


}
