package com.example.jp.entregableandroidcore.controller;

import com.example.jp.entregableandroidcore.ResultListener;
import com.example.jp.entregableandroidcore.dao.RecetasDAO;
import com.example.jp.entregableandroidcore.dto.Receta;

import java.util.List;

public class RecetaController {

    public void loadRecetas(final ResultListener<List<Receta>> listener){

        RecetasDAO recetasDAO = new RecetasDAO();
        recetasDAO.loadRecetas(new ResultListener<List<Receta>>() {
            @Override
            public void finish(List<Receta> resultado) {
                listener.finish(resultado);
            }
        });
    }
}
