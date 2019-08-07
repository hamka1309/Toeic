package com.t3h.toeic;

import android.support.v4.app.Fragment;

import com.t3h.toeic.base.BaseFragment;
import com.t3h.toeic.databinding.FragmentLevelBinding;

public class FragmentLevel extends BaseFragment<FragmentLevelBinding> {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_level;
    }

    @Override
    public int getTitle() {
        return 0;
    }
}
