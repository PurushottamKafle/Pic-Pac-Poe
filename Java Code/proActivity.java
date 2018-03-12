package com.android.picpacpoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class proActivity extends AppCompatActivity {

// Develop By Purushottam Kafle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro);

        final Button btns = (Button)findViewById(R.id.btn1);
        Button btns1 = (Button)findViewById(R.id.btn2);
        Button btns2 = (Button)findViewById(R.id.btn3);
        Button btns3 = (Button)findViewById(R.id.btn4);
        Button btns4 = (Button)findViewById(R.id.btn5);
        Button btns5 = (Button)findViewById(R.id.btn6);
        Button btns6 = (Button)findViewById(R.id.btn7);
        Button btns7 = (Button)findViewById(R.id.btn8);
        Button btns8 = (Button)findViewById(R.id.btn9);

        // Start Programing
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        for(int k=0; k<10; k++){

        }


    }
}
