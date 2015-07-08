package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.educatenepal.activity.kantipursavingandcredit.R;
import com.education.educatenepal.activity.kantipursavingandcredit.adapters.AboutViewPagerAdapter;
import com.sudeep23.lollipoptabs.slidingtab.SlidingTabLayout;

public class AboutFragment extends Fragment {
    SlidingTabLayout mSlidingTabLayout;
    ViewPager mViewPager;
    AboutViewPagerAdapter aboutViewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tab);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        aboutViewPagerAdapter = new AboutViewPagerAdapter(getFragmentManager(), getResources().getStringArray(R.array.aboutarray));
        mViewPager.setAdapter(aboutViewPagerAdapter);
        mSlidingTabLayout.setViewPager(mViewPager);
        mSlidingTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.tabindicator));
        return view;
    }
}
