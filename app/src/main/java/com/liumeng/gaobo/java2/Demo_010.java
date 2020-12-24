package com.liumeng.gaobo.java2;

import java.io.File;

public class Demo_010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=Demo_007.getDir();
		printLev(dir,0);
	}
	public static void printLev(File dir,int lev){
		File subFiles[]=dir.listFiles();
		for (File subFile : subFiles) {
			for(int i=0;i<=lev;i++){
				System.out.print("\t");
			}
			System.out.println(subFile);
			if (subFile.isDirectory()) {
				printLev(subFile,++lev);
			}
		}
	}

}
