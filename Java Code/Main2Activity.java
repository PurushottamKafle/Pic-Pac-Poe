package com.android.picpacpoe;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
// Develop By Purushottam Kafle
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar tb = (Toolbar)findViewById(R.id.tb1);
        setSupportActionBar(tb);
        getSupportActionBar().setTitle("Home");
         getSupportActionBar().setIcon(R.mipmap.feed_img);


/**
 * ----------------------------------------------------------------------------------------------
 */
        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent next = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(next);
            }
        });






    }
    @Override
   public boolean onCreateOptionsMenu(Menu menu)   {
        getMenuInflater().inflate(R.menu.opt_menu, menu);
  return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int i = item.getItemId();

        if(i==R.id.about){
            Intent in3 = new Intent(Main2Activity.this, AboutActivity.class);
            startActivity(in3);

        }
        if(i==R.id.login){
            Intent in1 = new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(in1);

        }
        if(i==R.id.play){
            Intent in2 = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(in2);

        }


        return super.onOptionsItemSelected(item);
    }
}
