package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class KolhapurDist extends AppCompatActivity {
    NeumorphCardView forts,temples,rest,card1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolhapur_dist);
        forts=findViewById(R.id.cardForts);
        forts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KolhapurDist.this,kolhapurForts.class);
                startActivity(intent);
            }
        });temples=findViewById(R.id.cardTemple);
        temples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KolhapurDist.this,KolhapurTemples.class);
                startActivity(intent);
            }
        });
        rest=findViewById(R.id.cardCity);
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KolhapurDist.this,KolhapurRests.class);
                startActivity(intent);
            }
        });
        card1=findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=iec7s1FFZbU"));
                startActivity(intent);
            }
        });
    }
}