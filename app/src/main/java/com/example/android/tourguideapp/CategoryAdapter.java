package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext= context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricalFragment();
        } else if (position == 1){
            return new NatureOutdoorFragment();
        } else if (position== 2) {
            return new NightLifeFragment();
        }else {
            return new HotelFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_historical);
        } else if (position == 1){
            return mContext.getString(R.string.category_nature);
        } else if (position== 2) {
            return mContext.getString(R.string.category_nightLife);
        }else {
            return mContext.getString(R.string.category_hotels);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
