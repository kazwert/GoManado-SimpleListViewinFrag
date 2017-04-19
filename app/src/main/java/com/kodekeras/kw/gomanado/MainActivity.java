package com.kodekeras.kw.gomanado;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.kodekeras.kw.gomanado.adapter.TabFragmentAdapter;

public class MainActivity extends AppCompatActivity {
    //deklarasi semua komponen View yang akan digunakan
    private Toolbar toolbar;
    private ViewPager pager;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager)findViewById(R.id.pager);
        tabs = (TabLayout)findViewById(R.id.tabs);

        //set object adapter ke viewpager
        pager.setAdapter(new TabFragmentAdapter(getSupportFragmentManager()));

        //manipulasi sdikit untuk textcolor
        //set tab ke view pager
        tabs.setupWithViewPager(pager);

        //konfigurasi gravity fill
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
    }

}
