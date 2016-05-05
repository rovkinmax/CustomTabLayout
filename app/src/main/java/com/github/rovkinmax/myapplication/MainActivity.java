package com.github.rovkinmax.myapplication;

import android.os.Bundle;
import android.support.design.widget.CustomTabLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[] title = {"title", "tit", "titles long very long", "title", "title", "tit", "titleslong"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomTabLayout tabLayout = (CustomTabLayout) findViewById(R.id.tabLayout);
        for (String s : title) {
            CustomTabLayout.Tab tab = tabLayout.newTab().setText(s);
            tabLayout.addTab(tab);

        }
    }
}
