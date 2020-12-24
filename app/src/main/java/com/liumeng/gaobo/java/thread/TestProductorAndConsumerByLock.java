package com.liumeng.gaobo.java.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者消费者模式
 * @author fliay
 *
 */
public class TestProductorAndConsumerByLock {

    public static void main(String[] args) {
        ClerkByLock c = new ClerkByLock();
        ProductorByLock pro = new ProductorByLock(c);
        ConsumerByLock con = new ConsumerByLock(c);
        new Thread(pro,"生产者A").start();
        new Thread(con,"消费者B").start();
        new Thread(pro,"生产者C").start();
        new Thread(con,"消费者D").start();
    }




}

class  ClerkByLock{
    //初始化产品
    private int product = 0;
    //定义一个Lock锁对象
    private Lock lock = new ReentrantLock();
    //创建condition对象
    private Condition condition = lock.newCondition();


    //进货
    public  void get(){
        lock.lock();

        try{
            while(product>=10){
                System.out.println("产品已满！");
                try {
                    //使用condition进行线程等待
                    condition.await();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            condition.signalAll();
            System.out.println(Thread.currentThread().getName()+":"+ ++product);
        }finally{
            //始终会解锁
            lock.unlock();
        }




    }

    //卖货
    public  void sale(){
        lock.lock();
        try{

            while(product<=0){
                System.out.println("补货中！");
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            condition.signalAll();
            System.out.println(Thread.currentThread().getName()+":"+ --product);
        }finally{
            lock.unlock();
        }


    }
}

class ProductorByLock implements Runnable{

    private ClerkByLock clerk;


    public ProductorByLock(ClerkByLock clerk) {
        this.clerk = clerk;
    }



    public void run() {
        for(int i=0;i<20;i++){
            clerk.get();
        }
    }
}


class ConsumerByLock implements Runnable{

    private ClerkByLock clerk;



    public ConsumerByLock(ClerkByLock clerk) {
        this.clerk = clerk;
    }



    public void run() {
        for(int i=0;i<20;i++){
            clerk.sale();
        }
    }
}