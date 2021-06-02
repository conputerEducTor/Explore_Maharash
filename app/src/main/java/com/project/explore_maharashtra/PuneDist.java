package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class PuneDist extends AppCompatActivity {
    NeumorphCardView forts,temple,city,week;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pune_dist);
        forts=findViewById(R.id.cardForts);
        forts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneDist.this, PuneForts.class);
                startActivity(intent);
            }
        });
        temple=findViewById(R.id.cardTemple);
        temple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneDist.this, PuneTemples.class);
                startActivity(intent);
            }
        });
        city=findViewById(R.id.cardCity);
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneDist.this,PunePlaces.class);
                startActivity(intent);
            }
        });
        week=findViewById(R.id.cardHills);
        week.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneDist.this,PuneWeek.class);
                startActivity(intent);
            }
        });
    }
}