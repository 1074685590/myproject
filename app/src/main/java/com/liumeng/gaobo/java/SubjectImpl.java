package com.liumeng.gaobo.java;

/**
 * Created by liumeng on 2020/11/23 0023.
 * Describe:
 */
public class SubjectImpl implements Subject {
    @Override
    public void hello(String param) {
        System.out.println("hello "+param);
    }
}
