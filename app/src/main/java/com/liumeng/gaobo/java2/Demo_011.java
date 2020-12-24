package com.liumeng.gaobo.java2;

public class Demo_011 {

	/**
	 * @param args
	 * ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(8));
	}
	public static int fun(int a){
		if(a==1||a==2){
			return 1;
		}else{
			return fun(a-1)+fun(a-2);
		}
	}

}
