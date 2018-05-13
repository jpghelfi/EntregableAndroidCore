package com.example.jp.entregableandroidcore.view.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jp.entregableandroidcore.R;
import com.example.jp.entregableandroidcore.ResultListener;
import com.example.jp.entregableandroidcore.controller.RecetaController;
import com.example.jp.entregableandroidcore.dto.Receta;

import java.util.List;

public class RecetasFragment extends Fragment{

    private List<Receta> recetaList;

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recetas_fragment, container, false);


        this.recyclerView = view.findViewById(R.id.reciclerViewRecetas);
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        this.loadRecetas();

        return view;
    }


    public void loadRecetas(){

        RecetaController recetaController = new RecetaController();

        recetaController.loadRecetas(new ResultListener<List<Receta>>() {
            @Override
            public void finish(List<Receta> resultado) {
                recetaList = resultado;

                RecetasAdapter adapter = new RecetasAdapter(recetaList);
                adapter.notifyDataSetChanged();
                recyclerView.setAdapter(adapter);
            }
        });


    }
}
