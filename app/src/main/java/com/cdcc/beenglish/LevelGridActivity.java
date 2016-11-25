package com.cdcc.beenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LevelGridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_grid);
    }


    public void nivelUno(View view){

        Intent intent = new Intent(this, Level1Activity.class)   ;
        startActivity(intent);
        finish();

    }

    public void nivelDos(View view){

        Intent intent = new Intent(this, level2Activity.class)   ;
        startActivity(intent);
        finish();


    }
    public void nivelTres(View view){

        Intent intent = new Intent(this, Level3Activity.class)   ;
        startActivity(intent);
        finish();

    }

    public void regresarASelPer(View view){

        Intent intent = new Intent(this, ProfileActivity.class)   ;
        startActivity(intent);
        finish();



    }

}
