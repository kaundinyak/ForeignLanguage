package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();


        Element adsElement = new Element();
        adsElement.setTitle("Advertise Here!");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.artabout)
                .setDescription("An Amity way of Learning!")
                .addItem(new Element().setTitle("Version 2.0"))
                .addItem(adsElement)
                .addGroup("Connect With Us")
                .addEmail("koundik5@gmail.com")
                .addWebsite("http://google.co.in")
                .addFacebook("Jatin Garg")
                .addTwitter("My Twitter")
                .addPlayStore("My PlayStore")
                .addInstagram("My Instagram")
                .addItem(createCopyright())
                .create();

        setContentView(aboutPage);
    }

    private Element createCopyright() {
        final Element copyright = new Element();
        final String copyrightString = String.format("Copyright %d by Kaundinya & Jatin", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AboutUs.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}
