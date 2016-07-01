package com.dzartek.androidlib;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainJokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainjokes_actvity);

        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
//        String newJoke = (String) bd.get("Joke");
//        bd.putString("Joke", newJoke);

        JokeFragment jFragment = new JokeFragment();
        jFragment.setArguments(bd);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentHolder, jFragment)
                .commit();

    }
}
