package com.jude.joy.module.setting;

import android.os.Bundle;
import android.widget.TextView;

import com.jude.beam.ui.RequiresPresenter;
import com.jude.beam.expansion.BeamBaseActivity;
import com.jude.joy.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import emagroup.beyearn.com.commonutils.JUtils;

/**
 * Created by Mr.Jude on 2015/8/14.
 */

@RequiresPresenter(AboutUsPresenter.class)
public class AboutUsActivity extends BeamBaseActivity<AboutUsPresenter> {

    @BindView(R.id.version)
    TextView version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);
        version.setText("v"+ JUtils.getAppVersionName());
    }



}
