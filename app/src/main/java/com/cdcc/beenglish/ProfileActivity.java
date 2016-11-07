package com.cdcc.beenglish;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView textView = (TextView) findViewById(R.id.textoperfil1);

        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/LittleMissPriss.ttf");
        textView.setTypeface(typeface);
    }
}
