package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.educatenepal.activity.kantipursavingandcredit.R;
import com.education.educatenepal.activity.kantipursavingandcredit.adapters.PersonalBankingViewPasgerAdapter;
import com.sudeep23.lollipoptabs.fixedtab.FixedTabLayout;


public class PersonalBankingFragment extends Fragment {
    private FixedTabLayout fixedTabLayout;
    private ViewPager viewPager;
    private PersonalBankingViewPasgerAdapter personalBankingViewPasgerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personal_banking, container, false);
        fixedTabLayout = (FixedTabLayout) view.findViewById(R.id.fixed_tab);
        fixedTabLayout.setBackgroundColor(Color.WHITE);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        personalBankingViewPasgerAdapter = new PersonalBankingViewPasgerAdapter(getFragmentManager(), getResources().getStringArray(R.array.personalbankingarray));
        viewPager.setAdapter(personalBankingViewPasgerAdapter);
        fixedTabLayout.setViewPager(viewPager, personalBankingViewPasgerAdapter.getCount());
        fixedTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.innertabindicator));
        return view;
    }


}
