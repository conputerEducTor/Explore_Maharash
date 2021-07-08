package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.security.cert.LDAPCertStoreParameters;

import soup.neumorphism.NeumorphCardView;

public class LaturDist extends AppCompatActivity {
    NeumorphCardView forts,card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latur_dist);

        forts=findViewById(R.id.cardForts);
        forts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LaturDist.this,LaturFort.class);
                startActivity(intent);

            }
        });

        card=findViewById(R.id.card1);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=OvuN9YxtFLw"));
                startActivity(intent);
            }
        });
    }
}