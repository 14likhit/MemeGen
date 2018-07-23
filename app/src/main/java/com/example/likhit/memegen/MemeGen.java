package com.example.likhit.memegen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MemeGen extends AppCompatActivity implements TopFragment.TopSectionListner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme_gen);
    }

    @Override
    public void createMeme(String top, String bottom) {
        BottomFragment bottomFragment=(BottomFragment)getSupportFragmentManager().findFragmentById(R.id.fragment3);
        bottomFragment.setMemeText(top, bottom);
    }
}
