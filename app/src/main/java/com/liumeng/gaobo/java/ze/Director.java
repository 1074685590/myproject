package com.liumeng.gaobo.java.ze;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class Director extends Leader {
    @Override
    protected void handle(int money) {
        System.out.println("主管批复报销"+money+"元");
    }

    @Override
    protected int limit() {
        return 5000;
    }
}
