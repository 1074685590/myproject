package com.liumeng.gaobo.java2;

public class Demo_030 {

	/**1807-1815
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(){
			public void run(){
				for (int i = 0; i < 1000; i++) {
					System.out.println(getName()+"......aaaaaaaaaa");
				}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				for (int i = 0; i < 1000; i++) {
					System.out.println(getName()+"...bb");
				}
			}
		};
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
	}

}
