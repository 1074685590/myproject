package com.liumeng.gaobo.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by liumeng on 2020/11/23 0023.
 * Describe:
 */
public class SubjectProxyMain {

    public static void main(String args[]) {
        Subject subject = new SubjectImpl();
        InvocationHandler subjectProxy = new SubjectProxy(subject);
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(subjectProxy.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), subjectProxy);
        proxyInstance.hello("world");
    }

}
