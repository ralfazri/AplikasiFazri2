package com.example.liburanyuks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvDestinasi;

    SliderView sliderView;

    ViewPager viewPager;
    private ArrayList<Destinasi> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvDestinasi = findViewById(R.id.rv_destinasi);
        rvDestinasi.setHasFixedSize(true);
        list.addAll(DestinasiData.getListDataDestinasi());
        showRecyclerList();

        RelativeLayout profil =(RelativeLayout)findViewById(R.id.lyProfile);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                 startActivity(intent);
            }
        });

        RelativeLayout video = (RelativeLayout)findViewById(R.id.lyVideo);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,VideoActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout foto = (RelativeLayout)findViewById(R.id.lyFoto);
        foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FotoActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout guide = (RelativeLayout) findViewById(R.id.lyGuide);
        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GuideActivity.class);
                startActivity(intent);
            }
        });

        sliderView = findViewById(R.id.imageSliderAuto);

        final SliderAdapterExample adapter = new SliderAdapterExample(this);
        adapter.setCount(3);

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.SLIDE); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.CUBEINROTATIONTRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_RIGHT);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.startAutoCycle();

    }


    private void showRecyclerList(){
        rvDestinasi.setLayoutManager(new LinearLayoutManager(this));
        ListDestinasiAdapter listDestinasiAdapter = new ListDestinasiAdapter(list);
        rvDestinasi.setAdapter(listDestinasiAdapter);

        listDestinasiAdapter.setOnItemClickCallBack(new ListDestinasiAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(int ImageView, String nama ,String kota, String tentang, String hotel, String paket, String detail, int rating) {
                Destinasi destinasi;
                Intent intent = new Intent(MainActivity.this, DestinasiDetailActivity.class);
                intent.putExtra("IMAGE", ImageView);
                intent.putExtra("NAMA", nama);
                intent.putExtra("KOTA", kota);
                intent.putExtra("TENTANG", tentang);
                intent.putExtra("HOTEL", hotel);
                intent.putExtra("PAKET", paket);
                intent.putExtra("DETAIL", detail);
                intent.putExtra("RATING", rating);
                intent.putExtras(intent);
                startActivity(intent);
            }
        });
    }

    private boolean doubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finishAffinity();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, R.string.doubleBackPressConfirmation, Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
