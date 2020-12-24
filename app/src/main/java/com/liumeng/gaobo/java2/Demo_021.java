package com.liumeng.gaobo.java2;

public class Demo_021 {

	/**15:55-16-01
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fenzi=4;
		double fenmu=1;
		double pi = 0;
		for (int i = 0; i < 10000000; i++) {
			pi+=fenzi/fenmu;
			fenzi=fenzi*(-1);
			fenmu+=2;
			
		}
		System.out.println(pi);
	}

}
