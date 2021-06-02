package com.project.explore_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PuneFortRajmanchi extends AppCompatActivity {
    ImageButton nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pune_fort_rajmanchi);
        nav=findViewById(R.id.navbutton);
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=17.3197° N, 74.2348° E&mode=d"));
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
    }
}