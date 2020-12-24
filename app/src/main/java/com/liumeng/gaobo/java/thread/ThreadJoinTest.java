package com.liumeng.gaobo.java.thread;

public class ThreadJoinTest implements Runnable {


    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new ThreadJoinTest());

        thread.start();

//        thread.join();
        thread.join(2000);

        System.out.println("主线程结束");

    }


    @Override

    public void run() {

        System.out.println("子线程开始");

        for (int i = 0; i < 5; i++) {

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

            System.out.println(i);

        }

        System.out.println("子线程结束");

    }

}
