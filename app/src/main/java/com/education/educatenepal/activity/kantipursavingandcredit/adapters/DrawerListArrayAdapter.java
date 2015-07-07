package com.education.educatenepal.activity.kantipursavingandcredit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.education.educatenepal.activity.kantipursavingandcredit.R;

/**
 * Created by gokarna on 7/7/15.
 */
public class DrawerListArrayAdapter extends ArrayAdapter {
    private String[] values;
    private Context context;
    private int[] imageValues;

    public DrawerListArrayAdapter(Context context, String[] values, int[] imageValues) {
        super(context, -1, values);
        this.values = values;
        this.context = context;
        this.imageValues = imageValues;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.customdrawerlist, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        imageView.setImageResource(imageValues[position]);
        textView.setText(values[position]);
        return view;
    }
}
