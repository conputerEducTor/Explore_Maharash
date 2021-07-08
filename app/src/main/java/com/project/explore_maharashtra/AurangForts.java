package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class AurangForts extends AppCompatActivity {

    NeumorphCardView cr,cr1,cr2,cr3,cr4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aurang_forts);

        cr=findViewById(R.id.cardRight);
        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AurangForts.this,AurangFortsDaulatabad.class);
                startActivity(intent);
            }
        });cr1=findViewById(R.id.cardRight1);
        cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AurangForts.this,AurangFortsSunheri.class);
                startActivity(intent);
            }
        });cr2=findViewById(R.id.cardRight2);
        cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AurangForts.this,AurangFortsBibi.class);
                startActivity(intent);
            }
        });cr3=findViewById(R.id.cardRight3);
        cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AurangForts.this,AurangFortsNaukhanda.class);
                startActivity(intent);
            }
        });cr4=findViewById(R.id.cardRight4);
        cr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AurangForts.this,AurangFortsKilla.class);
                startActivity(intent);
            }
        });
    }
}