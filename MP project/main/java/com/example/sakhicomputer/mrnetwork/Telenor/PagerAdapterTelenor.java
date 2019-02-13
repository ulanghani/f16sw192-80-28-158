package com.example.sakhicomputer.mrnetwork.Telenor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.sakhicomputer.mrnetwork.Mobilink.Tab1_mobilink;
import com.example.sakhicomputer.mrnetwork.Mobilink.Tab2_mobilink;
import com.example.sakhicomputer.mrnetwork.Mobilink.Tab3_mobilink;

/**
 * Created by SAkhi COmputer on 24/01/2018.
 */

public class PagerAdapterTelenor extends FragmentStatePagerAdapter {

    int nNoOfTabs;

    public PagerAdapterTelenor(FragmentManager fm, int NumberOfTabs){
        super(fm);
        this.nNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                Tab1_telenor tab1 = new Tab1_telenor();
                return tab1;
            case 1:
                Tab2_telenor tab2 = new Tab2_telenor();
                return tab2;
            case 2:
                Tab3_telenor tab3 = new Tab3_telenor();
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
