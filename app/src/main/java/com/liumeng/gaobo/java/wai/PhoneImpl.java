package com.liumeng.gaobo.java.wai;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }
}
