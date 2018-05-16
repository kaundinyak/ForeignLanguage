package com.example.android.miwok;

import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class NavigationDrawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView image5;

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

        image1 = (ImageView) findViewById(R.id.franceflag);
        image2 = (ImageView) findViewById(R.id.spainflag);
        image3 = (ImageView) findViewById(R.id.germanflag);
        image4 = (ImageView) findViewById(R.id.facts);
        image5 = (ImageView) findViewById(R.id.quiz);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NavigationDrawer.this,SelectionFrench.class));
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NavigationDrawer.this,SelectionSpanish.class));
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NavigationDrawer.this,SelectionGerman.class));
            }
        });
        
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
            startActivity(new Intent(NavigationDrawer.this,AboutUs.class));
        }


        if(id == R.id.nav_logout){

            startActivity(new Intent(NavigationDrawer.this,GoogleLogout.class));
        }

        if(id == R.id.nav_selectlanguage){
            //Toast.makeText(this,"Coming Soon",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(NavigationDrawer.this,LanguageChooser.class));
        }



        return false;

    }
}
