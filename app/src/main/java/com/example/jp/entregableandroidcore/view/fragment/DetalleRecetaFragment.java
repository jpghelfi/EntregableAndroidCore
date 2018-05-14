package com.example.jp.entregableandroidcore.view.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jp.entregableandroidcore.R;
import com.example.jp.entregableandroidcore.dto.Receta;
import com.example.jp.entregableandroidcore.view.activity.DetalleRecetaActivity;

public class DetalleRecetaFragment extends android.support.v4.app.Fragment{

    private TextView title;
    private TextView ingredients;
    private TextView preparation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_receta_detalle, container, false);
        Bundle bundle = getArguments();
        Receta receta= (Receta) bundle.getSerializable(DetalleRecetaActivity.RECETA_DETALLE);

//        imagenContacto = view.findViewById(R.id.imagen_contacto);
        this.title = view.findViewById(R.id.detalle_receta_title);
        this.ingredients = view.findViewById(R.id.detalle_receta_ingredientes);
        this.preparation= view.findViewById(R.id.detalle_receta_preparacion);
//        imagenContacto.setBackgroundResource(contacto.getImagenID());
//        this.title.setText(contacto.getNombre());
//        descripcionContacto.setText(contacto.getDescripcion());
        return view;
    }
}
