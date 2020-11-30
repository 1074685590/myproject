package com.liumeng.gaobo.java.builder;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOs;

    protected Computer(){}

    //设置CPU核心数
    public void setBoard(String board) {
        mBoard = board;
    }

    //设置内存
    public void setDisplay(String display) {
        mDisplay = display;
    }

    //设置操作系统
    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
