package com.liumeng.gaobo.java.zhuang;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class Main {
    public static void main(String[] args) {
        //首先我们要有一个Person男孩
        Person person = new Boy();

        PersonCloth clothCheap = new CheapCloth(person);
        clothCheap.dressed();

        PersonCloth clothExpensive = new ExpensiveCloth(person);
        clothExpensive.dressed();
    }
}
