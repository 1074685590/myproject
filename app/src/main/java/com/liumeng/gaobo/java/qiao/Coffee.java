package com.liumeng.gaobo.java.qiao;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public abstract class Coffee {
    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    /**
     * 咖啡具体是什么样的由子类决定
     */
    public abstract void makeCoffee();
}
