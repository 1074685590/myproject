package com.liumeng.gaobo.java.dai;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class Client {
    public static void main(String[] args) {
        //构造一个小明
        ILawsuit xiaomin = new XiaoMin();
        //构造一个代理律师并将小民作为构造参数传递进去
        ILawsuit lawsuit = new Lawyer(xiaomin);

        lawsuit.submit();
        lawsuit.burden();
        lawsuit.defend();
        lawsuit.finish();
    }
}
