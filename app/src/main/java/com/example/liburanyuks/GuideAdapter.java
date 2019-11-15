package com.example.liburanyuks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.CardViewViewHolder> {
    private ArrayList<Guide> listGuide;
    private OnItemClickCallBack onItemClickCallBack;

    GuideAdapter(ArrayList<Guide> list ) { this.listGuide = list; }

    void setOnItemClickCallBack(GuideAdapter.OnItemClickCallBack onItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_guide, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position){
        final Guide guide = listGuide.get(position);

        Glide.with(holder.itemView.getContext())
                .load(guide.getFotoGuide())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPotoGuide);
        holder.tvNamaPanggilan.setText(guide.getNamaGuide());
        holder.tvTitle.setText(guide.getTitleGuide());

        holder.btnLike.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(holder.itemView.getContext(), "Like untuk : " +listGuide.get(holder.getAdapterPosition()).getNamaGuide(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallBack.onItemClicked(guide.getFotoGuide(),guide.getNamaGuide(), guide.getNamaPanjangGuide(),
                        guide.getTitleGuide(), guide.getGenderGuide(), guide.getUmurGuide(), guide.getDetailGuide(), guide.getNomer());
            }
        });
    }

    @Override
    public int getItemCount() { return listGuide.size(); }

    class CardViewViewHolder extends RecyclerView.ViewHolder{

        ImageView imgPotoGuide;
        TextView tvNamaPanggilan, tvTitle;
        Button btnLike, btnDetail;


        CardViewViewHolder(View itemView){
            super(itemView);
            imgPotoGuide = itemView.findViewById(R.id.img_potoGuide);
            tvNamaPanggilan = itemView.findViewById(R.id.tv_panggilanGuide);
            tvTitle = itemView.findViewById(R.id.tv_detailGuide);
            btnLike = itemView.findViewById(R.id.btn_setLike);
            btnDetail = itemView.findViewById(R.id.btn_setInfoDetail);
        }
    }

    public interface OnItemClickCallBack{
        void onItemClicked(int ImageView,String nama, String namaPanjang, String title,String gender, String umur, String detail, String nomer);
    }
}
