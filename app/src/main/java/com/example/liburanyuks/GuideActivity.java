package com.example.liburanyuks;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GuideActivity extends AppCompatActivity {

    private RecyclerView rvGuide;
    private ArrayList<Guide> list = new ArrayList<>();


    @Override
    protected void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        rvGuide = findViewById(R.id.rvGuide);
        rvGuide.setHasFixedSize(true);

        list.addAll(GuideData.getListData());
        showGuide();
    }

    protected void showGuide(){
        rvGuide.setLayoutManager(new LinearLayoutManager(this));
        GuideAdapter guideAdapter = new GuideAdapter(list);
        rvGuide.setAdapter(guideAdapter);

        guideAdapter.setOnItemClickCallBack(new GuideAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(int ImageView, String nama, String namaPanjang, String title, String gender, String umur, String detail, String nomer) {
                Intent intent= new Intent(GuideActivity.this,GuideDetail.class);
                intent.putExtra("Image", ImageView);
                intent.putExtra("Nama", nama);
                intent.putExtra("NamaP", namaPanjang);
                intent.putExtra("Title", title);
                intent.putExtra("Gender", gender);
                intent.putExtra("Umur", umur);
                intent.putExtra("Detail", detail);
                intent.putExtra("Nomer", nomer);
                intent.putExtras(intent);
                startActivity(intent);
            }
        });
    }

}
