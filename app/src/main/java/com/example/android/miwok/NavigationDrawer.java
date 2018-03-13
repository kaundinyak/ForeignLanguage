package com.example.android.miwok;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class NavigationDrawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(NavigationDrawer.this,mDrawerLayout, R.string.open,R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
   public boolean onOptionsItemSelected(MenuItem item) {

        if(mToggle.onOptionsItemSelected(item)){
          return true;
       }
       return super.onOptionsItemSelected(item);
   }

    @Override
   public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.nav_home){
            startActivity(new Intent(NavigationDrawer.this,NavigationDrawer.class));
        }

        if(id == R.id.nav_aboutus){
            Toast.makeText(this,"Coming Soon",Toast.LENGTH_SHORT).show();
            // /startActivity(new Intent(NavigationDrawer.this,NavigationDrawer.class));
        }


        if(id == R.id.nav_logout){

            startActivity(new Intent(NavigationDrawer.this,GoogleLogout.class));
        }

        if(id == R.id.nav_selectlanguage){
            //Toast.makeText(this,"Coming Soon",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(NavigationDrawer.this,LanguageChooser.class));
        }

        if(id == R.id.nav_settings){
            Toast.makeText(this,"Coming Soon",Toast.LENGTH_SHORT).show();
            //startActivity(new Intent(NavigationDrawer.this,NavigationDrawer.class));
        }

        return false;

    }
}
