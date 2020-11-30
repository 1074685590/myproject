package com.liumeng.gaobo.java.qiao;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class Main {
    public static void main(String args[]) {
        Oridinary oridinary = new Oridinary();
        Sugar sugar = new Sugar();

        LargeCoffee largeCoffee = new LargeCoffee(oridinary);
        largeCoffee.makeCoffee();

        SmallCoffee smallCoffee = new SmallCoffee(oridinary);
        smallCoffee.makeCoffee();

        LargeCoffee largeCoffee1 = new LargeCoffee(sugar);
        largeCoffee1.makeCoffee();

        SmallCoffee smallCoffee1 = new SmallCoffee(sugar);
        smallCoffee1.makeCoffee();
    }
}
