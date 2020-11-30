package com.liumeng.gaobo.java.dan;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe: 懒汉模式
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
