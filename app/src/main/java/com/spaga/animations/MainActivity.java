package com.spaga.animations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {
        ImageView image1 = findViewById(R.id.image1);
        //ImageView image2 = findViewById(R.id.image2);

        image1.animate().rotation(180f).setDuration(2000);
        /*image1.animate().translationXBy(1000f).setDuration(2000);
        image1.animate().translationYBy(1000f).setDuration(2000);
        image1.animate().alpha(0f).setDuration(2000);
        image2.animate().alpha(1f).setDuration(2000);*/
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        // animate something from off the edge of the screen
        ImageView image1 = findViewById(R.id.image1);
        image1.setTranslationX(-1000f);
        */
    }
}
