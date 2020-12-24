package com.liumeng.gaobo.java2;

import java.io.File;
import java.util.Scanner;

public class Demo_007 {

	/**
	 * @param args ͳ��������ļ��еĴ�С
	 * a.�ȶ���һ�����Խ����ļ��еķ��� ������  ����ֵ File
	 *  1.�ȶ���Scanner���󣬽��������ļ���,����ѭ����ֻ����������ļ���
	 *  2.�ж�������Ƿ����ļ������ǷǷ�·���������ļ��У�
	 *  3.���ļ��оͷ��ش��ļ���
	 *  
	 * b.Ȼ����һ�������ļ��з�����Ȼ��������ļ��������
	 *  1.�����ļ��У�������ļ���ͳ���ļ���С�ۼӣ����ļ��о͵ݹ����
	 *  2.����ֵ����Ϊlong���������Ϊfile;
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=getDir();
		
		System.out.println(getFileLength(dir));
	}
	public static long getFileLength(File dir){
		File[] files=dir.listFiles();
		long len=0L;
		for (File file : files) {
			if (file.isFile()) {
				len=len+file.length();
			} else {
				len=len+getFileLength(file);
			}
		}
		return len;
	}
	public static File getDir(){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ļ���·����");
		while (true) {
			String str=sc.nextLine();
			File dir=new File(str);
			if (dir.isFile()) {
				System.out.println("����������ļ�·��������������");
			}else if (!dir.exists()) {
				System.out.println("��������ļ�·�������ڣ�����������");
			} else {
				return dir;
			}
		}
	}

}
