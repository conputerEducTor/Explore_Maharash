package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class ThaneDist extends AppCompatActivity {

    NeumorphCardView forts,temple,lake,dist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thane_dist);

        forts=findViewById(R.id.cardForts);
        forts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThaneDist.this,ThaneForts.class);
                startActivity(intent);
            }
        }); temple=findViewById(R.id.cardTemple);
        temple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThaneDist.this,ThaneTemples.class);
                startActivity(intent);
            }
        }); lake=findViewById(R.id.cardCity);
        lake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThaneDist.this,ThaneLakes.class);
                startActivity(intent);
            }
        }); dist=findViewById(R.id.card1);
        dist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=67y4XUyR_Hs"));
                startActivity(intent);
            }
        });

    }
}