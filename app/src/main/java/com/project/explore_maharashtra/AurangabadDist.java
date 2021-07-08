package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class AurangabadDist extends AppCompatActivity {
    NeumorphCardView forts,card1,temples,city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aurangabad_dist);

        forts=findViewById(R.id.cardForts);
        forts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AurangabadDist.this,AurangForts.class);
                startActivity(intent);
            }
        });
        card1=findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=X8JsTlH_ny0"));
                startActivity(intent);
            }
        });temples=findViewById(R.id.cardTemple);
        temples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AurangabadDist.this,AurangabadTemples.class);
                startActivity(intent);
            }
        });city=findViewById(R.id.cardCity);
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AurangabadDist.this,AurangabadPlaces.class);
                startActivity(intent);
            }
        });

    }
}