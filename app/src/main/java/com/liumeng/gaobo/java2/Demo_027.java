package com.liumeng.gaobo.java2;

public class Demo_027 {

	/**1712 1720
	 * @param args
	 * 1.�ֱ�Ϊѧɮ�ɼ���ֵ
	 * 2.���ƽ����
	 * 3.�����Ƚϣ����������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[40];
		for (int i = 0; i < 40; i++) {
			arr[i]=(int) (Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int sum=0;
		for (int i : arr) {
			sum+=i;
		}
		int pjf=sum/40;
		int count=0;
		for (int i : arr) {
			if (i<pjf) {
				count++;
			}
		}
		System.out.println(count);
	}

}
