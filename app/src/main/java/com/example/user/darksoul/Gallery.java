package com.example.user.darksoul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
    }

    public void Home(View view) {
        Intent home = new Intent(getApplicationContext(),MainActivity.class);
        startActivity( home);
    }
}
