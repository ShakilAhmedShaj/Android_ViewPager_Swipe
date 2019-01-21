package com.t3ch.shaj.android_viewpager_swipe_tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Shakil Ahmed Shaj on 22-Jan-19.
 * shakilahmedshaj@gmail.com
 */
public class DemoFragmentCollectionAdapter extends FragmentStatePagerAdapter {
    public DemoFragmentCollectionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        DemoFragment demoFragment = new DemoFragment();

        Bundle bundle = new Bundle();

        i=i+1;

        bundle.putString("message","Hello from Page : "+i);

        demoFragment.setArguments(bundle);





        return demoFragment;
    }

    @Override
    public int getCount() {
        return 100;
    }
}
