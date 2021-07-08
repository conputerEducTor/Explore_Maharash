package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class AurangabadDivision extends AppCompatActivity {

    NeumorphCardView cardAu,tem,city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aurangabad_division);

        cardAu=findViewById(R.id.cardForts);
        cardAu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AurangabadDivision.this,AurangabadDist.class);
                startActivity(intent);
            }
        });
        tem=findViewById(R.id.cardTemple);
        tem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AurangabadDivision.this,HingoliDist.class);
                startActivity(intent);
            }
        });

        city=findViewById(R.id.cardCity);
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AurangabadDivision.this,LaturDist.class);
                startActivity(intent);
            }
        });
    }
}