package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaParser;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class SataraDIst extends AppCompatActivity {
    NeumorphCardView fort,temple,dams,card1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satara_dist);
        fort=findViewById(R.id.cardForts);
        fort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SataraDIst.this,SataraFort.class);
                startActivity(intent);
            }
        });
        temple=findViewById(R.id.cardTemple);
        temple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SataraDIst.this,SataraTemples.class);
                startActivity(intent);
            }
        });
        dams=findViewById(R.id.cardCity);
        dams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SataraDIst.this,SataraDams.class);
                startActivity(intent);
            }
        });
        card1=findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=efMAS3iMdAg"));
                startActivity(intent);
            }
        });
    }
}