package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class HingoliTemp extends AppCompatActivity {

    NeumorphCardView cr,cr1,cr2,cr3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hingoli_temp);

        cr=findViewById(R.id.cardRight);
        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HingoliTemp.this,HingoliTempDig.class);
                startActivity(intent);
            }
        });cr1=findViewById(R.id.cardRight1);
        cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HingoliTemp.this,HingoliTempNamdev.class);
                startActivity(intent);
            }
        });cr2=findViewById(R.id.cardRight2);
        cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HingoliTemp.this,HingoliTempNagnath.class);
                startActivity(intent);
            }
        });cr3=findViewById(R.id.cardRight3);
        cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HingoliTemp.this,HingoliTempJyot.class);
                startActivity(intent);
            }
        });

    }
}