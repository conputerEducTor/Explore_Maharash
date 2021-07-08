package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class HingoliDist extends AppCompatActivity {
    NeumorphCardView forts,card,temple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hingoli_dist);
        forts=findViewById(R.id.cardForts);
        forts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HingoliDist.this,HingoliForts.class);
                startActivity(intent);
            }
        });temple=findViewById(R.id.cardTemple);
        temple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HingoliDist.this,HingoliTemp.class);
                startActivity(intent);
            }
        });
        card=findViewById(R.id.card1);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=OawMjSH3uK8"));
                startActivity(intent);
            }
        });
    }
}