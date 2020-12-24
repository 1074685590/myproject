package com.liumeng.gaobo.java2;

public class Demo_016 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable mr = new MyRunnable();
		Thread th = new Thread(mr);
		th.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("bbbbbb");
		}

	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println("aa");
		}
	}

}
