package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.education.educatenepal.activity.kantipursavingandcredit.R;
import com.education.educatenepal.activity.kantipursavingandcredit.adapters.BusinessBankingExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class BusinessBankingFragment extends Fragment {
    BusinessBankingExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    View view;

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
        expListView = (ExpandableListView) view.findViewById(R.id.expandableListView);
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                switch (groupPosition) {
                    case 0:
                        expListView.collapseGroup(1);
                        expListView.collapseGroup(2);

                        break;
                    case 1:
                        expListView.collapseGroup(0);
                        expListView.collapseGroup(2);
                        expListView.setSelectionAfterHeaderView();
                        break;
                    case 2:
                        expListView.collapseGroup(1);
                        expListView.collapseGroup(0);
                        expListView.setSelectionAfterHeaderView();
                        break;
                }
                expListView.smoothScrollToPosition(0);
            }
        });
        // preparing list data
        prepareListData();
        listAdapter = new BusinessBankingExpandableListAdapter(getActivity().getApplicationContext(), listDataHeader, listDataChild);
        // setting list adapter
        expListView.setAdapter(listAdapter);
        //set default expanding group
        expListView.expandGroup(0);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        // Adding child data
        listDataHeader.add("Business Accounts");
        listDataHeader.add("Business Loans");
        listDataHeader.add("Other Services");
        // Adding child data
        List<String> checkingContent = new ArrayList<String>();
        checkingContent.add("Business Accounts");
        List<String> serviceContent = new ArrayList<String>();
        serviceContent.add("Business Loans");
        List<String> loansContent = new ArrayList<String>();
        loansContent.add("Other Services");
        listDataChild.put(listDataHeader.get(0), checkingContent); // Header, Child data
        listDataChild.put(listDataHeader.get(1), serviceContent);
        listDataChild.put(listDataHeader.get(2), loansContent);
    }

}
