package com.prisonerprice.jokedisplayer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textView = findViewById(R.id.jokeText);

        Intent intent = getIntent();
        String text = intent.getStringExtra("JOKE");
        if (text != null) {
            textView.setText(text);
        } else {
            textView.setText("ERROR");
        }
    }
}
