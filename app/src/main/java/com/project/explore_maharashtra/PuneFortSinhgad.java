package com.project.explore_maharashtra;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PuneFortSinhgad extends AppCompatActivity {
    ImageButton nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pune_fort_sinhgad);

        nav=findViewById(R.id.navbutton);
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q= 18.3663° N 73.7559° E&mode=d"));
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });


    }
}