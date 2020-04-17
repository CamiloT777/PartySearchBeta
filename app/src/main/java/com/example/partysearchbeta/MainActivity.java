package com.example.partysearchbeta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.partysearchbeta.ui.bartender.bartender;
import com.example.partysearchbeta.ui.cuenta.cuenta;
import com.example.partysearchbeta.ui.decorador.decorador;
import com.example.partysearchbeta.ui.informacion.info;
import com.example.partysearchbeta.ui.local_gallery.GalleryFragment;
import com.example.partysearchbeta.ui.home.HomeFragment;
import com.example.partysearchbeta.ui.cocinero_send.SendFragment;
import com.example.partysearchbeta.ui.mesero_share.ShareFragment;
import com.example.partysearchbeta.ui.seguridad_slides.SlideshowFragment;
import com.example.partysearchbeta.ui.djs_tools.ToolsFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
FloatingActionButton fab;
    //Creación de la variable para el bar de navegación
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
               //         .setAction("Action", null).show();
                Intent intent= new Intent(getApplicationContext(),formServicioActivity.class);
                startActivity(intent);
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        Intent intent= getIntent();
        Bundle bundle=intent.getExtras();
        NavigationView navigationView1=(NavigationView)findViewById(R.id.nav_view);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_local, R.id.nav_cocinero,
                R.id.nav_mesero, R.id.nav_cuenta, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


    }
    //seleccion de menus
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        final DrawerLayout drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        NavigationView  navView = (NavigationView)findViewById(R.id.nav_view);

        navView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {

                        boolean fragmentTransaction = false;
                        Fragment fragment = null;

                        switch (menuItem.getItemId()) {
                            case R.id.nav_local:

                                fragment = new GalleryFragment() ;
                                fragmentTransaction = true;

                                break;
                            case R.id.nav_cocinero:
                                fragment = new SendFragment();
                                fragmentTransaction = true;
                                break;
                            case R.id.nav_mesero:
                                fragment = new ShareFragment();
                                fragmentTransaction = true;
                                break;
                            case R.id.nav_decora:
                                fragment = new decorador();
                                fragmentTransaction = true;
                                break;
                            case R.id.nav_dj:
                                fragment = new ToolsFragment();
                                fragmentTransaction = true;
                                break;
                            case R.id.nav_bar:
                                fragment = new bartender();
                                fragmentTransaction = true;
                                break;
                            case R.id.nav_cuenta:
                                fragment = new cuenta();
                                fragmentTransaction = true;
                                break;
                            case R.id.nav_info:
                                fragment = new info();
                                fragmentTransaction = true;
                                break;
                            case R.id.nav_seguridad:
                                fragment = new SlideshowFragment();
                                fragmentTransaction = true;
                                break;

                        }

                        if(fragmentTransaction) {
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.nav_host_fragment, fragment)
                                    .commit();

                            menuItem.setChecked(true);
                            getSupportActionBar().setTitle(menuItem.getTitle());
                        }

                        drawerLayout.closeDrawers();

                        return true;
                    }
                });
        return true;}




    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

void CreaPersona(View view){
        Intent intent= new Intent(getApplicationContext(),formServicioActivity.class);
        startActivity(intent);
    }






}




