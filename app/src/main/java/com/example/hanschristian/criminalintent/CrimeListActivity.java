package com.example.hanschristian.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Hans Christian on 02.09.2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
