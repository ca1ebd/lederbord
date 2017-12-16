package com.lederbord.lederbord;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chooseBaseball(View view){
        Intent intent = new Intent(this, BaseballActivity.class);
        startActivity(intent);
    }

    public void chooseFootball(View view){
        Intent intent = new Intent(this, FootballActivity.class);
        startActivity(intent);
    }

    public void chooseSoccer(View view){
        Intent intent = new Intent(this, SoccerActivity.class);
        startActivity(intent);
    }

    public void chooseLacrosse(View view){
        Intent intent = new Intent(this, LacrosseActivity.class);
        startActivity(intent);
    }
}
