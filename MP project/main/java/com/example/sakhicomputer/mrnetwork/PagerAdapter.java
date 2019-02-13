package com.example.sakhicomputer.mrnetwork;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by SAkhi COmputer on 24/01/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int nNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs){
        super(fm);
        this.nNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;

             default:
            return null;

        }

//        if (position == 0) {
//            return new Tab1();
//        }
//        else if (position == 1){
//            return new Tab2();
//        }
//        else
//            return new Tab3();
    }
    @Override
    public int getCount() {
        return nNoOfTabs;
    }
}
