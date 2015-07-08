package com.education.educatenepal.activity.kantipursavingandcredit.classes;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by gokarna on 7/8/15.
 */
public class CustomInnnerViewPager extends ViewPager {
    // private boolean isPagingEnabled = true;

    public CustomInnnerViewPager(Context context) {
        super(context);
    }

    public CustomInnnerViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        // Never allow swiping to switch between pages
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // Never allow swiping to switch between pages
        return false;
    }
}
