package com.example.jay.mineproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class Levels extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        Button easy = (Button)findViewById(R.id.easy2);
        Button medium = (Button)findViewById(R.id.medium);
        Button hard = (Button)findViewById(R.id.hard);
        Button expert = (Button)findViewById(R.id.expert);

        easy.setOnClickListener(this);
        medium.setOnClickListener(this);
        hard.setOnClickListener(this);
        expert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.easy2:
                Intent i = new Intent(this, Game.class);
                startActivity(i);
                break;
        }
    }
}
