package com.jude.joy.module.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.jude.beam.ui.RequiresPresenter;
import com.jude.beam.expansion.BeamBaseActivity;
import com.jude.joy.R;
import com.jude.joy.module.image.ImageJoyFragment;
import com.jude.joy.module.setting.AboutUsActivity;
import com.jude.joy.module.text.TextJoyFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

@RequiresPresenter(value=MainPresenter.class)
public class MainActivity extends BeamBaseActivity<MainPresenter> {

    @BindView(R.id.viewPager)
    ViewPager viewpager;
    @BindView(R.id.app_bar_layout)
    AppBarLayout appBarLayout;
    @BindView(R.id.coordinator_layout)
    CoordinatorLayout coordinatorLayout;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    private MainPagerAdapter mMainPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("JOY-给你纯粹的欢乐");
        ButterKnife.bind(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        tabLayout.setTabTextColors(getResources().getColor(R.color.whiteTrans80), getResources().getColor(R.color.white));
        viewpager.setAdapter(mMainPagerAdapter = new MainPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewpager);

        Log.e("mainactivity", "onCreate..........");
    }

    public class MainPagerAdapter extends FragmentPagerAdapter {

        public MainPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new TextJoyFragment();
                default:
                    return new ImageJoyFragment();
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "段子";
                case 1:
                    return "图片";
                case 2:
                    return "自定义";
                default:
                    return "null";
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about) {
            startActivity(new Intent(this, AboutUsActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("mainactivity", "onStart..........");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("mainactivity", "onResume..........");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("mainactivity", "onPause..........");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("mainactivity", "onStop..........");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("mainactivity", "onDestroy..........");
    }
}
