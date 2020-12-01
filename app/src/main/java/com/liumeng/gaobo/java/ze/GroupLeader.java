package com.liumeng.gaobo.java.ze;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class GroupLeader extends Leader {
    @Override
    protected void handle(int money) {
        System.out.println("组长批复报销"+money+"元");
    }

    @Override
    protected int limit() {
        return 1000;
    }
}
