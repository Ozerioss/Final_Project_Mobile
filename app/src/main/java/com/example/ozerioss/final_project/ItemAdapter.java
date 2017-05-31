package com.example.ozerioss.final_project;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import java.util.List;

/**
 * Created by Ozerioss on 27/03/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder>{


    private List<QueryItem.ItemsBean> itemsBean;
    private OnVideoSelectedListener onVideoSelectedListener;
    public ItemAdapter(List<QueryItem.ItemsBean> itemsBeen) {
        this.itemsBean = itemsBeen;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.setOnVideoSelectedListener(onVideoSelectedListener);
        holder.bind(itemsBean.get(position));

    }

    @Override
    public int getItemCount() {
        return itemsBean != null ? itemsBean.size() : 0;
    }

    public void setOnVideoSelectedListener(OnVideoSelectedListener onVideoSelectedListener) {
        this.onVideoSelectedListener = onVideoSelectedListener;
    }
}
