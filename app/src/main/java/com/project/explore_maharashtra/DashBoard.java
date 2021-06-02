package com.project.explore_maharashtra;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class DashBoard extends AppCompatActivity {

    NeumorphCardView pune,cardns,mtdc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        pune=findViewById(R.id.cardPune);
        pune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(com.project.explore_maharashtra.DashBoard.this,PuneDivision.class);
                startActivity(intent);
                finish();
            }
        });

        cardns=findViewById(R.id.cardNas);
        cardns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashBoard.this, PuneDist.class);
                startActivity(intent);
            }
        });
        mtdc=findViewById(R.id.card1);
        mtdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://mtdcrrs.maharashtratourism.gov.in/Booking/SearchPage.aspx");
            }
        });

    }
    private void gotoUrl(String s){

        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }





}
