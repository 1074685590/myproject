package com.liumeng.gaobo.java.qiao;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class LargeCoffee extends Coffee {
    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的"+impl.addSomething()+"咖啡");
    }
}
