package com.myanmar.tmn.buroole.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myanmar.tmn.buroole.R;
import com.myanmar.tmn.buroole.viewHolder.ItemGuidesViewHolder;

/**
 * Created by msi on 1/5/2018.
 */

public class ItemBruppleGuidesAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newsItems = inflater.inflate(R.layout.items_burpple_guides,parent,false);
        ItemGuidesViewHolder itemBruppleGuidesViewHolder = new ItemGuidesViewHolder(newsItems);
        return itemBruppleGuidesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
