package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class HingoliForts extends AppCompatActivity {
    NeumorphCardView rg,rg1,rg2,rg3,rg4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hingoli_forts);
        rg=findViewById(R.id.cardRight);
        rg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HingoliForts.this,HingoliFortsRangana.class);
                startActivity(intent);

            }
        });rg1=findViewById(R.id.cardRight1);
        rg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HingoliForts.this,HingoliFortsMansantosh.class);
                startActivity(intent);

            }
        });rg2=findViewById(R.id.cardRight2);
        rg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HingoliForts.this,HingoliFortsGandharva.class);
                startActivity(intent);

            }
        });rg3=findViewById(R.id.cardRight3);
        rg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HingoliForts.this,HingoliFortsSamangad.class);
                startActivity(intent);

            }
        });rg4=findViewById(R.id.cardRight4);
        rg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HingoliForts.this,HingoliFortsBhairavgad.class);
                startActivity(intent);

            }
        });
    }
}