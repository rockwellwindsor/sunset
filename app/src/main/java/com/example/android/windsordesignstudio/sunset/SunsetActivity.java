package com.example.android.windsordesignstudio.sunset;

import android.support.v4.app.Fragment;

import com.example.android.windsordesignstudio.sunset.fragment.SunsetFragment;

public class SunsetActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return SunsetFragment.newInstance();
    }
}
