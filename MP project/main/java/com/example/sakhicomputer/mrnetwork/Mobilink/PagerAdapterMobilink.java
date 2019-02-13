package com.example.sakhicomputer.mrnetwork.Mobilink;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.sakhicomputer.mrnetwork.Tab1;
import com.example.sakhicomputer.mrnetwork.Tab2;
import com.example.sakhicomputer.mrnetwork.Tab3;

/**
 * Created by SAkhi COmputer on 24/01/2018.
 */

public class PagerAdapterMobilink extends FragmentStatePagerAdapter {

    int nNoOfTabs;

    public PagerAdapterMobilink(FragmentManager fm, int NumberOfTabs){
        super(fm);
        this.nNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                Tab1_mobilink tab1 = new Tab1_mobilink();
                return tab1;
            case 1:
                Tab2_mobilink tab2 = new Tab2_mobilink();
                return tab2;
            case 2:
                Tab3_mobilink tab3 = new Tab3_mobilink();
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
