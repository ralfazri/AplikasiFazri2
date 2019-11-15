package com.example.liburanyuks;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapterExample extends
        SliderViewAdapter<SliderAdapterExample.SliderAdapterVH> {

    private Context context;
    private int mCount;

    public SliderAdapterExample(Context context) {
        this.context = context;
    }

    public void setCount(int count) {
        this.mCount = count;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(final SliderAdapterVH viewHolder, final int position) {


        switch (position) {
            case 0:
                viewHolder.textDeskripsi.setText("Bali");
                viewHolder.textDeskripsi.setTextSize(15);
                viewHolder.textDeskripsi.setTextColor(Color.WHITE);
                viewHolder.imageDotContainer.setVisibility(View.GONE);
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.view_bali)
                        .fitCenter()
                        .into(viewHolder.imageViewBackground);
                break;
            case 1:

                viewHolder.textDeskripsi.setText("Gunung Bromo");
                viewHolder.textDeskripsi.setTextSize(15);
                viewHolder.textDeskripsi.setTextColor(Color.WHITE);
                viewHolder.imageDotContainer.setVisibility(View.GONE);
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.view_gunung_bromo)
                        .fitCenter()
                        .into(viewHolder.imageViewBackground);
                break;
            case 2:
                viewHolder.textDeskripsi.setText("Jakarta");
                viewHolder.textDeskripsi.setTextSize(15);
                viewHolder.textDeskripsi.setTextColor(Color.WHITE);
                viewHolder.imageDotContainer.setVisibility(View.GONE);
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.view_jkt_duwa)
                        .fitCenter()
                        .into(viewHolder.imageViewBackground);
                break;

        }

    }

    @Override
    public int getCount() {
        return mCount;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imageViewBackground;
        ImageView imageDotContainer;
        TextView textDeskripsi;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_image_slider);
            imageDotContainer = itemView.findViewById(R.id.iv_dot_container);
            textDeskripsi = itemView.findViewById(R.id.tv_image_slider);
            this.itemView = itemView;
        }
    }


}
