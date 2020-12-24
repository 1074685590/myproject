package com.liumeng.gaobo.java2;

import java.io.File;

public class Demo_008 {

	/**ɾ���ļ���
	 * 1.��ȡһ���Ӽ���¼����ļ���
	 * 2.����һ��deleteFile�ķ���
	 *  ����������ļ�ɾ����������ļ��о͵ݹ���ã�����������ļ���ɾ��
	 *  ������� File dir���޷���ֵ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=Demo_007.getDir();
		System.out.println(dir.getName());
		deleteFile(dir);
	}
	public static void deleteFile(File dir){
		File[] subFiles=dir.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isFile()) {
				subFile.delete();
			} else {
				deleteFile(subFile);
			}
		}
		dir.delete();
	}

}
