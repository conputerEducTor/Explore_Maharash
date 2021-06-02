package com.project.explore_maharashtra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class PuneForts extends AppCompatActivity {


    NeumorphCardView cardrig,cardrig1,cardrig2,cardrig3,cardrig4,cardrig5,cardrig6,cardrig7,cardrig8,cardrig9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pune_fort);



        cardrig=findViewById(R.id.cardRight);
        cardrig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneForts.this, PuneFortSinhgad.class);
                startActivity(intent);
            }
        });
        cardrig1=findViewById(R.id.cardRight1);
        cardrig1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PuneForts.this,PuneFortShivneri.class);
                startActivity(intent);

            }
        });
        cardrig2=findViewById(R.id.cardRight2);
        cardrig2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneForts.this,PuneFortTikona.class);
                startActivity(intent);
            }
        });
        cardrig3=findViewById(R.id.cardRight3);
        cardrig3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneForts.this,PuneFortTung.class);
                startActivity(intent);
            }
        });
        cardrig4=findViewById(R.id.cardRight4);
        cardrig4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneForts.this,PuneFortRohida.class);
                startActivity(intent);
            }
        });

        cardrig5=findViewById(R.id.cardRight5);
        cardrig5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneForts.this,PuneFortRajgad.class);
                startActivity(intent);
            }
        });
        cardrig6=findViewById(R.id.cardRight6);
        cardrig6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneForts.this,PuneFortGhangad.class);
                startActivity(intent);
            }
        });
        cardrig7=findViewById(R.id.cardRight7);
        cardrig7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneForts.this,PuneFortKothaligad.class);
                startActivity(intent);
            }
        });
        cardrig8=findViewById(R.id.cardRight8);
        cardrig8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneForts.this,PuneFortGhangad.class);
                startActivity(intent);
            }
        });
        cardrig9=findViewById(R.id.cardRight9);
        cardrig9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneForts.this,PuneFortRajmanchi.class);
                startActivity(intent);
            }
        });





    }
}