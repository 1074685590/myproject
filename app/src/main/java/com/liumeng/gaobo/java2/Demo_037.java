package com.liumeng.gaobo.java2;

public class Demo_037 {

	/**22:49-23��03
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Printer p=new Printer();
		new Thread(){
			public void run(){
				while (true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		new Thread(){
			public void run(){
				while (true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}
class Printer {
	private int flag=1;
	public void print1() throws InterruptedException{
		synchronized (this) {
			if (flag !=1) {
				this.wait();
			}
			
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.println();
			flag=2;
			this.notify();
		}
	}
	public void print2() throws InterruptedException{
		synchronized (this) {
			if (flag !=2) {
				this.wait();
			}
			
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println();
			flag=1;
			this.notify();
		}
	}
}
