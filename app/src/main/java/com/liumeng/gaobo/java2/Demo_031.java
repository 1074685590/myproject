package com.liumeng.gaobo.java2;

public class Demo_031 {

	/**1840-48-02
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Print p=new Print();
		new Thread(){
			public void run(){
				while(true){
					p.print1();
				}
			}
		}.start();
		new Thread(){
			public void run(){
				while(true){
					p.print2();
				}
			}
		}.start();
	}

}
class Print{
	Object obj=new Object();
	public static synchronized void print1(){
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ѱ");
			System.out.print("��");
			System.out.println();
	}
	public static void print2(){
		synchronized (Print.class) {
			
			System.out.print("��");
			System.out.print("ֵ");
			System.out.print("��");
			System.out.print("��");
			System.out.println();
		}
	}
}
