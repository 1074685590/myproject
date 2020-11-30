package com.liumeng.gaobo.java.dan;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:DCL
 */
public class Singleton2 {
    private static Singleton2 sInstance2 = null;
    private Singleton2(){}
    public static Singleton2 getsInstance2(){
        if (sInstance2 == null) {
            synchronized (Singleton2.class) {
                if (sInstance2 == null) {
                    sInstance2 = new Singleton2();
                }
            }
        }
        return sInstance2;
    }
}
