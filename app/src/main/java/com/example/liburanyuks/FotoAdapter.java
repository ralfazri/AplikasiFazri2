package com.example.liburanyuks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class FotoAdapter extends RecyclerView.Adapter<FotoAdapter.GridViewHolder> {
    private ArrayList<Destinasi> listDestinasi;
    private OnItemClickCallBack onItemClickCallBack;

    void setOnItemClickCallBack(OnItemClickCallBack onItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack;
    }

    FotoAdapter(ArrayList<Destinasi> list){
        this.listDestinasi = list;
    }

    @NonNull
    @Override
    public FotoAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fotowisata, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final FotoAdapter.GridViewHolder holder, int position){
        Glide.with(holder.itemView.getContext())
                .load(listDestinasi.get(position).getFotoDestinasi())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onItemClickCallBack.onItemClicked(listDestinasi.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount(){
        return listDestinasi.size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;

        GridViewHolder(View itemView){
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_wisata);
        }
    }

    public interface OnItemClickCallBack{
        void onItemClicked(Destinasi data);
    }
}
