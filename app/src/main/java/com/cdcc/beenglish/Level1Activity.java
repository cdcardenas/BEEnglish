package com.cdcc.beenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Level1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
    }


    public void VolverUno(View view){


        Intent intent = new Intent(this, LevelGridActivity.class);
        startActivity(intent);
        finish();

    }

}
