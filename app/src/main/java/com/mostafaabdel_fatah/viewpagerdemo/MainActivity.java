package com.mostafaabdel_fatah.viewpagerdemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    int [] images = {R.drawable.image1,R.drawable.image2, R.drawable.image3,
            R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,
            R.drawable.image8,R.drawable.image9,R.drawable.paths1,R.drawable.paths2,
            R.drawable.paths3,R.drawable.paths4,R.drawable.paths5,R.drawable.paths6,
            R.drawable.paths7,R.drawable.paths8,R.drawable.paths9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Item> arrayList = new ArrayList<Item>();
        for(int i = 0 ; i < 7 ; i++) {
            Item item = new Item();
            item.setText("image " + i);
            item.setImage(images[i%images.length]);
            arrayList.add(item);
        }
        /************************************************/
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this,arrayList);
        viewPager.setAdapter(viewPagerAdapter);
    }
}
