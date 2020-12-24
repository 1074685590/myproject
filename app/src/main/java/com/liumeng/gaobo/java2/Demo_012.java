package com.liumeng.gaobo.java2;

import java.math.BigInteger;

public class Demo_012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo();
		int count=0;
		BigInteger bi1=new BigInteger("1");
		for (int i = 1; i <=1000; i++) {
			BigInteger bi2=new BigInteger(""+i);
			bi1=bi1.multiply(bi2);
		}
		String str=bi1.toString();
		StringBuffer sb=new StringBuffer(str);
		str=sb.reverse().toString();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='0') {
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);
	}
	public static void demo(){
		int count=0;
		BigInteger bi1=new BigInteger("1");
		for (int i = 1; i <=1000; i++) {
			BigInteger bi2=new BigInteger(""+i);
			bi1=bi1.multiply(bi2);
		}
		String str=bi1.toString();
		System.out.println(bi1);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='0') {
				count++;
			}
		}
		System.out.println(count);
		
	}
	

}
