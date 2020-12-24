package com.liumeng.gaobo.java2;

public class Demo_024 {

	/**16:39-16:47
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
