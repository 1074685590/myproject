package com.liumeng.gaobo.java.others;

import java.util.Random;

public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //����ʦ��һ��д�Ĵ�������
    public int getCodeLines(){
        return new Random().nextInt(10*10000);
    }
}

//��������
