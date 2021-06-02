package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class KolhapurFortsGandharva extends AppCompatActivity {

    ImageButton nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolhapur_forts_gandharva);
        nav=findViewById(R.id.navbutton);
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=15°57'16\"N   74°14'26\"E&mode=d"));
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });

    }
}
