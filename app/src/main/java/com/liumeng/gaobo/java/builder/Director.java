package com.liumeng.gaobo.java.builder;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe: 负责构造Computer
 */
public class Director {
    Builder mBuilder = null;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public void construct(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
