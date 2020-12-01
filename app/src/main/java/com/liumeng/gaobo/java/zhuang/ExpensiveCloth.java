package com.liumeng.gaobo.java.zhuang;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }

    private void dressShirt(){
        System.out.println("穿件短袖");
    }

    private void dressLeather() {
        System.out.println("穿件皮衣");
    }

    private void dressJean() {
        System.out.println("穿条牛仔裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }
}
