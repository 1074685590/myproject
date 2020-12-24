package com.liumeng.gaobo.java2;

public class Demo_005 {

	/**
	 * @param args������е�ˮ�ɻ�������νˮ�ɻ�����ָһ���� 3 λ���������λ���������͵����䱾 �� 
	 * ���磺 153 = 1*1*1 + 3*3*3 + 5*5*5 
	 * 1.����1000����ѭ����������
	 * 2.��ȡ��������ĸ�λ����Ϊ����ζ
	 * 3��������ʽ a*a*a+b*b*b+c*c*c=num
	 * ������ ��λ�ȡ��λ
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		for (int num = 1; num < 1000; num++) {
			a=num/100;
			b=(num-100*a)/10;
			c=num-100*a-10*b;
			if (a*a*a+b*b*b+c*c*c==num) {
				System.out.println(num);
			}
		}
		
	}

}
