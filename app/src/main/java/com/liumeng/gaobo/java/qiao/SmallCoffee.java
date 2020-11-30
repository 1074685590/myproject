package com.liumeng.gaobo.java.qiao;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的"+impl.addSomething()+"咖啡");
    }
}
