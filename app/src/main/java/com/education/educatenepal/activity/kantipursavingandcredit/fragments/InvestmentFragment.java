package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.educatenepal.activity.kantipursavingandcredit.R;
import com.education.educatenepal.activity.kantipursavingandcredit.adapters.InvestmentViewPasgerAdapter;
import com.sudeep23.lollipoptabs.fixedtab.FixedTabLayout;


public class InvestmentFragment extends Fragment {
    FixedTabLayout mFixedTabLayout;
    ViewPager mViewPager;
    InvestmentViewPasgerAdapter investmentViewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_banking, container, false);
        mFixedTabLayout = (FixedTabLayout) view.findViewById(R.id.sliding_tab);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        investmentViewPagerAdapter = new InvestmentViewPasgerAdapter(getFragmentManager(),getResources().getStringArray(R.array.investmentarray));
        mViewPager.setAdapter(investmentViewPagerAdapter);
        mFixedTabLayout.setViewPager(mViewPager,investmentViewPagerAdapter.getCount());
        mFixedTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.tabindicator));
        return view;
    }
}
