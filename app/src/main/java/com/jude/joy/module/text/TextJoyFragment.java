package com.jude.joy.module.text;

import android.view.ViewGroup;

import com.jude.beam.ui.RequiresPresenter;
import com.jude.beam.expansion.list.BeamListFragment;
import com.jude.beam.expansion.list.ListConfig;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.joy.model.bean.TextJoy;

/**
 * Created by Mr.Jude on 2015/8/20.
 */
@RequiresPresenter(TextJoyPresenter.class)
public class TextJoyFragment extends BeamListFragment<TextJoyPresenter,TextJoy> {
    @Override
    public BaseViewHolder getViewHolder(ViewGroup viewGroup, int i) {    //vh属于v层    adapter属于p
        return new TextJoyVH(viewGroup);
    }

    @Override
    public ListConfig getConfig() {
        return super.getConfig()
                .setLoadmoreAble(true)
                .setRefreshAble(true)
                .setNoMoreAble(true)
                .setErrorAble(true)
                .setErrorTouchToResumeAble(true);
    }
}
