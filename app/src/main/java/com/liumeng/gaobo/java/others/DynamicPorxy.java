package com.liumeng.gaobo.java.others;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicPorxy implements InvocationHandler{

    private Object obj; //�������������

    public DynamicPorxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // ���ñ����������ķ���
        Object result = method.invoke(obj, args);
        return result;
    }

}