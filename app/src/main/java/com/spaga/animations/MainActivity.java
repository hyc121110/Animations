package com.spaga.animations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {
        ImageView image1 = findViewById(R.id.image1);
        ImageView image2 = findViewById(R.id.image2);

        image1.animate().alpha(0f).setDuration(2000);
        image2.animate().alpha(1f).setDuration(2000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
