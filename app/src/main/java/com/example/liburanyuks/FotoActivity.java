package com.example.liburanyuks;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FotoActivity extends AppCompatActivity {

    private RecyclerView rvFoto;
    private ArrayList<Destinasi> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceSate){
        super.onCreate(savedInstanceSate);
        setContentView(R.layout.activity_foto);

        rvFoto = findViewById(R.id.rvFoto);
        rvFoto.setHasFixedSize(true);
        list.addAll((DestinasiData.getListDataDestinasi()));
        showFotoList();


    }

    private void showFotoList(){
        rvFoto.setLayoutManager(new GridLayoutManager(this,2));
        FotoAdapter fotoAdapter = new FotoAdapter(list);
        rvFoto.setAdapter(fotoAdapter);

        fotoAdapter.setOnItemClickCallBack(new FotoAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Destinasi data) {
                showSelectFotoList(data);
            }
        });
    }

    protected void showSelectFotoList(Destinasi data){
        Toast.makeText(this,"Nama Tempat : " + data.getName()+", " + "Lokasi : " +data.getKotaDestinasi() + ", Ayo pilih destinasi wisatamu! " , Toast.LENGTH_SHORT).show();

    }
}
