package com.jude.joy.app;

import android.support.multidex.MultiDexApplication;

import com.jude.beam.Beam;
import com.jude.joy.BuildConfig;

import emagroup.beyearn.com.commonutils.JUtils;

/**
 * Created by Mr.Jude on 2015/8/20.
 */
public class APP extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        JUtils.initialize(this);
        JUtils.setDebug(BuildConfig.DEBUG, "JoyLog");
        Beam.init(this);
    }
}
