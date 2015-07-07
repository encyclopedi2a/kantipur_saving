package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.educatenepal.activity.kantipursavingandcredit.R;
import com.education.educatenepal.activity.kantipursavingandcredit.adapters.ViewPagerAdapter;
import com.sudeep23.lollipoptabs.slidingtab.SlidingTabLayout;

public class AboutFragment extends Fragment {
    SlidingTabLayout mSlidingTabLayout;
    ViewPager mViewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tab);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        viewPagerAdapter = new ViewPagerAdapter(getFragmentManager());
        mViewPager.setAdapter(viewPagerAdapter);
        mSlidingTabLayout.setViewPager(mViewPager);
        mSlidingTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.tabindicator));
        return view;
    }
}
