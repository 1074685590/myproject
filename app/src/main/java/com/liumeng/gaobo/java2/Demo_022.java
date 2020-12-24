package com.liumeng.gaobo.java2;

public class Demo_022 {

	/**16:01-16:20
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Integer n=Integer.parseInt(args);
		int n1=1;
		int n2=2;
		int sum=0;
		if (n<=0) {
			System.out.println("����Ĳ�������");
			return;
		}
		if (n<=2) {
			sum=1;
		}else{
			for (int i = 3; i <=n; i++) {
				sum=n1+n2;
				n1=n2;
				n2=sum;
			}
		}
		System.out.println(sum);*/
		for (int i = 1; i < 10; i++) {
			System.out.println(getNum(i));
		}
		
		
	}
	public static int getNum(int n){
		if(n==1||n==2){
			return 1;
		}else{
			return getNum(n-1)+getNum(n-2);
		}
	}

}
