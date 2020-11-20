package com.liumeng.gaobo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 需求让他沿着y轴变化
 * 要想实现这个效果,可以充分利用Paint对象的Shader渲染器,通过设置一个不断变化的LinearGradient,并使用带有该属性的paint对象
 * 来绘制要显示的文字.
 * 1. 首先在onSizeChanged中进行一些初始化操作,并根据View的宽度设置一个LinearGradient渐变渲染器
 *         分析: 为什么要在onSizeChanged进行初始化操作,而不再构造方法中,因为在onSizeChanged中可以获取控件的宽高等信息
 * 2.其中的关键就是使用getPaint()方法获取当前绘制TextView的paint对象,并且给这个paint对象设置LinearGridient属性
 * 3. 最后在onDraw方法中通过矩阵的方式来不断平移渐变的效果,从而在绘制文字时,产生动态闪动效果
 */
public class ShineTextView extends TextView {

    private LinearGradient mLinearGradient;
    private Matrix         mGradientMatrix;
    private Paint          mPaint;
    private int            mViewWidth = 0;
    private int            mTranslate = 0;

    public ShineTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (mViewWidth == 0) {
            mViewWidth = getMeasuredWidth();
            if (mViewWidth > 0) {
                mPaint = getPaint();
                mLinearGradient = new LinearGradient(
                        0,
                        0,
                        mViewWidth,
                        0,
                        new int[]{
                                Color.BLUE, 0xffffffff,
                                Color.BLUE},
                        null,
                        Shader.TileMode.CLAMP);
                mPaint.setShader(mLinearGradient);
                mGradientMatrix = new Matrix();
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mGradientMatrix != null) {
            mTranslate += mViewWidth / 5;
            if (mTranslate > 2 * mViewWidth) {
                mTranslate = -mViewWidth;
            }
            mGradientMatrix.setTranslate(mTranslate, 0);
            mLinearGradient.setLocalMatrix(mGradientMatrix);
            postInvalidateDelayed(100);
        }
    }
}

