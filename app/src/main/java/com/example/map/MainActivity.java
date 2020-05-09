package com.example.map;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    PhotoViewAttacher mAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        mAttacher = new PhotoViewAttacher(imageView);

    }
}
