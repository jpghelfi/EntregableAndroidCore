package com.example.jp.entregableandroidcore.view.activity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.jp.entregableandroidcore.dto.Receta;
import com.example.jp.entregableandroidcore.view.fragment.MainFragment;
import com.example.jp.entregableandroidcore.R;
import com.example.jp.entregableandroidcore.view.fragment.RecetasFragment;
import com.example.jp.entregableandroidcore.view.fragment.AboutUsFragment;


public class MainActivity extends AppCompatActivity implements RecetasFragment.NotificadorFragment {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
        this.drawerLayout =  (DrawerLayout) findViewById(R.id.drawer_layout);
        this.setFragment(new MainFragment());

        navigationView.setNavigationItemSelectedListener(new NavigationViewListener());
    }

    @Override
    public void notificar(Receta receta) {

        Intent intent = new Intent(MainActivity.this, DetalleRecetaActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(DetalleRecetaActivity.RECETA_DETALLE, receta);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private class NavigationViewListener implements NavigationView.OnNavigationItemSelectedListener{

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

            if(item.getItemId() == R.id.primerFragment){
                setFragment(new RecetasFragment());
            }
            else if(item.getItemId() == R.id.segundoFragment){
                setFragment(new AboutUsFragment());
            }
            drawerLayout.closeDrawers();
            return true;
        }
    }

    private void setFragment(Fragment unFragment) {
        getFragmentManager().beginTransaction().replace(R.id.mainFragment,unFragment).commit();
    }
}
