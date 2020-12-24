package com.liumeng.gaobo.java2;

import java.util.ArrayList;

public class Demo_014 {

	/**11:38-11:57
	 * @param args��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLucklyNum(50));;
	}
	public static int getLucklyNum(int num){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= num; i++) {
			list.add(i);									//��1��num�洢�ڼ�����
		}
		int count = 1;										//����������,ֻҪ��3�ı�����ɱ��
		for(int i = 0; list.size() != 1; i++) {				//ֻҪ��������������1,��Ҫ���ϵ�ɱ
			if(i == list.size()) {							//���i������������������+1ʱ
				i = 0;										//���¹���
			}
			
			if(count % 3 == 0) {							//�����3�ı���
				list.remove(i--);								//��ɱ��
			}
			count++;
		}
		
		return list.get(0);
	}

}
