package com.education.educatenepal.activity.kantipursavingandcredit.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.education.educatenepal.activity.kantipursavingandcredit.fragments.OppurtunitiesFragment;

/**
 * Created by gokarna on 7/7/15.
 */
public class PersonalBankingViewPasgerAdapter extends FragmentStatePagerAdapter {
    private String[] viewPagerPages;

    public PersonalBankingViewPasgerAdapter(FragmentManager fm, String[] viewPagerPages) {
        super(fm);
        this.viewPagerPages = viewPagerPages;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new OppurtunitiesFragment();
                break;
            case 1:
                fragment = new OppurtunitiesFragment();
                break;
            case 2:
                fragment = new OppurtunitiesFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return viewPagerPages.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return viewPagerPages[position];
    }
}