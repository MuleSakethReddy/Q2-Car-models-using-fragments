package com.example.q6frag;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class main extends AppCompatActivity {
    FragmentManager fm;
    FragmentTransaction ft;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        ft.add(R.id.frame1,new SuzukiFragment());
        ft.commit();
    }
    public void suz(View v){
        ft=fm.beginTransaction();
        ft.replace(R.id.frame1,new SuzukiFragment());
        ft.commit();
    }
    public void bmw(View v){
        ft=fm.beginTransaction();
        ft.replace(R.id.frame1,new BMWFragment());
        ft.commit();
    }
    public void honda(View v){
        ft=fm.beginTransaction();
        ft.replace(R.id.frame1,new HondaFragment());
        ft.commit();
    }
    public void kia(View v){
        ft=fm.beginTransaction();
        ft.replace(R.id.frame1,new KiaFragment());
        ft.commit();
    }
}
