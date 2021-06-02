package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import soup.neumorphism.NeumorphCardView;

public class PuneDivision extends AppCompatActivity {


    NeumorphCardView pune,satara,solapur,kolhapur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pune_division);



        pune=findViewById(R.id.cardForts);
        pune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneDivision.this,PuneDist.class);
                startActivity(intent);
            }
        });
        satara=findViewById(R.id.cardTemple);
        satara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneDivision.this,SataraDIst.class);
                startActivity(intent);
            }
        });
        solapur=findViewById(R.id.cardCity);
        solapur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneDivision.this,SolapurDist.class);
                startActivity(intent);
            }
        });
        kolhapur=findViewById(R.id.cardHills);
        kolhapur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuneDivision.this,KolhapurDist.class);
                startActivity(intent);
            }
        });

    }
}