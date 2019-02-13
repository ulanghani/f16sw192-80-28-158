package com.example.sakhicomputer.mrnetwork.Zong;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sakhicomputer.mrnetwork.R;
import com.example.sakhicomputer.mrnetwork.Telenor.PagerAdapterTelenor;
import com.example.sakhicomputer.mrnetwork.Telenor.Tab1_telenor;
import com.example.sakhicomputer.mrnetwork.Telenor.Tab2_telenor;
import com.example.sakhicomputer.mrnetwork.Telenor.Tab3_telenor;

public class Zong_main extends AppCompatActivity implements Tab1_zong.OnFragmentInteractionListener,
        Tab2_zong.OnFragmentInteractionListener, Tab3_zong.OnFragmentInteractionListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zong_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText("SMS PACKAGES"));
        tabLayout.addTab(tabLayout.newTab().setText("CALL PACKAGES"));
        tabLayout.addTab(tabLayout.newTab().setText("DATA PACKAGES"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.pager);

        final PagerAdapterZong adapter = new PagerAdapterZong(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
