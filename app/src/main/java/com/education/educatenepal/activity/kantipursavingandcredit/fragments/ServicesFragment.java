package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.education.educatenepal.activity.kantipursavingandcredit.R;

/**
 * Created by gokarna on 7/9/15.
 */
public class ServicesFragment extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_services, container, false);
        TextView content = (TextView) view.findViewById(R.id.content);
        content.setText(Html.fromHtml(servicesContent()));
        return view;
    }

    private String servicesContent() {
        String content = "<b>How can we help you today?</b><br><br>Your needs, thoughts and concerns are very " +
                "important to us. Below are just a few options on how to reach us when you can't" +
                " make it to one of our locations . We look forward to hearing from you!<br><br><b> By Phone</b><br> " +
                "To be connected to any office,<br>please call<br> +977-1-4106531<br> +977-1-4106549<br>" +
                "+977-1-4106550<br><br> To reach Account Servicing, Administration, Audit, Compliance, " +
                "Finance, Human Resources, Imaging,Information Technology, Maintenance or Marketing,<br><br>" +
                "please call<br> +977-1-4490396 , +977-1-4490396.<br><br>  <b>By e-mail</b><br>" +
                "\u2022 General Bank email - bank@kantiputgroup.com<br>" +
                "\u2022 Account Servicing - asd@kantiputgroup.com<br>" +
                "\u2022 Marketing - marketing@kantiputgroup.com<br>" +
                "\u2022 Mortgage - mortgage@kantiputgroup.com<br>";
        return content;
    }

}
