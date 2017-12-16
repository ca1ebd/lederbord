package com.lederbord.lederbord;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.Console;

/**
 * Created by calebdudley on 12/16/17.
 */

public class board extends Fragment{
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board);
    }*/
    int currentHome = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.board, container, false);
        TextView homeScore = view.findViewById(R.id.homeScore);
        currentHome = Integer.parseInt(homeScore.getText().toString());
        return view;
    }

    public void incrementHome(View view){
        currentHome+=1;
        Console.out.println
    }

    public void decrementHome(View view){

    }

    public void incrementAway(View view){

    }

    public void decrementAway(View view){

    }

}
