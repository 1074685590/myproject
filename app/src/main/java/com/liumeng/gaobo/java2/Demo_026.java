package com.liumeng.gaobo.java2;

import java.util.Arrays;

//1707-1711
public class Demo_026 {
	public static void main(String[] args) {
		int arr[]=new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i]=i+1;
		}
		for (int i = 0; i < 10; i++) {
			if (i<9) {
				arr[i]=arr[i+1];
			} else {
				arr[i]=arr[0];
			}
		}
		System.out.println(Arrays.toString(arr));;
	}

}
