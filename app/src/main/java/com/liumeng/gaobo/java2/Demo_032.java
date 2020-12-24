package com.liumeng.gaobo.java2;

public class Demo_032 {

	/**15-26-44
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTicket mt=new MyTicket();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}

}
class MyTicket implements Runnable{
	private static int ticket=100;
	public void run(){
		while (true) {
			synchronized (this) {
				
				if (ticket<=0) {
					break;
				}
				try {
					Thread.sleep(10);				//�߳�1˯,�߳�2˯,�߳�3˯,�߳�4˯
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"����"+ticket--+"��Ʊ");
			}
		}
	}
}
