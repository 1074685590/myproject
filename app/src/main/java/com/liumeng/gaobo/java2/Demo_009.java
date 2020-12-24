package com.liumeng.gaobo.java2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo_009 {

	/**
	 * @param args
	 * 1.��Ŀ���ļ����д���ԭ�ļ���
	 * 2.��ȡԭ�ļ����������ļ����ļ��д��뵽File������
	 * 3.��������
	 * 4.������ļ���io������
	 * 5.������ļ��о͵ݹ����
	 * �������ļ�·����
	 * ������ļ�·����
	 * @throws Exception 
	 */
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src=Demo_007.getDir();
		File dest=Demo_007.getDir();
		if (src.equals(dest)) {
			System.out.println("Ŀ���ļ�����ԭ�ļ������ļ���");
		} else {
			copy(src,dest);
		}
	}
	public static void copy(File src,File dest) throws Exception{
		File newDir=new File(dest,src.getName());
		newDir.mkdir();
		File subFiles[]=src.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isFile()) {
				BufferedInputStream bis =new BufferedInputStream(new FileInputStream(subFile));
				BufferedOutputStream bos=
						new BufferedOutputStream(new FileOutputStream(new File(newDir,subFile.getName())));
				int b;
				while ((b=bis.read())!=-1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			} else {
				copy(subFile,newDir);
			}
		}
	}

}
