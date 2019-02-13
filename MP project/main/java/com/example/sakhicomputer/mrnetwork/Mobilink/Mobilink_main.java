package com.example.sakhicomputer.mrnetwork.Mobilink;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sakhicomputer.mrnetwork.R;
import com.example.sakhicomputer.mrnetwork.Tab1;
import com.example.sakhicomputer.mrnetwork.Tab2;
import com.example.sakhicomputer.mrnetwork.Tab3;

public class Mobilink_main extends AppCompatActivity implements Tab1_mobilink.OnFragmentInteractionListener,
        Tab2_mobilink.OnFragmentInteractionListener, Tab3_mobilink.OnFragmentInteractionListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobilink_main);


        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText("SMS PACKAGES"));
        tabLayout.addTab(tabLayout.newTab().setText("CALL PACKAGES"));
        tabLayout.addTab(tabLayout.newTab().setText("DATA PACKAGES"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.pager);

        final PagerAdapterMobilink adapter = new PagerAdapterMobilink(getSupportFragmentManager(), tabLayout.getTabCount());
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
