package com.example.stefano.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

        // Find the View that shows the sanremo2017 category
        TextView sanremo2017 = (TextView) findViewById(R.id.sanremo2017);

        // Find the View that shows the sanremo2018 category
        TextView sanremo2018 = (TextView) findViewById(R.id.sanremo2018);

        // Set a click listener on the view sanremo2017
        sanremo2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intentsanremo2017 = new Intent(MainActivity.this, sanremo2017Activity.class);
                startActivity(Intentsanremo2017);
            }
        });

        // Set a click listener on the view sanremo2018
        sanremo2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intentsanremo2018 = new Intent(MainActivity.this, sanremo2018Activity.class);
                startActivity(Intentsanremo2018);
            }
        });
   }
}
