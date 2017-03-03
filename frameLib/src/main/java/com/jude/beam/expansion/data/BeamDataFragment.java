package com.jude.beam.expansion.data;

import com.jude.beam.ui.BeamFragment;
import com.jude.beam.ui.RequiresPresenter;

/**
 * Created by Mr.Jude on 2015/8/20.
 */
@RequiresPresenter(BeamDataActivityPresenter.class)
public class BeamDataFragment<T extends BeamDataFragmentPresenter,M> extends BeamFragment<T> {

    public void setData(M data){}
    public void setError(Throwable e){
        throw new RuntimeException(e);
    }

}
