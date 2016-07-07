package anh.excam.com.testapp;

import android.graphics.Color;

import android.support.design.widget.TabLayout;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

import anh.excam.com.testapp.adapter.ViewPagerAdapter;
import anh.excam.com.testapp.fragment.FragmentExercises;
import anh.excam.com.testapp.fragment.FragmentWorkOuts;

public class MainActivity extends AppCompatActivity implements  FragmentWorkOuts.RCVOnItemClick  {
    private ViewPager viewPager;

    AHBottomNavigation bottomNavigation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBottom();

    }

    public void setBottom() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottombar);


        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);


        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.WorkOuts
                , R.drawable.ic_alarm_black_24dp, android.R.color.holo_blue_dark);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.Exercises
                , R.drawable.ic_chrome_reader_mode_black_24dp, android.R.color.holo_blue_dark);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.Setting
                , R.drawable.ic_settings_black_24dp, android.R.color.holo_blue_dark);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem(R.string.more
                , R.drawable.ic_error_outline_black_24dp, android.R.color.holo_blue_dark);

        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);
        bottomNavigation.addItem(item4);
        bottomNavigation.setBehaviorTranslationEnabled(false);

        // Change colors

// Force to tint the drawable (useful for font with icon for example)
        bottomNavigation.setForceTint(true);

// Force the titles to be displayed (against Material Design guidelines!)
        bottomNavigation.setForceTitlesDisplay(true);

// Use colored navigation with circle reveal effect
        bottomNavigation.setColored(true);
        //xem hộ minh cái lag đc k, giật vl;

// Set current item programmatically
        bottomNavigation.setCurrentItem(0);

// Customize notification (title, background, typeface)
        bottomNavigation.setNotificationBackgroundColor(Color.parseColor("#F63D2B"));

// Add or remove notification for each item
        bottomNavigation.setNotification("3", 1);
        bottomNavigation.setNotification("", 1);
//ham bat su kien
        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                viewPager.setCurrentItem(position);
                return true;
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                // chưa dùng cái này bao giwof.
//                nhưng bắt sự kiện để đổi màu button trên tab ở đây
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void changeViewPagerItem(int position) {
        viewPager.setCurrentItem(4);
    }
}

//lỗi scroll viewpager và tab không đổi màu.
