package com.example.sakhicomputer.mrnetwork.Zong;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.sakhicomputer.mrnetwork.Telenor.Tab1_telenor;
import com.example.sakhicomputer.mrnetwork.Telenor.Tab2_telenor;
import com.example.sakhicomputer.mrnetwork.Telenor.Tab3_telenor;

/**
 * Created by SAkhi COmputer on 24/01/2018.
 */

public class PagerAdapterZong extends FragmentStatePagerAdapter {

    int nNoOfTabs;

    public PagerAdapterZong(FragmentManager fm, int NumberOfTabs){
        super(fm);
        this.nNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                Tab1_zong tab1 = new Tab1_zong();
                return tab1;
            case 1:
                Tab2_zong tab2 = new Tab2_zong();
                return tab2;
            case 2:
                Tab3_zong tab3 = new Tab3_zong();
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
