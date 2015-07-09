package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.educatenepal.activity.kantipursavingandcredit.R;
import com.sudeep23.lollipoptabs.fixedtab.FixedTabLayout;


public class BusinessBankingFragment extends Fragment {
    private FixedTabLayout fixedTabLayout;
    private ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personal_banking, container, false);
        return view;
    }


}
