package com.liumeng.gaobo.java;

/**
 * Created by liumeng on 2020/12/24 0024.
 * Describe:
 */
public class Lock {
    public static String a = "a";
    public static String b = "b";

    public static void main(String[] args) {
        new Thread(new R1()).start();
        new Thread(new R2()).start();
    }
}

class R1 implements Runnable {

    @Override
    public void run() {
        synchronized (Lock.a) {
            try {
                System.out.println("1");
                Thread.sleep(3000);
                synchronized (Lock.b) {
                    System.out.println("11");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class R2 implements Runnable {

    @Override
    public void run() {
        synchronized (Lock.b) {
            try {
                System.out.println("2");
                Thread.sleep(3000);
                synchronized (Lock.a) {
                    System.out.println("22");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}