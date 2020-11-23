package com.liumeng.gaobo.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by liumeng on 2020/11/23 0023.
 * Describe:
 */
public class SubjectProxy implements InvocationHandler {

    private Subject mSubject;

    public SubjectProxy(Subject subject) {
        this.mSubject = subject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("------------------begin---------------");
        Object invoke = method.invoke(mSubject, args);
        System.out.println("------------------end---------------");
        return invoke;
    }
}
