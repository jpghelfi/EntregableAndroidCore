package com.example.jp.entregableandroidcore;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

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
