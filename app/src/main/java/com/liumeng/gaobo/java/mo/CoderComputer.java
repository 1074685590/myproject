package com.liumeng.gaobo.java.mo;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class CoderComputer extends AbstractComputer {
    @Override
    protected void login() {
        System.out.println("程序员只需要进行用户名和密码验证就可以了");
    }
}
