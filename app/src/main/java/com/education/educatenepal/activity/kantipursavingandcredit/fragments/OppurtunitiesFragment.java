package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.education.educatenepal.activity.kantipursavingandcredit.R;

public class OppurtunitiesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_oppurtunities, container, false);
        TextView textView = (TextView) view.findViewById(R.id.content);
        textView.setText(Html.fromHtml(setTextContent()));
        return view;
    }

    private String setTextContent() {
        String content = "Kantipur Cooperative Bank invites you to consider a career with us. " +
                "We pride ourselves On providing exceptional service to our customers and a " +
                "challenging and rewarding work.Environment for our employees. We are always " +
                "looking for friendly, self-motivated Individuals, who enjoy helping people," +
                " have strong communication skills, are detail-oriented, and enjoy working as" +
                " part of a team.<br><br> " +
                "We offer a friendly work environment, unique opportunities for growth, and " +
                "a competitive salary and benefits package, health and dental insurance, " +
                "vacation and sick time, incentive programs, and profit sharing.<br><br> " +
                "<b>Human Resource Officer</b><br> Kantipur Cooperative Bank<br> P.O.Box...20457, Gorkha Complex.<br>" +
                "Minbhawan, Kathmandu, Nepal <br><br>" +
                "Do NOT e-mail your resume or applications. Due to the volume of applicants," +
                " Kantipur Cooperative Bank will ONLY accept applications in person or by mail. " +
                "And please, no phone calls.";
        return content;
    }
}
