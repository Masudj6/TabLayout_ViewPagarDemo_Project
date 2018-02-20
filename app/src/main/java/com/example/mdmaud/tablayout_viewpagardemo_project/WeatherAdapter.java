package com.example.mdmaud.tablayout_viewpagardemo_project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Md.Maud on 2/20/2018.
 */

public class WeatherAdapter extends FragmentPagerAdapter {
    private int tabcount;

    public WeatherAdapter(FragmentManager fm,int tabcount) {
        super(fm);
        this.tabcount=tabcount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new CurrentFragment();
            case 1:
                return new ForcustFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
