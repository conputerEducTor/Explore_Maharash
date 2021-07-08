package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;


public class KokanDivision extends AppCompatActivity {

    NeumorphCardView thane,mumbai,ratna,rai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kokan_division);

        thane=findViewById(R.id.cardForts);
        thane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KokanDivision.this,ThaneDist.class);
                startActivity(intent);
            }
        });  mumbai=findViewById(R.id.cardTemple);
        mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KokanDivision.this,MumbaiDist.class);
                startActivity(intent);
            }
        });  ratna=findViewById(R.id.cardCity);
        ratna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KokanDivision.this,RatnagiriDist.class);
                startActivity(intent);
            }
        });  rai=findViewById(R.id.cardHills);
        rai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KokanDivision.this,RaigadDist.class);
                startActivity(intent);
            }
        });


    }
}