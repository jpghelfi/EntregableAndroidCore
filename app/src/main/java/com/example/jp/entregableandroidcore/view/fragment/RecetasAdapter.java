package com.example.jp.entregableandroidcore.view.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jp.entregableandroidcore.R;
import com.example.jp.entregableandroidcore.dto.Receta;

import java.util.List;

public class RecetasAdapter extends RecyclerView.Adapter {

    private List<Receta> recetaList;

    public RecetasAdapter(List<Receta> recetaList){
        this.recetaList = recetaList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_cell, parent, false );
        itemView.setMinimumHeight(20);

        return (new RecetaViewHolder(itemView));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RecetaViewHolder recetaViewHolder = (RecetaViewHolder) holder;
        recetaViewHolder.bindReceta(this.recetaList.get(position));
    }

    @Override
    public int getItemCount() {
        return this.recetaList.size();
    }

    private class RecetaViewHolder extends RecyclerView.ViewHolder{

        private TextView title;

        public RecetaViewHolder(View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.nombreReceta);
        }

        public void bindReceta(Receta receta){
            this.title.setText(receta.getTitle());
        }
    }
}
