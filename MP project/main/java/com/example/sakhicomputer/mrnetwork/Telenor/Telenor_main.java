package com.example.sakhicomputer.mrnetwork.Telenor;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sakhicomputer.mrnetwork.Mobilink.PagerAdapterMobilink;
import com.example.sakhicomputer.mrnetwork.Mobilink.Tab1_mobilink;
import com.example.sakhicomputer.mrnetwork.Mobilink.Tab2_mobilink;
import com.example.sakhicomputer.mrnetwork.Mobilink.Tab3_mobilink;
import com.example.sakhicomputer.mrnetwork.R;

public class Telenor_main extends AppCompatActivity implements Tab1_telenor.OnFragmentInteractionListener,
        Tab2_telenor.OnFragmentInteractionListener, Tab3_telenor.OnFragmentInteractionListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telenor_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText("SMS PACKAGES"));
        tabLayout.addTab(tabLayout.newTab().setText("CALL PACKAGES"));
        tabLayout.addTab(tabLayout.newTab().setText("DATA PACKAGES"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.pager);

        final PagerAdapterTelenor adapter = new PagerAdapterTelenor(getSupportFragmentManager(), tabLayout.getTabCount());
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