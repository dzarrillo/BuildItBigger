package com.dzartek.androidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by dzarrillo on 6/21/2016.
 */
public class JokeFragment extends Fragment {
    private TextView tvJoke;

    public JokeFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.joke_fragment, container, false);
        Bundle bundle = this.getArguments();
        String newJoke = bundle.getString("Joke");
        tvJoke = (TextView) v.findViewById(R.id.textViewJoke);
        tvJoke.setText(newJoke);
        return v;
    }
}
