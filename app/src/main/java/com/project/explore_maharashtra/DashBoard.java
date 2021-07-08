package com.project.explore_maharashtra;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import soup.neumorphism.NeumorphCardView;

public class DashBoard extends AppCompatActivity {

    NeumorphCardView pune,cardAu,mtdc,kokan,nag;

    TextView text;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);


        text=findViewById(R.id.textTitle);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashBoard.this,About.class);
                startActivity(intent);
            }
        });


        pune=findViewById(R.id.cardPune);
        pune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(com.project.explore_maharashtra.DashBoard.this,PuneDivision.class);
                startActivity(intent);

            }
        });
        kokan=findViewById(R.id.cardKok);
        kokan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(com.project.explore_maharashtra.DashBoard.this,KokanDivision.class);
                startActivity(intent);

            }
        });
        nag=findViewById(R.id.cardNag);
        nag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(com.project.explore_maharashtra.DashBoard.this,NagpurDivision.class);
                startActivity(intent);

            }
        });


        cardAu=findViewById(R.id.cardAu);
        cardAu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashBoard.this,AurangabadDivision.class);
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
