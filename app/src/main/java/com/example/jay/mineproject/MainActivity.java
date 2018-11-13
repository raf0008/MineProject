package com.example.jay.mineproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button new_game_btn = (Button)findViewById(R.id.new_game_btn);
        Button resume_btn = (Button)findViewById(R.id.resume_btn);
        Button statistics_btn = (Button)findViewById(R.id.statistics_btn);
        Button settings_btn = (Button)findViewById(R.id.settings_btn);

        new_game_btn.setOnClickListener(this);
        resume_btn.setOnClickListener(this);
        statistics_btn.setOnClickListener(this);
        settings_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.new_game_btn:
                Intent i = new Intent(this, Levels.class);
                startActivity(i);
                break;
        }
    }
}
