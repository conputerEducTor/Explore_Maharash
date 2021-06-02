package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class PunePlaces extends AppCompatActivity {
    NeumorphCardView cr,cr1,cr2,cr3,cr4,cr5,cr6,cr7,cr8,cr9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pune_places);

        cr=findViewById(R.id.cardRight);
        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PunePlaces.this,PunePlacesAgakhan.class);
                startActivity(intent);
            }
        });
        cr1=findViewById(R.id.cardRight1);
        cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PunePlaces.this,PunePlacesOsho.class);
                startActivity(intent);
            }
        });
        cr2=findViewById(R.id.cardRight2);
        cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PunePlaces.this,PunePlacesLal.class);
                startActivity(intent);
            }
        });
        cr3=findViewById(R.id.cardRight3);
        cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PunePlaces.this,PunePlacesCafe.class);
                startActivity(intent);
            }
        });
        cr4=findViewById(R.id.cardRight4);
        cr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PunePlaces.this,PunePlacesDinker.class);
                startActivity(intent);
            }
        });
        cr5=findViewById(R.id.cardRight5);
        cr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PunePlaces.this,PunePlacesNda.class);
                startActivity(intent);
            }
        });
        cr6=findViewById(R.id.cardRight6);
        cr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PunePlaces.this,PunePlacesFriend.class);
                startActivity(intent);
            }
        });

        cr7=findViewById(R.id.cardRight7);
        cr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PunePlaces.this,PunePlacesRajiv.class);
                startActivity(intent);
            }
        });
        cr8=findViewById(R.id.cardRight8);
        cr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PunePlaces.this,PunePlacesTaljai.class);
                startActivity(intent);
            }
        });
        cr9=findViewById(R.id.cardRight9);
        cr9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PunePlaces.this,PunePlacesPhule.class);
                startActivity(intent);
            }
        });
    }
}