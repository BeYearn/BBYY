package com.jude.joy.module.text;

import android.view.ViewGroup;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.joy.R;
import com.jude.joy.model.bean.TextJoy;
import com.jude.joy.utils.RecentDateFormat;
import com.jude.joy.utils.TextFilter;
import butterknife.BindView;
import butterknife.ButterKnife;
import emagroup.beyearn.com.commonutils.JTimeTransform;

/**
 * Created by Mr.Jude on 2015/8/20.
 */
public class TextJoyVH extends BaseViewHolder<TextJoy> {
    @BindView(R.id.content)
    TextView content;
    @BindView(R.id.time)
    TextView time;

    public TextJoyVH(ViewGroup parent) {
        super(parent, R.layout.item_joy_text);
        ButterKnife.bind(this,itemView);
    }

    @Override
    public void setData(TextJoy data) {
        content.setText(TextFilter.filter(data.getText()));
        time.setText(new JTimeTransform().parse("yyyy-MM-dd hh:mm:ss",data.getCt()).toString(new RecentDateFormat()));
    }
}
