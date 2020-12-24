package com.liumeng.gaobo.java2;

public class Demo_020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Thread t1=new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println(this.getName()+"aaaa ");
				}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println(this.getName()+"aaaa ");
					if (i==2) {
						try{
							t1.join(1);
						}catch(InterruptedException e){
							e.printStackTrace();
						}
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
