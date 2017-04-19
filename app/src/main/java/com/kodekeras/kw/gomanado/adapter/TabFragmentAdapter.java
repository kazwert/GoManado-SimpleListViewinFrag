package com.kodekeras.kw.gomanado.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.kodekeras.kw.gomanado.Tab1;
import com.kodekeras.kw.gomanado.Tab2;

/**
 * Created by User on 19-Apr-17.
 */

public class TabFragmentAdapter extends FragmentPagerAdapter {
    //nama tab
    String[] title = new String[]{
            "Tab 1","Tab 2"
    };
    public TabFragmentAdapter(FragmentManager fm) {
        super(fm);
    }
    //untuk manipulasi tampilan fragment di layar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Tab1();
                break;
            case 1:
                fragment = new Tab2();
                break;
            case 2:
                fragment = null;
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
