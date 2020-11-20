package com.liumeng.gaobo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2018/8/23 0023 on 下午 4:38
 */

public class LMViewGroup extends ViewGroup {
    public LMViewGroup(Context context) {
        super(context);
    }

    public LMViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LMViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
