package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.educatenepal.activity.kantipursavingandcredit.R;
import com.education.educatenepal.activity.kantipursavingandcredit.adapters.MortgageViewPagerAdapter;
import com.sudeep23.lollipoptabs.slidingtab.SlidingTabLayout;

public class MortgageFragment extends Fragment {
    SlidingTabLayout mSlidingTabLayout;
    ViewPager mViewPager;
    MortgageViewPagerAdapter mortgageViewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tab);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mortgageViewPagerAdapter = new MortgageViewPagerAdapter(getFragmentManager(), getResources().getStringArray(R.array.mortgagearray));
        mViewPager.setAdapter(mortgageViewPagerAdapter);
        mSlidingTabLayout.setViewPager(mViewPager);
        mSlidingTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.tabindicator));
        return view;
    }
}
