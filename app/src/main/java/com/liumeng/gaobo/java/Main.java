package com.liumeng.gaobo.java;

import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liumeng on 2020/11/25 0025.
 * Describe:
 */
public class Main {
    public static void main(String args[]) {
//        method7();
//        method8();
//        mthod9();
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, -4};
        Arrays.sort(array);
        printArray("数组排列结果为",array);
    }

    private static void printArray(String message, int[] array) {
        System.out.println(message + ":[length:" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static void mthod9() {
        double e = Math.E;
        System.out.format("%f%n", e);
        System.out.format(Locale.CHINA,"%-10.4f%n%n",e);
    }

    private static void method8() {
        String variables[] = new String[50000];
        for (int i = 0; i < 50000; i++) {
            variables[i] = "s"+i;
        }
        long startTime0 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            variables[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("直接使用字符串:"+(endTime0- startTime0)+"ms");
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            variables[i] = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("使用new关键字:" + (endTime1 - startTime1) + "ms");
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            variables[i] = new String("hello");
            variables[i] = variables[i].intern();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("使用字符串对象intern()方法:"+(endTime2-startTime2)+"ms");
    }

    private static void method7() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s1 = "hello";
            String s2 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("通过String关键字创建字符串:"+(endTime-startTime));
        for (int i = 0; i < 50000; i++) {
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("通过String对象创建字符串:"+(endTime1-endTime));
    }

    private static void method6() {
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";
        boolean match1 = first_str.regionMatches(11, second_str, 12, 9);
        boolean match2 = first_str.regionMatches(true,11, second_str, 12, 9);
        System.out.println(match1);
        System.out.println(match2);
    }

    private static void method5() {
        String str = "string runoob";
        String strUpper = str.toUpperCase();
        System.out.println(strUpper);
    }

    private static void method4() {
        String str = "This is String , split by StringTokenizer, created by runoob";
        StringTokenizer st = new StringTokenizer(str);
        System.out.println("-----通过空格分隔");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
        System.out.println("------通过逗号分隔");
        StringTokenizer st2 = new StringTokenizer(str, ", ");
        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }

    private static void method3() {
        String str = "www-runoob-com";
        String temp[];
        String delimeter = "-";
        temp = str.split(delimeter);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
            System.out.println();
        }
        System.out.println("-----java for each循环输出的方法-----");
        String str1 = "www.runoob.com";
        String temp1[];
        String delimeter1 = "\\."; //指定分隔字符,.号需要转义
        temp1 = str1.split(delimeter1);
        for (String x : temp1) {
            System.out.println(x);
            System.out.println();
        }
    }

    private static void method2() {
        String string = "runoob";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);
    }

    private static void method1() {
        String str = "Hello world";
        String regEx="[abcdH]";
        String reStr = "";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);
        reStr = matcher.replaceAll("").trim();
        System.out.println(reStr);
    }

    private static String removeCharat(String s, int pos) {
        return s.substring(0,pos)+s.substring(pos+1);
    }
}
