package com.liumeng.gaobo.java2;

public class Demo_018 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread("furong") {
			public void run() {
				System.out.println(this.getName() + "....aaaaaaaaaaaaa");
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				this.setName("����");
				System.out.println(this.getName() + "....bb");
			}
		};
		t1.start();
		t2.start();
	}

}
