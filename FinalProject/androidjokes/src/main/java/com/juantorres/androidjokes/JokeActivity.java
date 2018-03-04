package com.juantorres.androidjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String EXTRA_JOKE = "EXTRA_JOKE";
    private TextView tvJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        tvJoke = findViewById(R.id.tv_joke);
        displayJokeFromIntent();
    }

    private void displayJokeFromIntent(){
        Intent intent = getIntent();
        if(intent != null && intent.hasExtra(EXTRA_JOKE)){
            String joke = intent.getStringExtra(EXTRA_JOKE);
            tvJoke.setText(joke);
        }
    }
}
