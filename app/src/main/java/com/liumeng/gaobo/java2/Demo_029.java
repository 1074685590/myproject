package com.liumeng.gaobo.java2;

public class Demo_029 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t1=new Mythread();
		Mythread t2=new Mythread();
		t1.start();
		t2.start();
	}

}
class Mythread extends Thread{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			if (i%10==0) {
				Thread.yield();
			}
			System.out.println(getName()+"....."+i);
		}
	}
}
