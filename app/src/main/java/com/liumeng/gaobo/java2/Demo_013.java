package com.liumeng.gaobo.java2;

public class Demo_013 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(1000));
	}
	public static int fun(int num){
		if (num>0&&num<5) {
			return 0;
		} else {
			return num/5+fun(num/5);
		}
	}

}
