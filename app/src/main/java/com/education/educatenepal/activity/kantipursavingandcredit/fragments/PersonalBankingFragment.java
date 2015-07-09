package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;

import com.education.educatenepal.activity.kantipursavingandcredit.R;
import com.education.educatenepal.activity.kantipursavingandcredit.adapters.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by gokarna on 7/9/15.
 */
public class PersonalBankingFragment extends android.support.v4.app.Fragment {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    View view;
    int height;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_personal_banking, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearlayout);
        expListView = (ExpandableListView) view.findViewById(R.id.expandableListView);
        // preparing list data
        prepareListData();
        listAdapter = new ExpandableListAdapter(getActivity().getApplicationContext(), listDataHeader, listDataChild);
        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        // Adding child data
        listDataHeader.add("Personal Checking");
        listDataHeader.add("Personal Service");
        listDataHeader.add("Personal Loans");
        // Adding child data
        List<String> checkingContent = new ArrayList<String>();
        checkingContent.add("Personal Checking");
        List<String> serviceContent = new ArrayList<String>();
        serviceContent.add("Personal Service");
        List<String> loansContent = new ArrayList<String>();
        loansContent.add("Personal Loans");
        listDataChild.put(listDataHeader.get(0), checkingContent); // Header, Child data
        listDataChild.put(listDataHeader.get(1), serviceContent);
        listDataChild.put(listDataHeader.get(2), loansContent);
    }
}
