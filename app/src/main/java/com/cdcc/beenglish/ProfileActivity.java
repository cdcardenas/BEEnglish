package com.cdcc.beenglish;


import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;
    private DrawerLayout mDrawerLayout;
    private String mActivityTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);



        TextView textView = (TextView) findViewById(R.id.textoperfil1);
        TextView textView1 = (TextView)findViewById(R.id.textoperfil2) ;
        TextView textView2 = (TextView)findViewById(R.id.textView) ;
        TextView textView3 = (TextView)findViewById(R.id.textView3) ;

        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/LittleMissPriss.ttf");
        textView.setTypeface(typeface);
        textView1.setTypeface(typeface);
        textView2.setTypeface(typeface);
        textView3.setTypeface(typeface);


        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();


        mDrawerList = (ListView)findViewById(R.id.navList);
        addDrawerItems();






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

    private void addDrawerItems() {
        String[] osArray = { "Cerrar sesión", "Salir" };
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectItem(position);
            }
        });

    }

    private void selectItem(int position) {
        switch(position) {
            case 0:
                Intent a = new Intent(this, BEELoginActivity.class);
                startActivity(a);
                break;
            case 1:
                this.finishAffinity();
                break;
            default:
        }
    }


}
