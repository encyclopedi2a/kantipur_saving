package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.education.educatenepal.activity.kantipursavingandcredit.R;

public class MessageFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        TextView textView = (TextView) view.findViewById(R.id.content);
        textView.setText(Html.fromHtml(messageText()));
        return view;
    }

    private String messageText() {
        String content = "Welcome to Kantipur Co-operative Bank. We hope " +
                "your decision to visit our website will be a decision you " +
                "repeat frequently. We believe a good banking relationship is" +
                " based on solid communication and high- quality products and services. " +
                "To that end, we want this site to be a source of information and a tool" +
                " to help you make choices. We are committed to improving this site, making " +
                "it more useful, and bringing you new types of information whenever possible." +
                " We welcome your suggestions and comments.<br><br>Thank you all<br> " +
                "<b>C.B. Lama</b>" ;
        return content;
    }

}
