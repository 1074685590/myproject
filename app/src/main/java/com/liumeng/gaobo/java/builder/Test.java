package com.liumeng.gaobo.java.builder;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class Test {
    public static void main(String args[]) {
        //构造器
        Builder builder = new MacbookBuilder();
        Director director = new Director(builder);
        director.construct("英特尔主板", "Retina显示器");
        System.out.println("Computer Info :"+builder.create().toString());
    }
}
