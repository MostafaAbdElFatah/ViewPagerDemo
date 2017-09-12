package com.mostafaabdel_fatah.viewpagerdemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mostafa AbdEl_Fatah on 8/9/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {

    Context context;
    ArrayList<Item> arrayList;
    LayoutInflater layoutInflater;

    public ViewPagerAdapter(Context context , ArrayList<Item> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (LinearLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.row, container , false);
        LinearLayout bg = (LinearLayout) view.findViewById(R.id.image);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        bg.setBackgroundResource(arrayList.get(position).getImage());
        textView.setText(arrayList.get(position).getText());
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
