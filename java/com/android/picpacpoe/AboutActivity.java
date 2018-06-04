package com.android.picpacpoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Toolbar tb2 = (Toolbar)findViewById(R.id.tb2);
        setSupportActionBar(tb2);
        getSupportActionBar().setTitle("About");
         getSupportActionBar().setIcon(R.drawable.about);

        ImageView img = (ImageView)findViewById(R.id.pk23);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(AboutActivity.this, SupriseActivity.class);
                startActivity(i3);

            }
        });



    }
}
