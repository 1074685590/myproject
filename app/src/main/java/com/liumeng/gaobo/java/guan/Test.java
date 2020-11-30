package com.liumeng.gaobo.java.guan;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class Test {
    public static void main(String args[]) {
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        Coder mrsimple = new Coder("mr.simple");
        Coder coder = new Coder("code-1");
        Coder coder2 = new Coder("code-2");
        Coder coder3 = new Coder("code-3");

        //将观察者注册到可观察对象的观察列表中
        devTechFrontier.addObserver(mrsimple);
        devTechFrontier.addObserver(coder);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);

        //发布消息
        devTechFrontier.postNewPublication("新的一期开发技术前线周报发布了");
    }
}
