package com.liumeng.gaobo.java.dan;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe: 静态内部类
 */
public class Singleton3 {
    private Singleton3(){}

    public static Singleton3 getInstance() {
        return SingletonHolder.sInstance;
    }
    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static final Singleton3 sInstance = new Singleton3();
    }
}
