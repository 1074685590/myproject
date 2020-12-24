package com.liumeng.gaobo.java;

import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by liumeng on 2020/12/24 0024.
 * Describe:
 */
public class UnLock {
    public static       String    obj1 = "obj1";
    public static final Semaphore a1 = new Semaphore(1);
    public static final Semaphore a2 = new Semaphore(1);
    public static       String    obj2 = "obj2";


}

class LockA implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockA 开始执行");
            while (true) {
                if (UnLock.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + " LockA 锁住 obj1");
                    if (UnLock.a2.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + " LockA 锁住 obj2");
                        Thread.sleep(60 * 1000);
                    } else {

                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class LockB implements Runnable {

    @Override
    public void run() {

    }
}