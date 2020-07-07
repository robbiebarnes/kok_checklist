package com.example.kok_checklist;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {
    int tabCounts;

    PagerController(FragmentManager fm, int tabCounts) {
        super(fm);
        this.tabCounts = tabCounts;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new Bartender();
            case 1:
                return new Server();
            case 2:
                return new Barback();
            case 3:
                return new Security();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCounts;
    }
}
