package com.liumeng.gaobo.java.gong;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q7启动了");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7开始自动巡航!");
    }
}
