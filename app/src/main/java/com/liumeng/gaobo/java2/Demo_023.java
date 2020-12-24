package com.liumeng.gaobo.java2;

public class Demo_023 {

	/**16:21-16:38
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fenzi=1;
		double fenmu=1;
		double sum=0;
		while (Math.abs(fenzi/fenmu)<1e-5) {
			
			sum+=fenzi/fenmu;
			fenzi*=-1;
			fenmu+=2;
		}
	
		System.out.println(sum);
	}

}
