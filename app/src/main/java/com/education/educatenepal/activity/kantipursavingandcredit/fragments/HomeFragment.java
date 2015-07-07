package com.education.educatenepal.activity.kantipursavingandcredit.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

import com.education.educatenepal.activity.kantipursavingandcredit.R;


public class HomeFragment extends Fragment {
    private ViewFlipper viewFlipper;
    private float initialX = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        viewFlipper = (ViewFlipper) view.findViewById(R.id.viewFlipper);
        viewFlipper.setInAnimation(getActivity().getApplicationContext(), R.anim.in_right);
        viewFlipper.setOutAnimation(getActivity().getApplicationContext(), R.anim.out_left);
        viewFlipper.setOnTouchListener(new ViewFlipperTouch());
        return view;
    }

    private class ViewFlipperTouch implements View.OnTouchListener {

        @Override
        public boolean onTouch(View v, MotionEvent touchevent) {
            switch (touchevent.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    initialX = touchevent.getX();
                    break;
                case MotionEvent.ACTION_UP:
                    float finalX = touchevent.getX();
                    if (initialX > finalX) {
                        if (viewFlipper.getDisplayedChild() == 1)
                            break;
                        viewFlipper.setInAnimation(getActivity().getApplicationContext(), R.anim.in_right);
                        viewFlipper.setOutAnimation(getActivity().getApplicationContext(), R.anim.out_left);

                        viewFlipper.showNext();
                    } else {
                        if (viewFlipper.getDisplayedChild() == 0)
                            break;
                        viewFlipper.setInAnimation(getActivity().getApplicationContext(), R.anim.in_left);
                        viewFlipper.setOutAnimation(getActivity().getApplicationContext(), R.anim.out_right);
                        viewFlipper.showPrevious();
                    }
                    break;
            }
            return true;
        }
    }

}
