package com.example.jp.entregableandroidcore.view.activity;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jp.entregableandroidcore.R;
import com.example.jp.entregableandroidcore.view.fragment.DetalleRecetaFragment;

public class DetalleRecetaActivity extends AppCompatActivity {

    public static final String RECETA_DETALLE = "detalle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        DetalleRecetaFragment detalleFragment = new DetalleRecetaFragment();
        detalleFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, detalleFragment).commit();
    }
}
