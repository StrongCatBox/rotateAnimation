package com.example.linearlayout3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img1 = findViewById(R.id.rotate1);
        ImageView img2 = findViewById(R.id.rotate2);
        ImageView img3 = findViewById(R.id.rotate3);


        new Rotation(360, 4000, true, img1);


        new Rotation(360, 2000, true, img2);


        new Rotation(-360, 2000, true, img3);
    }
}

