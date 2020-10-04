package com.example.artistwikipedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView aSong;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        aSong = findViewById(R.id.songsTxt);
        image = findViewById(R.id.imageView);

        Intent intent = getIntent();
        String input = intent.getStringExtra("song");
        aSong.setText(input);

        int source = intent.getIntExtra("img",0);
        image.setImageResource(source);
    }
}