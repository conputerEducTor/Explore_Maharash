package com.project.explore_maharashtra;

import android.content.Intent;
import android.media.MediaParser;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class PuneTemples extends AppCompatActivity {
    NeumorphCardView cr1,cr2,cr3,cr4,cr5,cr6,cr7,cr8,cr9,cr10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pune_temple);
        cr1=findViewById(R.id.cardRight);
        cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneTemples.this,PuneTempleDagadu.class);
                startActivity(intent);
            }
        });
        cr2=findViewById(R.id.cardRight1);
        cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneTemples.this,PuneTempleAalandi.class);
                startActivity(intent);
            }
        });
        cr3=findViewById(R.id.cardRight2);
        cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneTemples.this,PuneTempleBhimashankar.class);
                startActivity(intent);
            }
        });
        cr4=findViewById(R.id.cardRight3);
        cr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneTemples.this,PuneTempleChattushringi.class);
                startActivity(intent);
            }
        });
        cr5=findViewById(R.id.cardRight4);
        cr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneTemples.this,PuneTempleJejuri.class);
                startActivity(intent);
            }
        });
        cr6=findViewById(R.id.cardRight5);
        cr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneTemples.this,PuneTempleJain.class);
                startActivity(intent);
            }
        });
        cr7=findViewById(R.id.cardRight6);
        cr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneTemples.this,PuneTempleDehu.class);
                startActivity(intent);
            }
        });
        cr8=findViewById(R.id.cardRight7);
        cr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneTemples.this,PuneTempleParvati.class);
                startActivity(intent);
            }
        });
        cr9=findViewById(R.id.cardRight8);
        cr9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneTemples.this,PuneTempleSangameshwar.class);
                startActivity(intent);
            }
        });
        cr10=findViewById(R.id.cardRight9);
        cr10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneTemples.this,PuneTempleMoreshwar.class);
                startActivity(intent);
            }
        });


    }
}