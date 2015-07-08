package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.educatenepal.activity.kantipursavingandcredit.R;
import com.education.educatenepal.activity.kantipursavingandcredit.adapters.BankingViewPasgerAdapter;
import com.sudeep23.lollipoptabs.fixedtab.FixedTabLayout;


public class BankingFragment extends Fragment {
    FixedTabLayout mFixedTabLayout;
    ViewPager mViewPager;
    BankingViewPasgerAdapter bankingViewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_banking, container, false);
        mFixedTabLayout = (FixedTabLayout) view.findViewById(R.id.sliding_tab);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        bankingViewPagerAdapter = new BankingViewPasgerAdapter(getFragmentManager(),getResources().getStringArray(R.array.bankingarray));
        mViewPager.setAdapter(bankingViewPagerAdapter);
        mFixedTabLayout.setViewPager(mViewPager,bankingViewPagerAdapter.getCount());
        mFixedTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.tabindicator));
        return view;
    }
}
