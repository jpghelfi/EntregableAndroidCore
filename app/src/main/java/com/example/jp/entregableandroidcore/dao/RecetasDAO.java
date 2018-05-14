package com.example.jp.entregableandroidcore.dao;

import com.example.jp.entregableandroidcore.ResultListener;
import com.example.jp.entregableandroidcore.dto.Receta;

import java.util.ArrayList;
import java.util.List;

public class RecetasDAO {

    public void loadRecetas(final ResultListener<List<Receta>> listener){

        listener.finish(getRecetas());
    }

    public List<Receta> getRecetas() {

        List<Receta> listRecetas = new ArrayList<Receta>();

        listRecetas.add(new Receta( "lomo strogonoff", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "Pastel de Carne", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "Spaghetti caprese", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "lomo strogonoff", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "Pastel de Carne", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "Spaghetti caprese", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "lomo strogonoff", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "Pastel de Carne", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "Spaghetti caprese", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "lomo strogonoff", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "Pastel de Carne", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "Spaghetti caprese", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "lomo strogonoff", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "Pastel de Carne", 1, "Carne, Sal", "no se"));
        listRecetas.add(new Receta( "Spaghetti caprese", 1, "Carne, Sal", "no se"));
        


        return listRecetas;
    }
}
