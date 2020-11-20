package com.liumeng.gaobo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 需求: 做一个没有使用sava的的例子来体现出他的作用  http://blog.csdn.net/yelangjueqi/article/details/8927286
 * 思路: 在继承TextView,在onDraw方法中调用super.onDraw(canvas)之前,绘制两个不同大小的矩形,形成一个重叠效果在调用
 * super.onDraw(canvas);
 */
public class    MyTextView extends TextView {

    private Paint mPaint1, mPaint2;

    public MyTextView(Context context) {
        super(context);
        initView();
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public MyTextView(Context context, AttributeSet attrs,
                      int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        //创建画笔不要放在ondraw中,因为ondraw方法很有可能会被调用多次
        mPaint1 = new Paint();
        mPaint1.setColor(getResources().getColor(
                android.R.color.holo_blue_light));
        mPaint1.setStyle(Paint.Style.FILL);
        mPaint2 = new Paint();
        mPaint2.setColor(Color.YELLOW);
        mPaint2.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // 绘制外层矩形
        canvas.drawRect(
                0,
                0,
                getMeasuredWidth(),
                getMeasuredHeight(),
                mPaint1);
//         绘制内层矩形
        canvas.drawRect(
                10,
                10,
                getMeasuredWidth() - 10,
                getMeasuredHeight() - 10,
                mPaint2);
        canvas.save();
        // 绘制文字前平移10像素
        canvas.translate(10, 0);   //因为有10像素的边框
        // 父类完成的方法，即绘制文本
        super.onDraw(canvas);
        canvas.restore();  //这一行本来是没有注释的,但是注释了也不会有什么影响
                           //第二次补充,这一行的意思是取出平移之前的画布,防止因为之前的平移10像素造成什么不可预知的错误
    }
}
