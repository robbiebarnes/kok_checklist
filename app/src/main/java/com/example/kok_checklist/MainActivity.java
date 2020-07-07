package com.example.kok_checklist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private static final boolean USE_FLAG = true;
    private static final int mFlag = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;

    TabLayout mTabLayout;
    ViewPager mViewPager;
    PagerController mPagerController;

    TabItem bartender;
    TabItem server;
    TabItem barback;
    TabItem security;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = findViewById(R.id.jobTabLayout);
        bartender = findViewById(R.id.bartenderTab);
        server = findViewById(R.id.serverTab);
        barback = findViewById(R.id.barbackTab);
        security = findViewById(R.id.securityTab);
        mViewPager = findViewById(R.id.viewpager);

        mPagerController = new PagerController(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(mPagerController);

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));




    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void OnMainToNotesButtonClick(View V) {
        Intent myIntent = new Intent(this, Notes.class);

        if(USE_FLAG)
            myIntent.addFlags(mFlag);

        startActivity(myIntent);
    }

    public void OnMainToQueryButtonClick(View V) {
        Intent myIntent = new Intent(this, Query.class);

        if(USE_FLAG)
            myIntent.addFlags(mFlag);

        startActivity(myIntent);
    }
}
