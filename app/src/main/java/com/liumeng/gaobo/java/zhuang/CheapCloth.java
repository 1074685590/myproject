package com.liumeng.gaobo.java.zhuang;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class CheapCloth extends PersonCloth {
    public CheapCloth(Person person) {
        super(person);
    }

    public void dressShorts() {
        System.out.println("穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
