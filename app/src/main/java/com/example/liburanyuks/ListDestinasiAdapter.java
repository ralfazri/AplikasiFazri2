package com.example.liburanyuks;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListDestinasiAdapter extends RecyclerView.Adapter<ListDestinasiAdapter.ListViewHolder> {

    private ArrayList<Destinasi> listDestinasi;
    private OnItemClickCallBack onItemClickCallBack;
    private Context context;

    void setOnItemClickCallBack(OnItemClickCallBack onItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack;
    }

    ListDestinasiAdapter(ArrayList<Destinasi> list) { this.listDestinasi = list; }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_destinasi, viewGroup, false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position){
        final Destinasi destinasi = listDestinasi.get(position);

        Glide.with(holder.itemView.getContext())
                .load(destinasi.getFotoDestinasi())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgFotoDestinasi);

        holder.tvNamaDestinasi.setText(destinasi.getName());
        holder.tvKotaDestinasi.setText(destinasi.getKotaDestinasi());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onItemClickCallBack.onItemClicked(destinasi.getFotoDestinasi(),destinasi.getName(),destinasi.getKotaDestinasi(),destinasi.getTentangDestinasi(),destinasi.getHotelDestinasi(),destinasi.getPaketDestinasi(),destinasi.getDetailDestinasi(),destinasi.getRating());
            }
        });
    }

    @Override
    public int getItemCount() { return listDestinasi.size(); }



    class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgFotoDestinasi;
        TextView tvNamaDestinasi, tvKotaDestinasi;

        ListViewHolder(View itemView){
            super(itemView);
            imgFotoDestinasi = itemView.findViewById(R.id.img_item_photoDestinasi);
            tvNamaDestinasi = itemView.findViewById(R.id.tv_item_nameDestinasi);
            tvKotaDestinasi = itemView.findViewById(R.id.tv_item_detailDestinasi);
        }
    }

    public interface OnItemClickCallBack{
        void onItemClicked(int ImageView,String nama, String kota, String tentang, String hotel, String paket, String detail, int rating);
    }




}
