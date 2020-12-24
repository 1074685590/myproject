package com.liumeng.gaobo.java2;

public class Demo_034 {

	/**21:43-
	 * @param args
	 * �������ģʽ�����ַ���
	 * 1.����ʽ2.����ʽ3.ֱ��final
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1=Singleton.s;
		Singleton s2=Singleton.s;
		System.out.println(s1==s2);
	}

}
class Singleton{
	private Singleton(){};
	static final Singleton s=new Singleton();
	
}