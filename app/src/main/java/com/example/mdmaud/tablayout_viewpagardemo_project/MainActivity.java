package com.example.mdmaud.tablayout_viewpagardemo_project;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

   private TabLayout tabLayout;
   private WeatherAdapter weatherAdapter;
   private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);
        tabLayout.addTab(tabLayout.newTab().setText("CurrentWeather").setIcon(R.mipmap.ic_launcher_round));
        tabLayout.addTab(tabLayout.newTab().setText("ForcastWeather").setIcon(R.mipmap.ic_launcher));
        weatherAdapter=new WeatherAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(weatherAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout ));


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
               viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }


}
