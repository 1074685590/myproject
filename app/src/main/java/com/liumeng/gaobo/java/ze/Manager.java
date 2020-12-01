package com.liumeng.gaobo.java.ze;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class Manager extends Leader {
    @Override
    protected void handle(int money) {
        System.out.println("经理批复报销"+money+"元");
    }

    @Override
    protected int limit() {
        return 10000;
    }
}
