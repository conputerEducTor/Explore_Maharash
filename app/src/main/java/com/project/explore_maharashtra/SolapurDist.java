package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class SolapurDist extends AppCompatActivity {
    NeumorphCardView forts,temples,dams,card1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solapur_dist);

        forts=findViewById(R.id.cardForts);
        forts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SolapurDist.this,SolapurForts.class);
                startActivity(intent);
            }
        }); temples=findViewById(R.id.cardTemple);
        temples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SolapurDist.this,SolapurTemples.class);
                startActivity(intent);
            }
        });dams=findViewById(R.id.cardCity);
        dams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SolapurDist.this,SolapurDams.class);
                startActivity(intent);
            }
        });
        card1=findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=rtm6nek3PwE"));
                startActivity(intent);
            }
        });
    }
}