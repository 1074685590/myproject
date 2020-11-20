package com.liumeng.gaobo.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.liumeng.gaobo.Fragment.ContentFragment;
import com.liumeng.gaobo.R;

public class FragmentActivity extends AppCompatActivity implements View.OnClickListener {

    FrameLayout mFrameLayout;
    ContentFragment mFragment1;
    ContentFragment mFragment2;
    ContentFragment mFragment3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        init();
    }

    private void init() {
        initView();
        initData();
    }

    private void initData() {
        mFragment1 = ContentFragment.newInstance("页面一", "");
        mFragment2 = ContentFragment.newInstance("页面二", "");
        mFragment3 = ContentFragment.newInstance("页面三", "");
        FragmentTransaction mTransaction = getSupportFragmentManager().beginTransaction();
        mTransaction.add(R.id.content, mFragment1);
        mTransaction.add(R.id.content,mFragment2).hide(mFragment2)
                .add(R.id.content,mFragment3).hide(mFragment3);
        mTransaction.commit();
    }

    private void initView() {
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        mFrameLayout = (FrameLayout) findViewById(R.id.content);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.btn1:
                fragmentTransaction.show(mFragment1).hide(mFragment2).hide(mFragment3);
                break;
            case R.id.btn2:
                fragmentTransaction.show(mFragment2).hide(mFragment1).hide(mFragment3);
                break;
            case R.id.btn3:
                fragmentTransaction.show(mFragment3).hide(mFragment2).hide(mFragment1);
                break;
        }
        fragmentTransaction.commit();
    }
}
