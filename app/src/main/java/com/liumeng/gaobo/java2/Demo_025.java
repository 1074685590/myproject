package com.liumeng.gaobo.java2;

public class Demo_025 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (100 * (Math.random()));
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(sum / 10);

	}

}
