package com.cdcc.beenglish;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView textView = (TextView) findViewById(R.id.textoperfil1);

        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/LittleMissPriss.ttf");
        textView.setTypeface(typeface);
    }

    public void niveles(View view){

        Intent intent = new Intent(this, LevelGridActivity.class);
        startActivity(intent);
        finish();

    }

    public void agregarPerfil(View view){

        Intent intent = new Intent(this,AddprofileActivity.class);
        startActivity(intent);
        finish();

    }

}
