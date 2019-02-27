package com.example.teamas.swipeviewswithviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class DemoCollectionPagerAdapter extends FragmentStatePagerAdapter {


    public DemoCollectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ExampleFragment1 fragment1 = new ExampleFragment1();
                return fragment1;
            case 1:
                ExampleFragment2 fragment2 = new ExampleFragment2();
                return fragment2;

            case 2:
                ExampleFragment3 fragment3 = new ExampleFragment3();
                return fragment3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Tab 1";
        } else if (position == 1) {
            return "Tab 2";
        } else if (position == 2) {
            return "Tab 3";
        } else {
            return null;
        }
    }
}
